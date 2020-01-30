// Awais Aziz
import java.util.Scanner;  // Needed for a scanner class
import java.util.Random;  // Needed for a random class
import java.text.DecimalFormat;  // Needed for a decimal class

/* A gambling device in which the user inserts money
 * and win money on bet */
public class SlotMachine
{
  public static void main(String[] args)
  {
    // Declaring identifiers
    int random1, random2, random3; //Needed for different slot
    double bet;     // User input betting money
    double totalBet = 0;  // The total money user bet
    double totalWon = 0; // The total money user won
    double noneWon, doubled,
      triple; //Needed for different matches
    String again; // Asking user to play again
    
    // Create a scanner object to read input
    Scanner keyboard = new Scanner(System.in);
    
    // Create a DecimalFormatter object
    DecimalFormat decimal = new DecimalFormat("$0.00");
    
    // Create a random object
    Random randomNumbers = new Random();
    
    do
    {
      System.out.println("Welcome to slot Machine Simulatoin");
      
      // Get a random integer and assign it to number
      random1 = randomNumbers.nextInt(6);
      random2 = randomNumbers.nextInt(6);
      random3 = randomNumbers.nextInt(6);
      
      System.out.print("Enter the amount of money you wantt to bet: $");
      bet = keyboard.nextDouble();
      
      // Determine the random number slot 1
      switch (random1)
      {
        case 0:
          System.out.println("Cherries");
          break;
        case 1:
          System.out.println("Oranges");
          break;
        case 2:
          System.out.println("Plums");
          break;
        case 3:
          System.out.println("Bells");
          break;
        case 4:
          System.out.println("Melons");
          break;
        case 5:
          System.out.println("Bars");
          break;
      }
      
      // Determine the random number slot 2
      switch (random2)
      {
        case 0:
          System.out.println("Cherries");
          break;
        case 1:
          System.out.println("Oranges");
          break;
        case 2:
          System.out.println("Plums");
          break;
        case 3:
          System.out.println("Bells");
          break;
        case 4:
          System.out.println("Melons");
          break;
        case 5:
          System.out.println("Bars");
          break;
      }
      
      // Determine the random number slot 3
      switch (random3)
      {
        case 0:
          System.out.println("Cherries");
          break;
        case 1:
          System.out.println("Oranges");
          break;
        case 2:
          System.out.println("Plums");
          break;
        case 3:
          System.out.println("Bells");
          break;
        case 4:
          System.out.println("Melons");
          break;
        case 5:
          System.out.println("Bars");
          break;
      }
      
      if (random1 == random2 && random2 == random3)
      {
        System.out.println("Wow! Three Match");
        System.out.println("Triple your bet");
        
        // Accumulate the bet value
        totalBet += bet;
        // Calculation for double
        triple = bet * 3;
        System.out.println("You win " + decimal.format(triple));        
        totalWon += triple;
      }
      else
      {
        if (random1 == random2 || random2 == random3
           || random1 == random3)
        {
          System.out.println("Two Match");
          System.out.println("Double your bet");
          
          // Calculaton
          totalBet += bet;
          doubled = bet * 2;
          System.out.println("you win " + decimal.format(doubled));
          totalWon += doubled;
        }
        else
        {
          System.out.println("Sorry, None match");
          // Calculation
          totalBet +=bet;
          noneWon = bet * 0;
          System.out.println("You won " + decimal.format(noneWon));
          totalWon += 0;
        }
      }
      
      keyboard.nextLine();
      System.out.print("Would you like to play again?"
                         + " Enter y for yes or N for no.");
      again = keyboard.nextLine();
      
    } while (again.equalsIgnoreCase("Y"));
    
    System.out.println("Your total bet is " + decimal.format(totalBet));
    System.out.println("Your total winning bet is " + decimal.format(totalWon));
  }
}
