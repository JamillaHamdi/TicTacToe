import java.lang.Thread;

public class printBoardClass {

    static String board = "_____________" + "\n" +
    "| 1 |" + " 2 |" + " 3 |" + "\n" +
    "-------------" + "\n" +
    "| 4 |" + " 5 |" + " 6 |" + "\n" +
    "-------------" + "\n" +
    "| 7 |" + " 8 |" + " 9 |" + "\n" +
    "-------------" + "\n";
        
    

    public static void printBoardMetod(String[] args) throws InterruptedException{

        for (int b = 0; b < board.length(); b++) {
            
            char character = board.charAt(b);

            System.out.print(character);
            Thread.sleep(50);
        }

       
    }
    
}
