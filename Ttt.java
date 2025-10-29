import java.util.Scanner;

public class Ttt {
   
   /*static char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };*/
    static String[][] board ={
        {" ", " ", " "},
        {" ", " ", " "},
        {" ", " ", " "}  
    };
    static boolean gameEnded = false;
    //static String[][] board = new String[3][3];
    static String spelare[] = new String[2];
    static Scanner s = new Scanner(System.in);
    static int row;
    static int col;
    static int v;

    public static void main(String[] args) {

      
      
      //spelaresVal();
      //printBoard();
      spelaSpel();

    }

static void spelaresVal (){
   System.out.println("Spelare 1, vill du vara x eler o?");  
     //Scanner sc = new Scanner(System.in);

     
     spelare[0] = s.nextLine().toLowerCase();
     spelare[1] = null;
     
     if (spelare[0].equalsIgnoreCase("x")){
        spelare[1] = "o";
     }
     else if (spelare[0].equalsIgnoreCase("o")){
        spelare[1] = "x";
     }
     else {
        System.out.println("Mannen välj rätt");
        spelaresVal();
     }

     System.out.println("Spelare 1 valde " + spelare[0] + ", spelare 2 blir då " + spelare[1]);

     //sc.close();

   
}


static String[][] printBoard() {
   

   /*char[][] board = {
      {'1', '2', '3'},
      {'4', '5', '6'},
      {'7', '8', '9'}
   };*/

   System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
        return board;
}

static String[][] spelaSpel() {
   spelaresVal();
   

   System.out.println("Nu spelar vi! Spelare 1 börjar. Välj först rad och sedan kolumn:");
   
   printBoard();

   int vemsTur = 1;
   String vad = null;
   //int v;


   while (!gameEnded){

      if (vemsTur == 1){

        // System.out.println("Din tur spelare 1!");
        v=0;
        vad = spelare[0];

      }
      else{
         v=1;
         vad = spelare[1];
      }
      System.out.println("Your move (row[1-3] and column[1-3]): ");
      row = s.nextInt() - 1;
      col = s.nextInt() - 1;
      
      if (isValidMove(row, col)) {
         board[row][col] = spelare[v];
         printBoard();
         
         if (vemsTur == 1){
            vemsTur = 2;
         }
         else{
            vemsTur = 1;
         }
         //return board;
         
         if (checkWin()) {
            System.out.println("You win!");
            break;
         } else if (isBoardFull()) {
            System.out.println("It's a draw!");
            break;
         }
      }
      
      else {
         System.out.println("Invalid move. Try again.");
      }
      
      
   }
   
   return board;


   }





   static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 &&
               col >= 0 && col < 3 &&
                " ".equals(board[row][col]);
    }
 
    static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (" ".equals(board[i][j])) return false;
            }
        }
        return true;
    }

   static boolean checkWin() {
          // Rows and Columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0].equals(spelare[v]) && board[i][1].equals(spelare[v]) && board[i][2].equals(spelare[v])) ||
                (board[0][i].equals(spelare[v]) && board[1][i].equals(spelare[v]) && board[2][i].equals(spelare[v]))) {
                return true;
            }
        }
 
        // Diagonals
        return (board[0][0].equals(spelare[v]) && board[1][1].equals(spelare[v]) && board[2][2].equals(spelare[v])) ||
               (board[0][2].equals(spelare[v]) && board[1][1].equals(spelare[v]) && board[2][0].equals(spelare[v]));
    }



}
    
