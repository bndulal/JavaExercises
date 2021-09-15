package qa.com.results;

public class FizzBuzz {
	public static void main(String[] arg) {
		fizzBuzz(18);
		
	}

	public static int fizzBuzz(int i) {
		// return Fizz for multiples of 3 and Buzz for multiples of five
		if (i%5 == 0 && i%3 == 0) {
			System.out.println("FizzBuzz");
		
		
	}
		else if (i%5 == 0) {
			System.out.println("Buzz");
		}
		else if (i%3 == 0) {
			System.out.println("Fizz");
		}
		
		return i;
	}
}

			


