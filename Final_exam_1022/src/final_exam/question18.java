package final_exam;

public class question18 {

	public static int compute(int m) {
        final int LIMIT1 = 7;
        final int LIMIT2 = 5;
        int value = m;
        boolean flag = (m < LIMIT1);
        
        if (flag) {
            value = value + LIMIT1;
        } else if (m == LIMIT2) {
            value = 2 * value;
        } else {
            value = value + LIMIT1;
        }
        
        return value;
    }

    public static void main(String[] args) {
        // Test the compute method for different values of m
        for (int m = 0; m <= 10; m++) {
            int result = compute(m);
            System.out.println("m = " + m + ": compute(m) = " + result);
            if (result == 10) {
                System.out.println("The value of m that results in 10 is: " + m);
            }
        }
    }

}
