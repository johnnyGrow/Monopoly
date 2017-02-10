import java.util.ArrayList;


import java.util.Scanner;

public class Runner
 {
	
	static int move=0;
	static int dice;
  
  static String player;
  
  static boolean stillPlaying=true;
  
  static int playerMoney=1500;
  
  static ArrayList<Property>card=new ArrayList<Property>();
  
  public static void main(String[] args)
   {
System.out.println("lets play Monopoly!Do you want to play with (1)Regular edition, or (2) Colorado Fourteener Edition");
Scanner userInput=new Scanner(System.in);
player=userInput.nextLine();
if(player.equals("1"))
{
	fillProperty();
    runGame();
      
}
else
{
	fillCoProperty();
    runGame();
}

   }
  public static void fillProperty()
  {
  card.add(new Property("Go", 200,"Go","DoesNothing"));
  card.add(new Property("Mediterranean Avenue", 60,"purple","ColoredProperty"));
  card.add(new Property("Community Chest", 0,"","card"));
  card.add(new Property("Baltic Avenue", 60,"purple","ColoredProperty"));
  card.add(new Property("Tax ",200,"Tax","Tax"));
  card.add(new Property("Reading RailRoad", 200,"RailRoad","RailRoad"));
  card.add(new Property("Oriental Avenue",100,"Light Blue","ColoredProperty"));
  card.add(new Property("Chance",0,"","card"));
  card.add(new Property("Vermont Avenue",100,"Light Blue","ColoredProperty"));
  card.add(new Property("Conneticut Avenue",120,"Light Blue","ColoredProperty"));
  card.add(new Property("Jail Visit", 0,"JailVisit","DoesNothing"));
  card.add(new Property("St Charles ", 140,"Pink","ColoredProperty"));
  card.add(new Property("Electric Company", 150,"ElectricCompany","Utilities"));
  card.add(new Property("States Avenue", 140,"Pink","ColoredProperty"));
  card.add(new Property("Virginia Avenue",100,"Pink","ColoredProperty"));
  card.add(new Property("Pennsylvennia RailRoad",200 ,"RailRoad","RailRoad"));
  card.add(new Property("St. James Place", 180,"Orange","ColoredProperty"));
  card.add(new Property("Communuity Chest", 0,"","card"));
  card.add(new Property("Tennesese Avenue",180,"Orange","ColoredProperty"));
  card.add(new Property("New York Avenue",200,"Orange","ColoredProperty"));
  card.add(new Property("Free Parking", 0,"FreeParking","DoesNothing"));
  card.add(new Property("Kentucky Avenue", 220,"Red","ColoredProperty"));
  card.add(new Property("Chance",0,"","card"));
  card.add(new Property("Indiana Avenue",220,"Red","ColoredProperty"));
  card.add(new Property("Illinios Avenue", 240,"Red","ColoredProperty"));
  card.add(new Property("B. And O. RailRoad",200,"RailRoad","RailRoad"));
  card.add(new Property("Atlantic Avenue",260,"Yellow","ColoredProperty"));
  card.add(new Property("Ventor Avenue",260,"Yellow","ColoredProperty"));
  card.add(new Property("Water Works", 150,"WaterWorks","Utilities"));
  card.add(new Property("Marvin Gardens",280,"Yellow","ColoredProperty"));
  card.add(new Property("Go To Jail", 0,"GoToJail","GoToJail"));
  card.add(new Property("Pacific Avenue", 300,"Green","ColoredProperty"));
  card.add(new Property("North Carolina Avenue",300 ,"Green","ColoredProperty"));
  card.add(new Property("Community Chest", 0,"","card"));
  card.add(new Property("Pennsylvennia Avenue", 320,"Green","ColoredProperty"));
  card.add(new Property("Short Line RailRoad",200 ,"RailRoad",""));
  card.add(new Property("Chance", 0,"","card"));
  card.add(new Property("Park Place", 350,"Blue","ColoredProperty"));
  card.add(new Property("Luxury Tax", 0,"LuxuryTax","Tax"));
  card.add(new Property("BoardWalk", 400,"Blue","ColoredProperty"));
  }
  
  public static void fillCoProperty()
  {
  card.add(new Property("TrailHead", 200,"Go","DoesNothing"));
  card.add(new Property("Mt. Sherman", 60,"purple","ColoredProperty"));
  card.add(new Property("Trail Fortune", 0,"","card"));
  card.add(new Property("Quandary Peak", 60,"purple","ColoredProperty"));
  card.add(new Property("CO Fourteeners Innitiative ",200,"Tax","Tax"));
  card.add(new Property("LittleBear-Blanca 14er Traverse", 200,"RailRoad","RailRoad"));
  card.add(new Property("Mount Bierstadt",100,"Light Blue","ColoredProperty"));
  card.add(new Property("Go For An Adventure",0,"","card"));
  card.add(new Property("Torreys Peak",100,"Light Blue","ColoredProperty"));
  card.add(new Property("Grays Peak",120,"Light Blue","ColoredProperty"));
  card.add(new Property("Base Camp/Hiking Through", 0,"JailVisit","DoesNothing"));
  card.add(new Property("Mt. Yale", 140,"Pink","ColoredProperty"));
  card.add(new Property("Pikes Peak (14er Toll Road)", 150,"ElectricCompany","Utilities"));
  card.add(new Property("Mt. Princeton", 140,"Pink","ColoredProperty"));
  card.add(new Property("Mt. Harvard",100,"Pink","ColoredProperty"));
  card.add(new Property("Crestones 14er Traverse",200 ,"RailRoad","RailRoad"));
  card.add(new Property("Humboldt Peak", 180,"Orange","ColoredProperty"));
  card.add(new Property("Trail Fortune", 0,"","card"));
  card.add(new Property("Mt. Lindsey",180,"Orange","ColoredProperty"));
  card.add(new Property("Kit Carson Peak",200,"Orange","ColoredProperty"));
  card.add(new Property("Sceneic Viewpoint", 0,"FreeParking","DoesNothing"));
  card.add(new Property("Mt. Sneffels", 220,"Red","ColoredProperty"));
  card.add(new Property("Go For An Adventure",0,"","card"));
  card.add(new Property("Uncompahgre Peak",220,"Red","ColoredProperty"));
  card.add(new Property("Mt. Eolus", 240,"Red","ColoredProperty"));
  card.add(new Property("Wislon-El Diente 14er Traverse",200,"RailRoad","RailRoad"));
  card.add(new Property("Mount of the Holly Cross",260,"Yellow","ColoredProperty"));
  card.add(new Property("Mt. Massive",260,"Yellow","ColoredProperty"));
  card.add(new Property("Wt. Evans (14er Toll Road)", 150,"WaterWorks","Utilities"));
  card.add(new Property("Mt. Elbert",280,"Yellow","ColoredProperty"));
  card.add(new Property("Go To Basecamp", 0,"GoToJail","GoToJail"));
  card.add(new Property("Castle Peak", 300,"Green","ColoredProperty"));
  card.add(new Property("Snowmass Mountain",300 ,"Green","ColoredProperty"));
  card.add(new Property("Trail Fortune", 0,"","card"));
  card.add(new Property("Pyramid Peak", 320,"Green","ColoredProperty"));
  card.add(new Property("Maroon Bells 14er Traverse",200 ,"RailRoad",""));
  card.add(new Property("Go For An Adventure", 0,"","card"));
  card.add(new Property("Longs Peak", 350,"Blue","ColoredProperty"));
  card.add(new Property("You Lost a Boot", 0,"LuxuryTax","Tax"));
  card.add(new Property("Capitol Peak", 400,"Blue","ColoredProperty"));
  }
  
  public static void runGame()
  {
	  
	  
   while(stillPlaying)
    {
	   
   int randomNumber=(int)(Math.random()*6)+1;
   int randomDice=(int)(Math.random()*6)+1;
   
    dice=randomNumber+randomDice;
    move=move+dice;
    if(move==30)
    {
    	System.out.println("You are going to jail, and you cannot get out until you land on Go");
    	move=9;
    while(move>0)
    {
    	
    	move=move-randomNumber-randomDice;
    	if(move<0)
    	{
    		System.out.println("you have made past Go, you are free");
    		move=0;
    	}
    	
    	System.out.println("dice rolled "+randomNumber+" and "+randomDice+" which equals -"+dice+" You are at position "+move);
    	System.out.println("you landed on "+card.get(move).getName());
    	
    }
    }
    if(move>=40)
    {
    	move=move-40;
    }
    System.out.println("dice rolled "+randomNumber+" and "+randomDice+" which equals "+dice+" "+move);
      
    
    
    if(card.get(move).getType().equals("DoesNothing"))
    {
    	System.out.println("you landed on "+card.get(move).getName());
    }
    
    
    if(card.get(move).getType().equals("Utilities"))
    {
    	Scanner userInput=new Scanner(System.in);
    	System.out.println("you landed on "+card.get(move).getName()+" this property cost "+card.get(move).getCost()+" do you want to buy it? Yes(1) or No(2)");
    	String decision=userInput.nextLine();
        if(decision.equals("1"))
         {
          playerMoney=playerMoney-card.get(move).getCost();
          
          System.out.println("your inventory is "+playerMoney);
          
         }
        else
         {
          System.out.println("lets play next move");
          
         }
    }
    
    
    
    if(card.get(move).getType().equals("RailRoad"))
    {
    	Scanner userInput=new Scanner(System.in);
    	System.out.println("you landed on "+card.get(move).getName()+" it costs "+card.get(move).getCost()+" do you want to buy it? Yes(1) or No(2)");
    	String decision=userInput.nextLine();
        if(decision.equals("1"))
         {
          playerMoney=playerMoney-card.get(move).getCost();
          
          System.out.println("your inventory is "+playerMoney);
          
         }
        else
         {
          System.out.println("lets play next move");
          
         }
    }
    
    
    if(card.get(move).getType().equals("Tax"))
    {
    	if(card.get(move).getName().equals("LuxaryTax"))
    	{
    		System.out.println("you land on Luxury Tax");
    		playerMoney=playerMoney-75;
    		System.out.println("you now have "+playerMoney+" dollars");
    	}
    	else
    	{
    		System.out.println("you land on Tax");

    		playerMoney=playerMoney-200;
    		System.out.println("you now have "+playerMoney+" dollars");
    	}
    	
    	
    	
    }
    
    
    
    if(card.get(move).getType().equals("ColoredProperty"))
    {
    	Scanner userInput=new Scanner(System.in);
    	System.out.println("you landed on "+card.get(move).getName()+" it costs "+card.get(move).getCost()+"do you want to buy it? Yes(1) or No(2)");
    	String decision=userInput.nextLine();
        if(decision.equals("1"))
         {
          playerMoney=playerMoney-card.get(move).getCost();
          
          System.out.println("your inventory is "+playerMoney);
          
         }
        else
         {
          System.out.println("lets play next move");
          
         }
    }
    
    Scanner userInput=new Scanner(System.in);
    
    
     if(card.get(move).getType().equals("card"))
      {
    	 System.out.println("you landed on"+card.get(move).getName());
     System.out.println("grab a card");
     String answer=userInput.nextLine();
     
  }
     if(playerMoney<=0)
     {
      stillPlaying=false;
      System.out.println("you are out of money you have lost");
     }
    }   
  }
  }
