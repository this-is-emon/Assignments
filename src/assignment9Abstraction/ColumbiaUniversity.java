package assignment9Abstraction;

// Regular Class: ColumbiaUniversity 
public class ColumbiaUniversity {
	// Constructor : Yes we can create a Constructor inside a regular Class
	public ColumbiaUniversity(){
		System.out.println("This is Constructor from a regular class named 'ColumbiaUniversity'");
	}
	
	/* We can not declare a "Abstract method" inside a "Regular Class":
	 * Because, A regular class can contain "Implemented" method only, Otherwise it becomes an Abstract class 
	 */
	//public abstract void chemistry();
	
	// Regular method
	public void biology() {
		System.out.println("It's a regular method 'biology' inside regular class 'ColumbiaUniversity'");
	}
}
