package final_exam;


import java.util.ArrayList;
public class question_26 {

	public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Adding elements to the list
        list.add("suyeon");
        list.add("yuna");
        list.add("heeyeon");
        list.add("sunhye");
        list.add("jihye");
        list.add("alan");
        list.add("mark");
        list.add("tom");
        list.add("jim");

        // Remove elements at specified indices: 3, 5, 1, 3
        list.remove(3); // Removes "sunhye"
        list.remove(5); // Removes "mark" (after "sunhye" was removed)
        list.remove(1); // Removes "yuna" (after previous removals)
        list.remove(3); // Removes "alan" (after previous removals)

        // Print the element at each relevant index
        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("Element at index 2: " + list.get(2));
        System.out.println("Element at index 5: " + (list.size() > 5 ? list.get(5) : "Index out of bounds"));

        // Print the index of each element if it exists in the list
        System.out.println("Index of 'jihye': " + list.indexOf("jihye"));
        System.out.println("Index of 'sunhye': " + list.indexOf("sunhye"));
        System.out.println("Index of 'mark': " + list.indexOf("mark"));
        System.out.println("Index of 'jim': " + list.indexOf("jim"));
        System.out.println("Index of 'suyeon': " + list.indexOf("suyeon"));
        System.out.println("Index of 'alan': " + list.indexOf("alan"));
        System.out.println("Index of 'yuna': " + list.indexOf("yuna"));
        System.out.println("Index of 'heeyeon': " + list.indexOf("heeyeon"));
        System.out.println("Index of 'tom': " + list.indexOf("tom"));
    }
}