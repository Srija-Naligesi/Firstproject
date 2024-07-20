package TechnoHacks;

import java.util.Random;
import java.util.Scanner;

//class declaration
public class RandomNum {
	// main method
	public static void main(String[] args) {
		// Prompt the user to guess a number between 1 and 100
		System.out.println("guess a number between 1 and 100");

		// Create a Scanner object to read input from the user
		Scanner sc = new Scanner(System.in);
		// Read the user's guess
		int num = sc.nextInt();

		// Create a Random object to generate random numbers
		Random random = new Random();

		// Generate a random number between 0 and 100
		int target = random.nextInt(100);

		// Loop until the user's guess matches the target number
		while (num != target) {
			// Check if the user's guess is greater than the target number
			if (num > target) {
				// Inform the user that their guess is too high and prompt them to guess again
				System.out.println("Your guess is greater,guess again");
				// Read the user's new guess
				num = sc.nextInt();
			}

			// Read the user's new guess
			else if (num < target) {
				// Inform the user that their guess is too low and prompt them to guess again
				System.out.println("Your guess is lower,guess again");
				// Read the user's new guess
				num = sc.nextInt();
			}
		}

		// Inform the user that their guess is correct
		System.out.println("Your guess is correct congrats!!");
	}
}
