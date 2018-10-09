/*
* Public Class LeapYear
*
* CCT Computer Programing Assignment
*
* Author: Asmer Bracho
* Student Number: 2016328
* Date: 26/10/2016
*/

public class LeapYear {
	// Here our intance variables
	int day = 1; //this will be the one to be printed in our days in the calendar
	int countDay = 1; //count the days in the background and keep register  
	int countMonth = 1; // count our months in the background
	int year; // to be used in our displayCalendar Method
	int checkYear; // this is an int because we will need to do calculations with it 
	String line = "=============================="; // for designing in our programe
	int dayOftheWeek; //
	int firstDay = 1; // this will be always the first day of each month => 1 of january, 1 of february ... 
	boolean itIsOrNot; //A variable to be used in our calendar later
	String week = "  Su  Mo  Tu  We  Th  Fr  Sa";
	String printMonth;
	
	//Constructor 
	public LeapYear() {
	//We do not need to add or change anything here so far 
	}

	//Methods

	/*
	* isLeapYear
	*
	* This method should be able to print if a 
	* specific year is Leap year or not
	*
	*/
	public void isLeapYear(int checkYear) {
		System.out.print("\n\n    |Leap Year Checking|\n\n");
		this.checkYear = checkYear; 
		if (checkYear % 4 == 0) { // evaluate if the year is divisible by 4
			if (checkYear % 100 == 0) { // If It is divisible by 4 we get here and evaluate if It is divisible by 100
				if (checkYear % 400 == 0) { // If it is divisible by 100 we need to check the last stament and check If It is divisible by 400 
					System.out.printf(line + "\n" + "  Year \t" + "    Is It Leap Year?" + "\n  " + checkYear + "\t \t Yes" + "\n" + line); // It is a Leap Year, So We print this fact
				} else { // It is not divisible by 400 so It is not a Leap Year
					System.out.print(line + "\n" + "  Year \t" + "     Is It Leap Year?" + "\n  " + checkYear + "\t \t No" + "\n" + line + "\n");
				}
			} else { // Here It is not divisible by 100 but It was by 4 so that means, It is a Leap Year
				System.out.print(line + "\n" + "  Year \t" + "    Is It Leap Year?" + "\n  " + checkYear + "\t \t Yes" + "\n" + line + "\n"); //Print the fact
			}
		} else { // It is not divisible by 4, then It is not a Leap Year 
			System.out.print("\n" + line + "\n" + "  Year \t" + "    Is It Leap Year?" + "\n  " + checkYear + "\t \t  No" + "\n" + line + "\n"); // Print it
		}
	} // end of isLeapYear
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	/*
	* displayCalendar
	*
	* This method will display any year calendar 
	* maching the days with the respectively dates
	*/

	public void displayCalendar (int year) {
		this.year = year;
		/*
		* Since we have two methods each of then separated from each other we can have diferent requests and because of that
		* we will need to evaluate again if the year is a leap Year or not
		*/
		if (year % 4 == 0) { // evaluate if the year is divisible by 4
			if (year % 100 == 0) { // If It is divisible by 4 we get here and evaluate if It is divisible by 100
				if (year % 400 == 0) { // If it is divisible by 100 we need to check the last stament and check If It is divisible by 400
					itIsOrNot = true; 
				} else { // It is not divisible by 400 so It is not a Leap Year
					itIsOrNot = false;
					}
			} else { // Here It is not divisible by 100 but It was by 4 so that means, It is a Leap Year
				itIsOrNot = true;
				}
		} else { // It is not divisible by 4, then It is not a Leap Year 
			itIsOrNot = false;
			}

		//------------------------------HERE START OUR CALENDAR -----------------------------------------------------
		//-------------------------------------------------------
		System.out.println("\t " + "|Calendar|" + "\n\t    " + year);
		//--------------------------------------------------------
		
		int jan = 0; // Everythinh in here will be explained later
 		int feb = 31;
 		int mar = 59;
 		int apr = 90;
 		int may = 120;
 		int jun = 151;
 		int jul = 181;
 		int aug = 212;
 		int sep = 243;
 		int oct = 273;
 		int nov = 304; 
 		int dec = 334;
 		int daysMonths;

  	if (itIsOrNot == true) { 
  		jan = -1; 
  		feb = 30; 	
  	}
  	
  	//---------------------------------------------------------
		
		while (countMonth <= 12) {
			if (countMonth == 1) { // Getting each month values to be printed in our calendar 
				printMonth = "January";
				daysMonths = jan;
			} else if (countMonth == 2) {
				printMonth = "Febuary";
				daysMonths = feb;
			} else if (countMonth == 3) {
				printMonth = "March";
				daysMonths = mar;
			} else if (countMonth == 4) {
					printMonth = "April";
					daysMonths = apr;
			} else if (countMonth == 5) {
				printMonth = "May";
				daysMonths = may;
			} else if (countMonth == 6) {
				printMonth = "Jun";
				daysMonths = jun;
			} else if (countMonth == 7) {
				printMonth = "July";
				daysMonths = jul;
			} else if (countMonth == 8) {
				printMonth = "August";
				daysMonths = aug;
			} else if (countMonth == 9) {
				printMonth = "September";
				daysMonths = sep;
			} else if (countMonth == 10) {
				printMonth = "October";
				daysMonths = oct;
			} else if (countMonth == 11) {
				printMonth = "November";
				daysMonths = nov;
			} else {
				printMonth = "December";
				daysMonths = dec;
			}
			//--------------------------------------------------------

			System.out.println("\n\n\t  " + printMonth); // Print the Month
			System.out.println(week); // print the week 

			//--------------------------------------------------------
			
			/* One of the things we need to do, is been able to know the day of the week for specific dates in the year
			* and then been able to match the others one through the whole year. 
			*
			* The logic I will be using let us Identify the first day of each month in the year we are consulting through our method
			* which mean 1/1/(year), 1/2/(year), 1/3/(year) and so on.    
			*
			*/

			// Defining some instances variables for this section
 			int yearReference = 1584; // this is a reference year which is a leap year by the way. (This date is basedin the started of the gregorian calendar which was in the yar 1582) 
 			int yearTotal;
 			int numberOfDays = 0; //This day in this point (without any calculation) is 1/1/1584 and It was Thursday

 			if (year >=1584) { // This will give us a positive number 
 				yearTotal = year - yearReference;  
 			} else{
 				yearTotal = yearReference - year; // this is in case someone give a value less than 1584. (1583 or 1582)
 			} // Here we are calculating the amount of years in between our year reference and the consulted year.

	 		/*
 			* Our formula (Shown few lines bellow will calculate the amount of days in between the two years)
 			* but our reference is 1 January 1584 and our formula will give us back 1 January of the consulted year.
 			*
 			* To calculate the other months, we will need to add the following values to our formula.
	 		*
	 		* This have been comentted as we added before. (-see line 86-)
	 		*
 			* int jan = 0; // this is 0 as our formula is giving us already january 
 			* int feb = 31; // 31 days have january so we add this and we will get to 1 of february
 			* int mar = 59; // same principle than before and It keep repiting. (note that our started point is always january 1, and that is why our number is getting bigger)
 			* int apr = 90;
 			* int may = 120;
 			* int jun = 151;
 			* int jul = 181;
 			* int aug = 212;
 			* int sep = 243;
 			* int oct = 273;
 			* int nov = 304; 
 			* int dec = 334;
 			* int daysMonths;

  		* if (itIsOrNot == true) { // For a Leap Year we need to change the values of january and february
  		*	 jan = -1; 
  		*	 feb = 30; 	
  		* }
 			*/
 			//-----------------------------------------------------------------
  		/*
			* Here is our formula and what it does is: yearTotal is the amout of years in between the 2 years.
  		* that number multyplied by 365 (which are the days in a year) will give us the days in between those years
			* but there is something we need to consider and that is; every four year we have a leap year which means
  		* we have an extra day every 4 years. We calculate that with yearTotal/4. then we add the variable 
  		* daysMonths to move till the needeed month and finally add 1 extra day which is a day we are carring from the calculation
			* of the last leap year (as we took as a reference year a leap year (1584) that extra day is not in the calculation).
			*
			* Finally our formula is:
  		*/
  
 			numberOfDays = (yearTotal*365) + (yearTotal/4) + daysMonths + 1;
  
 			/* 
 			* The previous formula do not give us a day, it only give us a huge number which is the exactly days in between
	 		* the 2 years (1584 and the year to be checked) 
 			*/

 			// Our reference date is 1 January 1584 which was a Thursday, then we will start from it 
			int dayIs = 0; // this was a Thursday, and then we have the following assignation: 
			/*
			* Su  Mo  Tu  We  Th  Fr  Sa
  		*  3   4   5   6   0   1   2
			*/
			int counter = 1; // our counter 
	
			// Finally, bellow we are going to start to count on 0 which is Thursday as many times as our big number (numberOfDays) 
	
			while (counter <= numberOfDays) {
				dayIs ++; // while our counter be on range, our day will go up by 1
				if (dayIs == 7) { // if dayIs is 7 then make that 7 a 0 and keep counting
					dayIs = 0;
				}
				counter++;
			}
				
			//-------------------------------------------------------
			int believeDay = 1; // This variable is in the backgroung counting at the same time as our day variable.
		
			if (dayIs == 4) { // Month start on Monday
				System.out.print("     ");
				believeDay = 2;
			} else if (dayIs == 5) { // Month start on Tuesday
				System.out.print("         "); 
				believeDay = 3;
			} else if (dayIs == 6) { // Month start on Wedsnesday
				System.out.print("             ");
				believeDay = 4;
			} else if (dayIs == 0) { // Month start on Thuersday
				System.out.print("                 ");
				believeDay = 5;
			} else if (dayIs == 1) { // Month start on Friday
				System.out.print("                     ");
				believeDay = 6;
			} else if (dayIs == 2) { // MOnth start on Saturday
				System.out.print("                         ");
				believeDay = 7;
			} else if (dayIs ==3) { //// Month Start on Sunday
				System.out.print(" ");
			} 

			while (day <= 28) {
				System.out.print ("  " + day);
				if (believeDay % 7 == 0) { // notice that this condition is evaluating believeDay which is the one counting in the background. so let say for instance our week started on friday, our day will be 2 on saturday but believeDay will be 7.
					System.out.println(); // go to next line
				}
				if (day <= 8) {
					System.out.print(" "); // giving an extra space to the numbers with only 1 digit
				}
				day++;
				believeDay++;
			}
			//--------------------------------------------------------
			if ( countMonth % 2 == 1 && countMonth <= 7 || countMonth % 2 == 0 && countMonth >= 8 && countMonth <= 12) { // Evaluating condition to match the months with 31 or 30 days
				while (day <= 31) {
					System.out.print ("  " + day);
					if (believeDay % 7 == 0) { // It means the end of the week
						System.out.println(); // go to next line
					}
					day++;
					believeDay++;
				}
					
			} else if (countMonth == 2) { // condition for february
				if (itIsOrNot == true) {
					while (day <= 29) { // A Leap Year 
						System.out.print("  " + day);
						if (believeDay % 7 == 0) { // It means the end of the week
							System.out.println(); // go to next line
						}
						day++;
						believeDay++;
					}
				}

			} else {
				while (day <= 30) {
					System.out.print("  " + day);
					if (believeDay % 7 == 0) { // It means the end of the week
						System.out.println(); // go to next line
					}
					day++;
					believeDay++;
				}
			}  	
			day = 1; // Set our day to 1 again so when it repeat it will match the rule again
			countMonth++;
			believeDay = 1;

		} // Finish of the main While
	} // end of displayCalendar

	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	/*
	* NB: Hi Jenny bellow as I told you I started the calendar by columns. I couldn't finish it but I will.
	* Comments and styles are probably not apropiated in this section due to I was working in logic and funcionality first. 
	* you may see long way of doing things, but this is thought to be changed later. That's why you may see different variables 
	* in the firts block. I will explain a little bit any way. 
	*
	*/

	/*
	* beautifulCalendar
	*
	* This method will display any year calendar 
	* maching the days with the respectively dates and organizing the months by columns of 4 
	*/
	public void beautifulCalendar(int year) {
		this.year = year; 
		// our condition to get the days in the week. (explained before. -See displayCalendar Method- )
		int jan = 0; 
 		int feb = 31;
 		int mar = 59;
 		int apr = 90;
 		int may = 120;
 		int jun = 151;
 		int jul = 181;
 		int aug = 212;
 		int sep = 243;
 		int oct = 273;
 		int nov = 304; 
 		int dec = 334;
 		int daysMonths;

  	if (itIsOrNot == true) { 
  		jan = -1; 
  		feb = 30; 	
  	}

  	/*
		* In this section we are going to organize the calendar in 3 rows of 4 columns each. In order to do this we will 
		* have a block for each row, what means 3 diferent blocks. this blocks will follow bassicly the same patern and just changing the  
		* values for the months. we will see that in detail now. 
		*
		*/

		//--------------------------------------------------- First Row ------------------------------------------------
		// We will be printing here from January till April. 

		while (countMonth <= 4) {
			if (countMonth == 1) { // Getting each month values to be printed in our calendar 
				printMonth = "January";
				daysMonths = jan;
			} else if (countMonth == 2) {
				printMonth = "Febuary";
				daysMonths = feb;
			} else if (countMonth == 3) {
				printMonth = "March";
				daysMonths = mar;
			} else {
					printMonth = "April";
					daysMonths = apr;
			} 

			System.out.print("\t\t"  + printMonth + "\t\t\t");

			countMonth++;
		}

		System.out.println();
		System.out.print(week + "\t\t" + week + "\t\t" + week + "\t\t" + week + "\n");

		int month = 1; 
		int counter = 1;
		countMonth = 1;

		while (countMonth <= 4) {
			while (day <= 28 && countMonth <= 4) { // condition for the whole 4 months 
				System.out.print ("   " + day);
				day++;
				if (day == 9) {
					System.out.print(" ");
				}
				
				if (counter == 7) {	// we make the restriction to the first line 
					if(countMonth %4 == 0) { // this wiil be apply in the forth month
						System.out.println();
						day = 8;
						countMonth = month; // the intension of creating this condition like this is giving it  a value of 5 when we finish printing the month 4 so tecnically it will repeat and print the whole year
						counter = 1;

						
						while (day <= 28 && countMonth <=4) {
							System.out.print("  " + day);
							day++;
								if (day == 9) {
									System.out.print("  ");
								}
							if (counter == 7) { // It will means that the day will be 14 
								if (countMonth%4 == 0) {
									System.out.println();
									day = 15;
									countMonth = month;
									counter = 1;


									while (day <= 28 && countMonth <=4) {
										System.out.print("  " + day);
										day++;

										if (counter == 7) {
											if (countMonth%4 == 0) {
												System.out.println();
												day = 22;
												countMonth = month; 
												counter = 1;

												while (day <= 28 && countMonth <=4) {
													System.out.print("  " + day);
													day++;
													if (counter == 7) {
														System.out.print("\t\t");
														day = 22;
														countMonth++;
														counter = 0;
													}
													counter++;
												}
											}
											System.out.print("\t\t");
											day = 15;
											countMonth ++; 
											counter = 0;
										}
									counter++;
									}	
								}
								System.out.print("\t\t"); // giving the space 
								day = 8;
								countMonth ++; // going to the next month 
								counter = 0;
								}
							counter++;
						} 
					}
					System.out.print("\t\t"); 
					day = 1; 
					countMonth ++;
					counter = 0;
					}
				counter++;
			}

			System.out.print(countMonth); 

		} // end of main while

		/*
		* I have started to work in modifying few variables in the code above to try to get a more eficient code which could be able
		* to print the whole year in only this first section (I will get there eventually)...
		*
		* For me what I am about to do is not the most eficient way to code as I am repeting code. but this is at the same time letting me
		* see the work almost done and think in how to make it shorter. 
		*/
		//--------------------------------------------------- Firts Row Finished ------------------------------------------------

		System.out.println("\n\n");

		//--------------------------------------------------- Second Row ------------------------------------------------
		countMonth = 5; 

		while (countMonth <= 8) {
			if (countMonth == 5) { // Getting each month values to be printed in our calendar 
				printMonth = "May";
				daysMonths = may;
			} else if (countMonth == 6) {
				printMonth = "Jun";
				daysMonths = jun;
			} else if (countMonth == 7) {
				printMonth = "July";
				daysMonths = jul;
			} else {
					printMonth = "August";
					daysMonths = aug;
			} 

			System.out.print("\t\t"  + printMonth + "\t\t\t");

			countMonth++;
		}

		System.out.println();
		System.out.print(week + "\t\t" + week + "\t\t" + week + "\t\t" + week + "\n");

		counter = 1; // get back to 1 and may sure our background is counting from the inicial number in our new section
		countMonth = 5;

		while (countMonth <= 8) {
			while (day <= 28 && countMonth <=8) { // condition for the whole 4 months 
				System.out.print ("   " + day);
				day++;
				if (day == 9) {
					System.out.print(" ");
				}
				
				if (counter == 7) {	// we make the restriction to the first line 
					if(countMonth == 8) { // this wiil be apply in the forth month
						System.out.println();
						day = 8;
						countMonth = 5;
						counter = 1;

						
						while (day <= 28 && countMonth <=8) {
							System.out.print("  " + day);
							day++;
								if (day == 9) {
									System.out.print("  ");
								}
							if (counter == 7) { // It will means that the day will be 14 
								if (countMonth == 8) {
									System.out.println();
									day = 15;
									countMonth = 5;
									counter = 1;


									while (day <= 28 && countMonth <=8) {
										System.out.print("  " + day);
										day++;
										if (counter == 7) {
											if (countMonth == 8) {
												System.out.println();
												day = 22;
												countMonth = 5; 
												counter = 1;

												while (day <= 28 && countMonth <=8) {
													System.out.print("  " + day);
													day++;
													if (counter == 7) {
														System.out.print("\t\t");
														day = 22;
														countMonth++;
														counter = 0;
													}
													counter++;
												}
											}
											System.out.print("\t\t");
											day = 15;
											countMonth++; 
											counter = 0;
										}
									counter++;
									}	
								}
								System.out.print("\t\t"); // giving the space 
								day = 8;
								countMonth++; // going to the next month 
								counter = 0;
								}
							counter++;
						} 
					}
					System.out.print("\t\t"); 
					day = 1; 
					countMonth++;
					counter = 0;
					}
				counter++;
			}
			
			System.out.print(countMonth); 


		} // end of main while

		//--------------------------------------------------- Second Row Finished ------------------------------------------------

		System.out.println("\n\n");
			
		//--------------------------------------------------- Third Row  ------------------------------------------------
			
		countMonth = 9; 

		while (countMonth <= 12) {
			if (countMonth == 9) { // Getting each month values to be printed in our calendar 
				printMonth = "Sept";
				daysMonths = sep;
			} else if (countMonth == 10) {
				printMonth = "Oct";
				daysMonths = oct;
			} else if (countMonth == 11) {
				printMonth = "Novemb";
				daysMonths = nov;
			} else {
					printMonth = "Dec";
					daysMonths = dec;
			} 
			System.out.print("\t\t"  + printMonth + "\t\t\t");
			countMonth++;
		}

		System.out.println();
		System.out.print(week + "\t\t" + week + "\t\t" + week + "\t\t" + week + "\n");
		
		counter = 1;
		countMonth = 9;

		while (countMonth <= 12) {
			while (day <= 28 && countMonth <=12) { // condition for the whole 4 months 
				System.out.print ("   " + day);
				day++;
				if (day == 9) {
					System.out.print(" ");
				}
				
				if (counter == 7) {	// we make the restriction to the first line 
					if(countMonth == 12) { // this wiil be apply in the forth month
						System.out.println();
						day = 8;
						countMonth = 9;
						counter = 1;
						
						while (day <= 28 && countMonth <=12) {
							System.out.print("  " + day);
							day++;
								if (day == 9) {
									System.out.print("  ");
								}
							if (counter == 7) { // It will means that the day will be 14 
								if (countMonth == 12) {
									System.out.println();
									day = 15;
									countMonth = 9;
									counter = 1;

									while (day <= 28 && countMonth <=12) {
										System.out.print("  " + day);
										day++;
										if (counter == 7) {
											if (countMonth == 12) {
												System.out.println();
												day = 22;
												countMonth = 9; 
												counter = 1;

												while (day <= 28 && countMonth <=12) {
													System.out.print("  " + day);
													day++;
													if (counter == 7) {
														System.out.print("\t\t");
														day = 22;
														countMonth++;
														counter = 0;
													}
													counter++;
												}
											}
											System.out.print("\t\t");
											day = 15;
											countMonth++; 
											counter = 0;
										}
									counter++;
									}	
								}
								System.out.print("\t\t"); // giving the space 
								day = 8;
								countMonth++; // going to the next month 
								counter = 0;
								}
							counter++;
						} 
					}
					System.out.print("\t\t"); 
					day = 1; 
					countMonth++;
					counter = 0;
					}
				counter++;
			}
			
			System.out.print(countMonth); 

		} // end of main while
		
		//--------------------------------------------------- Third Row Finished ------------------------------------------------
		
	} // end of beautifulCalendar
} // end of main class Leap Year 