import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * =============================================================================
 * MAIN CLASS - UseCase6PalindromeCheckerApp
 * =============================================================================
 * * Use Case 6: Queue + Stack Fairness Check
 * * Description:
 * This class demonstrates palindrome validation using 
 * two different data structures to show FIFO vs LIFO behaviors.
 * * At this stage, the application:
 * - Enqueues characters into a Queue (FIFO)
 * - Pushes characters into a Stack (LIFO)
 * - Compares dequeue vs pop outputs
 * * If all characters match, the input is a palindrome.
 * * @author vamsikoneru06
 * @version 6.0
 */
public class UseCase6PalindromeCheckerApp {

    /**
     * Application entry point for UC6.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {

        String input = "civic";

        Queue<Character> queue = new LinkedList<>();


        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        boolean isPalindrome = true;

        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        //  Display results
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}