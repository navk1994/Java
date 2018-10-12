
public class interate {

	public static void main(String[] args) {

		returnReverseString();

	}

	static void print1to10() {
		for (int i = 100; i <= 999; i++) {
			System.out.println(i);
		}
	}

	static void print1to10inWords() {
		for (int i = 1; i <= 10; i++) {
			switch (i) {

			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("two");
				break;
			case 3:
				System.out.println("three");
				break;
			case 4:
				System.out.println("four");
				break;
			case 5:
				System.out.println("five");
				break;
			case 6:
				System.out.println("six");
				break;
			case 7:
				System.out.println("seven");
				break;
			case 8:
				System.out.println("eight");
				break;
			case 9:
				System.out.println("nine");
				break;
			case 10:
				System.out.println("ten");
				break;

			default:
				System.out.println("You shouldnt see this statement");
				break;

			}
		}
	}

	static void print100to999() {
		for (int i = 100; i <= 999; i++) {
			System.out.println(i);
		}
	}

	static void printNumbersinWords() {
		String oneToNineteen[] = new String[] 
				{"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten","eleven", "twelve", "thirteen", "fourteen", 
						"fifteen", "sixteen", "seventeen ","eighteen", "nineteen"};
		
		String twentyToHundred[] = new String[] {"twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety", "hundred" };
	
		for(int i = 0; i<100;i++) 
		{
			if(i < oneToNineteen.length) 
			{
			System.out.println(oneToNineteen[i]);	
			}
			
			else 
			{
				
			}
		}
	}

	
	static void returnReverseString() {
		
		String secondname = "John";
		char othername [] = secondname.toCharArray(); 
		
		
		String[] name = {"n","a", "v", "e", "e", "d"};
		
		for(int i = name.length - 1; i >= 0; i--) {
			System.out.println(name[i]);
		}
		
		for(int j = othername.length - 1; j >=0; j--) 
		{
			System.out.print(othername[j]);
		}
		
		
		
	}
}
