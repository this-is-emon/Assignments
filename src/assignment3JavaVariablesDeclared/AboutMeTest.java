/* 
This Assignment is related to: Assignment Java Variables Declared
*/

package assignment3JavaVariablesDeclared;

// Step 6,7: Create another class AboutMeTest.
public class AboutMeTest {
		// Step 7: Main method
	public static void main(String[] args) {
		
		// Step 6,7: Instantiating AboutMe class inside the main method. 
		AboutMe my = new AboutMe();
		// Step 6,7: Initializing variables for me
		my.myName = "Emon";
		my.myAge = 32;
		my.myGender = 'M';
		my.myGrade = 3.5f;
		my.phoneNumber = 4353462;
		my.weight = 3256435;
		my.classNumber = 23;
		my.studentId = 34;
		my.fullTimeStudent = false;
		// Step 7: Calling method
		my.aboutMe();
		
		System.out.println("\n\n");
		
		// Step 6: Instantiating AboutMe class inside the main method.
		AboutMe alex = new AboutMe();
		// Step 6: Initializing variables for my best friend Alex
		alex.myName = "Alex";
		alex.myAge = 23;
		alex.myGender = 'M';
		alex.myGrade = 4.0f;
		alex.phoneNumber = 9357943;
		alex.weight = 934;
		alex.classNumber = 12;
		alex.studentId = 50;
		alex.fullTimeStudent = true;
		// Step 7: Calling method
		alex.aboutMe();
		

	}

}

