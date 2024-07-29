package final_exam;

public class q2 {

	public static int compute(int m) {
        int value = 0;
        while (m <= 7) {
            value += (m) %  7;
            m += 1;
        }
        return value;
    }

    public static void main(String[] args) {
        // Test different values of m
        for (int m = 0; m <= 7; m++) {
            int result = compute(m);
            System.out.println("m = " + m + ": result = " + result);
            if (result == 11) {
                System.out.println("Value of m for result 11: " + m);
            }
        }
    }
}
