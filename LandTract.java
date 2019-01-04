public class LandTract
{
	// Created a double variable called length to hold the length of the tract
	private double length; 

	// Created a double variable called width to hold the width of the tract
	private double width;

	/*
		Constructor

		Note that this constructor has no arguments. It will be used in the test class to create a
		LandTract testObject that does not need any arguments to function!
	*/

	public LandTract()
	{

	}
	/*
		Constructor

		Note that this constructor accepts two values as arguments, and assigns them to the length and width
		variables created in this class. 
	*/

	public LandTract(double lengthGiven, double widthGiven)
	{
		// Set the length variable declared in the class equal to the lengthGiven argument passed into this constructor
		length = lengthGiven;

		// Set the width variable declared in the class equal to the widthGiven argument passed into this constructor
		width = widthGiven;
	}

	// getArea method returns the area of the tract, in this case, since it is a rectangle, length * width
	public double getArea()
	{
		return length * width;
	}

	//tractEquals method compares the sizes of two tract objects to determine if they are of equal size(area)
	public void tractEquals(LandTract tract1Given, LandTract tract2Given)
	{
		if(tract1Given.getArea() == (tract2Given.getArea()))
		{
			System.out.println("These tracts are the same area!");
		}
		else
		{
			System.out.println("These tracts are different areas!");
		}
	}
}