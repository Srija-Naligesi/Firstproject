package Lab;
public class ContractEmployee extends Employee {
	int contractperiod;
	int pf;
	public ContractEmployee(int empid, String empName, int empsalary, int contractperiod, int pf) {
		super(empid, empName, empsalary);
		this.contractperiod = contractperiod;
		this.pf = pf;
	}
	//method overriding to calculate total salary for contractEmployee
	void totalSalary() {
		empSalary=empSalary+(contractperiod*pf);
		System.out.println("Total salary of contract employee "+empName+":"+empSalary);
	}
	public static void main(String[] args) {
		//creating object for Employee
				Employee emp=new Employee(8,"ram",40000);
				emp.totalSalary();	
				//creating object for permanentEmployee
				PermanentEmployee peremp=new PermanentEmployee(7,"sonu",50000,5000);
				peremp.totalSalary();
				//creating object for contractEmployee
				ContractEmployee conemp=new ContractEmployee(4,"ravi",30000,3,5000);
				conemp.totalSalary();
	}
}