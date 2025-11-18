/*
 HW10:
*/
// Step 01: Package"assignment10UseOfSuperInChildClass"
package assignment10UseOfSuperInChildClass;

// Step 02: Class: Father, 5 variables: Name, age, sex, usCitizen, and FamilyName.
public class Father {
	public String Name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String FamilyName;
	
	// Step 03: Default constructor (a sysout inside it)
	Father() {
		System.out.println("I am default constructor from 'Father' class");
	}
	
	// Step 03: First 4 variables to create a parameterized constructor (create a sysout inside it) with the parameters.
	Father(String Name, int age, char sex, boolean usCitizen){
		this.Name = Name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		
		System.out.println("Name = " + Name + ", Age = " + age + ", Sex = " + sex + ", US Citizen = " + usCitizen);

	}
	
	// Step 04: Regular void type method name father() which is implemented, and declare a sysout inside it.
	public void Father() {
		System.out.println("This is a Regular void type method Father inside Class Father");
	}
	
	// Step 05: Create a parameterized method fatherInfo() which also contains it's 4 variables, and declare a sysout (you can copy from parameterized constructor if you want).
	public void FatherInfo(String Name, int age, boolean usCitizen, String FamilyName) {
		System.out.println("Father: " + Name + " (" + age + " years old), Family: " + FamilyName + ", US Citizen: " + usCitizen);

	}
}
