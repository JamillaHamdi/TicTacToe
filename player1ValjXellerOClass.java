import java.util.Scanner;
import java.lang.Thread;

public class player1ValjXellerOClass {
    public static Scanner scanner = new Scanner(System.in);
    public static void player1ValjXellerOMetod(String[] args) throws InterruptedException {

        String player2 = "place holder";
        System.out.println("[X/O]?");
        System.out.println(" ");
        String player1Val = scanner.next().toUpperCase();
        

        if (player1Val.equals("X")) { 
            player2 = "O";}

        else if( player1Val.equals("O")){
            player2 = "X";}
        else {

            System.out.println("Mannen välj rätt");
            Thread.sleep(1000);
            
            System.out.println("Startar om...");
            System.out.println(" ");

            Thread.sleep(2000);
            player1ValjXellerOMetod(args);
        }

            System.out.println("Sparar valet...");
            Thread.sleep(1000);

            
            
            System.out.println(" ");
            System.out.println("Spelare 1 :" 
            + player1Val + " Spelare 2 :" + player2);
            Thread.sleep(1000);

            System.out.println("Spelet startar");
            Thread.sleep(1000);

            printBoardClass.printBoardMetod(args);


        }

        


    }

