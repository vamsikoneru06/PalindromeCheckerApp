# PalindromeCheckerApp
Goal: Handle sentences by ignoring spaces, punctuation, and letter casing

The Logic:
Normalization: Uses replaceAll("[^a-zA-Z0-9]", "") to remove everything except letters and numbers.

Lowercasing: Uses .toLowerCase() so that 'A' matches 'a'.

Validation: Applies the standard comparison logic to the cleaned, uniform string.

Key Concepts

Regular Expressions (Regex): Powerful patterns used to identify and replace specific characters in a string.

String Preprocessing: The act of cleaning data before processing it to ensure accuracy.

Data Structure: Utilizes String and Arrays for processing.