import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = new char[3][3]; // Create a 3x3 board
        initializeBoard(board); // Initialize the board to empty spaces
        char player = 'X'; // Player X goes first
        int moves = 0; // Keep track of the number of moves made
        while (true) {
            displayBoard(board); // Display the current state of the board
            int[] move = getMove(player); // Prompt the player for their move
            board[move[0]][move[1]] = player; // Place the player's symbol on the board
            moves++; // Increment the move counter
            if (checkWin(board, player)) { // Check if the player has won
                System.out.println("Player " + player + " wins!");
                break; // End the game
            } else if (moves == 9) { // Check if the game is a draw
                System.out.println("Draw!");
                break; // End the game
            } else { // Switch to the other player
                player = (player == 'X') ? 'O' : 'X';
            }
        }
    }

    // Initialize the board to empty spaces
    public static void initializeBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }
    }

    // Display the current state of the board
    public static void displayBoard(char[][] board) {
        System.out.println("  1 2 3");
        for (int i = 0; i < board.length; i++) {
            System.out.print(i + 1);
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(" " + board[i][j]);
                if (j < board[i].length - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < board.length - 1) {
                System.out.println("  -----");
            }
        }
    }

    // Prompt the player for their move
    public static int[] getMove(char player) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Player " + player + ", enter your move (row column): ");
            int row = scanner.nextInt() - 1;
            int col = scanner.nextInt() - 1;
            if (row < 0 || row > 2 || col < 0 || col > 2) {
                System.out.println("Invalid move. Row and column must be between 1 and 3.");
            } else if (board[row][col] != ' ') {
                System.out.println("Invalid move. That space is already occupied.");
            } else {
                return new int[] {row, col};
            }
        }
    }

    // Check if the player has won
    public static boolean checkWin(char[][] board, char player) {
        // Check rows
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }
        // Check columns
        for (int j = 0; j < board[0].
