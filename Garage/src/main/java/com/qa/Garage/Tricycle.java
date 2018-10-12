package com.qa.Garage;

import java.util.Arrays;
import java.util.List;

public class Tricycle extends Vehicle {
		int numberOfWheels = 3;
		
		
		public Tricycle(String name, String colour, int numberOfSeats, int numberOfWheels, String id)
		{
			this.name = name;
			this.colour = colour;
			this.numberOfSeats = numberOfSeats;
			this.numberOfWheels = numberOfWheels;
			this.id = id;
			
			
		}
		public void popWheelie()
		{
			System.out.println("Performing a wheelie with a tricycle");
		}
		public int getNumberOfWheels() {
			return numberOfWheels;
		}
		public void setNumberOfWheels(int numberOfWheels) {
			this.numberOfWheels = numberOfWheels;
		}
		
		public List<String> returnResults(List<String> list)
		{
			List<String> listOfStrings = Arrays.asList("Chicken", "Pineapple");
			return list;
		}
		
		@Override
		public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " " + numberOfWheels + "\n";
		}
}
