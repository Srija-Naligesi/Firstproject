package Lab;
//class declaration
public class DemoStringBuffer {
	//main method
	public static void main(String[] args) {
		//initializing StringBuffer object with a String
		StringBuffer strbuff=new StringBuffer("Anudip");
		//printing the StringBuffer object
		System.out.println(strbuff);
		//append method declaration
		strbuff.append("Foundation");
		System.out.println(strbuff);
		//printing reverse of a string
		System.out.println(strbuff.reverse());
		//printing character of a string at index 3
		System.out.println(strbuff.charAt(3));	
		//printing index of a string at character c
		System.out.println(strbuff.indexOf("c"));
		//printing the capacity of a string
		System.out.println(strbuff.capacity());
		//initializing another StringBuffer with a string
		StringBuffer strb=new StringBuffer("Advance program on java fullstack using Angular");
		System.out.println(strb.capacity());
		//deleting the character of a string
		strb.deleteCharAt(8);
		System.out.println(strb);
		//prints the ASCII
		System.out.println(strb.codePointAt(0));
		//compares the two strings
		System.out.println(strb.compareTo(strbuff));
		//prints the boolean value if two strings are equal
		System.out.println(strb.equals(strbuff));
		//prints the length of a string
		System.out.println(strb.length());
	}

}
