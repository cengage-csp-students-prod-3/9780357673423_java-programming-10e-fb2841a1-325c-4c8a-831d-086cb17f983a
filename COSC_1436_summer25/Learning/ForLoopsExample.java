package Learning; // location
import java.util.Scanner;

public class ForLoopsExample
{
    public static void main(String [] args)
    {
        // sets i to 5; while i is greater that or equal to 1, continue loop; whatever i is, subtract 1 each cycle
        for( int i = 5; i >=1; i--)
        {
            System.out.println("the value of i is " + i);
        }
        // sets sum equal to 0
        int sum = 0;
        // sets k equal to 1; while k is less than or equal to 5, continue loop; add 1 to k each cycle
        for (int k = 1; k <= 5; k++)
        {
            // take the current value of k and add it to the sum for each cycle. changing the value of sum to the new number each cycle.
            sum += k;
        }
        System.out.println("the total of sum is: " + sum);
    }
}