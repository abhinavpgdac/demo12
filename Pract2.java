package Pack1;
//using ternary check if number eneterd by user is positive or negative .
//In case number is positive store "Positive number" else store negative number to Result variable
import java.util.*;
public class Pract2 {
	
	public static void main(String[] args) {
		int a;
		String result;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Value of a");
		a = s.nextInt();
		result = a>=0 ? "Positive Number" : "Negative Number";
		System.out.println(result);

		

	}

}
