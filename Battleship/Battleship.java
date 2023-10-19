import java.util.Scanner;
import java.util.Arrays;

// prompt 10 coordinates
// create two 5x5 ship location grids
// create two 5x5 history grids
// create two fire functionalities

public class Battleship {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Welcome to Battleship!");

	// Declare grids
	char[][] player1Grid = new char[5][5];
	char[][] player2Grid = new char[5][5];
	char[][][] players = new char[][][]{
	player1Grid, player2Grid
	};

	// LIST OF PROMPTS 1-5
	String[] shipPrompts = new String[]{
		"Enter ship 1 location:",
		"Enter ship 2 location:",
		"Enter ship 3 location:",
		"Enter ship 4 location:",
		"Enter ship 5 location:"
	};

	int playerNum = 1;
	for (char[][] playerGrid : players){
	System.out.println("PLAYER " + playerNum + ", ENTER YOUR SHIPS’ COORDINATES.");
		for (String element : shipPrompts){
			boolean exit = false;
				do{
					System.out.println(element);
					if (input.hasNextInt()){
						int xCoordinate = input.nextInt(); // refactor this so that it's just a single method
						if (input.hasNextInt()){
							int yCoordinate = input.nextInt();
							if (xCoordinate > 4 || yCoordinate > 4){
								System.out.println("Invalid coordinates. Choose different coordinates.");
							} else {
								if ((char)playerGrid[xCoordinate][yCoordinate] != '@'){
								playerGrid[xCoordinate][yCoordinate] = '@';
								exit = true;
								} else {
									System.out.println("You already have a ship there. Choose different coordinates.");
								}	
							}
						} else {
							System.out.println("Invalid coordinates. Choose different coordinates.");
						}
					} else {
						System.out.println("Invalid coordinates. Choose different coordinates.");
					}				
				} while (exit == false);
		}
		playerNum++;
	}
	System.out.print(Arrays.toString(player1Grid));

	// placeShip();
	}

	// likely need to convert array to char to print player[row][column]
	// Use this method to print game boards to the console.
	/*
	private static void printBattleShip(char[][] player) {
		System.out.print("  ");
		for (int row = -1; row < 5; row++) {
			if (row > -1) {
				System.out.print(row + " ");
			}
			for (int column = 0; column < 5; column++) {
				if (row == -1) {
					System.out.print(column + " ");
				} else {
					System.out.print(player[row][column] + " "); // so player[x][y] should equal @ at the beginning
				}
			}
			System.out.println("");
		}
	}
	*/
}