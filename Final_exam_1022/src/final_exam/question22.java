package final_exam;

public class question22 {

	public question22() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
        // Arrays to be tested
        int[][][] testArrays = {
            {{18, 45, -45}, {27, 18, 36}, {6, -37, -42, 1}, {27, 36, 45}, {21, 144, 287, 147}},
            {{27, 18, 36}, {-3, 22}, {99, 45, -54}, {144, 27, -288}, {225, 13, 1, 31, 121}},
            {{21, 14}, {21, 147, 287}, {-35, 128, 22}, {49, 57, 4}, {28, 127, 21, 14, 497}},
            {{9, 18, 27}, {27, 18, 36}, {-36, 18, 27, 9}, {34, -43, -48}, {48, 49, 54, 42}},
            {{33, 876}, {88, 287, 21, 42}, {14, 21}, {49, 563, 43}, {88, 480, 343, 15, 28}},
            {{22, 147, 43, 288}, {-35, 0}, {49, 54, 43}, {27, 11, 306}, {287, -42, 49, 81}}
        };

        for (int[][] ia : testArrays) {
            boolean p1 = true; // Initialize p1 as true at the start of each test

            for (int[] row : ia) {
                boolean p2 = false; // Assume p2 as false for each row initially
                for (int num : row) {
                    if (num % 9 == 0) {
                        p2 = true; // Set p2 to true if at least one multiple of 9 is found
                        break; // Break the inner loop if the condition is met
                    }
                }
                if (!p2) { // If p2 is false after checking a row, set p1 to false
                    p1 = false;
                    break; // No need to check further rows if one fails
                }
            }

            System.out.println("Each row has at least one multiple of 9: " + p1);
        }
    }

}
