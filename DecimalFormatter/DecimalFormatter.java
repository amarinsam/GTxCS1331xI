import java.util.Scanner;
import java.text.DecimalFormat;

public class DecimalFormatter{
	public static void main(String[] args){
		DecimalFormat formatObject1 = new DecimalFormat("0.0%");
		System.out.println("formatted... -> " + formatObject1.format(0.31));
	}
}