package COSC_1436_summer25.Labs.Week4.Lab7;

public class Hero
{
    // Declares hero attributes: name, powerLevel, and affiliation
    private String name;
    private int powerLevel;
    private Affiliation affiliation;

    // Constructor to initialize name, power level, and affiliation.
    public Hero(String heroName, int heroPowerLevel, Affiliation affiliation)
    {
        this.name = heroName;
        this.powerLevel = heroPowerLevel;
        this.affiliation = affiliation;
    }

    public String getName()
    {
        return name;
    }

    public int getPowerLevel()
    {
        return powerLevel;
    }

    public Affiliation getAffiliation()
    {
        return affiliation;
    }

    @Override
    public String toString()
    {
        return "Name: " + name + ", Power Level: " + powerLevel + ", Affiliation: " + affiliation;
    }
}