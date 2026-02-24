/**
 * =============================================================================
 * MAIN CLASS - UseCase10PalindromeCheckerApp
 * =============================================================================
 * * Use Case 10: Case-Insensitive & Space-Ignored Palindrome
 * * Description:
 * This class handles real-world sentences by ignoring case and removing 
 * spaces/special characters before performing the palindrome check.
 * * At this stage, the application:
 * - Normalizes input using Regular Expressions (Regex)
 * - Converts all characters to lowercase
 * - Performs validation on the "cleaned" string
 * * @author vamsikoneru06
 * @version 10.0
 */
public class UseCase10PalindromeCheckerApp {

    /**
     * Application entry point for UC10.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Define the input string with spaces and mixed case
        String input = "A man a plan a canal Panama";

        // Normalize the string:
        // 1. Replace all non-alphanumeric characters with an empty string
        // 2. Convert the result to lowercase
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isPalindrome = checkPalindrome(normalized);

        // Display the results
        System.out.println("Original Input : " + input);
        System.out.println("Normalized     : " + normalized);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }

    /**
     * Standard two-pointer validation logic
     */
    private static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}