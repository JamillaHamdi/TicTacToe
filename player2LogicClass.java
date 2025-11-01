import java.lang.reflect.Field;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class player2LogicClass {

    public static Scanner p2RutaScanner = new Scanner(System.in);
    public static String valdRuta;

    public static void player2LogicMetod(String[] args)
    throws InterruptedException, IllegalAccessException{

        if (!cpuOrNotClass.cpuOn) {
            System.out.println("Spelare 2 \n");
            Thread.sleep(1000);
            System.out.println("Välj ruta");
            // read raw input (e.g. "1") and form field name "nr10", "nr20", ...
            String val = p2RutaScanner.next();
            valdRuta = "nr" + val;
        } else {
            int rand = ThreadLocalRandom.current().nextInt(1, 10);
            valdRuta = "nr" + rand;
        }

        
        try {
            Field f = printBoardClass.class.getDeclaredField(valdRuta);
            f.setAccessible(true);

            Object current = f.get(null);
            String currentStr = current == null ? "" : current.toString();

            if (currentStr.equalsIgnoreCase(player1valjXellerOClass.player1)
                    || currentStr.equalsIgnoreCase(player1valjXellerOClass.player2)) {
                if (!cpuOrNotClass.cpuOn) {
                    System.out.println("\nRutan är redan tagen. Försök igen.\n");
                    player2LogicMetod(args);
                    return;
                } else {
                    int retry = ThreadLocalRandom.current().nextInt(1, 10);
                    valdRuta = "nr" + retry + "0";
                    player2LogicMetod(args);
                    return;
                }
            }
            

            else
             {

                    f.set(null,player1valjXellerOClass.player2); 
                    printBoardClass.laddaOmBoard();
                    System.out.println(cpuOrNotClass.cpuOn == true ? "CPU:ns tur" : ""); 
                    if (cpuOrNotClass.cpuOn == true) {Thread.sleep(2000);}
                    System.out.println(cpuOrNotClass.cpuOn == true ? "CPU:n har valt ruta " + valdRuta : "Ruta uppdaterad");
                    if (cpuOrNotClass.cpuOn == true) {Thread.sleep(2000);}
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
