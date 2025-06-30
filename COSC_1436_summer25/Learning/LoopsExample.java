// WHILE LOOPS
package Learning; // location

import java.util.Scanner;

public class LoopsExample
{
    public static void main(String [] args)
    {
        // indefinite loop
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer (negative to quit) -> $ ");
        int number = scanner.nextInt();

        while(number >= 0)
        {
            System.out.println("You entered " + number);
            System.out.print("Enter an integer (negative to quit) -> $ ");
            number = scanner.nextInt();
        }

        System.out.println("You entered a negative number");

        // definite loop
        /// public static void main(String [] args)
        int x = 1; // x is 1
        while(x <= 100) // x is the LCV (loop control variable), as long as x is less than or equal to 100, the body executes.
        {
            System.out.println(x); // prints out current value of x
            x++; // increases x by 1. after this it runs through the loop again until x is greater than 100.
        }
    }
}