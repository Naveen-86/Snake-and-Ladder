import java.util.*;


  public class Snakenladder{

    public static void main(String[] args){
      System.out.println("Welcome To Snake and Ladder Game");

       int Startpoint = 0;
       Random rand = new Random();
       int diceroll = rand.nextInt(6)+1;

       System.out.println(diceroll);
  }
}
