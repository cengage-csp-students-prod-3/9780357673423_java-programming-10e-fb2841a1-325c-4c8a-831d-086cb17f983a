package Learning; // location
import java.util.Scanner;

public class DoWhileLoops
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int number;
        do
        {
            // loop body: code to exceute
            System.out.print("Enter a number between 1 and 10: ");
            number = scanner.nextInt();
        }while(number < 1 || number > 10);
    }
}