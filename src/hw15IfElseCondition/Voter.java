/*
HW_Java_if_else_01:
*/
package hw15IfElseCondition; //Step 01: Package name --> "hw15IfElseCondition"

public class Voter { //Step 02: Class name: "Voter"
	
	public static void main(String[] args) { //Step 03: Main method
		int age = 99; //Step 03: Initializing int-type variable "age"
		
		//Step 04: if your age is equal to 18, the outcome will be "I am a Voter"
		if (age == 18) {
			System.out.println("I am a Voter");
		}
		//Step 05: if your age is less than 18, the outcome will be "I am not a Voter"
		else if (age < 18) {
			System.out.println("I am not a Voter");
		}
		//Step 06: if your age is greater than 18, the outcome will be "I am a Voter from age 18"
		else if (age > 18) {
			System.out.println("I am a Voter from age 18");
		}
		//Step 07: And finally the outcome will be "Please add a valid age".
		else {
			System.out.println("Please add a valid age");
		}
	}

}
