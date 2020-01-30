// Awais Aziz
import java.util.Scanner;  // Needed for a Scanner class
import java.util.Random; // Needed for a random class

public class RollDice
{
  public static void main(String[] args)
  {
    int dice; // To hold the total iteration
    int input; // To hold the desired number
    char playAgain;  // To hold 'Y' or 'y'
    
    // Call the playOnce method
    playAgain = playOnce();
    
    while(playAgain == 'Y' || playAgain == 'y')
    {
      
      // Call the desiredNumber method
      input = desiredNumber();
      
      // Call the rollDice method
      dice = rollDice(input);
      
      System.out.println("The dice were rolled " + dice +
                         " times to get the number " + input + ".\n");
      
      // Call the rollAgain method
      playAgain = rollAgain();  // Find out if the user wants to play again
      
    }
    
    System.out.println("Thanks for rolling dice");
  }
  
  /*  The playOnce method prompts the user
   * to enter whether he wants to roll the
   * dice or no.
   * @return oneTime the input entered by the user. */
  
  public static char playOnce()
  {
    String play; // To hold the keyboard input
    char oneTime; // To hold 'Y' or 'y'
    
    //Create a scanner object to read from the keyboard
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("Would you like to roll the dice?");
    System.out.print("Enter Y for yes and N for no");
    play = keyboard.nextLine();
    oneTime = play.charAt(0); // Get the first char
    return oneTime;
  }
  
  /* The desiredNumber method prompts the user
   * to enter a desired number within 2-12.
   * @return the value entered by the user. */
  
  public static int desiredNumber()
  {
    int input;
    
    // Create a scanner object to read from the keyboard
    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("Enter a number within the "
                       + " range of 2-12");
    input = keyboard.nextInt();
    
    while (input < 2 || input > 12)
    {
      System.out.print("Please, enter the number "
                         + " in the range of 2 - 12");
      input = keyboard.nextInt();
    }
    return input;
  }
  
  /* The rollDice method rolls two dice
   * and check if the sum equals the input.
   * @param userInput value entered by the user.
   * @return the number of times the dice were rolled. */
  
  public static int rollDice(int userInput)
  {
    int dice1;  // To hold the dice1 rand number
    int dice2;  // To hold the dice2 rand number
    int diceRoll;  // To hold the sum of two dices
    int total = 0;  // Count the iteration
    
    // Create a random object
    Random rand = new Random();
    do
    {
      dice1 = rand.nextInt(6) + 1;
      dice2 = rand.nextInt(6) + 1;
      
      // Adding the two dice
      diceRoll = dice1 + dice2;
      // Accumulating the roll of dice
      total++;
      
    } while (diceRoll != userInput);
    
    return total;
  }
  
  /* The rollAgain method accept user entry for
   * another play or not.
   * @return playAgain which hold the 'Ý'or 'y'. */
  
  public static char rollAgain()
  {
    String playMore;  // To hold the keyboard input
    char playAgain;  // To hold 'Y' or 'y'
    
    // Create a scanner object to read from the keyboard
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("Would you like to roll the dice.");
    System.out.print("Enter Y for yes and N for no");
    playMore = keyboard.nextLine();
    playAgain = playMore.charAt(0);
    
    return playAgain;
  }
}