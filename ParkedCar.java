public class ParkedCar
{
	// Created a String variable called make to hold the car's make
	private String make;

	// Created a String variable model to hold the car's model
	private String model;

	// Created a String variable color to hold the car's color
	private String color; 

	// Created an String variable licenseNumber to hold the user's license number
	private String licenseNumber; 

	// Created an int variable minutesParked to hold the amount of minutes the car has been parked
	private int minutesParked;

	/*
		Constructor

		Created a no-arg constructor in the event that I will need to instantiate an object
		of this class without first accepting values for all of the variables as arguments.
	*/ 

	public ParkedCar()
	{

	}

	/*
		Constructor

		Created a second constructor, which passed in 5 arguments which correspond to the variables
		created in this class, and assign the values to the variables. 
	*/

	public ParkedCar(String makeGiven, String modelGiven, String colorGiven, String licenseNumberGiven, int minutesParkedGiven)
	{
		make = makeGiven;
		model = modelGiven;
		color = colorGiven;
		licenseNumber = licenseNumberGiven;
		minutesParked = minutesParkedGiven;
	}

	// Setter method for the make of the car 
	public void setMake(String makeGiven)
	{
		make = makeGiven;
	}

	// Getter method for the make of the car
	public String getMake()
	{
		return make;
	}

	// Setter method for the model of the car
	public void setModel(String modelGiven)
	{
		model = modelGiven;
	}

	// Getter method for the model of the car
	public String getModel()
	{
		return model;
	}

	// Setter method for the color of the car
	public void setColor(String colorGiven)
	{
		color = colorGiven;
	}

	// Getter method for the color of the car
	public String getColor()
	{
		return color;
	}

	// Setter method for the license number of the car
	public void setLicenseNumber(String licenseNumberGiven)
	{
		licenseNumber = licenseNumberGiven;
	}

	// Getter method for the license number of the car
	public String getLicenseNumber()
	{
		return licenseNumber;
	}

	// Setter method for the minutes the car has been parked
	public void setMinutesParked(int minutesParkedGiven)
	{
		minutesParked = minutesParkedGiven;
	}

	// Getter method for the minutes the car has been parked
	public int getMinutesParked()
	{
		return minutesParked;
	}

	// Consider making a toString method here at the end
}