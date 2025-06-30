package Learning; // location

public static void main (String [] args)
{
    int age = 20;
    String message = (age >= 18 ? "You are an adult." : "You are not an adult.");
    System.out.println(message);

    // the method is called here
    System.out.println("4 is " + checkEvenOrOdd(4));
    System.out.println("13 is " + checkEvenOrOdd(13));
}


// the method is created here
public static String checkEvenOrOdd(int num)
{
    return (num % == 0) ? "Even" : "Odd";
}

// THE ORDER OF A METHOD CALL DOES NOT MATTER. 
// A METHOD CAN BE WRITTEN ANYWHERE IN THE SAME CLASS 
// BECAUSE ONCE ITS COMPILED, JAVA KNOWS WHERE ITS AT AND CAN FIND IT.



// EXAMPLE OF OR AND NOT
public static void main (String [] args)
{
    int age = 20; // sets age to 20
    boolean isStudent = true; // sets student to true

    // checks age is less than 18 or if a student. if set to not on either they are inelligble 
    String discount = (age < 18 || isStudent) ? "eliigible for discount" : "not elligible for discount"
}