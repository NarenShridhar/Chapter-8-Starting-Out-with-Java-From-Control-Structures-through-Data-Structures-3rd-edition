import java.util.Scanner;

public class Chapter8Problem4
{
	public static void main (String[] args)
	{
		// Called the display method created below
		display();

		// Called the getUserInputs method created below to run the program
		getUserInputs();
	}

	// Created a display method which displays the objectives of the program to the user
	public static void display()
	{
		System.out.println("The goal of this program is as follows...");
		System.out.println("The user will input the length and width of two tracts, and the program will ");
		System.out.println(" show if the tracts are of the same size (area).");
	}

	public static void getUserInputs()
	{
		// Created a length variable to hold the user's input for the length of the tract
		double length;

		// Created a width variable to hold the user's input for the width of the tract
		double width;

		// Created a Scanner object called keyboard to hold the user's input
		Scanner keyboard = new Scanner(System.in);

		// Println statement to accept the length of the tract from the user and store it in the length variable
		System.out.println("User, please enter the length of the first tract (in feet): ");
		length = keyboard.nextDouble();

		// Println statement to accept the width of the tract from the user and store it in the width variable
		System.out.println("User, please enter the width of the first tract (in feet): ");
		width = keyboard.nextDouble();

		// Created an object called tract1 to hold the values of the first tract that were input by the user
		LandTract tract1 = new LandTract(length, width);

		// Println statement to accept the length of the tract from the user and store it in the length variable
		System.out.println("User, please enter the length of the second tract (in feet): ");
		length = keyboard.nextDouble();

		// Println statement to accept the width of the tract from the user and store it in the width variable
		System.out.println("User, please enter the width of the second tract (in feet): ");
		width = keyboard.nextDouble();

		// Created an object called tract1 to hold the values of the first tract that were input by the user
		LandTract tract2 = new LandTract(length, width);

		// Created a LandTract testObject to test the tractEquals methodd
		LandTract testObject = new LandTract();

		// Call the tractEquals method using the newly created testObject object
		testObject.tractEquals(tract1, tract2);
	}
}