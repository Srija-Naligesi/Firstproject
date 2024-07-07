//program using method overriding
package Lab;
//super class
public class Employee {
	//variables declaration
	int empId;
	String empName;
	int empSalary;
	//constructor declaration
	public Employee(int empid,String empName,int empsalary) {
		super();
		this.empId=empid;
		this.empName=empName;
		this.empSalary=empsalary;
	}
	//method to calculate total salary
	void totalSalary(){ 
		System.out.println("Total salary of "+empName+" :"+empSalary);
	}

}
