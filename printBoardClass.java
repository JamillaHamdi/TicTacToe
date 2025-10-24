import java.lang.Thread;

public class printBoardClass {

    static char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    public static void printBoardMetod(String[] args) throws InterruptedException{

        int n = 1;

        for (int a = 0; a < 13; a++) {

            System.out.print("_");
            Thread.sleep(100);
            
        }

        System.out.print("\n");

        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            Thread.sleep(400);
            for (int j = 0; j < 3; j++) {
                System.out.print( n++ + " | ");
                Thread.sleep(400);
            }
            System.out.println("\n-------------");
            Thread.sleep(100);

            
        }
    }
    
}
