import java.util.Scanner;

// prompt 10 coordinates
// create two 5x5 ship location grids
// create two 5x5 history grids
// create two fire functionalities

public class Battleship {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Welcome to Battleship!");

	// grid
	int[] ship1xy = new int[2];
	int[][] player1Grid = new int[5][5];
	System.out.println("PLAYER 1, ENTER YOUR SHIPS’ COORDINATES.");

	
	// check if exists

	System.out.println("Enter ship 1 location:");
	System.out.println("Enter ship 2 location:");
	System.out.println("Enter ship 3 location:");
	System.out.println("Enter ship 4 location:");
	System.out.println("Enter ship 5 location:");

	printBattleShip();
	}

	public static int[][] placeShips(String desiredCoordinates){
		if (input.hasNextInt()){
			xCoordinate = input.nextInt(); // refactor this so that it's just a single method
			if (input.hasNextInt()){
				yCoordinate = input.nextInt();
				player1Grid[xCoordinate][yCoordinate] = "@";
			} else {
				System.out.println("Invalid coordinates. Choose different coordinates.");
			}
		} else {
			System.out.println("Invalid coordinates. Choose different coordinates.");
		}
		return player1Grid;
	}

	// likely need to convert array to char to print player[row][column]
	// Use this method to print game boards to the console.
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
}