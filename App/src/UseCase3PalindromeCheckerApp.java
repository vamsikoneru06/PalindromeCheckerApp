import java.util.Scanner;

/**
 * =============================================================================
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 * =============================================================================
 * * Use Case 3: Reverse String Based Palindrome Check
 * * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with
 * the original value.
 * * At this stage, the application:
 * - Iterates the string in reverse order
 * - Builds a reversed version
 * - Compares original and reversed strings
 * - Displays the validation result
 * * This introduces transformation-based validation.
 * * @author Developer
 * @version 3.0
 */
public class UseCase3PalindromeCheckerApp {

    /**
     * Application entry point for UC3.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 3.0");
        System.out.println("System initialized successfully.");
        System.out.print("Enter a string to check: ");

        String input = scanner.nextLine();
        String reversed = "";

        // Reverse string using loop
        // Iterate from the last character to the first. [cite: 35]
        for (int i = input.length() - 1; i >= 0; i--) {
            // String Concatenation (+) – used to build reversed string
            reversed = reversed + input.charAt(i);
        }

        // Compare original and reversed
        // Use equals() to compare content instead of memory references
        if (input.equals(reversed)) {
            // Display result
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a palindrome.");
        }

        scanner.close();
    }
}