public class Area
{
	/*  
		Declared a private final double variable called pi to hold the value of pi.
		I have never seen the pi variable declared using Math.PI, so this is a new
		variable declaration for me. 
	*/
	private static final double pi = Math.PI;

	/*
		Created the first of three versions of the overloaded method Area. This version
		of the method accepts the radius of a circle as an argument and returns the area of a circle.
	*/

	static double Area(double radiusGiven)
	{
		return pi * (Math.pow(radiusGiven, 2));
	}

	/*
		Created the second of three versions of the overloaded method Area. This version
		of the method accepts length and width arguments and returns the area of a rectangle.
	*/

	static double Area(double lengthGiven, double widthGiven)
	{
		return lengthGiven * widthGiven;
	}

	/*
		Created the third of three version of the overloaded method Area. This version
		of the method accepts radiusGiven and heightGiven as arguments and returns
		the area of a cylinder. Note, when I tried to compile this method using 
		double radiusGiven, I received an error message from the terminal stating: 

		"error: method Area(double,double) is already defined in class Area
		static double Area(double radiusGiven, double heightGiven)."

		So I defined the variable as a float instead, and no problems were given now. 
	*/

	static double Area(float radiusGiven, double heightGiven)
	{
		return pi * Math.pow(radiusGiven, 2) * heightGiven;
	}
}