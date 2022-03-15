package Pack1;
//wap to demonstrate ternary operator .define a variable marks  .ask its value from user and using ternary operator check if marks > 40 store "Pass" in result varible else store "Fail"
import java.util.*;
public class Pract1 {
	

	public static void main(String[] args) {
		int marks=40;
		int m;
		String result;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Marks m");
		m=s.nextInt();
		result= m>marks ? "Pass" : "Fail";
		System.out.println(result);
	}
		
		
}
		
