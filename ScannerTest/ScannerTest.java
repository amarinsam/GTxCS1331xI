import java.util.Scanner;
import java.text.NumberFormat;

public class ScannerTest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Input int");
		int numInput = input.nextInt();
		System.out.print("Input String");
		String stringInput = input.next();
		System.out.printf("%d %s", numInput, stringInput);
	}
}
