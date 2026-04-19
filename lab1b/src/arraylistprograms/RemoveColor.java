 package arraylistprograms;

import java.util.*;

public class RemoveColor {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");

        // Remove 2nd element (index 1)
        colors.remove(1);

        // Remove "Blue"
        colors.remove("Blue");

        System.out.println("After removing: " + colors);
    }
}