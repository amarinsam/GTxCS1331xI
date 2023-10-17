import java.util.Scanner;

public class FtoC {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter F and D, and either Celcius, Centigrade, or C: ");
		int farentheight = input.nextInt();
		String day = input.next();
		String cText = input.next();
		double celcius = (5.0/9) * (farentheight - 32);
		System.out.printf("%s Farentheight: %d\n", day, farentheight);
		System.out.printf("%s| |%-10s|: %,.0f\n", day, cText, celcius);
	}
}