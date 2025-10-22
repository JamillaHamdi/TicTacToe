package BrädspelTicTacToe;
import java.util.Scanner;

public class Gameboard {

    static char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };
    
    
    //static final char PLAYER = 'X';
    //static final char AI = 'O';

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean gameEnded = false;

        System.out.println("Welcome to Tic Tac Toe (You = X, AI = O)");
        System.out.println("Choose 'X' or 'O'");
        
        
        char Player = choosePlayerSymbol(scan);
        char opponent;

        if (Player == 'X') {
            opponent = 'O';
        } 
        else {
            opponent = 'X';
        }

        printBoard();

        while (!gameEnded) {
            // Player move
            System.out.println("Your move (row[1-3] and column[1-3]): ");
            int row = scan.nextInt() - 1;
            int col = scan.nextInt() - 1;

            if (isValidMove(row, col)) {
                board[row][col] = Player;
                printBoard();

                if (checkWin(Player)) {
                    System.out.println("You win!");
                    
                } else if (isBoardFull()) {
                    System.out.println("It's a draw!");
                    
                }

                

                // AI move
                System.out.println("AI's move:");
                makeAIMove();
                printBoard();

                if (checkWin(opponent)) {
                    System.out.println("AI wins!");
                    
                } else if (isBoardFull()) {
                    System.out.println("It's a draw!");
                    
                }

            } else {
                System.out.println("Invalid move. Try again.");
            }

           

        }
        
        
        

        scan.close();
    }
    
        
    

    static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 &&
               col >= 0 && col < 3 &&
               board[row][col] == ' ';
    }

    static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') return false;
            }
        }
        return true;
    }

    static boolean checkWin(char player) {
        // Rows and Columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }

        // Diagonals
        return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
               (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }






    static void makeAIMove() {
        // Try to win
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    board[i][j] = opponent;
                    if (checkWin(opponent)) return;
                    board[i][j] = ' '; // Undo
                }
            }
        }

        // Block player from winning
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    board[i][j] = Player;
                    if (checkWin(Player)) {
                        board[i][j] = AI; // Block
                        return;
                    }
                    board[i][j] = ' '; // Undo
                }
            }
        }

        // Pick first available spot
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    board[i][j] = AI;
                    return;
                }
            }
            
        }
        
    }

    public static char choosePlayerSymbol(Scanner scan) {
                char playerSymbol = ' ';
                boolean validChoice = false;

                while (!validChoice) {
                    String input = scan.nextLine().trim().toUpperCase();

                    if (input.equals("X") || input.equals("O")) {
                        playerSymbol = input.charAt(0);
                        validChoice = true;
                    }
                    else {
                        System.out.println("Invalid choice. Please enter 'X' or 'O'.");
                    }
                } return playerSymbol;
            } 
}