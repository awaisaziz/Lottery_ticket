// Awais Aziz
import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 This program demonstrates a solution to the
 Slot Machine Simulation programming challenge.
 */

public class SlotMachineSimulationMeethods
{
  public static void main(String[] args)
  {
    // Constant for the maximum random number
    final int MAX_NUMBER = 5;
    
    // Variables
    String randList;  // To hold a string of characters
    int randNum;      // To hold a random number
    char rand1;       // To hold the first character
    char rand2;       // To hold the second character
    char rand3;       // To hold the third character
    char playAgain;   // To hold 'y' or 'n'
    double amountBet; // To hold the amount bet
    double amountWon; // To hold the amount won
    double totalBet;  // To hold the total bets
    double totalWon;  // To hold total winnings
    
    // Create a Random object.
    Random rand = new Random();
    
    // Set the bets and winnings to zero.
    amountBet = 0;
    amountWon = 0;
    totalBet = 0;
    totalWon = 0;
    
    // Play the slot machine once, and repeat the game as long 
    // as the user confirms they want to continue to play.
    do 
    { 
      // Set the random character 
      // list to an empty string.
      randList = "";
      
      // Calling the bet method
      amountBet = bet();
      // Calculating the total amount bet
      totalBet += amountBet;
      
      // Get three words from the list.
      for (int i = 0; i < 3; i++)
      {
        // Generate a random number.
        randNum = rand.nextInt(MAX_NUMBER);
        
        // Use the value of the random number to
        // select a word from the list.
        switch (randNum)
        {
          case 0:  System.out.print("- Cherries -");
          break;
          
          case 1:  System.out.print("- Oranges -");
          break;
          
          case 2:  System.out.print("- Plums -");
          break;
          
          case 3:  System.out.print("- Bells -");
          break;
          
          case 4:  System.out.print("- Melons -");
          break;
          
          case 5:  System.out.print("- Bars -");
          break;
        }
        
        // Add the random number to 
        // the string of characters.
        randList += randNum;
      }
      
      // Store each of the characters from
      // the list.
      rand1 = randList.charAt(0);
      rand2 = randList.charAt(1);
      rand3 = randList.charAt(2);
      
      // Calling the condition method
      amountWon = condition(rand1,rand2,rand3,amountBet);
      
      // Display the amount won.
      DecimalFormat dollar = new DecimalFormat("#,##0.00");       
      System.out.println("\nYou win $" + dollar.format(amountWon));
      
      // Skip a line.
      System.out.println();
      
      // Increment the total winnings.
      totalWon += amountWon;
      
      // Prompt the user to play again.
      
      
      playAgain = anotherBet();  // find out if the user wants to play again.
      
    } while (playAgain == 'Y' || playAgain == 'y');
    
    
    // Display the totals.
    DecimalFormat dollar = new DecimalFormat("#,##0.00");
    System.out.println("You bet a total of $" + dollar.format(totalBet));
    System.out.println("You won a total of $" + dollar.format(totalWon));
  }
  
  public static double bet()
  {
    System.out.println("Welcome to the Slot Machine Simulation.");
    
    // Create a Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    double amountBet;
    // Get the amount the user wants to bet.
    System.out.print("\nEnter the amount you would like to bet: $");
    amountBet = keyboard.nextDouble();
    return amountBet;
  }
  
  
  public static double condition(char rand1, char rand2, char rand3, 
                              double amountBet)
  {
    double amountWon = 0;
    
    // Determine if all three characters match.
    if (rand1 == rand2 && rand1 == rand3)
    {
      System.out.println("\nWow! All three match!");
      System.out.println("That triples your bet!");
      
      // Triple the amount won.
      amountWon = amountBet * 3;
      return amountWon;
    }
    // Determine if only two characters match.
    else if (rand1 == rand2 || rand1 == rand3 || rand2 == rand3)
    {
      System.out.println("\nGreat! Two match.");
      System.out.println("That doubles your bet!");
      
      // Triple the amount won.
      return amountWon = amountBet * 2;
    }
    // Determine if none of the characters match.
    else
    {
      System.out.println("\nSorry, None match...");
      
      // Set the amount won to zero.
      return amountWon = amountBet * 0;
    }
  }
  
  //method to accept user entry for another play or not
  public static char anotherBet()
  {
    String input;     // To hold keyboard input
    char betAgain;   // To hold 'y' or 'n' 
    
    // Create a Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    // Prompt the user to play again.
    System.out.println("\nWould you like to play again?");
    System.out.print("Enter Y for yes or N for no: ");
    input = keyboard.next();      // Read a string.
    betAgain = input.charAt(0);  // Get the first character.
    return betAgain;
  }
} 
