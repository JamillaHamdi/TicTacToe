import java.lang.Thread;

public class printBoardClass {

    static char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    public static void printBoardMetod(String[] args) throws InterruptedException{
        System.out.println("___________");
        Thread.sleep(400); 

        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            Thread.sleep(400);
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
                Thread.sleep(400);
            }
            System.out.println("\n-------------");
            
        }
    }
    
}
