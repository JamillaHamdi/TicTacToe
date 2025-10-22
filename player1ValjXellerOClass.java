import java.util.Scanner;


public class player1ValjXellerOClass {
    public static Scanner scanner = new Scanner(System.in);
    public static void player1ValjXellerOMetod(String[] args) {

        System.out.println("Spelare 1, Välj O eller X");
        String player1Val = scanner.next();
        if (player1Val.equalsIgnoreCase("x")) {

            System.out.println("Okej, spelare 1 är X och spelare 2 är O ");

        } else if (player1Val.equalsIgnoreCase("o")) {

            System.out.println("Okej, spelare 1 är O och spelare 2 är X ");

        } else {

            System.out.println("Mannen välj rätt");
            Main.main(args);
        }

        


    }
}
