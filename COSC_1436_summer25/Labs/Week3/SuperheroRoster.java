public class SuperheroRoster
{
    public static void main(String[] args)
    {
        // 1. Declare and initialize arrays for hero names, abilities, and power levels
        String[] heroNames = {"Spider-Man", "Iron Man", "Black Widow", "Hulk"};
        String[] abilities = {"Web-slinging", "Flying and high-tech armor", "Stealth and combat", "Super Strength"};
        int[] powerLevels = {85, 90, 65, 80};
 
        // 2. Print each hero's details using a loop
        for (int i = 0; i < heroNames.length; i++) 
        {
            Superhero hero = new Superhero(heroNames[i], abilities[i], powerLevels[i]);
            hero.displayHero(); // calls method "displayHero" to print
            System.out.println(); // prints a space for better readability
        }

        // 4. Calculate and display the average power level by calling calculateAveragePower method
        double avg = calculateAveragePower(powerLevels);
        System.out.println("Average Power: " + avg);
    }
 
    // Method: searchHero
    public static void searchHero(String[] heroNames, String[] abilities, int[] powerLevels, String target)
    {
        boolean found = false; // creates boolean value set to false
        for (int i = 0; i < heroNames.length; i++) // loops through list to look for hero
        {
            if (heroNames[i].equals(target)) // checks if target matches hero list
            {
                System.out.println(abilities[i] + " - " + powerLevels[i]); // print details
                found = true; // sets boolean to true if match
                break;
            }
        }
        if (!found) // if not, tell the user
        {
            System.out.println("Hero not found.");
        }
    }
 
    // Method: calculateAveragePower
    public static double calculateAveragePower(int[] powerLevels) 
    {
        // Implement the calculation for average power level
        int sum = 0; // sets variable "sum" to 0 as a starting value
        int quant = powerLevels.length;
        for (int i = 0; i < quant; i++) // loops through the power levels (quant)
        {
            sum += powerLevels[i]; // gets the sum of the idexes
        }
        double averagePower = (double) sum / quant; // divides the sum by the quantities of power levels and sets sum to a float for accuracy
        return averagePower; // returns calculated average
    }
}
 