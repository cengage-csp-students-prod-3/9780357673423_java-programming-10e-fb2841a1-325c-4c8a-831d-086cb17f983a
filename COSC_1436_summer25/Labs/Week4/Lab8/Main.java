package COSC_1436_summer25.Labs.Week4.Lab8;

public class Main
{
    public static void main(String[] args)
    {
        // Car object
        Car myCar = new Car(80, 12.5, 4);
        myCar.start();
        myCar.displayFuel();
        // (uncomment the below to test access)
        // System.out.println(myCar.speed + " mph");         // Is accessible. This should work.
        myCar.honk();
        
        // some space for seperation
        System.out.println();

        // Bicycle object
        Bicycle myBike = new Bicycle(15, 0.0, true);
        myBike.start();
        myBike.displayFuel();
        myBike.ringBell();

        // (uncomment the below to test access)
        // System.out.println(myCar.fuel);          // NOT accessible This should error out.
        // System.out.println(myBike.hasBell);      // NOT accessible. This should error out.
    }
}