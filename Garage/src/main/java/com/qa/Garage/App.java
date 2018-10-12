package com.qa.Garage;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App extends Vehicle {
	public static void main(String[] args) {

		Garage garage = new Garage();

		// System.out.println( "Hello World!" );

		Car c1 = new Car("Mazda", "Blue", 5, 3, 5, true, "Car");
		Tricycle t1 = new Tricycle("Nike Tricycle", "Red", 1, 3, "Tri");
		QuadBike q1 = new QuadBike("Mazerati Quad Collection", "Blue", 5, 4, "Quad");

		List<Vehicle> vehicles = new ArrayList<Vehicle>();

		vehicles.add(c1);
		vehicles.add(t1);
		vehicles.add(q1);

		garage.setListOfVehicles(vehicles);

		// garage.getListOfVehicles().stream().forEach(System.out::print);
	//	garage.getListOfVehicles().stream().forEach(System.out::print);
	//	garage.calculateTotalCosts(garage.getListOfVehicles()).stream().forEach(System.out::println);
		garage.removeVehicle(c1);
		garage.getListOfVehicles().stream().forEach(System.out::print);
		garage.emptyGarage();
		System.out.println(garage.getListOfVehicles());
	}

}
