package final_exam;

public class q3 {

	public static void main(String[] args) {
        // Example of a 2D array initialization
        int[][] a = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 0, 5, 2},
            {9, 1, 1, 1}
         
        };

        // Loop through the array and print each element
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();  // Move to the next line after each row
        }
    }

}
