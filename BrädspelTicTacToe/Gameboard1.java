package BrädspelTicTacToe;

public class Gameboard1 {
    static char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    public static void printboard() {
        System.out.println("------------");
        for (int i = 0; i <3; i++) {
            System.out.print(" | ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println( "\n-----------");
        }

    }

    static boolean isVaildMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && < 3 && board[row][col] == '  ';
    }
    
}
