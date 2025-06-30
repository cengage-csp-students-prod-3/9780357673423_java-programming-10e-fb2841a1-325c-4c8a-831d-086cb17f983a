package COSC_1436_summer25.Labs.Week4.Lab8;

public class Bicycle extends Vehicle
{
    private boolean hasBell;

    // constructor
    public Bicycle(int speed, double fuel, boolean hasBell)
    {
        super(speed, fuel);
        this.hasBell = hasBell;
    }

    @Override    // override start
    public void start()
    {
        System.out.println("Pedal away!");
    }

    public void ringBell()   // rings bell
    {
        if (hasBell)
        {
            System.out.println("Ring Ring!");
        }
        else
        {
            System.out.println("This bike has no bell.");
        }
    }

    public boolean getHasBell()    // getter for hasBell
    {
        return hasBell;
    }

    public void setHasBell(boolean hasBell)    // setter for hasBell
    {
        this.hasBell = hasBell;
    }
}