package collections;

import java.util.ArrayList;
public class RemoveList {
    public static ArrayList<String> stringList = new ArrayList<>();

    public void RemoveLastElement(ArrayList<String> arrList) {
        // Check if the ArrayList is not empty before removing the last element
        if (!arrList.isEmpty()) {
            // Remove the last object in the ArrayList
            arrList.remove(arrList.size() - 1);

            // Print the ArrayList after removal
            System.out.println("ArrayList after removing the last element: " + arrList);
        } else {
            System.out.println("ArrayList is empty. No elements to remove.");
        }
    }
}