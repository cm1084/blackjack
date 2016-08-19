import java.util.*; 
public class blackj 
{
  public static void main(String args[])
  {
  
  Scanner input=new Scanner(System.in);
  String s1="Welcome to BlackJack"; 
  System.out.println(s1); 
  
  System.out.println("");

   
  System.out.println("Remember the rules of the game: ");

  System.out.println("-------------------------------");
  
  System.out.println("1. Face cards are 10 and any other cards is its value. (the ace is 1)");
  
  System.out.println("2. You have to try to beat the dealer by getting a count as close to 21 as possible without going over 21.");
  
  System.out.println("3. If you choose to Stand then you will no longer be dealt cards and your card count will go against the dealer's. Who ever is closest to 21 wins.");
  
  System.out.println("4. If you choose to Hit then you will be dealt another card.");
  
  System.out.println("");
  System.out.println("Let's begin: ");
  
  
  int hand=0;
  boolean stay=true;
  int player = (int)(Math.random()*(10-1))+1;
  int dealer = (int)(Math.random()*(21-10))+10;
  System.out.println("You have been handed a: ");
  hand=player;
  System.out.println(hand);
  boolean newgame=true;
  
  while(stay)
  {	  
	  
	  if(hand==0)
	  {
	    System.out.println("You have been handed a: ");
	    hand=(int)(Math.random()*(10-1))+1;
	    System.out.println(hand);
	    dealer = (int)(Math.random()*(21-10))+10;
	  }
	  
	  System.out.println("Stand, or Hit?");
	  String decision=input.next();
	  
	  if(decision.equalsIgnoreCase("Stand"))
	  {
		  if(hand>dealer)
		  {
			  System.out.println("The dealer has: ");
			  System.out.println(dealer);
			  System.out.println("Congratulations you've won!");
			
			  
			  System.out.println("Do you want to stay? (Enter yes or no)");
			  String sty=input.next(); 
			  if(sty.equalsIgnoreCase("Yes"))
			  {
				  
			  }
			  if(sty.equalsIgnoreCase("No"))
			  {
				  stay=false;
			  }
			  
			  hand=0;
			  continue;
		  }
		  if(hand<dealer)
		  {
			  System.out.println("The dealer has: ");
			  System.out.println(dealer);
			  System.out.println("You have lost");
			  
			  System.out.println("");
			  System.out.println("Do you want to stay? (Enter yes or no)");
			  String sty=input.next(); 
			  if(sty.equalsIgnoreCase("Yes"))
			  {
				  
			  }
			  if(sty.equalsIgnoreCase("No"))
			  {
				  stay=false;
			  }
			  
		     hand=0;
		  }
		  
		  if(hand==dealer)
		  {
			  System.out.println("There is a tie!");
			  System.out.println("The dealer has: ");
			  System.out.println(dealer);
			  
			  System.out.println("");
			  System.out.println("Do you want to stay? (Enter yes or no)");
			  String sty=input.next(); 
			  if(sty.equalsIgnoreCase("Yes"))
			  {
				  
			  }
			  if(sty.equalsIgnoreCase("No"))
			  {
				  stay=false;
			  }
			  
		     hand=0;
		  }
		 
	  }
	  
	  if(decision.equalsIgnoreCase("Hit"))
	  {
		  System.out.println("You have been handed a: ");
		  
		  int num=(int)(Math.random()*(10-1))+1;
		  System.out.println(num);
		  
		  hand=hand + num;
		  System.out.println("");
		  System.out.println("Your new total is: " + hand);
		  
		  if(hand>21)
		  {
			  System.out.println("You went over 21");
			  System.out.println("");
		      System.out.println("Play again? (Enter Yes or No)");
		      String sty=input.next(); 
			  if(sty.equalsIgnoreCase("Yes"))
			  {
				 
				 
				  
			  }
			  if(sty.equalsIgnoreCase("No"))
			  {
				  stay=false;
			  }
		     
			  hand=0;
		  }
		  
		  if(hand<21)
		  {
			  continue;
			  
			  
		  }
	  }
	  
	  
	  
  }
  
  
  }
}
