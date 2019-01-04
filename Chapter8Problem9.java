import java.util.Scanner;

public class Chapter8Problem9
{
	public static void main (String[] args)
	{
		// Created a Scanner object called keyboard to hold the user's input
		Scanner keyboard = new Scanner(System.in);

		// Created an String variable called userInput to hold the user's input
		int userInput;

		// Created a double variable called circleRadius to hold the user's input for the radius of the circle
		double circleRadius;

		// Created a double variable called length to hold the user's input for the length of the rectangle
		double length;

		// Created a double variable called width to hold the user's input for the width of the rectangle
		double width;

		// Created a double variable called base to hold the user's input for the base of the triangle
		double base;

		// Created a double variable called height to hold the user's input for the height of the triangle
		double height;

		// Do-while loop runs the program
		do
		{
			display();
			System.out.println("User, from the above menu, what is your selection: ");
			userInput = keyboard.nextInt();

			while(userInput < 1 || userInput > 4)
			{
				System.out.println("Unfortunately, only entering numbers from 1-4 will trigger a response, please try again...");
				display();
				System.out.println("User, from the above menu, what is your selection: ");
				userInput = keyboard.nextInt();
			}

			if(userInput == 1)
			{
				System.out.println("User, please enter the radius of a circle: ");
				circleRadius = keyboard.nextDouble();
				System.out.println("The area of the circle the circle is: " + Geometry.circleArea(circleRadius));
			}

			else if(userInput == 2)
			{
				System.out.println("User, please enter the length of a rectangle: ");
				length = keyboard.nextDouble();
				System.out.println("User, please enter the width of a rectangle: ");
				width = keyboard.nextDouble();
				System.out.println("The area of the rectangle is: " + Geometry.rectangleArea(length, width));
			}

			else if(userInput == 3)
			{
				System.out.println("User, please enter the base of a triangle: ");
				base = keyboard.nextDouble();
				System.out.println("User, please enter the height of a triangle: ");
				height = keyboard.nextDouble();
				System.out.println("The area of the triangle is: " + Geometry.triangleArea(base, height));
			}

		} while(userInput != 4);
	}

	// Display method presents the options to the user
	public static void display()
	{
		System.out.println("Geometry Calculator");
		System.out.println("1. Calculate the Area of a Circle");
		System.out.println("2. Calculate the Area of a Rectangle");
		System.out.println("3. Calculate the Area of a Triangle");
		System.out.println("4. Quit");
	}
}