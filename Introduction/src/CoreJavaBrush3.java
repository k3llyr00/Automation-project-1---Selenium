
public class CoreJavaBrush3 {
	public static void main(String[] args) {
		// String is a object that represents a series of characters.
		String s = "Rahul Shetty Academy";
		// String literal: is not creating another object if  the value is same, instead it points to the value
		// String s1 = "Rahul Shetty Academy"; 
		
		String s2 = new String("Welcome");
		// New: two objects will be created
		String s3 = new String("Welcome");
		
		String [] splittedString = s.split("Shetty");
		
		for (int i = 0; i < splittedString.length; i ++ ) {
			System.out.println(splittedString[i]);
		}
		
		//remove the whitespaces
		System.out.println(splittedString[1].trim());
		
		// print character by character
		for (int i = 0; i < s.length(); i ++ ) {
			System.out.println(s.charAt(i));
			
		}
		
		//reverse print character by character
		for (int i = (s.length()-1); i > 0; i -- ) {
			System.out.println(s.charAt(i));
			
		}
	}
}
