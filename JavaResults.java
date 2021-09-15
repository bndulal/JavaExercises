package qa.com.results;

public class JavaResults{
	public static int physics = 80;
	public static int chemistry =90;
	public static int biology =90;
	public static int total = physics + chemistry + biology;
	public static float percentage;
	public static float perctP;
	public static float perctB;
	public static float perctC;
	
	
	
	public static void main(String[] args) {
		results();
		percentageCalculator(physics, chemistry, biology);
		
		
		
	}
	
		
	
	public static void results() {
		System.out.println("Physics Marks = " + physics);
		System.out.println("Chemistr Marks = " + chemistry);
		System.out.println("Biology Marks = " + biology);
		System.out.println("Total Marks out of 450 = " + total);
		
		
	}
	
	
	public static void percentageCalculator(int physics, int chemistry, int biology) {
		float percentage = ((physics + chemistry + biology)*100)/450;
		
		
		float perctP = physics * 100/150;
		float perctC = chemistry * 100/150;
		float perctB = biology * 100/150;
		
		// the result will be fail if the student fails to score above 60% in any subject
		
		if (percentage < 60 || perctP < 60)  {
			System.out.println("You have failed the exam");
			
		}
		else if (percentage < 60 || perctB < 60)  {
			System.out.println("You have failed the exam");
		}
		else if (percentage < 60 || perctC < 60)  {
			System.out.println("You have failed the exam");
		}
		
		else {
			System.out.println("You have passed the exam");
		}
		System.out.println("Percentage = " + percentage);
		
	}
	
	//continue for displaying the number of subjects failed 
	
}