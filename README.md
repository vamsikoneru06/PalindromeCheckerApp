# PalindromeCheckerApp
Goal: Move from procedural code to Object-Oriented Design via encapsulation.

The Logic:

Encapsulation: The validation logic is hidden inside a PalindromeService class.

Single Responsibility: The Main class only handles app startup, while the Service class only handles validation.

Reusability: You can now create multiple instances of the service or use it in different parts of a larger system.

Key Concepts
Class & Object: Creating a template (Class) and an instance (Object) to perform tasks.

Separation of Concerns: Keeping "how it works" separate from "how it's used."

Method Exposure: Providing a public API (check()) for other classes to interact with.