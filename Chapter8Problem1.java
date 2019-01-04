import java.util.Scanner;

public class Chapter8Problem1
{
	public static void main (String[] args)
	{
		// Called the display method to display the preface of the program
		display();

		// Called the getUserInputs method to get the required inputs from the user and display the answers
		getUserInputs();
	}

	// Created a static void method called displayProgram which serves to display the overall objective of the program. 
	public static void display()
	{
		System.out.println("This program serves to calculate the areas of a circle, rectangle, and cylinder.");
		System.out.println("In order to do this, we will need your input on certain variables, and the program will take care of the rest");
	}

	/*
		Created a static void method called getUserInputs which is used to get the values for the various varibles 
		that the user is required to input in order to calculate the areas of the circle, rectangle, and cylinder.
	*/
	public static void getUserInputs()
	{
		// Created a double variable called circleRadius to hold the user's input for the radius of a circle
		double circleRadius;

		// Created a double variable called rectangleLength to hold the user's input for the length of a rectangle
		double rectangleLength;

		// Created a double variable called rectangleLength to hold the user's input for the width of a rectangle
		double rectangleWidth;

		// Created a float variable called circleRadius to hold the user's input for the radius of a circle
		float cylinderRadius;

		// Created a double variable called cylinderHeight to hold the user's input for the height of a cylinder
		double cylinderHeight;

		// Created a Scanner object called keyboard to hold the user's input
		Scanner keyboard = new Scanner(System.in);

		// Println statement to accept the radius of the circle from the user and store it in the circleRadius variable
		System.out.println("User, please enter the radius of the circle");
		circleRadius = keyboard.nextDouble();

		// Println statement to accept the length of the rectangle from the user and store it in the rectangleLength variable
		System.out.println("User, please enter the length of the rectangle");
		rectangleLength = keyboard.nextDouble();

		// Println statement to accept the width of the rectangle from the user and store it in the rectangleWidth variable
		System.out.println("User, please enter the width of the rectangle");
		rectangleWidth = keyboard.nextDouble();

		// Println statement to accept the radius of the cylinder from the user and store it in the cylinderRadius variable
		System.out.println("User, please enter the radius of the cylinder");
		cylinderRadius = keyboard.nextFloat();

		// Println statement to accept the height of the cylinder from the user and store it in the cylinderHeight variable
		System.out.println("User, please enter the height of the cylinder");
		cylinderHeight = keyboard.nextDouble();

		System.out.println("The area of the circle is: " + Area.Area(circleRadius));
		System.out.println("The area of the rectangle is: " + Area.Area(rectangleLength, rectangleWidth));
		System.out.println("The area of the cylinder is: " + Area.Area(cylinderRadius, cylinderHeight));
	}
}