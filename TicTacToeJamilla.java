import java.util.InputMismatchException;
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
    static Scanner s = new Scanner(System.in);
    static int row;
    static int col;
    static Spelare ett = new Spelare();
    static Spelare two = new Spelare();

    public static void main(String[] args) {

      System.out.println("Välkommen till Tre i rad! Vill du spela med en kompis eller mot datorn?");
      System.out.println("1: Spela mot datorn");
      System.out.println("2: Spela med kompis");

      

      while (antal != 1 && antal !=2){
         //s.hasNextInt();
         try {
            antal = s.nextInt();
            if (antal != 1 && antal !=2){
               System.out.println("Du måste välja 1 eller 2. Försök igen:");
            }
         }
         catch(InputMismatchException e){
            System.out.println("Du måste välja 1 eller 2. Försök igen:");
            //s.reset();
            s.next();
         }
      }

      spelaresVal();
      boolean spelaIgen = true;
      while(spelaIgen){
         if (antal == 1){
            spelaMotDatorn();
         }
         else if(antal ==2){
            spelaSpel();
         }
         System.out.println("Vill du spela igen?");
         System.out.println("1: Ja");
         System.out.println("2: Nej");
         int igen = 0;

         while (igen != 1 && igen != 2){
            //s.hasNextInt();
            try {
               igen = s.nextInt();
               if (igen != 1 && igen!= 2){
                  System.out.println("Du måste välja 1 eller 2. Försök igen:");
               }
            }
            catch (InputMismatchException e){
               System.out.println("Du måste välja 1 eller 2. Försök igen:");
               s.next();
            }   
         }
         if (igen == 2){
               spelaIgen = false;}
      }
      System.out.println(ett.getNamn() + " vann " + ett.getVinst() + " gånger");
      System.out.println(two.getNamn() + " vann " + two.getVinst() + " gånger");
      s.close();

    }

static Spelare[] spelaresVal() {

   String namnEtt = null;
   String namnTwo = null;
   String valEtt = null;
   String valTwo = null; 
   boolean right = true;
   
   while (right) {
      System.out.println("Okej! Spelare 1, vad heter du och vill du vara x eler o?");
      System.out.println("Namn:");
      s.hasNext();
      namnEtt = s.next();
      System.out.println("x/o:");
      s.hasNext();
      valEtt = s.next().toLowerCase();
      
      if (valEtt.equalsIgnoreCase("x")){
         valTwo = "o";
         right = false;
      }
      else if (valEtt.equalsIgnoreCase("o")){
         valTwo = "x";
         right = false;
      }
      else {
      System.out.println("Mannen välj rätt");
      }
   }
   
   
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
   ett.addVinst(0);
   two.addVinst(0);
   
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

static String[][] clearBoard(){
   for (int i = 0; i < 3; i++){
      for (int j = 0; j < 3; j++){
         board[i][j]= " ";
      }
   }
   return board;

}

static String[][] spelaSpel() {

   clearBoard();
   //spelaresVal();

   System.out.println("Nu spelar vi! Välj först rad och sedan kolumn:");
   
   printBoard();

   Random rand = new Random();

   int vemsTur = rand.nextInt(2);
   System.out.println(vemsTur);
   String vad = null;
   String name = null;


   while (!gameEnded){

      if (vemsTur == 0){

        name = ett.getNamn();
        System.out.println("Din tur " + name + ":");
        vad = ett.getVal();

      }
      else if (vemsTur == 1) {
         name = two.getNamn();
         vad = two.getVal();
         System.out.println("Din tur " + name + ":");
      }
      boolean fel = true;
      while (fel){
         try {
            row = s.nextInt() - 1;
            col = s.nextInt() - 1;
            fel = false;
         }
         catch (InputMismatchException e){
            System.out.println("Du kan bara välja siffror 1-3. Försök igen:");
            s.next();
         }
         /*if (row >= 0 && row < 3 && col >= 0 && col < 3){
            fel = false;
         }*/
      }
      
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
            System.out.println(name + " vann!");
            if (vad.equals(ett.getVal())){
               ett.addVinst(ett.getVinst() + 1);
            }
            else if (vad.equals(two.getVal())){
               two.addVinst(two.getVinst() + 1);
            }
            break;
         } else if (isBoardFull(vad)) {
            System.out.println("Det blev lika");
            break;
         }
      }
      
      else {
         System.out.println("Otillåtet drag. Försök igen:");
      }
      
      
   }
   
   return board;
}

static String[][] spelaMotDatorn(){

   clearBoard();
   gameEnded = false;
   //spelaresVal();

   System.out.println("Nu spelar vi! Välj först rad och sedan kolumn:");
   
   printBoard();

   Random rand = new Random();

   int vemsTur = rand.nextInt(2);
   System.out.println(vemsTur);
   String vad = null;
   String name = null;


   while (!gameEnded){

      if (vemsTur == 0){
         name = ett.getNamn();
         vad = ett.getVal();

      }
      /*else if (vemsTur == 1){
         vad = two.getVal();
      }*/

      

      while (vemsTur == 0) {
         boolean fel = true;
         while (fel){
            try {
               System.out.println(name + "s tur: ");
               s.hasNextInt();
               row = s.nextInt() - 1;
               s.hasNextInt();
               col = s.nextInt() - 1;
               fel = false;
            }
            catch (InputMismatchException e){
               System.out.println("Du kan bara välja siffror 1-3. Försök igen:");
               s.next();
            }
         }

         
      
         if (isValidMove(row, col)) {
            board[row][col] = vad;
            printBoard();

            vemsTur = 1;
      
         
            if (checkWin(vad)) {
               System.out.println(name + " vann!");
               ett.addVinst(ett.getVinst() + 1);
               break;
            } 
            else if (isBoardFull(vad)) {
               System.out.println("Det blev lika");
               break;
            }
         }
      
         else {
            System.out.println("Otillåtet drag. Försök igen:");
         }

         
         
      }

      if (checkWin(vad) || isBoardFull(vad)){
         gameEnded = true;
      }
      else if (vemsTur == 1){
           // AI move
           name = two.getNamn();
           vad = two.getVal();
           System.out.println("Datorns drag:");
           makeAIMove(vad);
           printBoard();
           vemsTur = 0;
           
           if (checkWin(vad)) {
            System.out.println("Datorn vann!");
            two.addVinst(two.getVinst() + 1);
            break;
         }
         else if (isBoardFull(vad)) {
            System.out.println("Det blev lika");
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
