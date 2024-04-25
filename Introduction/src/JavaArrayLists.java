import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaArrayLists {

	public static void main(String[] args) {
		// create object of the class -- object.method
		ArrayList <String> a = new ArrayList<String>();
		a.add("rahul");
		a.add("shetty");
		a.add("academy");
		a.add("selenium");

		for(int i = 0; i < a.size(); i++) { // for arrayLists you cannot use .length(), instead .size()
			System.out.println(a.get(i));
		}
		
		//the enhanced for loop
		for (String val :a){
			System.out.println(val);
		}
		
		//item is present in ArrayList
		System.out.println(a.contains("rahul"));
		
		//convert an array for arrayList
		String [] name = {"rahul", "shetty", "selenium"};
		List <String> nameArrayList = Arrays.asList(name);
		
	}
}
