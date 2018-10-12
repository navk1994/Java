package com.Animals.Animal;

public class Animal {
	
	private String animalName;
	private String animalColour;
	private int animalWeight;
	
	public Animal(String name, String colour, int weight)
	{
		this.animalName = name;
		this.animalColour = colour;
		this.animalWeight = weight;
	}
	
	public void run()
	{
		System.out.println("The animal is running");
	}
	
	public void shout()
	{
		System.out.println("The animal is making noise");
	}
	
	
}
