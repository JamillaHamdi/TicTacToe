import java.lang.Thread;

public class printBoardClass {
    public static String nr1 = " 1 ";
    public static String nr2 = " 2 ";
    public static String nr3 = " 3 ";
    public static String nr4 = " 4 ";
    public static String nr5 = " 5 ";
    public static String nr6 = " 6 ";
    public static String nr7 = " 7 ";
    public static String nr8 = " 8 ";
    public static String nr9 = " 9 ";


    public static String board = "";
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
            Thread.sleep(1);
        }

        Thread.sleep(1000);

    }


    
}
