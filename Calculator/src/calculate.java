
public class calculate {

	public static void main(String[] args) {

		performCalculation(5,5,"multiply");
		

	}

	public static void performCalculation(int num1, int num2, String choice) {

		String add = "add";
		String multiply = "multiply";
		String divide = "divide";
		String subtract = "subtract";

		if (choice == add) {
			System.out.print(addNumbers(num1, num2));
			
		}
		
		if (choice == multiply) {
			System.out.println(multiplyNumbers(num1,num2));
			
			
		}
		
		if (choice == divide) {
			System.out.println(divideNumbers(num1,num2));
			
			
		}
		
		if (choice == subtract) {
			System.out.println(addNumbers(num1,num2));
			
			
		}
		
		
		
		
	}
	

	public static int addNumbers(int num1, int num2) {
		int result = num1 + num2;
		return result;

	}

	public static int multiplyNumbers(int num1, int num2) {
		int result = num1 * num2;
		return result;

	}

	public static int divideNumbers(int num1, int num2) {
		int result = num1 / num2;
		return result;

	}

	public static int subtractNumbers(int num1, int num2) {

		int result = num1 - num2;
		return result;

	}
	

}
