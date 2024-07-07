package Lab;
//declaring enum
enum Department{
	Accounts,
	Devops,
	Testing,
	Hr
}
//class declaration
public class DemoEnum{
	//main method
	public static void main(String[] args) {
		Department d=Department.Testing;
		Department d1=Department.Accounts;
		//printing the values
		System.out.println(d);
		System.out.println(d.compareTo(d1));
		System.out.println(d.equals(d1));
	}
}