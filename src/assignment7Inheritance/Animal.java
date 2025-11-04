/*
Assignment Java Inheritance:
*/
package assignment7Inheritance; //Step 01: Package name "assignment7Inheritance"

// Step 02: Class "Animal"
public class Animal {
	void animalInfo() {
		System.out.println("This method is from Animal Class");
	}
}

// Step 03: Class "Mammal"
// Step 12, 13: Single inheritance, Hierarchical inheritance
class Mammal extends Animal { // Bulldog <-- dog <-- mammal <--Animal
	void mammalInfo() {
		System.out.println("This method is from Mammal Class");
	}
}

// Step 06: Class "Dog"
// Step 12, 13: Multilevel inheritance
class Dog extends Mammal { // Bulldog <-- dog <-- mammal <--Animal
	void dogInfo() {
		System.out.println("This method is from Dog Class");
	}
}

// Step 09: Class "BullDog"
// Step 12, 13: Multilevel inheritance
class BullDog extends Dog { // Bulldog <-- dog <-- mammal <--Animal
	void bullDogInfo() {
		System.out.println("This method is from BullDog Class");
	}
}

//Step 04: Class "Reptile"
//Step 12, 13: Single inheritance, Hierarchical inheritance
class Reptile extends Animal { // Cobra <-- snake <--reptile <--Animal
	void reptileInfo() {
		System.out.println("This method is from Reptile Class");
	}
}

// Step 07: Class "Snake"
// Step 12, 13: Multilevel inheritance
class Snake extends Reptile { // Cobra <-- snake <--reptile <--Animal
	void snakeInfo() {
		System.out.println("This method is from Snake Class");
	}
}

// Step 10: Class "Cobra"
// Step 12, 13: Multilevel inheritance
class Cobra extends Snake { // Cobra <-- snake <--reptile <--Animal
	void cobraInfo() {
		System.out.println("This method is from Cobra Class");
	}
}

// Step 05: Class "Birds"
// Step 12, 13: Single inheritance, Hierarchical inheritance
class Birds extends Animal { // Robin <-- Bird <-- Animal
	void birdsInfo() {
		System.out.println("This method is from Birds Class");
	}
}

// Step 08: Class "Robin"
// Step 12, 13: Multilevel inheritance
class Robin extends Birds { // Robin <-- Bird <-- Animal
	void robinInfo() {
		System.out.println("This method is from Robin Class");
	}
}
