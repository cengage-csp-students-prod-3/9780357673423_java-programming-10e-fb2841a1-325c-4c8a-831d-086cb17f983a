package COSC_1436_summer25.Labs.Week4.Lab7;
import java.util.ArrayList;

public class HeroManager
{
    private ArrayList<Hero> heroes;

    public HeroManager()
    {
        heroes = new ArrayList<>();
    }

    // Add Hero
    public void addHero(Hero hero)
    {
        heroes.add(hero);
    }

    // Remove Hero by name
    public boolean removeHero(String name)
    {
        for (int i = 0; i < heroes.size(); i++)
        {
            if (heroes.get(i).getName().equalsIgnoreCase(name))
            {
                heroes.remove(i);
                return true;
            }
        }
        return false;
    }

    // Bubble Sort by power level
    public void bubbleSortByPower()
    {
        for (int i = 0; i < heroes.size() - 1; i++)
        {
            for (int j = 0; j < heroes.size() - i - 1; j++)
            {
                if (heroes.get(j).getPowerLevel() > heroes.get(j + 1).getPowerLevel())
                {
                    Hero temp = heroes.get(j);
                    heroes.set(j, heroes.get(j + 1));
                    heroes.set(j + 1, temp);
                }
            }
        }
    }

    // Insertion Sort by power level
    public void insertionSortByPower()
    {
        for (int i = 1; i < heroes.size(); i++)
        {
            Hero key = heroes.get(i);
            int j = i - 1;
            while (j >= 0 && heroes.get(j).getPowerLevel() > key.getPowerLevel())
            {
                heroes.set(j + 1, heroes.get(j));
                j--;
            }
            heroes.set(j + 1, key);
        }
    }

    public void displayHeroesAs2DArray()
    {
    System.out.printf("%-25s %-13s %-30s%n", "Name", "Power Level", "Affiliation");
    System.out.println("--------------------------------------------------------------------------");
    for (Hero h : heroes)
    {
        System.out.printf("%-25s %-13d %-30s%n", h.getName(), h.getPowerLevel(), h.getAffiliation());
    }
}
}