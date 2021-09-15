
public class Calculator {
	public static void main(String[] args) {
		
		System.out.println("The sum is: " + newSum(0));
		System.out.println("The difference is: " + newDiff(0));
		System.out.println("The multiplication is: " + newMult(0));
		System.out.println("The division is : " + newDiv(0));
		
	}
	private static int newDiff(int i) {
		int num3 = 10;
		int num4 = 20;
		i = num3 - num4;
		
		
		return i;
	}
	private static int newMult(int multip) {
		
		int num5 = 50;
		int num6 = 10;
		multip = num5*num6;
		
		return multip;
	}
	public static int newSum(int result) {
		int num1 = 3;
		int num2 = 6;
		result = num1 + num2;
		return result;
		
				
	}
private static double newDiv(double div) {
		
		int num5 = 5;
		int num6 = 10;
		if (num5<num6) {
			System.out.println("The division cannot be performed");
			
		}
	

			div = num5/num6;
		
		
		return div;
		}

	
}
