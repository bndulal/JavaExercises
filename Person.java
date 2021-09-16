package qa.com.results;

// create a person class with a few variables (height, name, shoe size, job title, age).
// generate a constructor with all of them
// create another constructor that only has name and height.
// create 2 methods that use these variable (eg: greet). They should not be static
// create 4 instances of the Person class in your runner and call the methods
//upload your code to Github.

public class Person {

	private double height;
	private String name;
	private double shoesize;
	private String jobTitle;
	private int age;
	
	


	public Person(String name, double height, double shoesize, String jobTitle, int age) {
	this.name = name;
	this.height= height;
	this.shoesize = shoesize;
	this.jobTitle = jobTitle;
	this.age= age;
	
}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person(String name, String jobTitle) {
		this.name = name;
		this.jobTitle = jobTitle;
	}
	
	public Person(String name, double shoesize) {
		this.name = name;
		this.shoesize = shoesize;
	}
	
	
	public void greet() {
		System.out.println("HI, I am "+ name + "." + " I am " + height + "'tall " + "and " + age + " years old. "
				+ "My shoesize is " + shoesize + " and I work as a "+ jobTitle + ".");
		
	
	}
	}

