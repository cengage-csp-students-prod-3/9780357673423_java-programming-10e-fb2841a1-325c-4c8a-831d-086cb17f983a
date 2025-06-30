package COSC_1436_summer25.Labs.Week4.Lab7;

public class Main
{
    public static void main(String[] args)
    {
        HeroManager manager = new HeroManager();

        // Adds all heroes
        // x-men
        manager.addHero(new Hero("Wolverine", 95, Affiliation.X_MEN));
        manager.addHero(new Hero("Cyclops", 90, Affiliation.X_MEN));
        manager.addHero(new Hero("Jean Grey", 98, Affiliation.X_MEN));
        manager.addHero(new Hero("Iceman", 80, Affiliation.X_MEN));
        manager.addHero(new Hero("Beast", 85, Affiliation.X_MEN));
        manager.addHero(new Hero("Professor X", 99, Affiliation.X_MEN));
        manager.addHero(new Hero("Rogue", 88, Affiliation.X_MEN));
        manager.addHero(new Hero("Storm", 92, Affiliation.X_MEN));
        manager.addHero(new Hero("Gambit", 87, Affiliation.X_MEN));
        manager.addHero(new Hero("Nightcrawler", 83, Affiliation.X_MEN));
        manager.addHero(new Hero("Colossus", 89, Affiliation.X_MEN));
        manager.addHero(new Hero("Angel", 82, Affiliation.X_MEN));
        manager.addHero(new Hero("Psylocke", 86, Affiliation.X_MEN));
        manager.addHero(new Hero("Cable", 91, Affiliation.X_MEN));
        manager.addHero(new Hero("Jubilee", 75, Affiliation.X_MEN));

        // avengers
        manager.addHero(new Hero("Iron Man", 95, Affiliation.AVENGERS));
        manager.addHero(new Hero("Captain America", 92, Affiliation.AVENGERS));
        manager.addHero(new Hero("Thor", 98, Affiliation.AVENGERS));
        manager.addHero(new Hero("Hulk", 99, Affiliation.AVENGERS));
        manager.addHero(new Hero("Black Widow", 85, Affiliation.AVENGERS));
        manager.addHero(new Hero("Hawkeye", 80, Affiliation.AVENGERS));
        manager.addHero(new Hero("Scarlet Witch", 97, Affiliation.AVENGERS));
        manager.addHero(new Hero("Vision", 90, Affiliation.AVENGERS));
        manager.addHero(new Hero("Ant-Man", 83, Affiliation.AVENGERS));
        manager.addHero(new Hero("Doctor Strange", 98, Affiliation.AVENGERS));
        manager.addHero(new Hero("Black Panther", 94, Affiliation.AVENGERS));
        manager.addHero(new Hero("Spider-Man", 91, Affiliation.AVENGERS));

        // fantastic four
        manager.addHero(new Hero("Human Torch", 75, Affiliation.FANTASTIC_FOUR));
        manager.addHero(new Hero("Invisible Woman", 85, Affiliation.FANTASTIC_FOUR));
        manager.addHero(new Hero("Mr. Fantastic", 90, Affiliation.FANTASTIC_FOUR));
        manager.addHero(new Hero("The Thing", 95, Affiliation.FANTASTIC_FOUR));

        // justice league
        manager.addHero(new Hero("Superman", 100, Affiliation.JUSTICE_LEAGUE));
        manager.addHero(new Hero("Batman", 90, Affiliation.JUSTICE_LEAGUE));
        manager.addHero(new Hero("Wonder Woman", 98, Affiliation.JUSTICE_LEAGUE));
        manager.addHero(new Hero("Flash", 95, Affiliation.JUSTICE_LEAGUE));
        manager.addHero(new Hero("Aquaman", 88, Affiliation.JUSTICE_LEAGUE));
        manager.addHero(new Hero("Green Lantern: Hal Jordan", 92, Affiliation.JUSTICE_LEAGUE));
        manager.addHero(new Hero("Cyborg", 89, Affiliation.JUSTICE_LEAGUE));
        manager.addHero(new Hero("Martian Manhunter", 97, Affiliation.JUSTICE_LEAGUE));
        manager.addHero(new Hero("Green Arrow", 84, Affiliation.JUSTICE_LEAGUE));
        manager.addHero(new Hero("Hawkgirl", 86, Affiliation.JUSTICE_LEAGUE));
        manager.addHero(new Hero("Shazam", 96, Affiliation.JUSTICE_LEAGUE));
        manager.addHero(new Hero("Zatanna", 87, Affiliation.JUSTICE_LEAGUE));
        manager.addHero(new Hero("Atom", 83, Affiliation.JUSTICE_LEAGUE));
        manager.addHero(new Hero("Firestorm", 85, Affiliation.JUSTICE_LEAGUE));
        manager.addHero(new Hero("Black Canary", 82, Affiliation.JUSTICE_LEAGUE));

        // teen titans
        manager.addHero(new Hero("Robin", 85, Affiliation.TEEN_TITANS));
        manager.addHero(new Hero("Starfire", 90, Affiliation.TEEN_TITANS));
        manager.addHero(new Hero("Raven", 95, Affiliation.TEEN_TITANS));
        manager.addHero(new Hero("Beast Boy", 80, Affiliation.TEEN_TITANS));
        manager.addHero(new Hero("Terra", 78, Affiliation.TEEN_TITANS));
        manager.addHero(new Hero("Blue Beetle", 84, Affiliation.TEEN_TITANS));
        manager.addHero(new Hero("Kid Flash", 87, Affiliation.TEEN_TITANS));
        manager.addHero(new Hero("Wonder Girl", 86, Affiliation.TEEN_TITANS));

        // avengers
        manager.addHero(new Hero("Doctor Fate", 95, Affiliation.JUSTICE_SOCIETY_OF_AMERICA));
        manager.addHero(new Hero("Hawkman", 88, Affiliation.JUSTICE_SOCIETY_OF_AMERICA));
        manager.addHero(new Hero("The Flash: Jay Garrick", 90, Affiliation.JUSTICE_SOCIETY_OF_AMERICA));
        manager.addHero(new Hero("Green Lantern: Alan Scott", 91, Affiliation.JUSTICE_SOCIETY_OF_AMERICA));
        manager.addHero(new Hero("Wildcat", 82, Affiliation.JUSTICE_SOCIETY_OF_AMERICA));
        manager.addHero(new Hero("Sandman", 80, Affiliation.JUSTICE_SOCIETY_OF_AMERICA));
        manager.addHero(new Hero("Power Girl", 93, Affiliation.JUSTICE_SOCIETY_OF_AMERICA));
        manager.addHero(new Hero("Stargirl", 85, Affiliation.JUSTICE_SOCIETY_OF_AMERICA));
        manager.addHero(new Hero("Atom Smasher", 87, Affiliation.JUSTICE_SOCIETY_OF_AMERICA));

        // inhumans
        manager.addHero(new Hero("Black Bolt", 98, Affiliation.INHUMANS));
        manager.addHero(new Hero("Medusa", 88, Affiliation.INHUMANS));
        manager.addHero(new Hero("Karnak", 85, Affiliation.INHUMANS));
        manager.addHero(new Hero("Gorgon", 84, Affiliation.INHUMANS));
        manager.addHero(new Hero("Crystal", 86, Affiliation.INHUMANS));
        manager.addHero(new Hero("Triton", 82, Affiliation.INHUMANS));
        manager.addHero(new Hero("Lockjaw", 79, Affiliation.INHUMANS));

        // guardians of the galaxy
        manager.addHero(new Hero("Star-Lord", 85, Affiliation.GUARDIANS_OF_THE_GALAXY));
        manager.addHero(new Hero("Gamora", 90, Affiliation.GUARDIANS_OF_THE_GALAXY));
        manager.addHero(new Hero("Drax", 88, Affiliation.GUARDIANS_OF_THE_GALAXY));
        manager.addHero(new Hero("Rocket Raccoon", 83, Affiliation.GUARDIANS_OF_THE_GALAXY));
        manager.addHero(new Hero("Groot", 86, Affiliation.GUARDIANS_OF_THE_GALAXY));
        manager.addHero(new Hero("Mantis", 80, Affiliation.GUARDIANS_OF_THE_GALAXY));
        manager.addHero(new Hero("Nebula", 84, Affiliation.GUARDIANS_OF_THE_GALAXY));
        manager.addHero(new Hero("Yondu", 82, Affiliation.GUARDIANS_OF_THE_GALAXY));

        // Display original list
        System.out.println("Original List:");
        manager.displayHeroesAs2DArray();

        // Bubble Sort
        manager.bubbleSortByPower();
        System.out.println("\nAfter Bubble Sort:");
        manager.displayHeroesAs2DArray();

        // Insertion Sort
        manager.insertionSortByPower();
        System.out.println("\nAfter Insertion Sort:");
        manager.displayHeroesAs2DArray();

        // Removes a hero
        manager.removeHero("Hawkeye");
        System.out.println("\nAfter removing Hawkeye:");
        manager.displayHeroesAs2DArray();

        // Adds a new hero
        manager.addHero(new Hero("Nova", 93, Affiliation.GUARDIANS_OF_THE_GALAXY));
        System.out.println("\nAfter adding Nova:");
        manager.displayHeroesAs2DArray();
    }
}