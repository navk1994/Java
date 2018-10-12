package com.qa.Garage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Garage {
		
	List<Vehicle> listOfVehicles = new ArrayList<Vehicle>();
	
	
	
	
	public List<Vehicle> getListOfVehicles() {
		return listOfVehicles;
	}




	public void setListOfVehicles(List<Vehicle> listOfVehicles) {
		this.listOfVehicles = listOfVehicles;
	}
	
	public List<Integer> calculateTotalCosts(List<Vehicle> vlist) 
	{
	List<Integer> listofCosts = vlist.stream().map(v -> v.getCost(v)).collect(Collectors.toList());
	return listofCosts;
	} 
	
	public List<Vehicle> removeVehicle(List<Vehicle> vehiclelist, String id)
	{
		List<Vehicle> newVehicleList = vehiclelist.stream().filter(vlist -> !(id.equals(vlist.getId()))).collect(Collectors.toList());
		return newVehicleList;
	}
	
	public List<Vehicle> removeVehicle(Vehicle id)
	{
		listOfVehicles.remove(id);
		return listOfVehicles;
	}
	
	public void emptyGarage()
	{
		listOfVehicles.removeAll(getListOfVehicles());
	}




	
	
}
