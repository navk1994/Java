package exercise6Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class exercise6 {
	
	public static void main (String[] args)
	{
		
		//pushNumbersArray();
		//printNumbersPushToList();
		
		System.out.println(multiplyValuesBy10(printNumbersPushToList()));
	}
	
	static void pushNumbersArray()
	{
		int[] numbersList = new int[100];
		
		for(int i = 0; i <= numbersList.length - 1; i++)
		{
		 int value = i + 1;
			numbersList[i] = value;
		}
		
		for(int j = 0; j <= numbersList.length - 1; j++)
		{
			System.out.println(numbersList[j]);
		}
	}
	
	static List<Integer> printNumbersPushToList() 
	{
List<Integer> numbersList = new ArrayList<Integer>();
			
		for(int i = 100; i <=999; i++)
		{
			int value = 0;
			value = i;
			numbersList.add(value);
		}
		
		return numbersList;
	}

	static List<Integer> multiplyValuesBy10(List<Integer> list)
	{
	 List<Integer> multipliedList = new ArrayList<Integer>();
	 
	 for(int number: list)
	 {
		 multipliedList.add(number * 10);
	 }
	 return multipliedList;
	}
	
}
