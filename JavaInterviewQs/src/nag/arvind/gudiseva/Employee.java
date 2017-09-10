package nag.arvind.gudiseva;

public class Employee implements Cloneable {
	
	private int empId;
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	private String empName;

	public Employee() {}

	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
        // Forcibly throw the exception to prevent cloning
        //throw new CloneNotSupportedException();
		return super.clone();
	}
	
	/*
	 * Exception: java.lang.CloneNotSupportedException
	 * nag.arvind.gudiseva.Employee should implement markable interface
	 * Native Method: java.lang.Object.clone
	 */
	public static void main(String[] args) throws CloneNotSupportedException {

		Employee employee = new Employee(101, "Arvind");
		Employee cloneEmp = (Employee) employee.clone();
		
		System.out.println("Employee: " + employee);
		System.out.println("Clone: " + cloneEmp);

	}

}
