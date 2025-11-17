/*
Java Abstraction:
*/
// Package name: "assignment9Abstraction"
package assignment9Abstraction;

// Abstract Class : "MedicalSchool"
public abstract class MedicalSchool {
	
	// Constructor: Inside Abstract Class - "MedicalSchool"
	public MedicalSchool() {
		System.out.println("This is the Constructor from the Absract class 'MedicalSchool'");
	}
	
	// 2 Methods - abstract("anatomyLab") and non-abstract("biochemistryLab")
	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("This is a non-abstract method named 'biochemistryLab' from abstract class 'MedicalSchool'.");
	}
}
