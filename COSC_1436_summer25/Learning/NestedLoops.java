package Learning;

public class NestedLoops
{
    //// this is the original thet prints out a x5 multiplication table
    // public static void main(String[] args) {
    //     for (int row = 1; row <= 3; row++) {
    //         for (int col = 1; col <= 4; col++) {
    //             System.out.print("(" + row + ", " + col + ") ");
    //         }
    //         System.out.println(); // move to the next line after each row
    //     }
    // }

    // this prints out steps like mario blocks on their side
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // move to the next line after each row
        }
    }
}