abstract class Employee {
	public abstract void netSalary();
}

class Intern extends Employee {
	public void netSalary() {
		System.out.println("Intern ");
	}
}

class Confirmed extends Employee {
	public void netSalary() {
		System.out.println("Confirmed");
	}
	public void transport(){
		System.out.println("transport done");
	}
}
class Contract extends Employee {
	public void netSalary() {
		System.out.println("Confirmed");
	}
}
class HR {
	public Employee recruit(String EmpType) {
		if (EmpType.equals("I"))
			return new Intern();
		else if(EmpType.equals("C"))
			return new Confirmed();
		else
			return new Contract();
	}
}
class Finance{
	public void processSalary(Employee emp){
		emp.netSalary();
		if(emp instanceof Confirmed){
			Confirmed conf =(Confirmed) emp;
			conf.transport();
		}
	}
}
public class EmployeeSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Intern();
		e.netSalary();
		HR hr = new HR();
		Finance finance=new Finance();
		Employee emp = hr.recruit("C");
		if (emp != null)
			finance.processSalary(emp);
		emp = hr.recruit("I");
		if (emp != null)
			finance.processSalary(emp);
	}

}
