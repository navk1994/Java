package com.qa.Game.infineTerrainSystemwithGrid;

import java.util.Scanner;

public class gameFunctions {

	Scanner scanner = new Scanner(System.in);
	double initialDialReading = 5;
	boolean alwaysTrue = true;
	
	

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
