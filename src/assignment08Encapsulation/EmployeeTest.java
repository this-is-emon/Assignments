package assignment08Encapsulation;

// Step 04: Class: EmployeeTest 
public class EmployeeTest {

	public static void main(String[] args) {

		// Step 04: Object from Employee Class
		Employee employee = new Employee();
		employee.setName("Captain Planet");
		employee.setAge(120);
		employee.setSex('M');
		employee.setCitizen(false);

		// Step 04: Executing those Getters and Setters:
		System.out.println("Employee Name: " + employee.getName() + "\nEmployee Age: " + employee.getAge()
				+ "\nGender: " + employee.getSex() + "\nEmployee is a Citizen? : " + employee.isCitizen());

	}

}
