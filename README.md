# f1-no-sense

Программа позволит понять (примерно), после скольки минимальных гонок F1 заезд может стать бесмыссленным

Сетка очков по 2022 году, без спринт квал и лучших кругов
Чуть что менять переменную targetNoSenseRaces 

Пример вывода лога для того, чтобы найти гонку после которой, ОДНА следующая станет бесмыссленной с точки зрения изменения позиций гощика (спойлер - сотая) 
```
Started F1NoSenseApp
{1=[0], 2=[0], 3=[0], 4=[0], 5=[0], 6=[0], 7=[0], 8=[0], 9=[0], 10=[0], 11=[0], 12=[0], 13=[0], 14=[0], 15=[0], 16=[0], 17=[0], 18=[0], 19=[0], 20=[0]}
Starting race 0
Starting race 1
Starting race 2
Starting race 3
Starting race 4
Starting race 5
Starting race 6
Starting race 7
Starting race 8
Starting race 9
Starting race 10
Starting race 11
Starting race 12
Starting race 13
Starting race 14
Starting race 15
Starting race 16
Starting race 17
Starting race 18
Starting race 19
Starting race 20
Starting race 21
Starting race 22
Starting race 23
Starting race 24
Starting race 25
Starting race 26
Starting race 27
Starting race 28
Starting race 29
Starting race 30
Starting race 31
Starting race 32
Starting race 33
Starting race 34
Starting race 35
Starting race 36
Starting race 37
Starting race 38
Starting race 39
Starting race 40
Starting race 41
Starting race 42
Starting race 43
Starting race 44
Starting race 45
Starting race 46
Starting race 47
Starting race 48
Starting race 49
Starting race 50
Starting race 51
Starting race 52
Starting race 53
Starting race 54
Starting race 55
Starting race 56
Starting race 57
Starting race 58
Starting race 59
Starting race 60
Starting race 61
Starting race 62
Starting race 63
Starting race 64
Starting race 65
Starting race 66
Starting race 67
Starting race 68
Starting race 69
Starting race 70
Starting race 71
Starting race 72
Starting race 73
Starting race 74
Starting race 75
Starting race 76
Starting race 77
Starting race 78
Starting race 79
Starting race 80
Starting race 81
Starting race 82
Starting race 83
Starting race 84
Starting race 85
Starting race 86
Starting race 87
Starting race 88
Starting race 89
Starting race 90
Starting race 91
Starting race 92
Starting race 93
Starting race 94
Starting race 95
Starting race 96
Starting race 97
Starting race 98
Starting race 99
Starting race 100
No sense race founded for 'no sense target' - 1
Race number 100
1:[0, 25, 50, 75, 100, 100, 125, 150, 175, 200, 200, 200, 200, 225, 250, 275, 275, 300, 325, 350, 375, 375, 375, 375, 375, 375, 375, 375, 375, 375, 400, 425, 450, 450, 450, 450, 450, 450, 450, 450, 450, 450, 450, 475, 500, 525, 550, 554, 556, 557, 557, 558, 558, 558, 558, 558, 558, 558, 558, 558, 558, 558, 583, 608, 633, 633, 658, 683, 708, 720, 730, 738, 744, 750, 754, 756, 757, 757, 757, 757, 757, 757, 757, 757, 757, 757, 757, 757, 757, 782, 807, 807, 807, 807, 807, 807, 807, 832, 857, 882]
2:[0, 18, 36, 54, 72, 97, 115, 133, 151, 169, 169, 169, 194, 212, 230, 248, 273, 291, 309, 327, 345, 345, 345, 345, 345, 345, 345, 345, 345, 370, 388, 406, 424, 424, 424, 424, 424, 424, 424, 424, 424, 424, 449, 467, 485, 503, 521, 523, 524, 524, 524, 524, 524, 524, 524, 524, 524, 524, 524, 524, 524, 549, 567, 585, 603, 628, 646, 664, 682, 692, 700, 706, 710, 714, 716, 717, 717, 717, 717, 717, 717, 717, 717, 717, 717, 717, 717, 717, 742, 760, 778, 778, 778, 778, 778, 778, 803, 821, 839, 857]
3:[0, 15, 30, 45, 60, 78, 93, 108, 123, 138, 138, 163, 181, 196, 211, 226, 244, 259, 274, 289, 304, 304, 304, 304, 304, 304, 304, 304, 329, 347, 362, 377, 392, 392, 392, 392, 392, 392, 392, 392, 392, 417, 435, 450, 465, 480, 495, 496, 496, 496, 496, 496, 496, 496, 496, 496, 496, 496, 496, 496, 521, 539, 554, 569, 584, 602, 617, 632, 647, 655, 661, 665, 667, 669, 670, 670, 670, 670, 670, 670, 670, 670, 670, 670, 670, 670, 670, 695, 713, 728, 743, 743, 743, 743, 743, 768, 786, 801, 816, 831]
4:[0, 12, 24, 36, 48, 63, 75, 87, 99, 111, 136, 154, 169, 181, 193, 205, 220, 232, 244, 256, 268, 268, 268, 268, 268, 268, 268, 293, 311, 326, 338, 350, 362, 362, 362, 362, 362, 362, 362, 362, 387, 405, 420, 432, 444, 456, 468, 468, 468, 468, 468, 468, 468, 468, 468, 468, 468, 468, 468, 493, 511, 526, 538, 550, 562, 577, 589, 601, 613, 619, 623, 625, 626, 627, 627, 627, 627, 627, 627, 627, 627, 627, 627, 627, 627, 627, 652, 670, 685, 697, 709, 709, 709, 709, 734, 752, 767, 779, 791, 803]
5:[0, 10, 20, 30, 40, 52, 62, 72, 82, 92, 110, 125, 137, 147, 157, 167, 179, 189, 199, 209, 219, 219, 219, 219, 219, 219, 244, 262, 277, 289, 299, 309, 319, 319, 319, 319, 319, 319, 319, 344, 362, 377, 389, 399, 409, 419, 429, 429, 429, 429, 429, 429, 429, 429, 429, 429, 429, 429, 454, 472, 487, 499, 509, 519, 529, 541, 551, 561, 571, 575, 577, 578, 578, 578, 578, 578, 578, 578, 578, 578, 578, 578, 578, 578, 578, 603, 621, 636, 648, 658, 668, 668, 668, 693, 711, 726, 738, 748, 758, 768]
6:[0, 8, 16, 24, 32, 42, 50, 58, 66, 74, 89, 101, 111, 119, 127, 135, 145, 153, 161, 169, 177, 177, 177, 177, 177, 202, 220, 235, 247, 257, 265, 273, 281, 281, 281, 281, 281, 281, 306, 324, 339, 351, 361, 369, 377, 385, 393, 393, 393, 393, 393, 393, 393, 393, 393, 393, 393, 418, 436, 451, 463, 473, 481, 489, 497, 507, 515, 523, 531, 533, 534, 534, 534, 534, 534, 534, 534, 534, 534, 534, 534, 534, 534, 534, 559, 577, 592, 604, 614, 622, 630, 630, 655, 673, 688, 700, 710, 718, 726, 734]
7:[0, 6, 12, 18, 24, 32, 38, 44, 50, 56, 68, 78, 86, 92, 98, 104, 112, 118, 124, 130, 136, 136, 136, 136, 161, 179, 194, 206, 216, 224, 230, 236, 242, 242, 242, 242, 242, 267, 285, 300, 312, 322, 330, 336, 342, 348, 354, 354, 354, 354, 354, 354, 354, 354, 354, 354, 379, 397, 412, 424, 434, 442, 448, 454, 460, 468, 474, 480, 486, 487, 487, 487, 487, 487, 487, 487, 487, 487, 487, 487, 487, 487, 487, 512, 530, 545, 557, 567, 575, 581, 587, 612, 630, 645, 657, 667, 675, 681, 687, 693]
8:[0, 4, 8, 12, 16, 22, 26, 30, 34, 38, 48, 56, 62, 66, 70, 74, 80, 84, 88, 92, 96, 96, 96, 121, 139, 154, 166, 176, 184, 190, 194, 198, 202, 202, 202, 202, 227, 245, 260, 272, 282, 290, 296, 300, 304, 308, 312, 312, 312, 312, 312, 312, 312, 312, 312, 337, 355, 370, 382, 392, 400, 406, 410, 414, 418, 424, 428, 432, 436, 436, 436, 436, 436, 436, 436, 436, 436, 436, 436, 436, 436, 461, 486, 504, 519, 531, 541, 549, 555, 559, 563, 581, 596, 608, 618, 626, 632, 636, 640, 644]
9:[0, 2, 4, 6, 8, 12, 14, 16, 18, 20, 28, 34, 38, 40, 42, 44, 48, 50, 52, 54, 56, 56, 81, 99, 114, 126, 136, 144, 150, 154, 156, 158, 160, 160, 160, 185, 203, 218, 230, 240, 248, 254, 258, 260, 262, 264, 266, 266, 266, 266, 266, 266, 266, 266, 291, 309, 324, 336, 346, 354, 360, 364, 366, 368, 370, 374, 376, 378, 380, 380, 380, 380, 380, 380, 380, 380, 380, 380, 380, 405, 430, 448, 466, 481, 493, 503, 511, 517, 521, 523, 525, 540, 552, 562, 570, 576, 580, 582, 584, 586]
10:[0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 16, 20, 22, 23, 24, 25, 27, 28, 29, 30, 31, 56, 74, 89, 101, 111, 119, 125, 129, 131, 132, 133, 134, 134, 159, 177, 192, 204, 214, 222, 228, 232, 234, 235, 236, 237, 238, 238, 238, 238, 238, 238, 238, 263, 281, 296, 308, 318, 326, 332, 336, 338, 339, 340, 341, 343, 344, 345, 346, 346, 346, 346, 346, 346, 346, 346, 346, 346, 371, 389, 407, 422, 437, 449, 459, 467, 473, 477, 479, 480, 481, 493, 503, 511, 517, 521, 523, 524, 525, 526]
11:[0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 5, 7, 8, 8, 8, 8, 9, 9, 9, 9, 9, 27, 42, 54, 64, 72, 78, 82, 84, 85, 85, 85, 85, 110, 128, 143, 155, 165, 173, 179, 183, 185, 186, 186, 186, 186, 186, 186, 186, 186, 211, 211, 236, 254, 269, 281, 291, 299, 305, 309, 311, 312, 312, 312, 312, 313, 313, 313, 313, 313, 313, 313, 313, 313, 313, 313, 313, 338, 356, 371, 386, 398, 410, 420, 428, 434, 438, 440, 441, 441, 441, 451, 459, 465, 469, 471, 472, 472, 472, 472]
12:[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 18, 30, 40, 48, 54, 58, 60, 61, 61, 61, 61, 61, 79, 94, 106, 116, 124, 130, 134, 136, 137, 137, 137, 137, 137, 137, 137, 137, 162, 180, 205, 223, 238, 250, 260, 268, 274, 278, 280, 281, 281, 281, 281, 281, 281, 281, 281, 281, 281, 281, 281, 281, 281, 281, 281, 306, 324, 339, 351, 363, 373, 383, 391, 397, 401, 403, 404, 404, 404, 404, 412, 418, 422, 424, 425, 425, 425, 425, 425]
13:[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 13, 23, 31, 37, 41, 43, 44, 44, 44, 44, 44, 44, 59, 71, 81, 89, 95, 99, 101, 102, 102, 102, 102, 102, 102, 102, 102, 127, 145, 160, 178, 193, 205, 215, 223, 229, 233, 235, 236, 236, 236, 236, 236, 236, 236, 236, 236, 236, 236, 236, 236, 236, 236, 236, 261, 279, 294, 306, 316, 326, 334, 342, 348, 352, 354, 355, 355, 355, 355, 355, 361, 365, 367, 368, 368, 368, 368, 368, 368]
14:[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 18, 24, 28, 30, 31, 31, 31, 31, 31, 31, 31, 43, 53, 61, 67, 71, 73, 74, 74, 74, 74, 74, 74, 74, 74, 99, 117, 132, 144, 159, 171, 181, 189, 195, 199, 201, 202, 202, 202, 202, 202, 202, 202, 202, 202, 202, 202, 202, 202, 202, 202, 202, 227, 245, 260, 272, 282, 290, 298, 304, 310, 314, 316, 317, 317, 317, 317, 317, 317, 321, 323, 324, 324, 324, 324, 324, 324, 324]
15:[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 14, 18, 20, 21, 21, 21, 21, 21, 21, 21, 21, 31, 39, 45, 49, 51, 52, 52, 52, 52, 52, 52, 52, 52, 52, 70, 85, 97, 107, 119, 129, 137, 143, 147, 149, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 175, 200, 218, 233, 245, 255, 263, 269, 275, 279, 283, 285, 286, 286, 286, 286, 286, 286, 286, 288, 289, 289, 289, 289, 289, 289, 289, 289]
16:[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 10, 12, 13, 13, 13, 13, 13, 13, 13, 13, 13, 21, 27, 31, 33, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 49, 61, 71, 79, 89, 97, 103, 107, 109, 110, 110, 110, 110, 110, 110, 110, 110, 110, 110, 110, 110, 110, 110, 110, 135, 153, 171, 186, 198, 208, 216, 222, 226, 230, 232, 234, 235, 235, 235, 235, 235, 235, 235, 235, 236, 236, 236, 236, 236, 236, 236, 236, 236]
17:[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 13, 17, 19, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 32, 42, 50, 56, 64, 70, 74, 76, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 102, 120, 135, 150, 162, 172, 180, 186, 190, 192, 194, 195, 196, 196, 196, 196, 196, 196, 196, 196, 196, 196, 196, 196, 196, 196, 196, 196, 196, 196]
18:[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 7, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 20, 28, 34, 38, 44, 48, 50, 51, 51, 51, 51, 51, 51, 51, 51, 51, 51, 51, 51, 51, 51, 51, 76, 94, 109, 121, 133, 143, 151, 157, 161, 163, 164, 165, 165, 165, 165, 165, 165, 165, 165, 165, 165, 165, 165, 165, 165, 165, 165, 165, 165, 165, 165]
19:[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 12, 18, 22, 24, 28, 30, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 49, 64, 76, 86, 96, 104, 110, 114, 116, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117, 117]
20:[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 7, 11, 13, 14, 16, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 32, 44, 54, 62, 70, 76, 80, 82, 83, 83, 83, 83, 83, 83, 83, 83, 83, 83, 83, 83, 83, 83, 83, 83, 83, 83, 83, 83, 83, 83, 83]
END

Process finished with exit code 0
```

Just for fun
