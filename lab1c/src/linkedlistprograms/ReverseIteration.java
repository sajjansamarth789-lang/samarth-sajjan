 //4. Write a Java program to display elements and their positions in a linked list ( using
//l_listobj.get(p) )


package linkedlistprograms;

import java.util.*;

public class ReverseIteration {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");

        Iterator<String> it = list.descendingIterator();

        System.out.println("Elements in reverse order:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
