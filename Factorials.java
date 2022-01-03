/*
*
* The factorial program lets you enter a number and gives you the factorial
* of that number
*
* @author Jakob
* @version 1.0
* @since 2020-11-24
* Class Factorials1
*/

import java.util.Scanner;

final class Factorials1{

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    *
    */

private Factorials1() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */

   public static void main(final String[] args) {
      //Scanner object for capturing the user input
      final Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the number:");
      //Stored the entered value in variable
try {
      final int num = scanner.nextInt();
      //Called the user defined function fact


        int factorial = fact(num);
      System.out.println("The factorial of entered number is: " + factorial);
}
    catch (java.util.InputMismatchException ex) {
    System.out.println("That was not a valid number.");
}
    /**
    * The starting factorial function.
    *             
    * @param number is a number
    *       
    * @return factorial of number
    */

}
   public static int fact(final int number) {

       int output;
       if(number == 0){
        output = 1;
       }
        else if (number > 0) {
       output = fact(number - 1)* number;
}
        else {
        output = fact(number + 1)* number;
}
       return output;   
 }
}
