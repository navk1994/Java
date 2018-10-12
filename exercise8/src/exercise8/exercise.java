/**
 * 
 */
package exercise8;


public class exercise {
	
	public static void main(String[] args)
	{
		Greeting helloWorld = (message) -> "Hello  " + message; 
		
	//	System.out.println(helloWorld.sayMessage("Him"));
		
		Operations add = (int a, int b) -> a + b;
		Operations subtract = (a,b) -> a - b;
		Operations multiply = (a,b) -> a * b;
		Operations divide = (a,b) -> a / b;
		
		System.out.println(add.operation(5,10));
		System.out.println(subtract.operation(10, 5));
		System.out.println(multiply.operation(5, 10));
		System.out.println(divide.operation(100, 10));
		
		
	}
	
	interface Greeting
	{
		String sayMessage(String message);
	}
	
	
	
}
