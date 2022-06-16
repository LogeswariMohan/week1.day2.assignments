package week1.day2.assignments;

public class EmployeeDetails {
	
	//Create a new class as EmployeeDetails with methods as below
	
			public void employeeName(String empName, int empId) {
				System.out.println(empName+ " "+empId);
			}
			public void getEmployeeAddress(String empAddress) {
				System.out.println(empAddress);
			}
			private void printEmployeeSalary(double empSalary) {
				System.out.println(empSalary);
			}
			public void printEmployeeMobileNumber(long mobNum) {
				System.out.println(mobNum);
			}

	public static void main(String[] args) {
		
		//Call all the methods from main() and execute
		
		EmployeeDetails e = new EmployeeDetails();
		e.employeeName("Logeswari", 10701);
		e.getEmployeeAddress("Chennai");
		e.printEmployeeSalary(10500.85);
		e.printEmployeeMobileNumber(986543210);
	}

}
