import java.util.Scanner;

public class winCheckclass {
    
 public static boolean win;
 public static boolean draw;

    public static void winCheckMetod(String[] args) 
    throws InterruptedException, IllegalAccessException{
     Scanner scanner = new Scanner(System.in);



            if (
                printBoardClass.nr1 == printBoardClass.nr2
                                    &&
                printBoardClass.nr2 == printBoardClass.nr3

                                    ||
                
                printBoardClass.nr1 == printBoardClass.nr4
                                    &&
                printBoardClass.nr4 == printBoardClass.nr7

                                    ||
                
                printBoardClass.nr1 == printBoardClass.nr5
                                    &&
                printBoardClass.nr5 == printBoardClass.nr9

               )
            {
            
                System.out.println(printBoardClass.nr1 + " vinner!");
                win = true;
                loopBreakMetod(args);
                System.out.println("Vill du spela igen? \n [J/N]");
                String spelaIgenScanner = scanner.next();
                if (spelaIgenScanner.equalsIgnoreCase("J"))
                {   
                     win = false;
                     draw = false;
                     printBoardClass.nr1 = " 1 ";
                     printBoardClass.nr2 = " 2 ";
                     printBoardClass.nr3 = " 3 ";
                     printBoardClass.nr4 = " 4 ";
                     printBoardClass.nr5 = " 5 ";
                     printBoardClass.nr6 = " 6 ";
                     printBoardClass.nr7 = " 7 ";
                     printBoardClass.nr8 = " 8 ";
                     printBoardClass.nr9 = " 9 ";
                    Main.main(args);
                }
            }
            else if (
                printBoardClass.nr2 == printBoardClass.nr5
                                    &&
                printBoardClass.nr5 == printBoardClass.nr8

               )
            {
            
                System.out.println(printBoardClass.nr2 + " vinner!");
                win = true;
                loopBreakMetod(args);
                System.out.println("Vill du spela igen? \n [J/N]");
                String spelaIgenScanner = scanner.next();
                if (spelaIgenScanner.equalsIgnoreCase("J"))
                {   
                     win = false;
                     draw = false;
                     printBoardClass.nr1 = " 1 ";
                     printBoardClass.nr2 = " 2 ";
                     printBoardClass.nr3 = " 3 ";
                     printBoardClass.nr4 = " 4 ";
                     printBoardClass.nr5 = " 5 ";
                     printBoardClass.nr6 = " 6 ";
                     printBoardClass.nr7 = " 7 ";
                     printBoardClass.nr8 = " 8 ";
                     printBoardClass.nr9 = " 9 ";
                    Main.main(args);}
            }
            else if (
                printBoardClass.nr3 == printBoardClass.nr6
                                    &&
                printBoardClass.nr6 == printBoardClass.nr9

                                    ||
                
                printBoardClass.nr3 == printBoardClass.nr5
                                    &&
                printBoardClass.nr5 == printBoardClass.nr7

               )
            {
            
                System.out.println(printBoardClass.nr3 + " vinner!");
                win = true;
                loopBreakMetod(args);
                System.out.println("Vill du spela igen? \n [J/N]");
                String spelaIgenScanner = scanner.next();

                if (spelaIgenScanner.equalsIgnoreCase("J"))
                {   
                     win = false;
                     draw = false;
                     printBoardClass.nr1 = " 1 ";
                     printBoardClass.nr2 = " 2 ";
                     printBoardClass.nr3 = " 3 ";
                     printBoardClass.nr4 = " 4 ";
                     printBoardClass.nr5 = " 5 ";
                     printBoardClass.nr6 = " 6 ";
                     printBoardClass.nr7 = " 7 ";
                     printBoardClass.nr8 = " 8 ";
                     printBoardClass.nr9 = " 9 ";
                    Main.main(args);}
            }
            else if (
                printBoardClass.nr4 == printBoardClass.nr5
                                    &&
                printBoardClass.nr5 == printBoardClass.nr6

               )
            {
            
                System.out.println(printBoardClass.nr4 + " vinner!");
                win = true;
                loopBreakMetod(args);
                System.out.println("Vill du spela igen? \n [J/N]");
                String spelaIgenScanner = scanner.next();

                if (spelaIgenScanner.equalsIgnoreCase("J"))
                {   
                     win = false;
                     draw = false;
                     printBoardClass.nr1 = " 1 ";
                     printBoardClass.nr2 = " 2 ";
                     printBoardClass.nr3 = " 3 ";
                     printBoardClass.nr4 = " 4 ";
                     printBoardClass.nr5 = " 5 ";
                     printBoardClass.nr6 = " 6 ";
                     printBoardClass.nr7 = " 7 ";
                     printBoardClass.nr8 = " 8 ";
                     printBoardClass.nr9 = " 9 ";
                    Main.main(args);}
            }
            else if (
                printBoardClass.nr7 == printBoardClass.nr8
                                    &&
                printBoardClass.nr8 == printBoardClass.nr9

               )
            {
            
                System.out.println(printBoardClass.nr7 + " vinner!");
                win = true;
                loopBreakMetod(args);
                System.out.println("Vill du spela igen? \n [J/N]");
                String spelaIgenScanner = scanner.next();

                if (spelaIgenScanner.equalsIgnoreCase("J"))
                {   
                     win = false;
                     draw = false;
                     printBoardClass.nr1 = " 1 ";
                     printBoardClass.nr2 = " 2 ";
                     printBoardClass.nr3 = " 3 ";
                     printBoardClass.nr4 = " 4 ";
                     printBoardClass.nr5 = " 5 ";
                     printBoardClass.nr6 = " 6 ";
                     printBoardClass.nr7 = " 7 ";
                     printBoardClass.nr8 = " 8 ";
                     printBoardClass.nr9 = " 9 ";
                    Main.main(args);}
            }
            else if (printBoardClass.nr1 != " 1 " &&
                     printBoardClass.nr2 != " 2 " &&
                     printBoardClass.nr3 != " 3 " &&
                     printBoardClass.nr4 != " 4 " &&
                     printBoardClass.nr5 != " 5 " &&
                     printBoardClass.nr6 != " 6 " &&
                     printBoardClass.nr7 != " 7 " &&
                     printBoardClass.nr8 != " 8 " &&
                     printBoardClass.nr9 != " 9 "                     
                     ) {

                System.out.println("Det blir oavgjort!");
                draw = true;
                loopBreakMetod(args);
                System.out.println("Vill du spela igen? \n [J/N]");
                String spelaIgenScanner = scanner.next();
                
                if (spelaIgenScanner.equalsIgnoreCase("J"))
                {   
                     win = false;
                     draw = false;
                     printBoardClass.nr1 = " 1 ";
                     printBoardClass.nr2 = " 2 ";
                     printBoardClass.nr3 = " 3 ";
                     printBoardClass.nr4 = " 4 ";
                     printBoardClass.nr5 = " 5 ";
                     printBoardClass.nr6 = " 6 ";
                     printBoardClass.nr7 = " 7 ";
                     printBoardClass.nr8 = " 8 ";
                     printBoardClass.nr9 = " 9 ";
                    Main.main(args);}
                
                

            }
        
           
            
        

    }
    
    public static void loopBreakMetod(String[] args)
    throws InterruptedException, IllegalAccessException{

        while(win == false && draw == false){

            if (win || draw){break;}
            player1LogicClass.player1LogicMetod(args);
         winCheckMetod(args);
         if (win || draw){break;}

         
         player2LogicClass.player2LogicMetod(args);

         winCheckMetod(args);
         if (win || draw){break;}

        }

    }

}
