package qa.com.results;

public class Taxes {
	public static void main(String[] arg) {
		method1(0.00,0.00);
		System.out.println("The tax amount is  : " + method2(0.00, 0.00, 0.00));
	}

	public static double method1(double salary, double tax) {
		// takes in salary and works out the percentage by which it will be taxed
		 salary = 50000.00;
		
		if (salary < 15000){
			tax = 0;
			}
		else if (salary < 20000){
			tax = 10;
		}
		else if (salary < 30000) {
			tax = 15;
		}
		else if (salary < 45000) {
			tax = 20;
		}
		else {
			tax = 25;
		}
		return tax;
	}

public static  double method2(double salary, double tax, double taxAmount) {
		// works out the exact amount that the user will be taxed 
		//the amount should be returned and output to the console
	salary = 32000f;
	
	if (salary < 15000){
		tax = 0;
		taxAmount = 0;
		}
	else if (salary < 20000){
		tax = 10;
		taxAmount = salary * 0.1;
		return taxAmount;
		
		
	}
	else if (salary < 30000) {
		tax = 15;
		taxAmount = salary * 0.15;
		return taxAmount;
		
	}
	else if (salary < 45000) {
		tax = 20;
		taxAmount = salary * 0.2;
		
	}
	else {
		tax = 25;
		taxAmount = salary * 0.25;
		
	}
	return taxAmount;
	
	
		
	}

}
