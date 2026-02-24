# PalindromeCheckerApp
Goal: Measure and compare the execution time of different palindrome algorithms.

The Logic:

Time Capture: Uses System.nanoTime() for high-precision timing before and after each method call.

Duration Calculation: Subtracts the start time from the end time to find the total nanoseconds elapsed.

Benchmarking: Compares the lightweight Array-based method against the more memory-heavy Stack-based method.

Key Concepts
System.nanoTime(): Provides the current value of the running Java Virtual Machine's high-resolution time source.

Algorithm Efficiency: Demonstrates that while multiple ways lead to the same result, some are significantly faster and use less memory.

Scalability: Testing with larger strings highlights the performance gap between iterative and object-heavy solutions.