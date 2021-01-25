import java.util.Scanner;

public class Game {

  Scanner myScanner = new Scanner(System.in);
  String playerName;
  int choice;

  public static void main(String[]args){
    setUpGame();
  }

  public void getName(){
    System.out.println("------------------------");
    System.out.println("Welcome to Pokemon Game!");
    System.out.println();
    System.out.println("Please enter your name:");
		playerName = myScanner.nextLine();
    System.out.println();
    System.out.println("Welcome " + playerName.toLowerCase() + " to my pokemon game!");
  }

  //Where you dab and get your starter pokemon
  public void getStarterPokemon(){
    System.out.println("------------------------");
    System.out.println("Hey kid choose pokeman!");
    System.out.println("Input the number corresponding with the action");
    System.out.println("");
		System.out.println("1: Get ALIFEE_Greens");
		System.out.println("2: Get Homeruni");
    System.out.println("3: Get Sanitater");

    choice = myScanner.nextInt();

    //These pokemon names are all jokes btw will change later
    
		if(choice==1){
      //Get alif pokemon
    }
    if(choice==2){
      //Get Homeruni pokemon
    }
    if(choice==3){
      //Get sanitater
    }
  }

  public void fieldSetUp(){
    System.out.println("------------------------");
    System.out.println("\n" + playerName + " you arrive at a grassy field rumored to contain strong, wild pokimaines.\nWhat do you do " + playerName.toLowerCase()+ "?");
		System.out.println("Input the number corresponding with the action.");
    System.out.println("");
		System.out.println("1: Traverse the field");
		System.out.println("2: Exit game and restart");

    choice = myScanner.nextInt();

		if(choice==1){
      //Implement this...
    }
    if(choice==2){
      System.out.println("");
      System.out.println("------------------------");
      System.out.println("You've started a new game!!!");
      setUpGame();
    }
  }

  public static void setUpGame(){
    Game newGame = new Game();
    newGame.getName();
    // newGame.getStaterPokemon();
    newGame.fieldSetUp();
  }

}
