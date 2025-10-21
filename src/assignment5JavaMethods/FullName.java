package assignment5JavaMethods; // Step 1: Package Name
/*
Assignment Name: Assignment Java Methods
*/

public class FullName { // Step 5:Another class "FullName".


	// Step 6: String return type parameterized method
	public String fullName(String fName, String lName) { // Step 6: String type parameter
		System.out.println("Family Member: " + fName + " " + lName); // Step 6: SYSO outcome
		return null;
	}

	// Step 7: Main method
	public static void main(String[] args) {
		
		FullName familyMemberName = new FullName(); // Step 7: Instantiating class object
		// Step 7: Calling parameterized method & printing names
		familyMemberName.fullName("John", "Doe");
		familyMemberName.fullName("Chris", "Martin");
		familyMemberName.fullName("Nancy", "Polecy");
		familyMemberName.fullName("Mickel", "Jackson");
	}

}
