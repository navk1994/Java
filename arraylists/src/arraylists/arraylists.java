package arraylists;

import java.util.Arrays;
import java.util.List;

public class arraylists {
	
	public static void main (String[] args)
	{
		
		//printEvenNumbers();
		//printNumbersMoreThan10();
	//	printHighestNumber();
		//printLowestNumber();
		sqrNumberPushToNewArray();
		
	}
	
	static void printEvenNumbers() 
	{
List<Integer> numbers = Arrays.asList(3,2,2,3,7,3,5,9,8,12);
		
		for(int i = 0; i < numbers.size(); i++) {
			
			if(numbers.get(i) % 2 == 0) {
				System.out.print(numbers.get(i) + ", ");
			}
			

			
			
		}
		
	}
	
	static void printNumbersMoreThan10() 
	{
List<Integer> numbers = Arrays.asList(3,2,2,3,7,3,5,9,8,12);
		
		for(int i = 0; i < numbers.size(); i++) {
			
			int j = numbers.get(i) * 10;
			System.out.print(j + ", ");

			
			
		}
		
		
		
		
	}
	
	static void printHighestNumber()
	{
		int currentMax = 0;
List<Integer> numbers = Arrays.asList(3,2,2,3,7,3,5,9,8,12);
		
		for(int i = 0; i <= numbers.size() - 1; i++) {
			
			if((i + 1 <= (numbers.size() - 1)) && numbers.get(i) < numbers.get(i + 1)   ) {
				currentMax = numbers.get(i + 1);
			}
			else 
			{
				currentMax = numbers.get(i);
			}	
			
			
			
		

			
			
		}
		
		System.out.println(currentMax);
		
	}

	static void printLowestNumber()
	{
		int currentLowest = 100;
List<Integer> numbers = Arrays.asList(1,10,2,3,7,3,5,9,8,12);
		
		for(int i = 0; i <= numbers.size() - 1; i++) {
			
			if((i + 1 <= (numbers.size() - 1)) && numbers.get(i + 1) < currentLowest    ) {
				currentLowest = numbers.get(i + 1);
			}
			
			
			if(numbers.get(0) < currentLowest) 
			{
			currentLowest = numbers.get(0);	
			}
			
		

			
			
		}
		
		System.out.println(currentLowest);
		
	}
	
	static void sqrNumberPushToNewArray() 
	{
		
		List<Integer> numbers = Arrays.asList(1,10,2,3,7,3,5,9,8,12);
		
		
		for(int i = 0; i <= numbers.size() - 1; i++) 
		{
			int sqrNumber = numbers.get(i) * numbers.get(i);
	//		System.out.print(sqrNumber + ", ");
		
		List<Integer> numbers2 = Arrays.asList(sqrNumber);
		System.out.println(numbers2);
		}
		
		
//		for(int j = 0; j <= numbers2.size() - 1; j++) 
//		{
//			System.out.print(numbers2.get(j) + ", ");
//		}
		
	}

	static void printUniqueNumbers() 
	{
		List<Integer> numbers = Arrays.asList(3,2,2,3,7,3,5,9,8,12);
		
		
		for (int i = 0; i <= numbers.size() - 1; i++) 
		{
			
			
		}
	}
}
