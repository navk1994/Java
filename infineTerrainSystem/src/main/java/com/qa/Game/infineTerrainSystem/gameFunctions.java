package com.qa.Game.infineTerrainSystem;

import java.util.Scanner;

public class gameFunctions {

	Scanner scanner = new Scanner(System.in);
	double initialDialReading = 5;
	boolean alwaysTrue = true;

	public void startGame() {
		System.out.println("Grey foggy clouds float oppressively close to you," + " "
				+ "reflected in the murky grey water which reaches up your shins.");
		System.out.println("Some black plants barely poke out of the shallow water.");

		System.out.println("You notice a small watch-like device in your left hand." + " "
				+ "It has hands like a watch, but the hands don't seem to tell time.");

		System.out.println("The dial reads '5M'");
		System.out.println("You have the option to go North, South, East or West\n");

		System.out.println("Type in North, South, East or West"); 
		String option = scanner.nextLine();
		movePlayer(option);
	}

	public void movePlayer(String choice) {
		

		
		
		switch (choice) {
		case "North":
			initialDialReading = initialDialReading - 0.025;
			System.out.println("The dial reads " + initialDialReading + " M");
			System.out.println("Type in North, South, East or West");
			String option2 = scanner.nextLine();
			movePlayer(option2);
			break;

		case "South":
			initialDialReading = initialDialReading + 0.025;
			System.out.println("The dial reads " + initialDialReading + " M");
			System.out.println("Type in North, South, East or West");
			String option3 = scanner.nextLine();
			movePlayer(option3);
			break;

		case "East":
			initialDialReading = initialDialReading - 0.05;
			System.out.println("The dial reads " + initialDialReading + " M");
			System.out.println("Type in North, South, East or West");
			String option4 = scanner.nextLine();
			movePlayer(option4);
			break;

		case "West":
			initialDialReading = initialDialReading - 0.025;
			System.out.println("The dial reads " + initialDialReading + " M");
			System.out.println("Type in North, South, East or West");
			String option5 = scanner.nextLine();
			movePlayer(option5);
			break;

		default:
			System.out.println("Type in North, South, East or West");
			String option6 = scanner.nextLine();
			movePlayer(option6);
			break;

		}

	}
}
