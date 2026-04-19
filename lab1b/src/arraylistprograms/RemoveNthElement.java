//5. Write a java program for getting different colors through ArrayList interface and delete nth
//element from the ArrayList object by using remove by index

package arraylistprograms;

import java.util.*;

public class RemoveNthElement {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");

        int n = 2; // delete 3rd element (index starts from 0)

        if (n >= 0 && n < colors.size()) {
            colors.remove(n);
            System.out.println("After removing nth element: " + colors);
        } else {
            System.out.println("Invalid index!");
        }
    }
}
