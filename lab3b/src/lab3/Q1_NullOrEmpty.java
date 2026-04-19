/*Q1. Write a Java Program for Checking if a given string is null or contains only whitespace using user
defined function isNullOrEmpty().*/

package lab3;

import java.util.Scanner;

public class Q1_NullOrEmpty {

    public static boolean isNullOrEmpty(String str) {
        return (str == null || str.trim().isEmpty());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isNullOrEmpty(input)) {
            System.out.println("String is NULL or contains only whitespace");
        } else {
            System.out.println("String is NOT empty");
        }

        sc.close();
    }
}
