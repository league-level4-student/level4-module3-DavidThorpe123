package _02_gotta_catchem_all;

public class ExceptionMethods {
	//2. In the ExceptionMethods class, write a method called divide that takes
		//   two doubles as parameters and returns their quotient as a double. This method 
		//   should throw an IllegalArgumentException if the denominator is 0.0.
	public double divide(double x, double y) throws IllegalArgumentException {
		if (y == 0.0) {
			throw new IllegalArgumentException();
		}
		return x / y;
	}
	//4. In the ExceptionMethods class, write a method called reverseString that takes a
		//   String and returns the reverse of that String. It should throw an IllegalStateException
		//   if the String passed in is empty
	public String reverseString(String s) throws IllegalStateException {
		if (s.isEmpty()) {
			throw new IllegalStateException();
		}
		String reverse = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse += s.charAt(i);
		}
		return reverse;
	}
}
