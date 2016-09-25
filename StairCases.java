
/**
 * This class contains 2 methods that print ascending and descending staircases 
 *
 * @author Michael Sun
 * @version 1.0 
 */
import java.util.Scanner;

public class StairCases
{
  /**
   * Main method demonstrates the other wo methods by calling each of them.
   * @param args Standard array of commandline String arguments. Not used in this program.
   */

  public static void main(String[] args)
  {
    //TODO change the next line so it actually gets input from the user
    Scanner keyboard = new Scanner(System.in);
    System.out.println("How many stairs would you like to have? ");
    int size = keyboard.nextInt();

    printAscending(size);
    printDescending(size);
  }

  /**
   * This method prints an ascending staircase 
   * @param size The amount of stairs there will be, this variable is inputed by the user 
   */
  public static void printAscending(int size)
  //TODO Finish this method
  {
   for (int counter = 0; counter < size; counter++)
   {
    for (int stars = 0; stars < counter + 1; stars++)
    {
     System.out.print("*");
    }
   
    System.out.print("\n");
   }
  }

  /**
   * This method prints a descending staircase
   * @param size The amount of stairs there will be, this variable is inputed by the user 
   */
  public static void printDescending(int size)
  {
  //TODO Finish this method
   System.out.println("\n");
   for (int counter = size; counter > 0; counter--)
   {
    for (int stars = 0; stars < counter; stars ++)
    {
     System.out.print("*");
    }
    System.out.print("\n"); 
   }
  }

}
