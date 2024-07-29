package final_exam;

import java.util.ArrayList;
public class question_28 {

	public static void main(String[] args) {
        // Create an ArrayList and add elements
        ArrayList<String> alist = new ArrayList<>();
        alist.add("ItemA");
        alist.add("ItemB");
        alist.add("ItemX");
        alist.add("ItemY");
        alist.add("ItemF");
        alist.add("ItemZ");
        alist.add("ItemD");
        alist.add("ItemC");

        // Remove elements at specified indices
        alist.remove(3); // Removes the element at index 3 (ItemY)
        alist.remove(5); // Attempt to remove the element at index 5 (initially ItemC), adjusts due to prior removal
        alist.remove(3); // Removes the new element at index 3 (ItemF)
        alist.remove(1); // Removes the element at index 1 (ItemB)

        // Outputs the elements at various indices
        System.out.println("Element at index 1: " + alist.get(1));
        System.out.println("Element at index 4: " + (alist.size() > 4 ? alist.get(4) : "Index out of bounds"));
        System.out.println("Element at index 0: " + alist.get(0));
        System.out.println("Element at index 2: " + (alist.size() > 2 ? alist.get(2) : "Index out of bounds"));
    }
}
