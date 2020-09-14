import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
// create a Scanner for user input
  Scanner input = new Scanner(System.in);

  // declare a variable for the first number

  // ask the user for a number
   System.out.println("Please enter a number:");
   // initialize a number that needs to be divided by another number

   // declare and initialize a variable for integer1
   int number1 = input.nextInt();

   // declare and initialize a variable for integer1
   int number2 = input.nextInt();
   // declare and initialize the quotient from the 2 numbers
  System.out.println("The answer is " + (number1%number2));
  }
}
