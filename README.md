# PalindromeCheckerApp
Objective: Design and implement a console-based Java application to validate strings as palindromes.
Purpose: Strengthen core programming fundamentals and data structure concepts.
UC1: Application Entry & Welcome Message
Goal: Display a welcome message and app details at startup.
Actor: User.
Flow:
Program starts and the JVM invokes the main() method.
Application name and version (1.0) are displayed.
The system confirms successful initialization.
Key Concepts:
Class: Container for the application logic.
Main Method: Entry point with the signature public static void main(String[] args).
Static Keyword: Allows the JVM to invoke the method without creating an object.
Console Output: Uses System.out.println() to display messages.
Execution Commands
Compile: javac UseCase1PalindromeCheckerApp.java.
Run: java UseCase1PalindromeCheckerApp.
* **Goal: Use a Stack data structure to reverse characters and validate a palindrome.
* Logic:
* Push: Insert each character of the string into the stack.
* Pop & Compare: Remove characters from the stack (returns them in reverse order) and compare them to the original string.
* Result: If all characters match, the input is a palindrome.
* Technical Details
* LIFO Principle: Stack follows Last In First Out, which naturally reverses the sequence.
* Data Structure: Uses the java.util.Stack collection.
* Operations: Leverages push() to add and pop() to retrieve/remove elements.
* Quick Commands
* Compile: javac UseCase5PalindromeCheckerApp.java
* Run: java UseCase5PalindromeCheckerApp**
