public class RoomDimension
{
	// Created a double variable called length to hold the length of the room
	private double length;

	// Created a double variable called width to hold the width of the room
	private double width;

	/*
		Constructor

		Note that this constructor accepts two arguments, lengthGiven and widthGiven, and sets them equal
		to the previously declared variables of length and width that have not been initialized. 
	*/

	public RoomDimension(double lengthGiven, double widthGiven)
	{
		// Set the length variable declared in the class equal to the lengthGiven argument passed into this constructor
		length = lengthGiven;

		// Set the width variable declared in the class equal to the widthGiven argument passed into this constructor
		width = widthGiven;
	}

	// getArea method returns the area of the room, in this case, since it is a rectangle, length * width
	public double getArea()
	{
		return length * width;
	}

	// toString method represents the current state of the Object, also helps with formatting
	public String toString()
	{
		// Created a string variable str that will be assigned a value and returned at the end of the method
		String str = "Length: " + length + " Width: " + width + " results in an area of: " + getArea();

		// Return the string
		return str;
	}


}