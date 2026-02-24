# PalindromeCheckerApp
Goal: Use a Deque to compare front and rear elements for maximum efficiency.

The Logic:


Deque (Double-Ended Queue): A structure allowing insertion/deletion at both ends.


Comparison: Simultaneously remove the first and last characters; if they match, continue until the Deque is empty.


Benefit: This is highly optimized as it avoids extra memory for reversals and provides direct index-free access to ends.

