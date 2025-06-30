package Learning;

public class UsefulStringMethods
{
    public static void main(String[] args)
    {
        // -- #10 --
        // .equals()
        // .equalsIgnoreCase()
        String str1 = "hello";
        String str2 = "HELLO";
        String str3 = "   hello   ";
        System.out.println(str1.equals(str2)); // Outputs: false (case is not the same)
        System.out.println(str1.equalsIgnoreCase(str2)); // Outputs: true (case is ignored)

        // -- #9 --
        // .trim()
        System.out.println(str1.equals(str3.trim())); // Outputs: true (removes the spaces on the ends)

        // -- 8 --
        // .split()
        String str = "one, two, three";
        String[] parts = str.split(", ");
        for (String part: parts)
        {
            System.out.println(part);
        }

        // -- #7 --
        // .replace()
        String str4 = "Hello";
        System.out.println(str4.replace("l", "p")); // Outputs: "Heppo"
        
        // -- #6 --
        // .contains()
        // returns a boolean
        String str5 = "Hello, World!";
        System.out.println(str5.contains("World")); // Outputs: true

        // -- #5 --
        // .indexOf()
        // .lastIndexOf()
        String str6 = "Hello, World!";
        // gives the first occurance
        System.out.println(str6.indexOf('l')); // Outputs: 2
        // gives the last occurance
        System.out.println(str6.lastIndexOf('l')); // Outputs: 10

        // -- #4 --
        // .toUpperCase()
        // .toLowerCase()
        String str7 = "Hello";
        // capitalize everything
        System.out.println(str7.toUpperCase()); // Outputs: 'HELLO'
        // lowercase everything
        System.out.println(str7.toLowerCase()); // Outputs: 'hello'

        // -- #3 --
        // .substring()
        // grabs whats at the start and end range of the given index
        // the end index always ends at the location before the given number. 
        // index 11 is the last character given in this case.
        String str8 = "Hello, World!";
        // grabs whats at the start and end range of the given index
        System.out.println(str8.substring(7, 12)); // Outputs: 'World'

        // -- #2 --
        // .charAt()
        // finds a specific character in a string
        String str9 = "Hello, World!";
        System.out.println(str9.charAt(1)); // Outputs: 'e'

        // -- #1 --
        // .length()
        // returns the length of a method
        String str10 = "Hello, World!";
        System.out.println(str10.length()); // Outputs: '13'
        // this is so important and useful because it allows you to do things like this.
        for(int i = 0; i<str10.length(); i++) // iterates through str10 at every index location
        {
            System.out.println(str10.charAt(i)); // prints the character at the index location given
            // THIS IS VERY USEFUL AND COOOOOOL
        }
        // you can do it in reverse too
        for(int i = str10.length()-1; i>=0; i--) // iterates through str10 at every index location
        {
            System.out.println(str10.charAt(i)); // prints the character at the index location given
            // THIS IS VERY USEFUL AND COOOOOOL
        }
    
    }
}