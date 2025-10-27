import java.lang.reflect.Field;
import java.util.Scanner;

public class gameLogicClass {

    public static Scanner rutaScanner = new Scanner(System.in);

    public static void gameLogicMetod(String[] args) throws InterruptedException {

        System.out.println("Där har du brädan \n Välj ruta");

        String valdRuta = "nr" + rutaScanner.next();

        try {
            Field f = printBoardClass.class.getDeclaredField(valdRuta);
            f.setAccessible(true);
            f.set(null,player1valjXellerOClass.player1); // set the static field to " x "
            printBoardClass.laddaOmBoard(); // rebuild board string from fields
            System.out.println("Rutan uppdaterad.");
        } catch (NoSuchFieldException e) {
            System.out.println("Ogiltigt val: ingen sådan ruta.");
        } catch (IllegalAccessException e) {
            System.out.println("Kunde inte ändra rutan.");
        }
        printBoardClass.printBoardMetod(args);

    }

}
