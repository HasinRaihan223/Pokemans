import java.util.Scanner;

public class Game {

  Scanner myScanner = new Scanner(System.in);
  String playerName;

  public static void main(String[]args){
    Game newGame = new Game();
    newGame.setUp();
  }

  public void setUp(){
    System.out.println();
    System.out.println("------------------------");
    System.out.println("Welcome to Pokemon Game!");
    System.out.println();
    System.out.println("Please enter your name:");
		playerName = myScanner.nextLine();
    System.out.println();
    System.out.println("Welcome " + playerName + " to my pokemon game!");
  }

}
