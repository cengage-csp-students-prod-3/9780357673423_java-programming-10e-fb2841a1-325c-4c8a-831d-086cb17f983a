package Learning;

public class ArraysExample
{
    public static void main(String[] args)
    {
        // creates an int array and sets the size to 5
        int [] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // prints out the value of the indexes as an int
        printArray(numbers);

        // creates an String array and sets the size to 5
        String [] noombers = new String[5];
        noombers[0] = "ten";
        noombers[1] = "twenty";
        noombers[2] = "thirty";
        noombers[3] = "forty";
        noombers[4] = "fifty";

        // prints out the value of the indexes as a string
        printArray(noombers);
    }

    // allows the method to print the int array at each index by iterating through the length
    public static void printArray(int [] numbers)
    {
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }

    // allows the method to print the String array at each index by iterating through the length
    public static void printArray(String [] noombers)
    {
        for (int j = 0; j < noombers.length; j++)
        {
            System.out.println("Element at index " + j + ": " + noombers[j]);
        }
    }
}