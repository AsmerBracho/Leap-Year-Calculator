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

import java.util.Scanner;

public class LeapYearCalculator {
  
    static Scanner sc = new Scanner(System.in);
    
	public static void main(String[] args) { // Main Method
	  System.out.print("\nPlease Enter a Year: ");
	  int year = sc.nextInt();
	  LeapYear leapCalculator = new LeapYear(); // Create Calculator


		// Test If the year is a Leap Year or not
		leapCalculator.isLeapYear(year); // Give it a Year to test
		
		//----------------------------------------------------------
		System.out.println("\n\n");
		//----------------------------------------------------------

		// Display Year Calendar 
		leapCalculator.displayCalendar(year);

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