package final_exam;
import java.util.HashMap;
public class question_29 {

	public static void main(String[] args) {
        // Create a new HashMap
        HashMap<String, String> amap = new HashMap<>();

        // Perform operations as specified
        amap.put("KA", "VA");
        amap.put("KB", "VB");
        amap.get("KA");  // Accessing the value associated with key "KA"
        amap.put("KD", "VD");
        amap.put("KC", "VA");
        amap.put("KD", "VB");  // Updating the value associated with key "KD"
        amap.remove("VB");  // Attempt to remove a key "VB" which does not exist as a key

        // Output the size of the map
        System.out.println("Size of amap: " + amap.size());
    }
}
