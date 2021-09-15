package qa.com.results;

public class Flowcharts {
	// return sum of two number if boolean is true and product if boolean is false
	
	public static void main(String[] arg) {
		flowNums(5, 6, false);
		flowChart(300);
	}
	
	private static void flowNums(int i, int j, boolean b) {
		if (b == true) {
			int result = i+j;
			System.out.println(result);
		}
		else {
			int result  = i*j;
			System.out.println(result);
		}
	}
	private static void flowChart(int a) {
		if (a>2000) {
			System.out.println("A");
			if (a>6000) {
				System.out.println("C");
			}
			else {
				System.out.println("B");
				if (a>4000) {
					System.out.println("D");
				}
				else {
					System.out.println("E");
				}
			}
			
			
		}
		else {
			System.out.println("1");
			if (a>100) {
				System.out.println("3");
				if (a>600) {
					System.out.println("5");
				}
				else {
					System.out.println("4");
					if (a>500) {
						System.out.println("6");
					}
					else {
						System.out.println("7");
					}
				}
			}
			else {
				System.out.println("2");
				
		}
		}
	}
}


		
	


			
	


