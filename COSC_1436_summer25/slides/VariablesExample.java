package slides;
//these are my imports
import java.util.Scanner;

/**
 * This is the class that I will be using to explain variables.
 */

public class VariablesExample
{
    /**
     * This is the main method of my program
     * @param - array of String args from the console
     */
    public static void main(String [] args)
    {
        Scanner kb = new Scanner(System.in);
        final double TAX_RATE = 1.0825;
        System.out.print("What does your item cost?: ");
        double itemPrice = kb.nextDouble();

        System.out.println("Your total price will be $" + (itemPrice * TAX_RATE));


        /**
        String a = "Hello"; //Strings are imutable

        int b = 5; //answers the question how MANY

        double c = b; //how MUCH (point 0 or 0.0) they have floating points

        {
            int d = 7;
            System.out.println(d);
        }

        boolean myBool = false;

        myBool = !myBool;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(myBool);

        */

        kb.close();

    }
}