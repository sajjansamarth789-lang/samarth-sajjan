 package lab3;

import java.util.*;

public class StringOperationsDemo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = new String("World");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("\nLength of String1: " + str1.length());
        System.out.println("Character at index 1 in String1: " + str1.charAt(1));

        // 3. String Comparison
        String str3 = "hello";
        System.out.println("\nEquals: " + str1.equals(str3));
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase(str3));

        // 4. String Searching
        String text = "Java Programming Language";
        System.out.println("\nIndex of 'Programming': " + text.indexOf("Programming"));
        System.out.println("Contains 'Java': " + text.contains("Java"));

        // 5. Substring Operations
        System.out.println("\nSubstring (0-4): " + text.substring(0, 4));

        // 6. String Modification
        System.out.println("\nUppercase: " + text.toUpperCase());
        System.out.println("Replace 'Java' with 'Python': " + text.replace("Java", "Python"));

        // 7. Whitespace Handling
        String spaceStr = "   Hello Java   ";
        System.out.println("\nBefore Trim: '" + spaceStr + "'");
        System.out.println("After Trim: '" + spaceStr.trim() + "'");

        // 8. String Concatenation
        String result = str1 + " " + str2;
        System.out.println("\nConcatenated String: " + result);

        // 9. String Splitting
        String fruits = "Apple,Mango,Banana";
        String[] arr = fruits.split(",");
        System.out.println("\nSplit Strings:");
        for(String fruit : arr) {
            System.out.println(fruit);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        sb.insert(0, "Learn ");
        sb.replace(0, 5, "Master");
        System.out.println("\nStringBuilder Result: " + sb);

        // 11. String Formatting
        int num = 100;
        double price = 99.99;
        System.out.println("\nFormatted Output:");
        System.out.printf("Number: %d, Price: %.2f\n", num, price);

        // 12. Email Validation
        System.out.print("\nEnter Email: ");
        String email = sc.nextLine();

        if(email.contains("@") && email.startsWith("a") && email.endsWith(".com")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }

        sc.close();
    }
}