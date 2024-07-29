package lab3;
//You are NOT allowed to add any "import" statement other than 
//the ones already in the starter files. 

///////////////////////////////////////////////////////////////////////////
//Full Name :Utkarsh sachdeva
//Yorku Email :Sid1336@my.yorku.ca
//Date : Feb 2nd , 2024
//Authenticity Declaration :
//I declare this submission is the result of my own work and has not been
//shared with any other student or 3rd party content provider.This submitted
//piece of work is entirely of my own creation.
//////////////////////////////

public class Lab3 {

	public static String printStars(int n) {
		
		StringBuilder result = new StringBuilder();

	    for (int i = n; i > 0; i--) {
	        // Add dashes
	        for (int j = n - i; j > 0; j--) {
	            result.append("-");
	        }

	        // Add stars
	        for (int k = i; k > 0; k--) {
	            result.append("*");
	        }

	        // Move to the next line
	        result.append("\n");
	    }

	    return result.toString().trim();
	}
	    
	
	public static String expand(int num, int d) {
	    if (d <= 0 || num <= 0) {
	        return "Invalid";
	    }

	    int numberOfDigits = (int) Math.floor(Math.log10(num) + 1);
	    StringBuilder result = new StringBuilder();

	    for (int i = numberOfDigits; i > 0; i--) {
	        int divisor = (int) Math.pow(10, i - 1);
	        int quotient = num / divisor;
	        num %= divisor;

	        if (quotient != 0) {
	            if (result.length() > 0) {
	                result.append(" + ");
	            }
	            if (divisor == 1) {
	                result.append(quotient);
	            } else {
	                result.append(quotient).append("*").append(divisor);
	            }
	        }
	    }

	    return result.toString();
	}


	
	public static String getSeqStat(int ft, int d, int n) {
	        StringBuilder result = new StringBuilder("{");

	        for (int i = 1; i <= n; i++) {
	            result.append("[<");
	            for (int j = 0; j < i; j++) {
	                result.append(ft + (j * d));
	                if (j < i - 1) {
	                    result.append(", ");
	                }
	            }
	            result.append(">: ");

	            int sum = i * (2 * ft + (i - 1) * d) / 2;
	            int product = 1;
	            for (int j = 0; j < i; j++) {
	                product *= (ft + (j * d));
	            }

	            result.append(sum).append(", ").append(product).append("]");

	            if (i < n) {
	                result.append("; ");
	            }
	        }

	        result.append("}");
	        return result.toString();
	    }
	
	public static String seqInterleaving(int ft1, int d1, int n1, int ft2, int d2, int n2) {
	    StringBuilder result = new StringBuilder("<");

	    int i = 1;
	    int j = 1;

	    while (i <= n1 || j <= n2) {
	        if (i <= n1) {
	            result.append(ft1 + (i - 1) * d1);
	            i++;
	            if (i <= n1 || j <= n2) {
	                result.append(", ");
	            }
	        }
	            

	        if (j <= n2) {
	            result.append(ft2 + (j - 1) * d2);
	            j++;
	            if (i <= n1) {
	                result.append(", ");
	           
	            }
	        }
	        if (j <= n2 && (i > n1 && j <= n2)) {
                result.append(", ");
        }
	    }

	    result.append(">");
	    return result.toString();
	}

}
		
	


