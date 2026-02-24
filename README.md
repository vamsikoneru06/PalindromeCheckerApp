# PalindromeCheckerApp
Goal: Check if a string is a palindrome using the power of Recursion.

The Logic:

Recursive Call: The method compares the characters at the current start and end positions.

Subproblem: If they match, the method calls itself with the inner substring (moving pointers inward).

Base Condition: The recursion stops when the pointers meet or cross, confirming a palindrome.

Key Concept:

Call Stack: This method relies on the JVM's internal stack to manage each recursive call.