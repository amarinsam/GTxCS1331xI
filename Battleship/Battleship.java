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

		// Declare Target History Boards
		char[][] player1View = new char[5][5];
		char[][] player2View = new char[5][5];
		char[][][] gameHistory = new char[][][]{
			player1View, player2View
		};

		// LIST OF PROMPTS 1-5
		String[] shipPrompts = new String[]{
			"Enter ship 1 location:",
			"Enter ship 2 location:",
			"Enter ship 3 location:",
			"Enter ship 4 location:",
			"Enter ship 5 location:"
		};

		// Ship Input
		int playerNum = 1;
		for (char[][] playerGrid : players){
		System.out.println("PLAYER " + playerNum + ", ENTER YOUR SHIPS’ COORDINATES.");
			for (String prompt : shipPrompts){
				boolean exit = false;
					do {
						System.out.println(prompt);
						if (input.hasNextInt()){
							int xCoordinate = input.nextInt(); // refactor this so that it's just a single method
							if (input.hasNextInt()){
								int yCoordinate = input.nextInt();
								if (xCoordinate > 4 || yCoordinate > 4 || xCoordinate < 0 || yCoordinate < 0){
									System.out.println("Invalid coordinates. Choose different coordinates.");
									input.nextLine();
									continue;
								} else {
									if (playerGrid[xCoordinate][yCoordinate] != '@'){
									playerGrid[xCoordinate][yCoordinate] = '@';
									exit = true;
									} else {
										System.out.println("You already have a ship there. Choose different coordinates.");
										input.nextLine();
										continue;

									}
								}
							} else {
								System.out.println("Invalid coordinates. Choose different coordinates.");
								input.nextLine();
								continue;
							}
						} else {
							System.out.println("Invalid coordinates. Choose different coordinates.");
							input.nextLine();
							continue;
						} // need to clear out the data stream, likely to flush out x and y coord?
						// note down how to check equality with chars
					} while (exit == false);
			}
			// fill and render board after each player inputs pieces
			if (playerNum == 1){
				for (int i = 0; i < player1Grid.length; i++){
					for (int e = 0; e < player1Grid[i].length; e++){
						if (player1Grid[i][e] != '@'){
							player1Grid[i][e] = '-';
						}
					}
				}
				printBattleShip(player1Grid);
			} else {
				for (int i = 0; i < player2Grid.length; i++){
					for (int e = 0; e < player2Grid[i].length; e++){
						if (player2Grid[i][e] != '@'){
							player2Grid[i][e] = '-';
						}
					}
				}
				printBattleShip(player2Grid);
			}
			// print 100 lines
			for (int i = 0; i < 100; i++){
				System.out.println();
			}
			playerNum++;
		// end ship input loop
		}

		for (int i = 0; i < gameHistory.length; i++){
			for (int e = 0; e < gameHistory[i].length; e++){
				for (int y = 0; y < gameHistory[i][e].length; y++){
					gameHistory[i][e][y] = '-';
				}
			}
		}

		// Game Engine
		// Winning states
		boolean allShipsHit = false;
		char[][] currentAttackedGrid = player2Grid;
		char[][] currentPlayerView = player1View;
		playerNum = 1;
		int opposingPlayer = 2;

		do {
			boolean exit = false;
			do {
				if (playerNum % 2 != 0){
					opposingPlayer = 2;
				}
				System.out.println("Player " + playerNum + ", enter hit row/column:");
				if (input.hasNextInt()){
					int xCoordinate = input.nextInt();
					if (input.hasNextInt()){
						int yCoordinate = input.nextInt();
						if (xCoordinate > 4 || yCoordinate > 4){
							System.out.println("Invalid coordinates. Choose different coordinates.");
							input.nextLine();
							continue;
						} else {
							if (currentAttackedGrid[xCoordinate][yCoordinate] == 'O' ||
							currentAttackedGrid[xCoordinate][yCoordinate] == 'X'){
								System.out.println("You already fired on this spot. Choose different coordinates.");
								input.nextLine();
								continue;
							} else {
								if (currentAttackedGrid[xCoordinate][yCoordinate] == '-'){
								System.out.println("PLAYER " + playerNum + " MISSED!");
								currentAttackedGrid[xCoordinate][yCoordinate] = 'O'; // just updated this
								currentPlayerView[xCoordinate][yCoordinate] = 'O';
								}
								if (currentAttackedGrid[xCoordinate][yCoordinate] == '@'){
									// might need to add a
									System.out.println("PLAYER " + playerNum + " HIT PLAYER " + opposingPlayer + "'s SHIP!");
									currentAttackedGrid[xCoordinate][yCoordinate] = 'X';
									currentPlayerView[xCoordinate][yCoordinate] = 'X';
								}
								exit = true;
							}
						}
					} else {
						System.out.println("Invalid coordinates. Choose different coordinates.");
						input.nextLine();
						continue;
					}
				} else {
					System.out.println("Invalid coordinates. Choose different coordinates.");
					input.nextLine();
					continue;
				}
			} while (exit == false);
			printBattleShip(currentPlayerView);
			System.out.println("");
			// Check Win Condition
			int countOfX = 0;
			for (int i = 0; i < currentAttackedGrid.length; i++){
				for (int e = 0; e < currentAttackedGrid[i].length; e++){
					if (currentAttackedGrid[i][e] == 'X'){
						countOfX++;
					}

				}
			}
			if (countOfX == 5){
						allShipsHit = true;
						System.out.println("PLAYER " + playerNum + " WINS! YOU SUNK ALL OF YOUR OPPONENT'S SHIPS!");
						System.out.println("");
						System.out.println("Final boards:");
						System.out.println("");
						printBattleShip(player1Grid);
						System.out.println("");
						printBattleShip(player2Grid);
						System.out.println("");
					}
			// Switch Players
			if (currentAttackedGrid == player2Grid){
				currentAttackedGrid = player1Grid;
				currentPlayerView = player2View;
				playerNum = 2;
				opposingPlayer = 1;
			} else {
				currentAttackedGrid = player2Grid;
				currentPlayerView = player1View;
				playerNum = 1;
				opposingPlayer = 2;
			}
		} while (allShipsHit == false);

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