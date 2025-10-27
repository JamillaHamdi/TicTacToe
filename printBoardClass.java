import java.lang.Thread;

public class printBoardClass {
    static String nr1 = " 1 ";
    static String nr2 = " 2 ";
    static String nr3 = " 3 ";
    static String nr4 = " 4 ";
    static String nr5 = " 5 ";
    static String nr6 = " 6 ";
    static String nr7 = " 7 ";
    static String nr8 = " 8 ";
    static String nr9 = " 9 ";


    static String board = "";
    public static void laddaOmBoard() {
        board =

             "_____________ \n" +

     "|" + nr1 + "|" + nr2 + "|" + nr3 + "| \n" +

             "------------- \n" +

     "|" + nr4 + "|" + nr5 + "|" + nr6 + "| \n" +

             "------------- \n" +

     "|" + nr7 + "|" + nr8 + "|" + nr9 + "|\n" +

             "------------- \n";
    }
    

    public static void printBoardMetod(String[] args) throws InterruptedException{
        laddaOmBoard();

        for (int b = 0; b < board.length(); b++) {
            
            char character = board.charAt(b);

            System.out.print(character);
            Thread.sleep(50);
        }

        Thread.sleep(2000);

    }


    
}
