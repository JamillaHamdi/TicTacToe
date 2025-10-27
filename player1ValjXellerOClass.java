import java.util.Scanner;
import java.lang.Thread;
import java.lang.String;

public class player1valjXellerOClass {
    public static String player1;
    public static String player2;

    public static Scanner scanner = new Scanner(System.in);
    public static void player1ValjXellerOMetod(String[] args) throws InterruptedException {

        System.out.println("Spelare 1: [X/O] \n");   

        String player1Val = scanner.next();

        if (player1Val.equalsIgnoreCase("x")) {

            player1 = " X ";  
            player2 = " O ";

        } else if (player1Val.equalsIgnoreCase("o")) {

            player1 = " O ";
            player2 = " X ";

        } else {

            System.out.println("Mannen välj rätt");
            Thread.sleep(1000);

            System.out.println("Startar om... \n");
            Thread.sleep(2000);

            Main.main(args);
        }

        
        Thread.sleep(800);
     
        System.out.println("\n" + "Spelare 1: "
        + player1 + ", spelare 2: " + player2);
        Thread.sleep(1000);

        System.out.println("Laddar..."); 
        Thread.sleep(2000);

        System.out.println("\n" + "Spelet börjar om...");
        Thread.sleep(1000);

        System.out.println("3");
        Thread.sleep(1000);

        System.out.println("2");
        Thread.sleep(1000);

        System.out.println("1");
        Thread.sleep(1000);

        


    }
}
