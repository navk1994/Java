import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class demo {

	public static void main (String[] args)
	{
		
		List<Integer> listOfNumbers = Arrays.asList(8, 29, 4, 5, 1010 , 29);
	listOfNumbers.stream().sorted().forEach(System.out::println);
		
	}
	
	
	

}

