package final_exam;

public class question19 {

	public question19() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
        int[] c = {11, 4, 5, 14, 11};
        
        for (int i = 0; i < c.length - 1; i++) {
            if (c[i] <= c[i + 1]) {
                c[i + 1] = 2 * c[i];
            }
        }
        
        System.out.println(c[3]);
    }

}
