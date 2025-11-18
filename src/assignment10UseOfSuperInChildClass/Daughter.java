package assignment10UseOfSuperInChildClass;
// Step 12: Daughter extends Father (superclass). Use the super method, and super keyword and show all of their use in the child class.

// Step 07: Class name 'Daughter', variable birthMonth, and age.
public class Daughter extends Father{
	public String birthMonth;
    public int age;
    
    // Step 08: Default constructor 
    Daughter() {
    	super(); // Step 12
        System.out.println("I am the default constructor of Daughter class");
    }

    // Step 08: 2 variables inside a parameterized constructor
    Daughter(String birthMonth, int age) {
        this.birthMonth = birthMonth;
        this.age = age;
        System.out.println("Daughter Details --> Birth Month: " + birthMonth + ", Age: " + age);
    }
    
    // Step 09: Regular void type method named daughter() which is implemented, and create a sysout inside it.
    public void daughter() {
        System.out.println("This is a regular void type method 'daughter' inside Daughter class");
    }
    
    // Step 10: Parameterized method daughterInfo(),contains it's 2 variables and  a sysout 
    public void daughterInfo(String birthMonth, int age) {
        System.out.println("Daughter Details --> Birth Month: " + birthMonth + ", Age: " + age);
    }
}
