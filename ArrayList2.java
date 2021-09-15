package qa.com.results;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {

public static void main(String[] args) {
List<String> newArray = new ArrayList<>();
	newArray.add("London");
	newArray.add("Tokyo");
	newArray.add("Amsterdam");
	for (int i = 0; i < newArray.size(); i++) {
	
	System.out.println(newArray.get(i));
	
	}
	
	for (String i :newArray) {
		System.out.println(i);
		}

}
	
	
}
