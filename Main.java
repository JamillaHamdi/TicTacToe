public class Main {

    public static void main(String[] args) throws InterruptedException, IllegalAccessException {

        cpuOrNotClass.cpuOrNotMetod(args);

        if (cpuOrNotClass.cpuOn == false){

        player1valjXellerOClass.player1ValjXellerOMetod(args);
        printBoardClass.printBoardMetod(args);
        winCheckclass.winCheckMetod(args);
        winCheckclass.loopBreakMetod(args);
        }
        else {
            
            player1valjXellerOClass.player1ValjXellerOMetod(args);
            printBoardClass.printBoardMetod(args);
            winCheckclass.loopBreakMetod(args);
        }
                
        
        
    }

}