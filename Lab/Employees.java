package Lab;
//class declaration
public class Employees {
	//variable declaration
	int empid;
	String empname;
	int empsalary;
	//constructor
	public Employees(int empid,String empname,int empsalary) {
		super();
		this.empid=empid;
		this.empname=empname;
		this.empsalary=empsalary;
	}
	//override
	public String toString() {
		return"Employee1[id="+empid+",name="+empname+",salary="+empsalary+"]";
	}	
}
