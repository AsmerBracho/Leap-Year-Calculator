/*
* Main Method
* Public Class LeapYearCalculator
*
* CCT Computer Programing Assignment
*
* Author: Asmer Bracho
* Student Number: 2016328
* Date: 26/10/2016
*/

public class LeapYearCalculator {
	public static void main(String[] args) { // Main Method
		LeapYear leapCalculator = new LeapYear(); // Create Calculator


		// Test If the year is a Leap Year or not
		leapCalculator.isLeapYear(1900); // Give it a Year to test
		
		//----------------------------------------------------------
		System.out.println("\n\n");
		//----------------------------------------------------------

		// Display Year Calendar 
		leapCalculator.displayCalendar(2016);

		//----------------------------------------------------------
		System.out.println("\n\n");
		//----------------------------------------------------------
		
		/*
		* Next section is an extra section which organize the calendar by columns of 4
		* 
		*/
		// A Beautiful Calendar :)
		//leapCalculator.beautifulCalendar(2016);
	
	} // end of main Method 	
} // end of LeapYearCalculator