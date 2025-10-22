/*
 This Assignment is related to: Assignment Java Variables Declared 
*/
package assignment3JavaVariablesDeclared; // Step 1: Package Name -> "assignment3JavaVariablesDeclared" 

public class AboutMe { // Step 2: Class declared
	// Step 3: Declaring variables
	String myName1;
	String myName;
	int myAge;
	float myGrade;
	char myGender;
	boolean fullTimeStudent;
	byte studentId;
	short classNumber;
	long phoneNumber;
	double weight;

	// Step 7: Constructor declared
	public AboutMe() {
		System.out.println(": ------------ This is all about Myself ------------:");
	}

	// Step 4,5,7: Method Initialized
	public void aboutMe() {
		System.out.println("My name is: " + myName + "\nMy age is: " + myAge + "\nMy grade is: " + myGrade
				+ "\nMy gender is: " + myGender + "\nMy studentship status is: " + fullTimeStudent + "\nMy student id: "
				+ studentId + "\nMy class is: " + classNumber + "\nMy phone number: " + phoneNumber + "\nMy weight is: "
				+ weight);

	}

}
