import java.util.*;;

public class Main {
    public static void main(String[] args) {
        
        String a = "1", b= "2",c= "3",d= "4",e= "5",f= "6",g= "7",h= "8",i= "9";
        int y;
        //System.out.println("[x/o]?");
        //String player1 = new Scanner(System.in).nextLine();
        String player2 = "o"; //BYT TILL O EFTER TEST!!!!!!!!!!
        String player1 = "x";
        //if(player1 == "x"){player2 = "o";}else{player2 = "x";};
        int j = 1;
        System.out.printf("__%s|%s|%s__\n",a,b,c);
        System.out.printf("__%s|%s|%s__\n",d,e,f);
        System.out.printf("  %s|%s|%s \n",g,h,i);
        do{
            /*if(j%2 != 0){*/
            y = new Scanner(System.in).nextInt();//se{y = (int)(Math.random()*9) +1;}
            switch (y) {
                case 1:
                //&& !(a.equals("x") || a.equals("o"))
                    if(j%2 != 0 ){a=player1;}else{a=player2;}
                    ++j;
                    break;
                case 2:
                    if(j%2 != 0){b=player1;}else{b=player2;}
                    ++j;
                    break;
                case 3:
                    if(j%2 != 0){c=player1;}else{c=player2;}
                    ++j;
                    break;
                case 4:
                    if(j%2 != 0){d=player1;}else{d=player2;}
                    ++j;
                    break;
                case 5:
                    if(j%2 != 0){e=player1;}else{e=player2;}
                    ++j;
                    break;
                case 6:
                    if(j%2 != 0){f=player1;}else{f=player2;}
                    ++j;
                    break;
                case 7:
                    if(j%2 != 0){g=player1;}else{g=player2;}
                    ++j;
                    break;
                case 8:
                    if(j%2 != 0){h=player1;}else{h=player2;}
                    ++j;
                    break;
                case 9:
                    if(j%2 != 0){i=player1;}else{i=player2;}
                    ++j;
                    break;
            }
            System.out.printf("__%s|%s|%s__\n",a,b,c);
            System.out.printf("__%s|%s|%s__\n",d,e,f);
            System.out.printf("  %s|%s|%s \n",g,h,i);

    }while(!((a.equals(b) && b.equals(c)) || (a.equals(d) && d.equals(g)) || (a.equals(e) && e.equals(i)) || (e.equals(d) && d.equals(f)) || (e.equals(b) && b.equals(h)) || (g.equals(e) && e.equals(c))));
    
        }

    

}