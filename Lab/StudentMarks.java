package Lab;
import java.util.Scanner;
//class declaration
public class StudentMarks {
	public static void main(String[] args) {	
		//defining array
		int marks[]=new int[6];
		System.out.println("enter the marks of student:");
		Scanner sc=new Scanner(System.in);	
		for(int i=0;i<marks.length;i++) {
			marks[i]=sc.nextInt();
		}
		//initializing variables
		int i=0;
		int total=0;
		float percentage;
			boolean b=true;
			for(;i<marks.length;) {
				//condition for checking the marks and giving results
				if(marks[i]<=35)
					b=false;
				i++;
			}
			if(b) {
				for(i=0;i<marks.length;i++) {
					total+=marks[i];
				}
				percentage=total/6;
				//printing result
				System.out.println("student Result:Total="+total+",Percentage="+percentage);
			}
			else
				System.out.println("student got failed");
	}
		
}