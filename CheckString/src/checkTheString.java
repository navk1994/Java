
public class checkTheString {
	
	public static void main (String[] args) {
		
		System.out.println(checkIfStringsMatch("jim", "abe"));
		
	}
	
	static String checkIfStringsMatch(String firstWord, String secondWord) 
	{
		
		String wordsMatch = "The words match";
		String wordsDontMatch = "The words don't match";
		
		
		
		
		if(firstWord == secondWord) {
			return wordsMatch;
		}
		
		else {
			return wordsDontMatch;
		}
		
	}
	
	
}
