import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class F1NoSenseApp {

    int raceCount = 0;
    int targetNoSenseRaces = 5;
    public static int[] scores = {25, 18, 15, 12, 10, 8, 6, 4, 2, 1};

    HashMap<Integer, ArrayList<Integer>> driversScores = new HashMap<>();

    public void run() {
        System.out.println("Started F1NoSenseApp");

        F1DriverManager.initDriversScores(driversScores);
        System.out.println(driversScores);

        while (true) {
            System.out.println("Starting race " + raceCount);
            if(raceCount == 0) {
                raceCount++;
                continue;
            }

            int intervalProblemIndex = checkIntervalForNoSenseTarget(targetNoSenseRaces, driversScores);
            if (intervalProblemIndex == -1) {
                System.out.println("No sense race founded for 'no sense target' - " + targetNoSenseRaces);
                System.out.println("Race number " + raceCount);

                for (Map.Entry<Integer, ArrayList<Integer>> entry : driversScores.entrySet()) {
                    System.out.println(entry.getKey() + ":" + entry.getValue().toString());
                }
                return;
            }

            raceSimulation(driversScores, intervalProblemIndex);
            raceCount++;
        }
    }

    private void raceSimulation(HashMap<Integer, ArrayList<Integer>> driversScores, int intervalProblemDriver) {
        for (int i = 0; i < scores.length; i++) {
            if(intervalProblemDriver + i > driversScores.size()) {
                intervalProblemDriver = intervalProblemDriver - (driversScores.size());
            }

            ArrayList<Integer> driverScores = driversScores.get(intervalProblemDriver + i);
            int newScore = driverScores.get(raceCount - 1) + scores[i];
            driverScores.add(newScore);
        }

        for (ArrayList<Integer> driverScores : driversScores.values()) {
            if(driverScores.size() <= raceCount) {
                driverScores.add(driverScores.get(raceCount - 1));
            }
        }
    }

    private int checkIntervalForNoSenseTarget(int targetNoSenseRaces,
                                                  HashMap<Integer, ArrayList<Integer>> driversScores) {
        int maxRaceScore = scores[0];
        int intervalToHold = targetNoSenseRaces * maxRaceScore;

        for (int i = 1; i < driversScores.size(); i++) {
            Integer firstDriverScore = driversScores.get(i).get(raceCount - 1);
            Integer secondDriverScore = driversScores.get(i + 1).get(raceCount - 1);

            if (firstDriverScore - secondDriverScore - intervalToHold < 0) {
                return i;
            }
        }
        return -1;
    }
}

class F1DriverManager {
    static void initDriversScores(HashMap<Integer, ArrayList<Integer>> driversScores) {
        for (int i = 1; i <= 20; i++) {
            ArrayList<Integer> scoreList = new ArrayList<>();
            scoreList.add(0);
            driversScores.put(i, scoreList);
        }
    }
}
