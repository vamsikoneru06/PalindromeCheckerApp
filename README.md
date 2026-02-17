# PalindromeCheckerApp
Goal: Optimize palindrome checking by comparing characters directly.
Logic:
Convert string to a char array for index-based access.
Apply the Two-Pointer Technique.
Start one pointer at the beginning and one at the end, moving toward the center.
Compare characters at each step; if they don't match, it is not a palindrome.
Why This is Better
Memory Efficient: Reduces extra memory usage by avoiding new string objects.
Faster: Uses a primitive array and stops early if a mismatch is found.
Data Structure: Uses char[] instead of String manipulation.
Quick Commands
Compile: javac UseCase4PalindromeCheckerApp.java.
Run: java UseCase4PalindromeCheckerApp.