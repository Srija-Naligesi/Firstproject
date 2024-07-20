package TechnoHacks;

import java.util.Scanner;

//class declaration
public class Calculator {
	// main method
	public static void main(String[] args) {
		// Create a Scanner object to read input from the user
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter the first number
		System.out.println("Enter first number: ");
		// Read the first number
		double num1 = scanner.nextDouble();

		// Prompt the user to enter the second number
		System.out.println("Enter second number: ");
		// Read the second number
		double num2 = scanner.nextDouble();

		// Prompt the user to enter an operator
		System.out.println("Enter an operator (+, -, *, /): ");
		// Read the operator
		char operator = scanner.next().charAt(0);

		// Variable to store the result of the operation
		double result;

		// Switch statement to perform the operation based on the operator
		switch (operator) {
		case '+':
			System.out.println("Sum:");
			// Addition
			result = num1 + num2;
			break;

		case '-':
			System.out.println("Difference:");
			// Subtraction
			result = num1 - num2;
			break;

		case '*':
			System.out.println("Product:");
			// Multiplication
			result = num1 * num2;
			break;

		case '/':
			// Check if the second number is not zero to avoid division by zero
			if (num2 != 0) {
				System.out.println("Division:");
				result = num1 / num2;
			} else {
				// Error message for division by zero
				System.out.println("Error(Division by zero)");
				return;
			}
			break;

		default:
			// prints the invalid operator
			System.out.println("Invalid operator!");
			return;
		}

		// Print the result of the operation
		System.out.println("The result is: " + result);
	}
}
