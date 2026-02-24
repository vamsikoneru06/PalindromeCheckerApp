# PalindromeCheckerApp
Goal: Enable the application to choose a palindrome algorithm dynamically at runtime.

The Logic:

Interface: Define a PalindromeStrategy interface that all algorithms must follow.

Concrete Strategies: Implement different logic (Stack, Deque, Array) in separate classes.

Polymorphism: The main app interacts with the interface, not the specific class, allowing for "plug-and-play" behavior.

Key Concepts
Strategy Pattern: Defines a family of algorithms, encapsulates each one, and makes them interchangeable.

Polymorphism: Using a single interface to represent different underlying forms (algorithms).

Dependency Injection: Passing the desired algorithm into the context at runtime.