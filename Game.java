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
    System.out.println("Welcome " + playerName.toLowerCase() + " to my Pokemon game!");
  }

  //Where you dab and get your starter Pokemon
  public void getStarterPokemon(){
    System.out.println("------------------------");
    System.out.println("Hey kid choose pokeman!");
    System.out.println("Input the number corresponding with the action");
    System.out.println("");
		System.out.println("1: Get ALeafy");
		System.out.println("2: Get Homeruni");
    System.out.println("3: Get Sanitater");

    choice = myScanner.nextInt();

    //These Pokemon names are all jokes btw will change later

		if(choice==1){
      //Get alif Pokemon
      getAleafy();
    }
    if(choice==2){
      //Get Homeruni Pokemon
      getHomeruni();
    }
    if(choice==3){
      //Get sanitater
      getSanitater();
    }
  }

  public Pokemon getAleafy(){
    String[] leafAttacks = {"Tackle", "Leaf Storm"};
    // Tackle damages
    // Leaf storm increase damage
    String[] leafType = {"Fight", "Grass"};
    Pokemon makeLeafy = new Pokemon(1, 0, 100, 20, 20, leafAttacks, leafType, "Aleafy");
    return makeLeafy;
  }

  public Pokemon getHomeruni(){
    String[] runiAttacks = {"Speak", "Ponder"};
    // Speak damages
    // Ponder increase damage
    String[] runiType = {"Fight", "Grass"};
    Pokemon makeRuni = new Pokemon(1, 0, 100, 20, 20, runiAttacks, runiType, "Homeruni");
    return makeRuni;
  }

  public Pokemon getSanitater(){
    String[] taterAttacks = {"Golden Shower", "Divine Rays"};
    // Golden shower damages
    // Divine rays increase damage
    String[] taterType = {"Light", "Water"};
    Pokemon makeTater = new Pokemon(1, 0, 100, 20, 20, taterAttacks, taterType, "Sanitater");
    return makeTater;
  }

  //Idk what im doing with this
  public Pokemon getEnemy(){
    String[] enemyAttack = {"Bite", "Growl"};
    String[] enemyType = {"Dark", "Fight"};
    Pokemon makeEnemy = new Pokemon(1, 0, 100, 20, 20, enemyAttack, enemyType, "Feral Hound");
    return makeEnemy;
  }

  public void fieldSetUp(){
    System.out.println("------------------------");
    System.out.println(playerName + " you arrive at a grassy field rumored to contain strong, wild pokimaines.\nWhat do you do " + playerName.toLowerCase()+ "?");
		System.out.println("Input the number corresponding with the action.");
    System.out.println("");
		System.out.println("1: Traverse the field");
		System.out.println("2: Exit game (field) and restart");

    choice = myScanner.nextInt();

		if(choice==1){
      traverseField();
    }
    if(choice==2){
      System.out.println("");
      System.out.println("------------------------");
      System.out.println("You've started a new game!!!");
      setUpGame();
    }
  }

  public void traverseField(){
    double rand = Math.random();
		if (rand < 0.6) {
      System.out.println("\nYou find no pokimaines.");
      System.out.println("What do you do " + playerName.toLowerCase()+ "?\n");

      System.out.println("1: Keep traversing the field");
  		System.out.println("2: Exit field (game) and restart");

      choice = myScanner.nextInt();

      //Choices
      if(choice==1){
        traverseField();
      }
      if(choice==2){
        System.out.println("");
        System.out.println("------------------------");
        System.out.println("You've started a new game!!!");
        setUpGame();
      }
    }
    else {
      System.out.println("\nYou encounter a Feral Hound!");
    }
  }

  public static void setUpGame(){
    Game newGame = new Game();
    newGame.getName();
    newGame.getStarterPokemon();
    newGame.fieldSetUp();
  }

}
