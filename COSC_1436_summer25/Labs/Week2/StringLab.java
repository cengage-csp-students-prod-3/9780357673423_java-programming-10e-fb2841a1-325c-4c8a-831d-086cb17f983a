4

import java.util.Scanner; // imports the scanner utility

public class StringLab // creates a new class named StringLab.
{ 
    // TASK ONE:
    public static void main(String[] args) // defines the main method and is the beginning of the program.
    {
        String homework = "Welcome to the Java String Lab!"; // assigns the string homework

        int len = homework.length(); // grabs the length of the string
        System.out.println(len); // prints the length of the string

        char letter = homework.charAt(7); // grabs letter at index 7
        System.out.println(letter); // prints letter at index 7

        System.out.println(homework.substring(15,19)); // prints "Java"
        System.out.println(homework.substring(15, 19).toUpperCase()); // prints "JAVA"
        System.out.println(homework.substring(15, 19).toLowerCase()); // print "java"

        System.out.println(homework.indexOf("Java")); // prints the index of the first occurrence of "Java"

        System.out.println(homework.contains("Lab"));   // checks to see if the string contains the word "Lab" and prints the result

        System.out.println(homework.replace("Java", "Java Programming"));  // replaces "Java" with "Java Programming"

        String[] words = homework.split(" "); // splits homework into individual words
        for (int i = 0; i < words.length; i++) // creates loop to iterate throgh each word in "homework"
            {
                System.out.println(words[i]); // prints out each word and then stops
            }

        System.out.println(homework.trim()); // removes any leading or trailing spaces and prints result

        String a = "java string lab!"; // passes in variable a
        String b = " Welcome to the Java String Lab! "; // passes in variable a
        System.out.println(a.equals(b)); // checks to see if they are exactly the same. then prints result
        System.out.println(a.equalsIgnoreCase(b)); // checks to see if they are the same, but ignores case. then prints result

        
    // TASK TWO:
        int vowels = 0; // counts number of vowels
        for (int i = 0; i < homework.length(); i++) // craetes loop to iterate through each word
        {
            char v = Character.toLowerCase(homework.charAt(i)); // sets varaible v to the lowercase version of homework and gets character at designated position
            if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u') // designations the character position to look for
            {
                vowels++; // increases index number if vowel is found
            }
        }
        System.out.println(vowels); // prints total number of vowels

        String forward = "racecar"; // creates string "forward" and assigns it to "racecar"
        String reversed = ""; // creates string "reversed" and leaves it empty
        int i = forward.length() -1; // gets length of forward
        while (i >= 0) // loop that goes through the string back to front
        {
            reversed = reversed + forward.charAt(i); // builds the reversed version of "racecar"
            i--;
        }
        if (forward.equals(reversed)) // compares forward to reversed
        {
            System.out.println("It's a palindrome!"); // prints output if a palindrome
        } 
            else 
        {
            System.out.println("It's not a palindrome."); // prints output if not a palindrome
        }

        String JERVA;
        Scanner input = new Scanner(System.in); // Use a Scanner to ask the user for input.
        do
        {
            System.out.print("Enter a sentence.:  "); // prompts user to enter a sentence
            JERVA = input.nextLine();
        }
        while (!JERVA.contains("Java")); // check if not equal - closes loop
        System.out.println("Thank you!"); // says thank you


    // TASK THREE:
        StringBuilder sb = new StringBuilder("StringBuilder Lab");
        sb.append(" - Learning Java");  // adds " - Learning Java" to the end
        sb.insert(18, "is fun ");   // inserts "is fun" after "Lab"
        sb.delete(26, 35);  // deletes "Learning"
        sb.reverse();   // reverses everything
        System.out.println(sb); // prints result


    // TASK FOUR:
        StringBuffer sf = new StringBuffer("Multithreading Lab");
        sf.append(" - Learning Java");  // adds " - Learning Java" to the end
        sf.insert(19, "is fun ");   // inserts "is fun" after "Lab"
        sf.delete(27, 36);  // deletes "Learning"
        sf.reverse();   // reverses everything
        System.out.println(sf); // prints result
    }
}