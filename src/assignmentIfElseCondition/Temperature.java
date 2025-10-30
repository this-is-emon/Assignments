/*
 Assignment_Java_if_else_02:
 
*/
package assignmentIfElseCondition; //Step 01: Package name --> "assignmentIfElseCondition"

import java.util.Scanner;

public class Temperature { // Step 02: Class: "Temperature".

	public static void main(String[] args) {
		// Step 02: Inside the main method, Use syso "Today's Weather".
		System.out.println("Today's Weather: ");

		// Step 03: Scanner class to define an int type variable 'todaysTemperature'.
		Scanner scanner = new Scanner(System.in);
		int todaysTemperature = scanner.nextInt();

		// Step 04: If the temperature is less than 32, the outcome will be "Freezing"
		if (todaysTemperature < 32) {
			System.out.println("Freezing");
		}

		// Step 05: If the temperature is less than 55, the outcome will be "Pleasant"
		else if (todaysTemperature < 55) {
			System.out.println("Pleasant");
		}

		// Step 06: If the temperature is less than 73, the outcome will be "Getting
		// Warmer"
		else if (todaysTemperature < 73) {
			System.out.println("Getting Warmer");
		}

		// Step 07: If the temperature is less than 101, then print "Hot"
		else if (todaysTemperature < 101) {
			System.out.println("Hot");
		}

		// Step 08: If the temperature is greater than or equal to 101, the outcome will
		// be "Very Hot"
		else if (todaysTemperature > 101) {
			System.out.println("Very Hot");
		}

		// Step 09: And finally the outcome will be "Please put a valid temperature".
		// Please don't forget to close the scanner.
		else {
			System.out.println("Please put a valid temperature");
		}

		scanner.close();

	}

}
