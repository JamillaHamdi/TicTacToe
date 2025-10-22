import java.util.Scanner;

public class Ttt {
    public static void main(String[] args) {
      //spelaresVal();
      printBoard();
      

    }

public static void spelaresVal (){
   System.out.println("Spelare 1, vill du vara x eler o?");  
     Scanner s = new Scanner(System.in);

     String spelare1 = s.nextLine().toLowerCase();
     String spelare2 = null;
     
     if (spelare1.equalsIgnoreCase("x")){
        spelare2 = "o";
     }
     else if (spelare1.equalsIgnoreCase("o")){
        spelare2 = "x";
     }
     else {
        System.out.println("Mannen välj rätt");
        spelaresVal();
     }
}


public static void printBoard() {
   

   char[][] board = {
      {' ', ' ', ' '},
      {' ', ' ', ' '},
      {' ', ' ', ' '}
   };

   System.out.println("-----------");
   for (int i = 0; i < 3; i++){
      System.out.print("|");
      for ( int j = 0; j < 3; j++){
         System.out.print(board[i][j] + " | ");
      }
      System.out.println("\n------------");
   }
}
    

}
