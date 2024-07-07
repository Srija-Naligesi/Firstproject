package Lab;
//class declaration
public class DemoStringBuilder {
//main method
	public static void main(String[] args) {
		//initializing StringBuilder object with a String
		StringBuilder strb=new StringBuilder("Hello world");
		//printing the StringBuilder object
		System.out.println(strb);
		//prints the length of a string
		System.out.println(strb.length());
		//prints the index of string
		System.out.println(strb.indexOf("o"));
		//initializing a StringBuffer with a string
		StringBuffer strb1=new StringBuffer(strb);
		System.out.println(strb1);
		//convert StringBuffer to StringBuilder
		StringBuilder strbul=new StringBuilder(strb1);
		System.out.println(strbul);
	}

}
