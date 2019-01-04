public class Month
{
	// Created an integer variable called monthNumber that will hold the number of the month
	private int monthNumber;

	/*
		Constructor

		This is a no-arg constructor that sets the monthNumber to 1.
	*/

	public Month()
	{
		monthNumber = 1;
	}

	/*
		Constructor

		This constructor accepts the number of the month as an argument, and sets the monthNumber field to the value
		passed in by the argument. 
	*/

	public Month(int monthNumberGiven)
	{
		// If statement that sets the monthNumber to 1, if the argument is < 1 or > 12.
		if(monthNumberGiven < 1 || monthNumberGiven > 12)
		{
			monthNumber = 1;
		}

		// Else block that sets the monthNumber equal to the argument if the value is within the appropriate range
		else
		{
			monthNumber = monthNumberGiven;
		}
	}

	/*
		Constructor

		This constructor accepts the name of the month as a String as the argument and sets the monthNumber field to the
		correct corresponding numerical value. 
	*/

	public Month(String monthNameGiven)
	{
		switch(monthNameGiven)
		{
			case "January": monthNameGiven.equalsIgnoreCase("January");
			monthNumber = 1;
			break;
			case "February": monthNameGiven.equalsIgnoreCase("February");
			monthNumber = 2;
			break;
			case "March": monthNameGiven.equalsIgnoreCase("March");
			monthNumber = 3;
			break;
			case "April": monthNameGiven.equalsIgnoreCase("April");
			monthNumber = 4;
			break;
			case "May": monthNameGiven.equalsIgnoreCase("May");
			monthNumber = 5;
			break;
			case "June": monthNameGiven.equalsIgnoreCase("June");
			monthNumber = 6;
			break;
			case "July": monthNameGiven.equalsIgnoreCase("March");
			monthNumber = 7;
			break;
			case "August": monthNameGiven.equalsIgnoreCase("August");
			monthNumber = 8;
			break;
			case "September": monthNameGiven.equalsIgnoreCase("September");
			monthNumber = 9;
			break;
			case "October": monthNameGiven.equalsIgnoreCase("October");
			monthNumber = 10;
			break;
			case "November": monthNameGiven.equalsIgnoreCase("November");
			monthNumber = 11;
			break;
			case "December": monthNameGiven.equalsIgnoreCase("December");
			monthNumber = 12;
			break;
		}
	}

	/*
		Created the setMonthNumber method which accepts an integer argument, which is assigned to the monthNumber field.
		If the value is less than 1 or greater than 12, the method sets the monthNumber to 1. 
	*/

	public void setMonthNumber(int monthNumberGiven)
	{
		// If statement that sets the monthNumber to 1, if the argument is < 1 or > 12.
		if(monthNumberGiven < 1 || monthNumberGiven > 12)
		{
			monthNumber = 1;
		}

		// Else block that sets the monthNumber equal to the argument if the value is within the appropriate range
		else
		{
			monthNumber = monthNumberGiven;
		}
	}

	// Getter method to return the value in the monthNumber field
	public int getMonthNumber()
	{
		return monthNumber;
	}

	// Getter method to return the name of the month, by accepting the integer of the monthNumber
	public String getMonthName(int monthNumberGiven)
	{
		String monthName;

		monthNumber = monthNumberGiven;

		if(monthNumber == 1)
		{
			monthName = "January";
			return monthName;
		}

		else if(monthNumber == 2)
		{
			monthName = "February";
			return monthName;
		}

		else if(monthNumber == 3)
		{
			monthName = "March";
			return monthName;
		}

		else if(monthNumber == 4)
		{
			monthName = "April";
			return monthName;
		}

		else if(monthNumber == 5)
		{
			monthName = "May";
			return monthName;
		}

		else if(monthNumber == 6)
		{
			monthName = "June";
			return monthName;
		}

		else if(monthNumber == 7)
		{
			monthName = "July";
			return monthName;
		}

		else if(monthNumber == 8)
		{
			monthName = "August";
			return monthName;
		}

		else if(monthNumber == 9)
		{
			monthName = "September";
			return monthName;
		}

		else if(monthNumber == 10)
		{
			monthName = "October";
			return monthName;
		}

		else if(monthNumber == 11)
		{
			monthName = "November";
			return monthName;
		}

		else if(monthNumber == 12)
		{
			monthName = "December";
			return monthName;
		}

		else
		{
			monthName = "Error";
			return monthName;
		}
	}

	/* 
		toString method represents the current state of the Object, also helps with formatting. 
		In this problem, the toString method will return the same value as the getMonthName method, 
		as per the program guidelines.
	*/
	public String toString(int monthNumberGiven)
	{
		String str;

		str = getMonthName(monthNumberGiven);

		return str;
	}

	/*
		Created a (boolean) equals method called monthEquals, which accepts a Month object and returns true if
		the argumentObject has the same data (value) as the called object (in this case, callingObject), 
		and returns false otherwise.
	*/

	public boolean monthEquals(Month argumentObject)
	{
		if(argumentObject.getMonthNumber() == this.getMonthNumber())
		{
			return true;
		}

		else
		{
			return false;
		}
	}

	/*
		Created a (boolean) greaterThan method which accepts a Month object and returns true if the calling object's
		monthNumber field is greater than the argument's monthNumber field, and false if not. 
	*/

	public boolean greaterThan(Month argumentObject)
	{

		if(this.getMonthNumber() > argumentObject.getMonthNumber())
		{
			return true;
		}

		else
		{
			return false;
		}
	}

	/*
		Created a (boolean) lessThan method which accepts a Month object and returns true if the calling object's
		monthNumber field is greater than the argument's monthNumber field, and false if not. 
	*/

	public boolean lessThan(Month argumentObject)
	{

		if(this.getMonthNumber() < argumentObject.getMonthNumber())
		{
			return true;
		}

		else
		{
			return false;
		}
	}
}