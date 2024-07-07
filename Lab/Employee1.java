package Lab;
//class declaration
 class Employees {
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

//class declaration
public class Employee1 {
//main method
	public static void main(String[] args) {
		//creating object 
		Employees[] emp=new Employees[5];
		//initializing employee objects
		emp[0]=new Employees(1,"srija",20000);
		emp[1]=new Employees(2,"sathwika",30000);
		emp[2]=new Employees(3,"sandhya",40000);
		emp[3]=new Employees(4,"pallavi",25000);
		emp[4]=new Employees(5,"vishwasini",35000);
		//variable declaration
		int i;
		//using for loop
		for(i=0;i<5;i++) {
			//printing the employee details
			System.out.println(emp[i]);
		}
		for(Employees s:emp)
			System.out.println(s);	
	}
}
