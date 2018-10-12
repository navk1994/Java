package com.qa.Garage;

import java.util.List;
import java.util.stream.Collectors;

public abstract class Vehicle {
	String name;
	String colour;
	int numberOfSeats;
	String id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " + colour + " " + numberOfSeats;
	}

	public int getCost(Vehicle v) {
		if (v instanceof Car) {
			int price = v.numberOfSeats * 100;
			return price;
		}
		if (v instanceof Tricycle) {
			int price = v.numberOfSeats * 100;
			return price;
		}
		if (v instanceof QuadBike) {
			int price = v.numberOfSeats * 100;
			return price;
		} else {
			return 0;
		}

	}
	
	
}
