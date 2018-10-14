package com.qa.Game.infineTerrainSystemwithGrid;

import java.util.Scanner;

public class Game {
	int playerNewXPosition;
	int playerNewYPosition;
	Scanner scanner = new Scanner(System.in);

	String[][] map = { { "Grass", "Grass" }, { "Grass", "Grass" }, { "Grass", "Grass" }, { "Women", "Grass" },
			{ "Grass", "Grass" }, { "Grass", "Grass" }, { "Grass", "Traveler" }, { "Grass", "Grass" },
			{ "Treasure", "Grass" } };

	Player player = new Player();

	public void startGame() {
		int XCoordinates = (int) Math.ceil(Math.random() * 8);
		int YCoordinates = (int) Math.floor(Math.random() * 2);

		player.setPositionX(XCoordinates);
		player.setPositionY(YCoordinates);

		System.out.println("Grey foggy clouds float oppressively close to you," + " "
				+ "reflected in the murky grey water which reaches up your shins.");
		System.out.println("Some black plants barely poke out of the shallow water.");

		System.out.println("You notice a small watch-like device in your left hand." + " "
				+ "It has hands like a watch, but the hands don't seem to tell time.");

		System.out.println("The dial reads '5M'");
		System.out.println("You have the option to go North, South, East or West\n");

		System.out.println("Type in North, South, East or West");
		String option = scanner.nextLine();
		move(option);

	}

	public void move(String direction) {
		switch (direction) {
		case "North":
			player.setPositionX(player.getPositionX() + 1);
			System.out.println(player.getPositionX() + " " + player.getPositionY());
			if(map[player.getPositionX()][player.getPositionY()] == "Treasure")
			{
				System.out.println("A girl steps out from the treasure chest, a beefy gal that must have been around 100kg.");
				break;
			}
			
			if (player.getPositionY() > 8) {
				player.setPositionY(8); //the last index in the array
				System.out.println(player.getPositionX() + " " + player.getPositionY());
				System.out.println("An ogre is blocking your path, choose a different direction to go");
				System.out.println("Type in North, South, East or West");
				String option2 = scanner.nextLine();
				move(option2);
			} else {
				if(map[player.getPositionX()][player.getPositionY()] == "Treasure")
				{
					System.out.println("A girl steps out from the treasure chest, a beefy gal that must have been around 100kg.");
				}
				System.out.println(map[player.getPositionX()][player.getPositionY()]);
				System.out.println("Type in North, South, East or West");
				String option2 = scanner.nextLine();
				move(option2);
				break;
			}

		case "South":
			player.setPositionX(player.getPositionX() - 1);
			System.out.println(player.getPositionX() + " " + player.getPositionY());
			
			if(map[player.getPositionX()][player.getPositionY()] == "Treasure")
			{
				System.out.println("A girl steps out from the treasure chest, a beefy gal that must have been around 100kg.");
				break;
			}
			
			if(player.getPositionX() < 0) {
				player.setPositionX(0);
				System.out.println(player.getPositionX() + " " + player.getPositionY());
				System.out.println("An ogre is blocking your path, choose a different direction to go");
				System.out.println("Type in North, South, East or West");
				String option3 = scanner.nextLine();
				move(option3);
				break;
			}
			else {
			System.out.println("Type in North, South, East or West");
			String option3 = scanner.nextLine();
			move(option3);
			break;
			}

		case "East":
			player.setPositionY(player.getPositionY() + 1);
			
			if(map[player.getPositionX()][player.getPositionY()] == "Treasure")
			{
				System.out.println("A girl steps out from the treasure chest, a beefy gal that must have been around 100kg.");
				break;
			}
			
			if(player.getPositionY() > 1) {
				player.setPositionY(1);
				System.out.println(player.getPositionX() + " " + player.getPositionY());
				System.out.println("An ogre is blocking your path, choose a different direction to go");
				String option3 = scanner.nextLine();
				move(option3);
				break;
			}
			else {
			System.out.println(player.getPositionX() + " " + player.getPositionY());
			System.out.println("Type in North, South, East or West");
			String option4 = scanner.nextLine();
			move(option4);
			break;
			}

		case "West":
			player.setPositionY(player.getPositionY() - 1);
			
			if(map[player.getPositionX()][player.getPositionY()] == "Treasure")
			{
				System.out.println("A girl steps out from the treasure chest, a beefy gal that must have been around 100kg.");
				break;
			}
			
			if(player.getPositionY() < 0) 
			{
				player.setPositionY(0);
				System.out.println(player.getPositionX() + " " + player.getPositionY());
				System.out.println("An ogre is blocking your path, choose a different direction to go");
				System.out.println("Type in North, South, East or West");
				String option3 = scanner.nextLine();
				move(option3);
				break;
			}
			
			else {
				System.out.println(player.getPositionX() + " " + player.getPositionY());
			System.out.println("Type in North, South, East or West");
			String option5 = scanner.nextLine();
			move(option5);
			break;
			}

		default:
			System.out.println("Type in North, South, East or West");
			String option6 = scanner.nextLine();
			move(option6);
			break;

		}
	}

}
