package qa.com.results;

public class Array {

	public static void main(String[] args) {
		int[] newArray = new int[10];
		newArray[0] = 0;
		newArray[1] = 1;
		newArray[2] = 2;
		newArray[3] = 3;
		newArray[4] = 4;
		newArray[5] = 5;
		newArray[6] = 6;
		newArray[7] = 7;
		newArray[8] = 8;
		newArray[9] = 9;
		
		for (int j = 0; j < newArray.length; j++) {
			System.out.println(newArray[j]);
		}
		
		for (int a = 0; a < newArray.length; a++) {
			newArray[a] = a;
		
		
			System.out.println("value " +newArray[a]);
			}
		for (int c = 0; c<newArray.length; c++) {
			newArray[c] = c*10;
			System.out.println(newArray[c]);
			
		}
			
			
	}
}


