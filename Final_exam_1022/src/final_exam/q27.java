package final_exam;

public class q27 {

	public q27() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = false;

        // Evaluate each expression
        boolean expression1 = !(!(b1 || b2 && b3)) || (b1 && !b2 && !b3);
        boolean expression2 = !(!(b1 || b2 || b3)) && (b1 && !b2 && !b3);
        boolean expression3 = !(!(b1 && b2 || b3)) || (b1 && !b2 && !b3);
        boolean expression4 = !(!(b1 || b2 && b3)) && (b1 && !b2 || !b3);
        boolean expression5 = !(!(b1 || b2 && b3)) && (b1 && !b2 && !b3);
        boolean expression6 = !(!(b1 && b2 || b3)) && (b1 || !b2 || !b3);
        boolean expression7 = !(!(b1 && b2 || b3)) && (b1 && !b2 && !b3);

        // Print the results of each expression
        System.out.println("Expression 1: " + expression1);
        System.out.println("Expression 2: " + expression2);
        System.out.println("Expression 3: " + expression3);
        System.out.println("Expression 4: " + expression4);
        System.out.println("Expression 5: " + expression5);
        System.out.println("Expression 6: " + expression6);
        System.out.println("Expression 7: " + expression7);
    }

}
