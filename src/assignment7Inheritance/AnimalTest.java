package assignment7Inheritance;

// Step 11: Class "AnimalTest"
public class AnimalTest {

	public static void main(String[] args) {

		// Step 11: Calling objects and methods of every class
		Animal myAnimal = new Animal();
		myAnimal.animalInfo();

		Mammal myMammal = new Mammal();
		myMammal.mammalInfo();

		Reptile myReptile = new Reptile();
		myReptile.reptileInfo();

		Birds myBirds = new Birds();
		myBirds.birdsInfo();

		Dog myDog = new Dog();
		myDog.dogInfo();

		Snake mySnake = new Snake();
		mySnake.snakeInfo();

		Robin myRobin = new Robin();
		myRobin.robinInfo();

		BullDog myBullDog = new BullDog();
		myBullDog.bullDogInfo();

		Cobra myCobra = new Cobra();
		myCobra.cobraInfo();

		System.out.println("-------------------------------------------");

		// Step 12: An object Can call other methods if the class is extended, if yes,
		// show all the possible calls.
		BullDog yourBullDog = new BullDog();
		yourBullDog.animalInfo();
		yourBullDog.mammalInfo();
		yourBullDog.dogInfo();
		yourBullDog.bullDogInfo();
		
		System.out.println("-------------------------------------------");
		
		Cobra yourCobra = new Cobra();
		yourCobra.animalInfo();
		yourCobra.reptileInfo();
		yourCobra.snakeInfo();
		yourCobra.cobraInfo();
		
		System.out.println("-------------------------------------------");
		
		Robin yourRobin = new Robin();
		yourRobin.animalInfo();
		yourRobin.birdsInfo();
		yourRobin.robinInfo();
		

	}

}
