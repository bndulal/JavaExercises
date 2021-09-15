package qa.com.results;

public class StringManipulation {
	public static void main(String args[]) {
		// exercise 1 from string manipulation
		
		String strYesterday = "yesterday it was raining";
		String strToday = "today it is sunny";
		
		System.out.println(strToday.toUpperCase()+ ", "+ strYesterday.toUpperCase());
		
		String mySubString1 = strToday.substring(0, 11);
		String mySubString2 = strYesterday.substring(16, 24);
		
		System.out.println(mySubString1 + mySubString2);
		

// When given a String, count and return how many words there are in that String
	
	String newStr = "welcome to the jungle";
	int strLength = newStr.length();
	System.out.println("The string length is  " + strLength);
	
	int a = 0;
	for (int i = 0; i<=newStr.length(); i++) {
		String mySubString3 = newStr.substring(0, i);
		System.out.println(mySubString3);
		
		
		
		
	}
	
}

}



	


