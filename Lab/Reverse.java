package Lab;
import java.util.Scanner;
//class declaration
public class Reverse {
	//main method
	public static void main(String[] args) {
		// Creating a Scanner to read input from the console
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String str= sc.nextLine();
		//initializing StringBuilder object with a String
        StringBuilder strbul= new StringBuilder(str);
        // Reverse the string using the reverse method
        String rev = strbul.reverse().toString();
        // Printing the reversed string
        System.out.println("Reversed String:" + rev);
    }
}
