import java.util.Scanner;

public class Calculator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("List of operations: add subtract multiply divide alphabetize");
		System.out.println("Enter an operation");
		String operationSelect = input.next();
		switch(operationSelect.toLowerCase()){
			case "add": {
				System.out.println("Enter two integers:");
				if (input.hasNextInt()){
					int int1 = input.nextInt();
					if (input.hasNextInt()){
						int int2 = input.nextInt();
						System.out.println("Answer: " + (int1 + int2));
						break;
					} else {
						System.out.println("Invalid input entered. Terminating...");
						break;						
					}
				} else {
					System.out.println("Invalid input entered. Terminating...");
					break;											
				}
			}
			case "subtract": {
				System.out.println("Enter two integers:");
				if (input.hasNextInt()){
					int int1 = input.nextInt();
					if (input.hasNextInt()){
						int int2 = input.nextInt();
						System.out.println("Answer: " + (int1 - int2));
						break;
					} else {
					System.out.println("Invalid input entered. Terminating...");
					break;						
					}
				} else {
					System.out.println("Invalid input entered. Terminating...");
					break;
				}
			}
			case "multiply": {
				System.out.println("Enter two doubles:");
				if (input.hasNextDouble()){
					double int1 = input.nextDouble();
					if (input.hasNextDouble()){
					double int2 = input.nextDouble();	
					System.out.println("Answer: " + (int1 * int2));
					break;
					} else {
						System.out.println("Invalid input entered. Terminating...");
						break;
					}
				} else {
					System.out.println("Invalid input entered. Terminating...");
					break;
				}
			}
			case "divide": {
				System.out.println("Enter two doubles:");
				if (input.hasNextDouble()){
					double int1 = input.nextDouble();
					if (input.hasNextDouble()){
						double int2 = input.nextDouble();	
						if (int2 == 0){
							System.out.println("Invalid input entered. Terminating...");
							break;
						} else {
							System.out.println("Answer: " + (int1 / int2));
							break;	
						} 
					} 
				} else {
						System.out.println("Invalid input entered. Terminating...");
						break;
				}
			}
			case "alphabetize": {
				System.out.println("Enter two words:");
				String word1 = input.next();
				String word2 = input.next();
				if (word1.toLowerCase().equals(word2.toLowerCase())){
					System.out.print("Answer: Chicken or Egg.");
				} else {
					if ((word1.toLowerCase().compareTo(word2.toLowerCase())) < 0){
					System.out.print("Answer: " + word1 + " comes before " + word2 + " alphabetically.");					
					}
					if ((word1.toLowerCase().compareTo(word2.toLowerCase())) > 0){
					System.out.print("Answer: " + word2 + " comes before " + word1 + " alphabetically.");					
					}
				}
				break;
			}
			default: {
				System.out.println("Invalid input entered. Terminating...");
				break;
			}
		}
	}
}