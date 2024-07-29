package final_exam;

public class question20 {

	public question20() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		for (int i = 0; i <= 20; i++) {
            System.out.println("i = " + i);
            System.out.println("17 >= i || i >= 4: " + (17 >= i || i >= 4));
            System.out.println("17 >= i && i >= 4: " + (17 >= i && i >= 4));
            System.out.println("17 < i && i < 4: " + (17 < i && i < 4));
            System.out.println("17 < i || i < 4: " + (17 < i || i < 4));
            System.out.println();
        }
    }

}
