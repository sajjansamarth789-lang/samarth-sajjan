//1. Write a Java program to iterate through all elements in a linked list starting at the
//specified position ( 2 nd ) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))

package linkedlistprograms;

import java.util.*;

public class DisplayWithPosition {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");

        System.out.println("Elements with positions:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Position " + i + ": " + list.get(i));
        }
    }
}
