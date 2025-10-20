package BrädspelTicTacToe;
import java.util.Scanner;

public class Gameboard {
    static char [][] board = {{' ',' ',' '},
                              {' ',' ',' '},
                              {' ',' ',' '}
    };

    static char currentPlayer = 'X';

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean gameEnded = false;

        System.out.println("Welcome to ticTacToe");
        printBoard();

        while (!gameEnded) {
            System.out.println("Player " + currentPlayer + ", enter your move (row [1-3] and column [1-3]): ");
            int row = scan.nextInt() - 1;
            int column = scan.nextInt() - 1;

            if (isValidMove(row, column)) {
                board[row][column] = currentPlayer;
                printBoard();
            }

            if (checkWin(currentPlayer)) {
                System.out.println("Player " + currentPlayer + " wins!");
                gameEnded = true;
            }
            else if (isBoardFull()) {
                System.out.println("It's a draw!");
                gameEnded = true;
            }
            else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }      
        }
        else {
            System.out.println("Invalid move. Try again.");

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

    static boolean isValidMove (int row, int column) {
        return row >= 0 && row < 3 
               && column >= 0 && 
               board[row][column] == ' ';
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
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board [i][1] == player && board [i][2] == player) ||
                (board[0][i] == player && board[1][i] == player && board [2][i] == player)) {
                return true;      
                }
        }

        if ((board[0][0] == player && board [1][1] == player && board[2][2] == player) ||
            (board[0][2] == player && board[1][1] == player && board [2][0] == player)) {
                return true;
            }

        return false;
    }
}
