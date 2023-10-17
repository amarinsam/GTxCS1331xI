import java.util.Scanner;
import java.text.NumberFormat;

public class Currency{
	public static void main(String[] args){
		/* enter number of items, and cost per item, then format to currency */
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of items: ");
		int numberOfItems = input.nextInt();		
		System.out.print("Enter cost per item: ");
		double costPerItem = input.nextDouble();
		double total = numberOfItems * costPerItem;
		System.out.println(total);
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		System.out.println(formatter.format(total));
	}
	
}