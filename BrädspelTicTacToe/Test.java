package BrädspelTicTacToe;
import java.util.Scanner;

public class Test {

    static char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    public static void main(String[] args) {

        System.out.println("Spelare 1, vill du vara X eller O?");

        Scanner scan = new Scanner(System.in);

        String spelare1 = scan.nextLine();
        String spelare2 = null;

        if (spelare1.equals("x")) {
            spelare2 = "o";
        }
        else if (spelare1.equals("o")){
            spelare2 = "x";
        }
        else {
            System.out.println("Välj rätt");
        }
        System.out.println(spelare1 + spelare2);
    }
    
}
