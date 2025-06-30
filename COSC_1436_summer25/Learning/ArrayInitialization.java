package COSC_1436_summer25.Learning;
public class ArrayInitialization
{
    public static void main(String[] args)
    {
        // Declare of an array
        int[] numbers;

        // intiailization of an array
        numbers = new int[];

        // declared and intiailized
        int[] numbersSingleLine = new int[5];

        int[] predfinedNumbers = {10, 20, 30, 40, 50};

    }

    public static void printArray(int [] numbers)
    {
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println("Element at index " + i + ":" + numbers[i]);
        }
    }


}