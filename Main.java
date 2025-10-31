public class Main {

    public static void main(String[] args) throws InterruptedException, IllegalAccessException {
        cpuOrNotClass.cpuOrNotMetod(args);
        if (cpuOrNotClass.cpuOn){
        player1valjXellerOClass.player1ValjXellerOMetod(args);
        }
        else {
            cpuLogicClass.cpuLogicMetod(args);
        }
        printBoardClass.printBoardMetod(args);
        winCheckclass.winCheckMetod(args);
        winCheckclass.loopBreakMetod(args);
        
        
        
    }

}