package TechnoHacks;

import java.security.SecureRandom;

//class declaration
public class Password {
	// Define the characters that can be included in the password
	private static final String Upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String Lower_case = "abcdefghijklmnopqrstuvwxyz";
	private static final String Digits = "0123456789";
	private static final String Special_characters = "@$^&*_";
	private static final String Characters = Upper_case + Lower_case + Digits + Special_characters;

	// Method to generate a random password of a given length
	public static String generateRandomPassword(int length) {
		// Check if the password length is at least 8 characters
		if (length < 8) {
			System.out.println("password must contain atleast 8 characters");
		}

		// Create a SecureRandom object to generate random values
		SecureRandom random = new SecureRandom();
		// Create a character array to hold the password
		char[] password = new char[length];

		// Add at least one character from each required character set
		password[0] = Upper_case.charAt(random.nextInt(Upper_case.length()));
		password[1] = Lower_case.charAt(random.nextInt(Lower_case.length()));
		password[2] = Digits.charAt(random.nextInt(Digits.length()));
		password[3] = Special_characters.charAt(random.nextInt(Special_characters.length()));

		// Fill the remaining characters randomly from all character sets
		for (int i = 4; i < length; i++) {
			password[i] = Characters.charAt(random.nextInt(Characters.length()));
		}

		// Shuffle the characters to ensure randomness
		for (int i = 0; i < password.length; i++) {
			int randomIndex = random.nextInt(password.length);
			char temp = password[i];
			password[i] = password[randomIndex];
			password[randomIndex] = temp;
		}

		// Return the generated password as a string
		return new String(password);
	}

	public static void main(String[] args) {
		// Desired length of the password
		int passwordLength = 8;
		// Generate a random password
		String randomPassword = generateRandomPassword(passwordLength);

		// Print the generated password
		System.out.println("Generated Random Password: " + randomPassword);
	}

}
