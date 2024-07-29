package final_exam;

public class question_23 {

	public static void main(String[] args) {
        int i = 7, j = 15, k = 3;
        while (++i < --j);  // Loop until i is not less than j
        k += j + i;         // Add the values of j and i to k
        while (++j < --k);  // Loop until j is not less than k

        System.out.println("i = " + i); // Output the value of i
        System.out.println("j = " + j); // Output the value of j
        System.out.println("k = " + k); // Output the value of k
    }
}