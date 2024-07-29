package final_exam;

public class question_24 {

	public static void main(String[] args) {
        // Example two-dimensional array
		int[][][] testArrays = {
	            {{49, 563, 43}, {287, 21, 42, 88}, {33, 876}, {14, 21}, {342, 27, 486, 81, 18}},
	            {{47, 33, 43}, {24, 15, 32}, {108, 45, -54}, {38, 42, 11}, {288, 146, 27, 144}},
	            {{34, -43, 48}, {21, 13, 34}, {8, 15, 29}, {36, 27, 216, 72}, {54, 36, 44, 45}},
	            {{11, 27, 306}, {54, 27, 45, 147}, {45, 44, 54}, {306, 35}, {-45, 288, 81, 48}},
	            {{-3, 225}, {27, 18, 36}, {147, 21, -287}, {94, 42, 55}, {18, 226, 9, 36, 126}},
	            {{48, 5, 42}, {29, 141, 288}, {22, 15}, {128, 34, 25}, {495, 126, 27, 18, 279}}
	        };

	        for (int[][] ia : testArrays) {
	            boolean p1 = false;

	            for (int i = 0; i < ia.length; i++) {
	                boolean p2 = true;
	                for (int j = 0; j < ia[i].length; j++) {
	                    if (ia[i][j] % 9 == 0) {
	                        p2 = false;
	                        break;
	                    }
	                }
	                if (p2) {
	                    p1 = true;
	                    break;
	                }
	            }

	            System.out.println("At least one row has all multiples of 9: " + p1);
	        }
	    }
}
