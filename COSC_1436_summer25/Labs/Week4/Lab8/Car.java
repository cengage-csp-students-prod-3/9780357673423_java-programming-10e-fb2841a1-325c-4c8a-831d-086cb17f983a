package COSC_1436_summer25.Labs.Week4.Lab8;

public class Car extends Vehicle
{
    private int numberOfDoors;

    // constructor
    public Car(int speed, double fuel, int numberOfDoors)
    {
        super(speed, fuel);
        this.numberOfDoors = numberOfDoors;
    }

    @Override    // overrides start method
    public void start()
    {
        System.out.println("The car has started.");
    }

    public void honk()
    {
        System.out.println("Beep Beep!");    // honks
    }

    public int getNumberOfDoors() // getter for numberOfDoors
    {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors)    // setter for numberOfDoors
    {
        this.numberOfDoors = numberOfDoors;
    }
}