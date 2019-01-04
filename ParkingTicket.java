public class ParkingTicket
{
	/*
		Created a ParkedCar object which will be used to report the make, model, color, and license number of 
		the illegal parked car. 
	*/

	private ParkedCar parkedCarObject;

	/*
		Created a PoliceOfficer object which will be used to report the name and badge number of the police 
		officer who is issuing the parking ticket. 
	*/

	private PoliceOfficer policeOfficerObject;

	// Created a double variable called fine to hold the amount of the parking ticket fine
	private double fine;

	// Created an integer variable called illegalMinutesParked for the amount of minutes the parking ticket is for
	private int illegalMinutesParked;

	// Created the final double variable firstHourFine to hold the value of the fine for the first hour
	private final double firstHourFine = 25.0;

	// Created the final double variable additionalHourFine to hold the value of the fine for every hour after 1
	private final double additionalHourFine = 10.0;

	/*
		Constructor

		Created a no-arg constructor in the event that I will need to instantiate an object
		of this class without first accepting values for all of the variables as arguments.
	*/ 

	public ParkingTicket()
	{

	}

	// Parametized Constructor
	public ParkingTicket(ParkedCar parkedCarObjectGiven, PoliceOfficer policeOfficerObjectGiven, int illegalMinutesParkedGiven)
	{
		parkedCarObject = parkedCarObjectGiven;
		policeOfficerObject = policeOfficerObjectGiven;
		illegalMinutesParked = illegalMinutesParkedGiven;
		computeFine();
	}

	// Created the computeFine method to generate the value of the fine based on the illegal minutes parked 
	public void computeFine()
	{
		// Created a final double minutesInAnHour variable to hold the 60 minutes in an hour
		final double minutesInAnHour = 60.0;

		// Created the illegalMinutesInHours variable to store the illegalMinutesParked/60.0 total to be used later
		double illegalMinutesInHours = illegalMinutesParked/minutesInAnHour;

		// Created the intIllegalMinutesInHours variable and set it equal to the integer value of the double variable illegalMinutesInHours
		int intIllegalMinutesInHours = (int)illegalMinutesInHours;

		// If the intIllegaLMinutesInHours is less than or equal to 1, the fine is only the base fine
		if(intIllegalMinutesInHours <= 1)
		{
			fine = firstHourFine;
		}

		// Otherwise, the fine is the base fine plus the intIllegalMinutesInHours - 1 * the additional hourly fine
		else if(intIllegalMinutesInHours > 1)
		{
			fine = firstHourFine;
			fine += intIllegalMinutesInHours * additionalHourFine;
		}
	}

	// Setter method for the ParkedCar object
	public void setParkedCar(ParkedCar parkedCarObjectGiven)
	{
		parkedCarObject = parkedCarObjectGiven;
	}

	// Getter method for the ParkedCar object
	public ParkedCar getParkedCar()
	{
		return parkedCarObject;
	}

	// Setter method for the PoliceOfficer object
	public void setPoliceOfficer(PoliceOfficer policeOfficerObjectGiven)
	{
		policeOfficerObject = policeOfficerObjectGiven;
	}

	// Getter method for the PoliceOfficer object
	public PoliceOfficer getPoliceOfficer()
	{
		return policeOfficerObject;
	}

	// Setter method for the fine
	public void setFine(double fineGiven)
	{
		fine = fineGiven;
	}

	// Getter method for the fine
	public double getFine()
	{
		return fine;
	}

	// Setter method for the illegalMinutesParked
	public void setIllegalMinutesParked(int illegalMinutesParkedGiven)
	{
		illegalMinutesParked = illegalMinutesParkedGiven;
	}

	// Getter method for the illegalMinutesParked
	public int getIllegalMinutesParked()
	{
		return illegalMinutesParked;
	}

	// Consider making a toString method here at the end
}