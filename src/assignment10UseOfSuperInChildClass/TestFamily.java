package assignment10UseOfSuperInChildClass;

// Step 06: Create TestFamily Class and instantiate Father class and initialize default, 
// 			parametrized constructor, also void type and parameterized method.
public class TestFamily {
	public static void main(String[] args) {

        // Default constructor
        Father f1 = new Father();
        f1.Father();  // Void method
        f1.FatherInfo("Rahim", 50, true, "Khan");  //Parameterized method

        System.out.println("--------------------------------");

        // Parameterized constructor
        Father f2 = new Father("Karim", 45, 'M', false);
        f2.Father();  // void method
        f2.FatherInfo("Karim", 45, false, "Ahmed");  // Parameterized method
        
        // Step 11: Instantiate Daughter class and initialize default, parametrized constructor, void type and parameterized method.
        //// Default constructor
        Daughter d1 = new Daughter();
        d1.daughter();  // Void method
        d1.daughterInfo("March", 18);  // Parameterized method

        System.out.println("--------------------------------");

        // Parameterized constructor
        Daughter d2 = new Daughter("July", 15);
        d2.daughter();  // Void method
        d2.daughterInfo("July", 15);  // Parameterized method
    }
}
