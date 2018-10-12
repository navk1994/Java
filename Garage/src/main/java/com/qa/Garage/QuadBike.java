package com.qa.Garage;

public class QuadBike extends Vehicle {
	int numberOfWheels = 4;
	
	
	public QuadBike(String name, String colour, int numberOfSeats, int numberOfWheels, String id)
	{
		this.name = name;
		this.colour = colour;
		this.numberOfSeats = numberOfSeats;
		this.numberOfWheels = numberOfWheels;
		this.id = id;
		
	}
	
	void revEngine() 
	{
		System.out.println("Too loud!!!");
		
	}
	
	void drift()
	{
		System.out.println("Drifting far and wide");
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	
	@Override
	public String toString() {
	// TODO Auto-generated method stub
	return super.toString() + numberOfWheels ;
	}
	
}
