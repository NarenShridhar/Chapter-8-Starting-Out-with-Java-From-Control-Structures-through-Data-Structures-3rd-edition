public class RoomCarpet
{
	// Created a RoomDimension object as a field called size
	private RoomDimension size;

	// Created a double field called carpetCost to hold the cost of the carpet per square foot
	private double carpetCost;

	/*
		Constructor

		Note that this constructor accepts two arguments, firstly, a RoomDimension object, and secondly, a double object.
		Both of these objects will be assigned values by the user, and then passed as arguments to the previously created
		variables. 
	*/

	public RoomCarpet(RoomDimension sizeGiven, double carpetCostGiven)
	{
		// Set the size RoomDimension object equal to the sizeGiven argument passed into this constructor
		size = sizeGiven;

		// Set the carpetCost double variable equal to the carpestCostGiven argument passed into this constructor
		carpetCost = carpetCostGiven;
	}

	// getTotalCost method returns the total cost of the carpet
	public double getTotalCost()
	{
		// Return the total cost of the carpet, which is the area * cost per square foot
		return size.getArea() * carpetCost;
	}

	// toString method represents the current state of the Object, also helps with formatting
	public String toString()
	{
		// Created a string variable str that will be assigned a value and returned at the end of the method
		String str = "The total cost is: $" + getTotalCost(); 

		// Return the string
		return str;
	}
}