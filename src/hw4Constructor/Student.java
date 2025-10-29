/*
This Assignment is related to: Assignment Java Constructor:
*/
package hw4Constructor; // Step 1: Package name --> "hw4Constructor"

// Step 2: Class --> "Student", Declaring variables
public class Student {
	String name;
	int id;
	char gender;
	float grade;
	boolean isProgrammer;

	// Step 3: Default constructor.
	public Student() {
		System.out.println("This is all about Student.");
	}

	// Step 4: Declaring parameterized constructor
	public Student(String name, char gender, int id, float grade, boolean isProgrammer) {
		this.name = name;
		this.gender = gender;
		this.id = id;
		this.grade = grade;
		this.isProgrammer = isProgrammer;

		System.out.println("Student Name:" + name + ", ID:" + id + ", Gender:" + gender + ", Grade:" + grade
				+ ", and Java Programmer? " + isProgrammer);

	}

}
