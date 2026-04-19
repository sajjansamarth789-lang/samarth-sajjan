//3. Write a java program for getting different colors through ArrayList interface and sort them
//using Collections.sort( ArrayListObj)

package arraylistprograms;

import java.util.*;

public class SortColors {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");

        Collections.sort(colors);

        System.out.println("Sorted colors: " + colors);
    }
}
