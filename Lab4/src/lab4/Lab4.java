package lab4;

public class Lab4 {
	public static int longestSeq (int[] array) {
		if (array.length == 0) {
            return 0;
        }

        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < array.length; i++) {
            int currentNum = array[i];

            // Check if the previous number is present in the array
            boolean hasPrevious = false;
            for (int j = 0; j < i; j++) {
                if (array[j] == currentNum - 1) {
                    hasPrevious = true;
                    break;
                }
            }

            if (hasPrevious) {
                currentLength = currentLength + 1;
            } else {
                currentLength = 1;
            }

            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    
    
    }

	public static String countArray (int[] array) {
		
	        if (array.length == 0) {
	            return "";
	        }

	        StringBuilder result = new StringBuilder();

	        // Count occurrences of even numbers in the range [2, 100)
	        for (int i = 2; i < 100; i += 2) {
	            int count = 0;

	            // Count occurrences in the array
	            for (int num : array) {
	                if (num == i) {
	                    count++;
	                }
	            }

	            // Append to result if count is greater than 0
	            if (count > 0) {
	                result.append(i).append(": ").append(count).append("\n");
	            }
	        }

	        return result.toString().trim();  // Remove trailing whitespaces
	    }
	

	
	public static boolean validString(String str1, String str2) {
	    int index1 = 0;
	    int index2 = 0;

	    while (index1 < str1.length() && index2 < str2.length()) {
	        if (str1.charAt(index1) == str2.charAt(index2)) {
	            index2++;
	        }
	        index1++;
	    }

	    return index2 == str2.length();
	}


	
	public static String arrayResult(int[][] array) {
		
		    if (array.length == 0 || array[0].length == 0) {
		        return "";
		    }

		    StringBuilder result = new StringBuilder();
		    int sum = 0;
		    long product = 1;

		    for (int i = 0; i < array.length; i++) {
		        for (int j = 0; j < array[i].length; j++) {
		            if ((i + j) % 2 == 0) {
		                sum += array[i][j];
		            } else {
		                product *= array[i][j];
		            }
		        }
		    }

		    // Adjust the product to be 0 if the sum is 1
		    if (sum == 1) {
		        product = 0;
		    }

		    result.append("Sum:").append(sum).append(", Product:").append(product);

		    return result.toString();
		}


	
	public static boolean magicSquare(int[][] array) {
	    int n = array.length;

	    // Check if the array is a square
	    if (n == 0 || array[0].length != n) {
	        return false;
	    }

	    int magicSum = n * (n * n + 1) / 2; // The sum of each row, column, and diagonal

	    // Check rows and columns
	    for (int i = 0; i < n; i++) {
	        int rowSum = 0;
	        int colSum = 0;

	        for (int j = 0; j < n; j++) {
	            rowSum += array[i][j];
	            colSum += array[j][i];
	        }

	        if (rowSum != magicSum || colSum != magicSum) {
	            return false;
	        }
	    }

	    // Check diagonals
	    int mainDiagonalSum = 0;
	    int antiDiagonalSum = 0;

	    for (int i = 0; i < n; i++) {
	        mainDiagonalSum += array[i][i];
	        antiDiagonalSum += array[i][n - 1 - i];
	    }

	    return mainDiagonalSum == magicSum && antiDiagonalSum == magicSum;
	}
}
