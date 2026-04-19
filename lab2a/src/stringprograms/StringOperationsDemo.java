//2 a. Develop a java program for performing various string operations with different string handling
//functions directed as follows
//String Creation and Basic Operations, Length and Character Access, String Comparison, String Searching,
//Substring Operations , String Modification, Whitespace Handling, String Concatenation, String
//Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and startsWith() and
//endsWith()





package stringprograms;

import java.util.*;

public class StringOperationsDemo {

    // 1. String Creation and Basic Operations
    public static void stringCreation() {
        String s1 = "Hello";
        String s2 = new String("World");
        System.out.println("String 1: " + s1);
        System.out.println("String 2: " + s2);
    }

    // 2. Length and Character Access
    public static void lengthAndAccess(String str) {
        System.out.println("Length: " + str.length());
        System.out.println("Character at index 2: " + str.charAt(2));
    }

    // 3. String Comparison
    public static void stringComparison() {
        String a = "Java";
        String b = "java";
        System.out.println("Equals: " + a.equals(b));
        System.out.println("Equals Ignore Case: " + a.equalsIgnoreCase(b));
    }

    // 4. String Searching
    public static void stringSearching(String str) {
        System.out.println("Index of 'a': " + str.indexOf('a'));
        System.out.println("Contains 'Java': " + str.contains("Java"));
    }

    // 5. Substring Operations
    public static void substringExample(String str) {
        System.out.println("Substring (0,4): " + str.substring(0, 4));
    }

    // 6. String Modification
    public static void stringModification(String str) {
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Replace 'a' with 'o': " + str.replace('a', 'o'));
    }

    // 7. Whitespace Handling
    public static void whitespaceHandling() {
        String str = "   Hello Java   ";
        System.out.println("Before trim: '" + str + "'");
        System.out.println("After trim: '" + str.trim() + "'");
    }

    // 8. String Concatenation
    public static void concatenation() {
        String a = "Hello";
        String b = "World";
        System.out.println("Concatenation: " + a.concat(" " + b));
    }

    // 9. String Splitting
    public static void splitting() {
        String str = "Java,Python,C++";
        String[] arr = str.split(",");
        System.out.println("Splitted Strings:");
        for (String s : arr) {
            System.out.println(s);
        }
    }

    // 10. StringBuilder Demo
    public static void stringBuilderDemo() {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" Java");
        sb.insert(5, " World");
        sb.replace(0, 5, "Hi");
        System.out.println("StringBuilder result: " + sb);
    }

    // 11. String Formatting
    public static void stringFormatting() {
        String name = "Samarth";
        int age = 20;
        String result = String.format("Name: %s, Age: %d", name, age);
        System.out.println(result);
    }

    // 12. Email Validation
    public static void validateEmail(String email) {
        if (email.contains("@") && email.startsWith("s") && email.endsWith(".com")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }

    // Main Method
    public static void main(String[] args) {

        String str = "Java Programming";

        System.out.println("=== String Creation ===");
        stringCreation();

        System.out.println("\n=== Length & Character Access ===");
        lengthAndAccess(str);

        System.out.println("\n=== String Comparison ===");
        stringComparison();

        System.out.println("\n=== String Searching ===");
        stringSearching(str);

        System.out.println("\n=== Substring ===");
        substringExample(str);

        System.out.println("\n=== String Modification ===");
        stringModification(str);

        System.out.println("\n=== Whitespace Handling ===");
        whitespaceHandling();

        System.out.println("\n=== Concatenation ===");
        concatenation();

        System.out.println("\n=== Splitting ===");
        splitting();

        System.out.println("\n=== StringBuilder Demo ===");
        stringBuilderDemo();

        System.out.println("\n=== String Formatting ===");
        stringFormatting();

        System.out.println("\n=== Email Validation ===");
        validateEmail("samarth@gmail.com");
    }
}
