import java.util.Scanner;

public class Chapter8Problem3
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
		System.out.println("This program does the following...");
		System.out.println("The user will be asked to enter the length, width, and cost per square foot of carpet for a room, ");
		System.out.println("and the program will display the total cost of the carpet for said room.");
		System.out.println();
	}

	public static void getUserInputs()
	{
		// Created a length variable to hold the user's input for the length of the room
		double length;

		// Created a width variable to hold the user's input for the width of the room
		double width;

		// Created a carpetCost variable to hold the user's input for the cost of the carpet per square foot
		double carpetCost;

		// Created a Scanner object called keyboard to hold the user's input
		Scanner keyboard = new Scanner(System.in);

		// Println statement to accept the length of the room from the user and store it in the length variable
		System.out.println("User, please enter the length of the room (in feet): ");
		length = keyboard.nextDouble();

		// Println statement to accept the width of the room from the user and store it in the width variable
		System.out.println("User, please enter the width of the room (in feet): ");
		width = keyboard.nextDouble();

		// Println statement to accept the carpet cost of the carpet
		System.out.println("User, please enter the cost per square foot of the carpet: ");
		carpetCost = keyboard.nextDouble();

		// Created a RoomDimension object called size and input the arguments of length and width given by the user
		RoomDimension size = new RoomDimension(length, width);

		// Created a RoomCarpet object called total and input the arguments of the size RoomDimension object and the carpet cost
		RoomCarpet total = new RoomCarpet(size, carpetCost);

		// Final total output printed
		System.out.println("The total cost is: $" + total.getTotalCost());
	}
}