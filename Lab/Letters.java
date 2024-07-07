package Lab;
import java.util.Scanner;
//class declaration
public class Letters {
//main method
			public static void main(String[] args) {	
				int vowels=0;
				int consonants=0;
				System.out.println("Enter a String:");
				Scanner s=new Scanner(System.in);
				String str=s.nextLine();
				str=str.toLowerCase();
				for(int i=0;i<str.length();i++) {
					if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u') {
						vowels++;
				}
					else if(str.charAt(i)!=' ') {
						consonants++;
			}
			}
				System.out.println(vowels);
				System.out.println(consonants);
	}

}
