import java.util.Random;
import java.util.Scanner;

public class TicTacToeJamilla {
    
    static String[][] board ={
        {" ", " ", " "},
        {" ", " ", " "},
        {" ", " ", " "}  
    };
    static boolean gameEnded = false;
    static int antal;
    //static String spelare[] = new String[2];
    static Scanner s = new Scanner(System.in);
    static int row;
    static int col;
    static Spelare ett = new Spelare();
    static Spelare two = new Spelare();

    public static void main(String[] args) {

      //Scanner s = new Scanner(System.in);
      System.out.println("Välkommen till Tre i rad! Vill du spela med en kompis eller mot datorn?");
      System.out.println("1: Spela mot datorn");
      System.out.println("2: Spela med kompis");

      antal = s.nextInt();

      if (antal != 1 && antal !=2){
         System.out.println("Du måste välja 1 eller 2. Försök igen:");
         s.hasNextInt();
         antal = s.nextInt();
         
      }
      //s.close();

      
      //spelaresVal();

      //System.out.println(ett.getNamn() + two.getNamn() + ett.getVal() + two.getVal());
      //printBoard();
      spelaSpel();
      //spelaMotDatorn();
      s.close();

    }

static Spelare[] spelaresVal() {
   System.out.println("Okej! Spelare 1, vad heter du och vill du vara x eler o?");
   System.out.println("Val:");
   s.hasNext();
   String valEtt = s.next();
   String namnTwo = null;
   String valTwo = null; 
   
   if (valEtt.equals("x")){
      valTwo = "o";
   }
   else if (valEtt.equals("o")){
      valTwo = "x";
   }
   else {
     System.out.println("Mannen välj rätt");
      spelaresVal();
   }
   
   System.out.println("Namn:");
   s.hasNext();
   String namnEtt = s.next();
   
   if (antal == 2){
      System.out.println("Spelare 2, vad heter du?");
      s.hasNext();
      namnTwo = s.next();
   }
   else {
      namnTwo = "Datorn";
   }
   
   ett.setNamn(namnEtt);
   ett.setVal(valEtt);
   two.setNamn(namnTwo);
   two.setVal(valTwo);
   
   System.out.println(ett.getNamn() + " valde " + ett.getVal() + ". " + two.getNamn() + " blir då " + two.getVal());

   Spelare[] Spelare = {ett, two};
   //Spelare = new Spelare[2];
   //Spelare[0] = ett;
   //Spelare[1] = two;

   return Spelare;
   
}


static String[][] printBoard() {
   

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

   System.out.println("Nu spelar vi! Välj först rad och sedan kolumn:");
   
   printBoard();

   Random rand = new Random();

   int vemsTur = rand.nextInt(2);
   System.out.println(vemsTur);
   String vad = null;


   while (!gameEnded){

      if (vemsTur == 0){

        // System.out.println("Din tur spelare 1!");
        vad = ett.getVal();

      }
      else if (vemsTur == 1) {
         vad = two.getVal();
      }
      System.out.println("Your move (row[1-3] and column[1-3]): ");
      row = s.nextInt() - 1;
      col = s.nextInt() - 1;
      
      
      if (isValidMove(row, col)) {
         board[row][col] = vad;
         printBoard();
         
         if (vemsTur == 0){
            vemsTur = 1;
         }
         else{
            vemsTur = 0;
         }
         
         if (checkWin(vad)) {
            System.out.println("You win!");
            break;
         } else if (isBoardFull(vad)) {
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

static String[][] spelaMotDatorn(){

   spelaresVal();

   System.out.println("Nu spelar vi! Välj först rad och sedan kolumn:");
   
   printBoard();

   Random rand = new Random();

   int vemsTur = rand.nextInt(2);
   System.out.println(vemsTur);
   String vad = null;


   while (!gameEnded){

      if (vemsTur == 0){

        // System.out.println("Din tur spelare 1!");
        vad = ett.getVal();

      }
      else if (vemsTur == 1){
         vad = two.getVal();
      }

      

      while (vemsTur == 0) {

         System.out.println("Your move (row[1-3] and column[1-3]): ");
         s.hasNextInt();
         row = s.nextInt() - 1;
         s.hasNextInt();
         col = s.nextInt() - 1;
      
         if (isValidMove(row, col)) {
            board[row][col] = vad;
            printBoard();

            vemsTur = 1;
      
         
            if (checkWin(vad)) {
               System.out.println("You win!");
               break;
            } 
            else if (isBoardFull(vad)) {
               System.out.println("It's a draw!");
               break;
            }
         }
      
         else {
            System.out.println("Invalid move. Try again.");
         }
         
      }
      if (vemsTur == 1){
           // AI move
           vad = two.getVal();
           System.out.println("AI's move:");
           makeAIMove(vad);
           printBoard();
           vemsTur = 0;
           
           if (checkWin(vad)) {
            System.out.println("AI wins!");
            break;
         }
         else if (isBoardFull(vad)) {
            System.out.println("It's a draw!");
            break;
         }
      }
   }
   
   return board;

}




   static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 &&
               col >= 0 && col < 3 &&
                " ".equals(board[row][col]);
    }
 
    static boolean isBoardFull(String vad) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (" ".equals(board[i][j])) return false;
            }
        }
        return true;
    }

   static boolean checkWin(String vad) {
          // Rows and Columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0].equals(vad) && board[i][1].equals(vad) && board[i][2].equals(vad)) ||
                (board[0][i].equals(vad) && board[1][i].equals(vad) && board[2][i].equals(vad))) {
                return true;
            }
        }
 
        // Diagonals
        return (board[0][0].equals(vad) && board[1][1].equals(vad) && board[2][2].equals(vad)) ||
               (board[0][2].equals(vad) && board[1][1].equals(vad) && board[2][0].equals(vad));
    }
    
    static void makeAIMove(String vad) {
        // Try to win
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (" ".equals(board[i][j])) {
                    board[i][j] = vad;
                    if (checkWin(vad)) return;
                    board[i][j] = " "; // Undo
                }
            }
        }
               // Block player from winning
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (" ".equals(board[i][j])) {
                    board[i][j] = vad;
                    if (checkWin(vad)) {
                        board[i][j] = vad; // Block
                        return;
                    }
                    board[i][j] = " "; // Undo
                }
            }
        }
 
        // Pick first available spot
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (" ".equals(board[i][j])) {
                    board[i][j] = vad;
                    return;
                }
            }
        }
    }



}
