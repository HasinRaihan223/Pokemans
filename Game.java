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
		System.out.println("1: Get ALeafy");
		System.out.println("2: Get Homeruni");
    System.out.println("3: Get Sanitater");

    choice = myScanner.nextInt();

    //These pokemon names are all jokes btw will change later

		if(choice==1){
      //Get alif pokemon
      getAleafy();
    }
    if(choice==2){
      //Get Homeruni pokemon
    }
    if(choice==3){
      //Get sanitater
    }
  }

  public Pokemans getAleafy(){
    String[] leafAttacks = {"Tackle", "Leaf Storm"};
    // Tackle damages
    // Leaf storm increase damage
    String[] leafType = {"Fight", "Grass"};
    Pokemans makeLeafy = new Pokemans(1, 0, 100, 100, 20, 20, leafAttacks, leafType, "Aleafy");
    return makeLeafy;
  }

  public Pokemans getHomeruni(){
    String[] runiAttacks = {"Speak", "Ponder"};
    // Speak damages
    // Ponder increase damage
    String[] runiType = {"Fight", "Grass"};
    Pokemans makeRuni = new Pokemans(1, 0, 100, 100, 20, 20, runiAttacks, runiType, "Homeruni");
    return makeRuni;
  }

  public Pokemans getSanitater(){
    String[] taterAttacks = {"Golden Shower", "Divine Rays"};
    // Golden shower damages
    // Divine rays increase damage
    String[] taterType = {"Light", "Water"};
    Pokemans makeTater = new Pokemans(1, 0, 100, 100, 20, 20, taterAttacks, taterType, "Sanitater");
    return makeTater;
  }

  //Idk what im doing with this
  public Pokemans getEnemy(){
    String[] enemyAttack = {"Bite", "Growl"};
    String[] enemyType = {"Dark", "Fight"};
    Pokemans makeEnemy = new Pokemans(1, 0, 100, 100, 20, 20, enemyAttack, enemyType, "Feral Hound");
    return makeEnemy;
  }

  public void fieldSetUp(){
    System.out.println("------------------------");
    System.out.println("\n" + playerName + " you arrive at a grassy field rumored to contain strong, wild pokimaines.\nWhat do you do " + playerName.toLowerCase()+ "?");
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
		if (rand < 0.5) {
      System.out.println("You find no pokimaines.");
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
      System.out.println("You encounter a Feral Hound!");
    }
  }

  public static void setUpGame(){
    Game newGame = new Game();
    newGame.getName();
    // newGame.getStaterPokemon();
    newGame.fieldSetUp();
  }

}
