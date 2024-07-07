package Lab;
//child class extends Parent class Employee
public class PermanentEmployee extends Employee {
   int bonus;
   public PermanentEmployee(int empid, String empName, int empsalary, int bonus) {
		super(empid, empName, empsalary);
		this.bonus = bonus;
	}
//method overriding to calculate total salary for permanentEmployee
	void totalSalary(){
		empSalary+=bonus;
		System.out.println("Total salary of permanent employee"+ empName+":"+empSalary);
	}
}
