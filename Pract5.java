package Pack1;

import java.util.Scanner;

/* wap to ask product name and price of product from user and calculate discount i.e 
if price > 2000 then discount is 10 percent of price 
else 
discount is 7 % of price */

public class Pract5 {

	public static void main(String[] args) {
		String name;
		int price;
		float price1;
		float finalprice;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the Product Name :- ");
		name = a.next();
		System.out.println("Enter the Product Price :- ");
		price = a.nextInt();
		
		if(price>2000)
		{
			System.out.println("Discount will be 10% on price :- " + price);
			price1 = (price * 10)/100;
			finalprice = price - price1;
			System.out.println("Final amount :- " + finalprice);
		}
		else
		{
			System.out.println("Discount will be 7% on price :- " + price);
			price1 = (price * 7)/100;
			finalprice = price - price1;
			System.out.println("Final amount :- " + finalprice);
		}
	}

}
