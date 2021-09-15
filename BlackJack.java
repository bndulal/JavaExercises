package qa.com.results;

public class BlackJack {

	public static void main(String[] args) {
		System.out.println(blackJack(22,19));
		
		
	}

	public static int blackJack(int i, int j) {
		
			if (i > 21 && j > 21) {
				return 0;
			}
			if (i>j && i<=21) {
	
				return i;
			}
			else if (j >21){
				
				return i;
			}
			else {
				return j;
			}
		
		
		
		
	}
}
