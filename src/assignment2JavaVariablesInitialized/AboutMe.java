//Assignment Name: Assignment Java Variables Initialized

package assignment2JavaVariablesInitialized; //Step 1: Package -> "assignment2JavaVariablesInitialized"

public class AboutMe { // Step 2: Class -> "AboutMe"

	String myName1; // Step 3,9: Declaring a variable type

	// Step 4,9: Initializing String, int, float, char, and boolean type variables
	String myName = "Emon";
	int myAge = 32;
	float myGrade = 3.5f;
	char myGender = 'M';
	boolean fullTimeStudent;

	// Step 5,9: Declaring a Constructor
	public AboutMe() {
		System.out.println(": ------------ This is all about Myself ------------:");
	}

	// Step 6,9: Void type method named "aboutMe"
	public void aboutMe() {
		// Step 7: Calling all the variables inside syso.
		System.out.println("My name is: " + myName);
		System.out.println("My age is: " + myAge);
		System.out.println("My grade is: " + myGrade);
		System.out.println("My gender is: " + myGender);
		System.out.println("My studentship status is: " + fullTimeStudent);

	}

	public static void main(String[] args) {
		// Step 8,9: Instantiating AboutMe class inside the main method body.
		AboutMe em = new AboutMe();
		// Step 8,9: Object can only call the aboutMe method
		em.aboutMe();

	}

}
