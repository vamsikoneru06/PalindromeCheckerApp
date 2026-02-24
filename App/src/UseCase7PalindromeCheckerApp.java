import java.util.ArrayDeque;
import java.util.Deque;

/**
 * =============================================================================
 * MAIN CLASS - UseCase7PalindromeCheckerApp
 * =============================================================================
 * * Use Case 7: Deque-Based Optimized Palindrome Checker
 * * Description:
 * This class uses a Deque to compare front and rear elements
 * for an optimized palindrome check.
 * * * At this stage, the application:
 * - Inserts characters into a Deque
 * - Removes from both ends simultaneously
 * - Compares characters until the Deque is empty or 1 element remains
 * * * @author vamsikoneru06
 * @version 7.0
 */
public class UseCase7PalindromeCheckerApp {

    /**
     * Application entry point for UC7.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Define the input string
        String input = "racecar";

        // Create a Deque to store characters
        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into the deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        // Compare front and rear until deque is empty or has one element
        while (deque.size() > 1) {
            // Remove first and last characters and compare
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        // Display the result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}