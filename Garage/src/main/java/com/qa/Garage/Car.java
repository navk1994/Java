package com.qa.Garage;

public class Car extends Vehicle {
	
	int engineSize;
	int numberOfDoors;
	boolean isManual;
	
	public void drive()
	{
		System.out.println("Vrooooooom");
	}
	
	public void park()
	{
		System.out.println("The car has been parked");
		
	}
	
	public Car(String name, String colour,int numberOfSeats, int engineSize, int numberOfDoors, boolean isManual, String id)
	{
		this.name = name;
		this.colour = colour;
		this.engineSize = engineSize;
		this.numberOfSeats = numberOfSeats;
		this.numberOfDoors = numberOfDoors;
		this.isManual = isManual;
		this.id = id;
	}

	public int getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public boolean isManual() {
		return isManual;
	}

	public void setManual(boolean isManual) {
		this.isManual = isManual;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + engineSize + " " + numberOfDoors + " " + isManual + " " + id + "\n";
	}
	
}
