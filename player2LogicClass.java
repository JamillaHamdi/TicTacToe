import java.lang.reflect.Field;
import java.util.Scanner;

public class player2LogicClass {

    public static Scanner p2RutaScanner = new Scanner(System.in);

    public static void player2LogicMetod(String[] args)
    throws InterruptedException, IllegalAccessException{

        System.out.println("Där har du brädan, spelare 2 \n");
        Thread.sleep(1000);
        System.out.println("Välj ruta");

        String valdRuta = "nr" + p2RutaScanner.next();

        
            try {
                Field f = printBoardClass.class.getDeclaredField(valdRuta);
                f.setAccessible(true);

                Object current = f.get(null);
                String currentStr = current == null ? "" : current.toString();

                if ((currentStr.equalsIgnoreCase(player1valjXellerOClass.player1))
                                            ||
                   (currentStr.equalsIgnoreCase(player1valjXellerOClass.player2))
                   )
                {
 
                System.out.println("\n" + 
                "Rutan är redan tagen, ser du väl \n" + 
                "Försök igen \n");
                player2LogicMetod(args);
                
                }
            
                else {

                    f.set(null,player1valjXellerOClass.player2); 
                    printBoardClass.laddaOmBoard(); 
                    System.out.println("Rutan uppdaterad.");
                    printBoardClass.printBoardMetod(args);
                }

            } catch (NoSuchFieldException e) {
                System.out.println("Wtf mannen vadå " + "'" + valdRuta + "'");
                Thread.sleep(1000);
                System.out.println("Välj rätt nu");
                printBoardClass.printBoardMetod(args);
                player2LogicMetod(args);

            } catch (IllegalAccessException r){
                System.out.println("Error, kunde inte ändra rutan"); 
            }
        

    }

}
