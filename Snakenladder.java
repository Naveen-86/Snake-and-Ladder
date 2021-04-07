import java.util.*;


  public class Snakenladder{

    public static void main(String[] args){
      System.out.println("Welcome To Snake and Ladder Game");

       int Startpoint = 0;
       int player1 = Startpoint;
       int dicecount = 0;


       while(player1 <= 100){

       Random rand = new Random();
       int diceroll = rand.nextInt(6)+1;
       dicecount++;

       System.out.println(diceroll);

       Random opt = new Random();
       int position = opt.nextInt(3);

       int previousposition = player1;

       switch(position){

                   case 0:
                             player1 = player1;
                             System.out.println("Sorry,u cant play remain in same position");
                             break;
                   case 1:
                             player1 = player1+diceroll;
                             System.out.println(" Yahoo! you got ladder " + diceroll + " steps move forward ");
                             break;
                   case 2:
                             player1 = player1-diceroll;
                             System.out.println(" Hiss! you are beaten by snake " + diceroll + " steps move backward ");
                             break;
         }
           if(player1 > 100){
				player1 = previousposition;
			}
			if(player1 < 0){
				player1 = player1;
			}
			if(player1 == 100){
				break;
			}
         System.out.println("You are in " + player1 + " position ");
      }
     System.out.println("you have rolled the dice for : " + dicecount + " times");
     System.out.println("You have reached 100,you win");
  }
}
