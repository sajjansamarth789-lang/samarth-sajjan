 package lab3;

import java.util.Scanner;

public class Q8_IsNumeric {

    public static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isNumeric(input)) {
            System.out.println("String contains only numeric characters");
        } else {
            System.out.println("String is NOT numeric");
        }

        sc.close();
    }
}