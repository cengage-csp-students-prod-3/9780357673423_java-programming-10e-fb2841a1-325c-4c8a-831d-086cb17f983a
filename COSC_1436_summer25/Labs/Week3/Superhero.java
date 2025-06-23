class Superhero
{
    // Declare attributes: name, ability, and powerLevel
    String name;
    String ability;
    int powerLevel;

    // Constructor to initialize name, ability, and powerLevel
    public Superhero(String heroName, String heroAbility, int heroPowerLevel)
    {
        name = heroName;
        ability = heroAbility;
        powerLevel = heroPowerLevel;
    }
    
    // Method: displayHero
    public void displayHero()
    {
        // Print the hero's. name, ability, and power level
        System.out.println("Name: " + name);
        System.out.println("Ability: " + ability);
        System.out.println("Power Level: " + powerLevel);
    }
}