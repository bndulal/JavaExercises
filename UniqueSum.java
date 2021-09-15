package qa.com.results;

public class UniqueSum {
	public static void main(String[] args){
	
		System.out.println(Input(2,2,3));
		
	}
	public static int Input(int i, int j, int k) {
		
		if (i == j && i == k){
			return 0;
		}
		else if (i == j){
			return k;
		}
		else if (j == k) {
			return i;
		}
		else {
			return i+j+k;
			
			
		}
		
		
	}
	

}
