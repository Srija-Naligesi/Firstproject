package Lab;
import java.util.Scanner;
//class declaration
public class Calculator {
//main method
	public static void main(String[] args) {
		//declaration of local variables
				int a,b;
				System.out.println("enter and b values");
				Scanner sc=new Scanner(System.in);
				a=sc.nextInt();
				b=sc.nextInt();
				System.out.println("a+b="+(a+b));
				System.out.println("a-b="+(a-b));
				System.out.println("a*b="+(a*b));
				System.out.println("a/b="+(a/b));
				System.out.println("a%b="+(a%b));
	}

}
