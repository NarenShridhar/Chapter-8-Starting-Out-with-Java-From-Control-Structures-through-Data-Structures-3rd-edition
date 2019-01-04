public class PoliceOfficer
{
	// Created a String called officerName to hold the name of the police officer
	private String officerName;

	// Created a String called badgeNumber to hold the badge number of the police officer
	private String badgeNumber;

	/*
		Constructor

		Created a no-arg constructor in the event that I will need to instantiate an object
		of this class without first accepting values for all of the variables as arguments.
	*/ 

	public PoliceOfficer()
	{

	}

	// Parametized Constructor
	public PoliceOfficer(String officerNameGiven, String badgeNumberGiven)
	{
		officerName = officerNameGiven;
		badgeNumber = badgeNumberGiven;
	}

	// Setter method for the officer name
	public void setOfficerName(String officerNameGiven)
	{
		officerName = officerNameGiven;
	}

	// Getter method for the officer name
	public String getOfficerName()
	{
		return officerName;
	}

	// Setter method for the officer badgeNumber
	public void setOfficerBadgeNumber(String badgeNumberGiven)
	{
		badgeNumber = badgeNumberGiven;
	}

	// Getter method for the officer badgeNumber
	public String getOfficerBadgeNumber()
	{
		return badgeNumber;
	}

	/*
		Created a method called examine to examine a ParkedCar object and a ParkingMeter object to determine whether 
		the car's time has expired. This method will issue a parcking ticket (a ParkingTicket object) if the 
		car's time has expired
	*/

	public ParkingTicket examine(ParkedCar parkedCarObjectGiven, ParkingMeter parkingMeterObjectGiven)
	{
		// Set the ParkingTicket object to null at the start
		ParkingTicket parkingTicketObject = null;

		/*
			Created an integer variabled called numberOfIllegalMinutes and set it equal to 
			the minutes the car has been parked minus the parked time purchased
		*/

		int numberOfIllegalMinutes = parkedCarObjectGiven.getMinutesParked() - parkingMeterObjectGiven.getParkingMinutesPurchased();

		// If statement which will return a parkingTicketObject if the numberOfIllegalMinutes is greater than 0
		if(numberOfIllegalMinutes > 0)
		{
			parkingTicketObject = new ParkingTicket(parkedCarObjectGiven, this, numberOfIllegalMinutes);
		}		

		return parkingTicketObject;
	}

	// Consider making a toString method here at the end
}