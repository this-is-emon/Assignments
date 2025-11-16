/*
 Assignment Java Encapsulation:
*/

//Step 01: Package name : "assignment08Encapsulation"
package assignment08Encapsulation;

public class Employee {

	// Step 02: Private variables----> name, age, sex, citizen:
	private String name;
	private int age;
	private char sex;
	private boolean citizen;

	// Step 03: Getter and Setter method:
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public boolean isCitizen() {
		return citizen;
	}

	public void setCitizen(boolean citizen) {
		this.citizen = citizen;
	}

}
