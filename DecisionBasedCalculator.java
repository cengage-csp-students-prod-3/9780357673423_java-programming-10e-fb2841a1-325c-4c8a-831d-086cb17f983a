// This imports the scanner utility. This is used to get user input.
import java.util.Scanner;

// This creates a new class named DecisionBasedCalculator.
public class DecisionBasedCalculator
{
    // This defines the main method and is the beginning of the program.
    public static void main(String[] args)
    {
        // Use a Scanner to ask the user to input a math operation (+, -, *, /, or exit).
        Scanner input = new Scanner(System.in);

        // Prompt the User for Operation.
        System.out.print("Input a math operation (+, -, *, /, or exit).\n");

        //Stores the chosen operation as an operand. Converts any use of a letter to lower case to improve reliablity and ease of use.
        String operation = input.nextLine().toLowerCase();

        // Checks to see if there are other inputs
        if (
            operation.equals("+") ||
            operation.equals("-") ||
            operation.equals("*") ||
            operation.equals("/") ||
            operation.equals("exit")
        ) 
        // The empty brackets allow the program to continue on, and not run the else.
        {}
        else
        {
            System.out.print("Entry invalid. Try again.\n");
            main(null); // run if invalid
        }

        // Terminates the program if user types "exit".
        if (operation.equals("exit"))
        {
            System.out.println("Goodbye :)");
            System.exit(0);
        }

        // If the user didn't exit, prompt the user for two numbers (operands).
        // Stores these number 1 and number 2 as double variables.
        System.out.print("Input two numbers(operands).\nNumber 1: ");
        double num1 = input.nextDouble();
        System.out.print("Number 2: ");
        double num2 = input.nextDouble();

        // Inspects user's chosen operation and executes accordingly.
        // Continuously prompts the user to choose an operation until they choose to exit.
        switch (operation)
        {
            // If addition is selected, num1 and num2 are added. The answer is then displayed and the program restarts.
            case "+":
                System.out.println(num1 + num2);
                break;
            // If subtraction is selected, num1 and num2 are subtracted. The answer is then displayed and the program restarts.
            case "-":
                System.out.println(num1 - num2);
                break;
            // If multiplication is selected, num1 and num2 are multiplied. The answer is then displayed and the program restarts.
            case "*":
                System.out.println(num1 * num2);
                break;
            // If division is selected, and num2 is not 0, num1 and num2 are divided. The answer is then displayed and the program restarts. 
            // If num 2 is 0, the program informs the user, and the program restarts.
            case "/":
                if (num2 == 0)
                {
                    System.out.print("Cannot divide by 0. Try again.\n");
                }
                else
                {
                    System.out.println(num1 / num2);
                }
                break;
            // Informs user if none of the inputs are valid. After this, the method ends.
            default:
                System.out.println("Entry invalid. Try again.");
        }

        // Restarts program if user did not already choose to exit.
        main(null);
    }
}
