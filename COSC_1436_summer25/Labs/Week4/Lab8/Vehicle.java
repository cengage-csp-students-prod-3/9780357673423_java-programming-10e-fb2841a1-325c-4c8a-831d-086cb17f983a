package COSC_1436_summer25.Labs.Week4.Lab8;

public class Vehicle
{
    protected int speed;       // accessible to subclasses
    private double fuel;       // only accessible within Vehicle

    // constructor
    public Vehicle(int speed, double fuel)
    {
        this.speed = speed;
        this.fuel = fuel;
    }

    public void start()    // start the vehicle (will be overridden in subclasses)
    {
        System.out.println("The vehicle has started.");
    }

    public void stop()    // stop the vehicle
    {
        System.out.println("The vehicle has stopped.");
    }

    public final void displayFuel()    // final to display fuel level
    {
        System.out.println("Fuel level: " + fuel + " liters");
    }

    public int getSpeed()    // getter for speed
    {
        return speed;
    }

    public void setSpeed(int speed)    // setter for speed
    {
        this.speed = speed;
    }

    public double getFuel()    // getter for fuel
    {
        return fuel;
    }

    public void setFuel(double fuel)    // setter for fuel
    {
        this.fuel = fuel;
    }
}