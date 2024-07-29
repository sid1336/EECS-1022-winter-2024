package final_exam;

public class question_21 {

	public question_21() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
        aMethod(5);
        cMethod(2);
        bMethod(1);
    }

    public static void aMethod(int i) {
        System.out.print(++i);  // Increment and print
        cMethod(i++);           // Call cMethod with the current value of i, then increment
    }

    public static void bMethod(int i) {
        System.out.print(i + 2);  // Print i + 2
    }

    public static void cMethod(int i) {
        System.out.print(--i);    // Decrement and print
        bMethod(i);               // Call bMethod with the current value of i
    }

}
