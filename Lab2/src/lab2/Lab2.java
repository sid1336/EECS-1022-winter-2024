package lab2;
//You are NOT allowed to add any "import" statement other than 
//the ones already in the starter files. 

///////////////////////////////////////////////////////////////////////////
//Full Name : Utkarsh Sachdeva
//Yorku Email : sid1336@my.yorku.ca
//Date :219964444
//Authenticity Declaration :
//I declare this submission is the result of my own work and has not been
//shared with any other student or 3rd party content provider.This submitted
//piece of work is entirely of my own creation.
//////////////////////////////


/**
 * Objective: practice  If statements, nested If statements, Demorgan's Law, Data Comparison 
 *
 */
public class Lab2 {
	
	public static double getCalories(int gender, int age, double weight, double height, boolean athlete) {

        if (age <= 0 || weight <= 0 || height <= 0) {
            return -1.0; // Invalid parameters
        }

        double baseCalories;

        if (gender == 1) { // Male
            baseCalories = 10 * weight + 6.25 * height - 5 * age + 5;
        } else if (gender == 2) { // Female
            baseCalories = 10 * weight + 6.25 * height - 5 * age - 161;
        } else {
            return -1.0; // Invalid gender
        }

        // Adjust calories for athletes
        if (athlete) {
            if (gender == 1) { // Male
                baseCalories *= 1.20; // Increase by 20%
            } else if (gender == 2) { // Female
                baseCalories *= 1.15; // Increase by 15%
            }
        }

        return baseCalories;
    }


	       

		
	
	public static double computeTax(double income) {
	    if (income < 0) {
	    	return -1;
	    }
	    double salary=0;
	    
	    if (income > 0 && income < 7150) {
	    	return income*0.10;
	    }
	    
	    if (income >= 7150 && income < 29050) {
	    	return 715 + (income-7150)*0.15;
	    	
	    }
	    if (income >= 29050 && income < 70350) {
	    	return 4000 + (income-29050)*0.25;
	    	
	    }
	    if (income >= 70350) {
	    	return 14325 + (income-70350)*0.28;
	    	
	    }
	    return salary;
	}
	
	
//	public static boolean validDate(int day, int month, int year) {
//		
//		
//		boolean monthValid;
//		if (month <= 12 && month >0) {
//			return true;
//		}
//		
//		boolean yearValid;
//		if (year >= 1000) {
//			return true;
//		}
//		
//		boolean isleapYear;
//		if ( (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
//			return true;
//		}
//		else {
//				return false;
//				
//		}
//		
//		boolean dayValid;
//		
//		{if (month == 2 && day <29) {
//			return true;
//		}
//		if (month % 2 > 2) {
//			if (day <= 30) {
//				return true;
//			}
//			else {
//				return false;
//			}
//		}
//		if (month % 2 != 2 && day <= 31) {
//			return true;
//		}
//		
//		boolean validDate;
//		if ( monthValid && yearValid ) {
//			if (isleapYear && dayValid) {
//				return true;
//			}
//			else {
//				return false;
//			}
//		}
//		
//		
//		
//}}
	
	public static boolean validDate(int day, int month, int year) {
	    boolean monthValid = (month >= 1 && month <= 12);
	    boolean yearValid = (year >= 1000);
	    boolean isLeapYear = ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0));

	    boolean dayValid;
	    if (day== 0) {
	    	return false;
	    }

	    if (month == 2) {
	        dayValid = (isLeapYear) ? (day <= 29) : (day <= 28);
	    } else if (month <= 7) {
	        dayValid = (month % 2 == 1) ? (day <= 31) : (day <= 30);
	    } else {
	        dayValid = (month % 2 == 0) ? (day <= 31) : (day <= 30);
	    }

	    return monthValid && yearValid && dayValid;
	}


}