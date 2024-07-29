package final_exam;

public class q1 {

	public static void main(String[] args) {
        int b = 12;
        int a = 7;

        // strA construction
        String strA = a + b++ + "$";
        // Postfix increment on b means it uses the current value of b (12) then increments b to 13.

        // strB and strC are declared but never used for output. They still affect the values of a and b.
        // strB uses the prefix increment, which increases a before using it in the expression.
        String strB = ++a + "%" + b--;
        // b-- uses the current value of b (13) then decrements b to 12.

        // strC uses the prefix increment, which modifies b before using it in the expression.
        String strC = "$" + ++b + a-- + "%";
        // a-- uses the current value of a (8) then decrements a to 7.

        System.out.println(strA);  // Output the result of strA
    }
}