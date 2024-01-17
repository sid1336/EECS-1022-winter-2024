package Lab1;
//You are NOT allowed to add any "import" statement other than 
//the ones already in the starter files. 

///////////////////////////////////////////////////////////////////////////
//Full Name : Utkarsh Sachdeva
//Yorku Email : sid136@my.yorku.ca
//Date : Jan 15th, 2024
//Authenticity Declaration :
//I declare this submission is the result of my own work and has not been
//shared with any other student or 3rd party content provider.This submitted
//piece of work is entirely of my own creation.
//////////////////////////////

public class Lab1 {
	public static int collatz(int n) {
		if (n >0 && n % 2 == 0) { 
			return n / 2;
			} 
		else if (n >0 && n % 2 == 1){ 
			return (3 * n) + 1; 
			} 
		else {
			return -1; 
			} 
	}
	
	
	
//	public static String yorkAdmit (double gpa, int sat) {
////		if ((gpa < 1.8 && gpa > 1.4) || sat < 900) {
////			return "Reject";
////		}
////		
////		else if (gpa >= 1.8 && sat >= 900) {
////			return "Accept";
////		}
////		else if (gpa <= 1.4 && sat < 900){
////			return "ScoreTooLow";
////		}
////		else 
////			return "ScoreTooLow";
////	
////		}
//		}
	public static String yorkAdmit(double gpa, int sat) {
	    if ((gpa < 1.8 && gpa > 1.4) || sat < 900) {
	        return "Reject";
	    } else if (gpa >= 1.8 && sat >= 900) {
	        return "Accept";
	    } else {
	        return "ScoreTooLow";
	    }
	}



	
	
	public static int quadrant (double x, double y) {
		if (x == 0 || y == 0) {
			return 0;
		}
		else if ( x > 0 && y > 0) {
			return 1;
		}
		else if ( x < 0 && y > 0) {
			return 2;
		}
		else if ( x < 0 && y < 0) {
			return 3;
		}
		else {
			return 4;
	}
		}
	
	
	
	public static boolean enoughLunchTime (int hour1, int min1, int hour2, int min2) {
		
		 int timeDifferenceInMinutes = (hour2 - hour1) * 60 + (min2 - min1);

		    if (timeDifferenceInMinutes > 45) {
		        return true;
		    } else if (timeDifferenceInMinutes == 45 && min1 <= min2) {
		        return true;
		    } 
		    else if (timeDifferenceInMinutes >= 45) {
		    	return true;
		    }
		    		
		    else {
		        return false;
		    }
		}
	
	
	
	public static double computePayment (double oldBalance, double charges) {
		double balance = oldBalance + charges;
		if (oldBalance == 0 && balance <= 50) {
			return balance;
		}
		else if( oldBalance > 0 && (balance > 50 && balance <= 300)) {
			return 50;
		}
		else if (oldBalance == 0 && balance >= 50){
			return balance * 0.20;
			
	}
		else {
			double Newbalance = ((oldBalance + charges) * 0.20) + ((oldBalance + charges) * 0.20)* 0.02;
					return Newbalance;
		}
}
}
