import java.util.Scanner;

public class cpuOrNotClass {
 public static Scanner scanner = new Scanner(System.in);
 public static Boolean cpuOn = true;


    public static void cpuOrNotMetod(String[] args) {

        System.out.println("Vill du spela mot CPU:n? [J/N] \n");   

        String cpuVal = scanner.next();

        if (cpuVal.equalsIgnoreCase("N"))
        {cpuOn = false;}
        else if (cpuVal.equalsIgnoreCase("J"))
        {cpuOn = true;}
        else 
        {System.out.println("Valet är mellan Ja (J) eller Nej (N) brotha \n" +
        "Försök tf igen"); 
        cpuOrNotMetod(args);
        }
        
    }
    
}
