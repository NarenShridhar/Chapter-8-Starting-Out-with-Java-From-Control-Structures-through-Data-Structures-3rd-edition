public class ParkingMeter
{
	// Created an int variable called parkingMinutesPurchased to hold the number of parking minutes that were purchased
	private int parkingMinutesPurchased; 

	/*
		Constructor

		Created a no-arg constructor in the event that I will need to instantiate an object
		of this class without first accepting values for all of the variables as arguments.
	*/ 

	public ParkingMeter()
	{

	}

	// Parametized Constructor
	public ParkingMeter(int parkingMinutesPurchasedGiven)
	{
		parkingMinutesPurchased = parkingMinutesPurchasedGiven;
	}

	// Setter method for the parking minutes purchased
	public void setParkingMinutesPurchased(int parkingMinutesPurchasedGiven)
	{
		parkingMinutesPurchased = parkingMinutesPurchasedGiven;
	}

	// Getter method for the parking minutes purchased
	public int getParkingMinutesPurchased()
	{
		return parkingMinutesPurchased;
	}

	// Consider making a toString method here at the end
}