package BrädspelTicTacToeTest;
import java.util.Scanner;

public class TreIRadSpel {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        
        String board [][] = {{"  ","   ","   "},
                            {"   ","   ","   "},
                            {"   ","   ","   "},
    };

    System.out.println("Välkommen till tre i rad! Välj symbol: X eller O");

    
    String symbol = scan.nextLine();
    
    if (symbol.equals("Player")) {
        symbol = "X";
    }
    else if (symbol.equals("CPU")) {
        symbol = "O";
    }

    printBoard(board);

    }
    public void printBoard(String [][] gameboard) {
        for (String [] row : gameboard) {
            for (String c: row) {
            System.out.println(c);
            }
        }

    }
    
}
