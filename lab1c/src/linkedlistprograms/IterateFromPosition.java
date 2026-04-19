//2. Write a Java program to iterate a linked list in reverse order (using
//objlist.descendingIterator())


package linkedlistprograms;

import java.util.*;

public class IterateFromPosition {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");

        // Start from index 1 (2nd position)
        Iterator<String> it = list.listIterator(1);

        System.out.println("Elements from 2nd position:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
