import java.util.Scanner;

public class Geometry
{
	// Created a double variable called pi, assigned with the value of PI using Math.PI
	private static final double pi = Math.PI;

	// Created a double variable called circleRadius to hold the radius of a circle
	// private static double circleRadius;

	// Static double method to calculate the area of a circle
	public static double circleArea(double circleRadiusGiven)
	{
		// Created a Scanner object called keyboard to hold the user's input
		Scanner keyboard = new Scanner(System.in);

		// While loop serves as input validation to ensure that a negative number cannot be passed into this method for the radius
		while(circleRadiusGiven < 0)
		{
			System.out.println("Error, this is an invalid entry. You entered a negative value for the radius of your circle...");
			System.out.println("User, please enter the radius of a circle: ");
			circleRadiusGiven = keyboard.nextDouble();
		}

		// Return statement returns the area of the circle
		return pi * Math.pow(circleRadiusGiven, 2);
	}

	// Static double method to calculate the area of a rectangle
	public static double rectangleArea(double lengthGiven, double widthGiven)
	{
		// Created a Scanner object called keyboard to hold the user's input
		Scanner keyboard = new Scanner(System.in);

		// While loop serves as input validation to ensure that a negative number cannot be passed into this method for the length
		while(lengthGiven < 0)
		{
			System.out.println("Error, this is an invalid entry. You entered a negative value for the length of your rectangle...");
			System.out.println("User, please enter the length of a rectangle: ");
			lengthGiven = keyboard.nextDouble();
		}

		while(widthGiven < 0)
		{
			System.out.println("Error, this is an invalid entry. You entered a negative value for the width of your rectangle...");
			System.out.println("User, please enter the width of a rectangle: ");
			widthGiven = keyboard.nextDouble();
		}

		return lengthGiven * widthGiven;
	}

	public static double triangleArea(double baseGiven, double heightGiven)
	{
		// Created a Scanner object called keyboard to hold the user's input
		Scanner keyboard = new Scanner(System.in);

		// While loop serves as input validation to ensure that a negative number cannot be passed into this method for the base
		while(baseGiven < 0)
		{
			System.out.println("Error, this is an invalid entry. You entered a negative value for the base of your triangle...");
			System.out.println("User, please enter the base of a triangle ");
			baseGiven = keyboard.nextDouble();
		}

		// While loop serves as input validation to ensure that a negative number cannot be passed into this method for the height
		while(heightGiven < 0)
		{
			System.out.println("Error, this is an invalid entry. You entered a negative value for the height of your triangle...");
			System.out.println("User, please enter the height of a triangle: ");
			heightGiven = keyboard.nextDouble();
		}

		return baseGiven * heightGiven * 0.5;
	}
}