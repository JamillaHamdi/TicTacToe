import java.util.Scanner;
import java.lang.Thread;

public class player1valjXellerOClass {
    public static Scanner scanner = new Scanner(System.in);
    public static void player1ValjXellerOMetod(String[] args) throws InterruptedException {

        System.out.println("Spelare 1, Välj O eller X ");
        System.out.println(" ");
        String player1Val = scanner.next();

        if (player1Val.equalsIgnoreCase("x")) {

            System.out.println("Sparar valet...");
            Thread.sleep(1000);

            String player1 = "X";
            String player2 = "O";
            
            System.out.println(" ");
            System.out.println("Okej, spelare 1 är " 
            + player1 + " och spelare 2 är " + player2);
            Thread.sleep(1000);

            System.out.println("Vi börjar spelet!");
            Thread.sleep(1000);

            printBoardClass.printBoardMetod(args);


        } else if (player1Val.equalsIgnoreCase("o")) {

            System.out.println("Sparar valet...");
            Thread.sleep(1000);

            String player1 = "O";
            String player2 = "X";

            System.out.println(" ");
            System.out.println("Okej, spelare 1 är "
            + player1 + " och spelare 2 är " + player2);
            Thread.sleep(1000);

            System.out.println("Vi börjar spelet!");
            Thread.sleep(1000);

            printBoardClass.printBoardMetod(args);


        } else {

            System.out.println("Mannen välj rätt");
            Thread.sleep(1000);

            System.out.println("Startar om...");
            System.out.println(" ");

            Thread.sleep(2000);
            player1ValjXellerOMetod(args);
        }

        


    }
}
