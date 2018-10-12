package com.qa.Game.infineTerrainSystemwithGrid;

public class Game {

	String[][] map = { 
			{ "Grass", "Grass" },
			{ "Grass", "Grass" },
			{ "Grass", "Grass" },
			{ "Women", "Grass" },			
			{ "Grass", "Grass" },
			{ "Grass", "Grass" },
			{ "Grass", "Traveler" },
			{ "Grass", "Grass" },
			{"Treasure", "Grass"} };
	
	Player player = new Player();
	public void startGame()
	{
		int XCoordinates = (int) Math.ceil(Math.random() * 8);
		int YCoordinates = (int) Math.floor(Math.random() * 2);
		
		player.setPositionX(XCoordinates);
		player.setPositionY(YCoordinates);
		
		
		
		
	}
	
	public void move() 
	{
		for (int i = 0; i<= 20; i++)
		{
		int randomValue = (int) Math.floor(Math.random() * 2);
		System.out.println(randomValue);
		
		}
		
		System.out.println(map[8][0]);
	}
	
}
