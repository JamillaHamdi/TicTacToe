package BrädspelTicTacToe;

public class Gameboard1 {
    static char[][] board = {
            { '1', '2', '3' },
            { '4', '5', '6' },
            { '7', '8', '9' }
    };

    public static void printboard() {
        System.out.println("------------");
        for (int i = 0; i < 3; i++) {
            System.out.print(" | ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-----------");
        }

    }

    static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 &&
                col >= 0 && col < 3 &&
                board[row][col] == ' ';
    }

    static boolean isBoardFull() {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') return false;
            }
        }
        return true;
    }

    static boolean checkWin(char player) {

        for(int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board [i][1] == player && board[i][2] == player)|| 
                (board[0][i] == player && board[1][i] == player && board [2][i] == player)) {
                    return true;
                }
        }
        return (board[0][0] == player && board[1][1] == player && board [2][2] == player) ||
               (board[0][2] == player && board[1][1] == player && board[2][0] == player);

    }

    static void makeAIMove() {
        for (int i = 0; i  < 3; i++) {
            for (int j = 0; j < )
        }
    }



}
