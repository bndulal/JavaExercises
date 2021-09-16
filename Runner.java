package qa.com.results;

public class Runner {
	public static void main(String[] args) {
		
		Person harry = new Person("Harry", 5.10, 9, "Shop assistant", 35 );
		Person carry = new Person("Carry", 42);
		Person boris = new Person ("Boris", "Cleaner");
		
		
		harry.greet();
		carry.greet();
		boris.greet();
		
		}

}
