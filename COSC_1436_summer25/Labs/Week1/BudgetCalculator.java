// This creates a new class named BudgetCalculationProject.
public class BudgetCalculator
{
    // This defines the main method and is the beginning of the program.
    public static void main(String [] args)
    {
        // The below will declare constants to be used for calculations.
        // Declares the monthly salary.
        final double SALARY = 3000;
        // Declares the percentage of salary to be saved.
        final double SAVINGS_PERCENT = 0.2;
        // Declares the percentage of salary allocated to rent.
        final double RENT_PERCENT = 0.3;
        // Declares the percentage of salary allocated to groceries.
        final double  GROCERIES_PERCENT = .15;
        // Declares the percentage of salary allocated to entertainment.
        final double ENTERTAINMENT_PERCENT = .1;

        // The below will calculate the amounts with the provided salary and percents given.
        // Stores the monthly salary in a variable.
        double monthlySalary = SALARY;
        // Calculates the amount saved from the salary.
        double savedAmount = SALARY * SAVINGS_PERCENT;
        // Calculates the amount spent on rent.
        double rentAmount = SALARY * RENT_PERCENT;
        // Calculates the amount spent on groceries.
        double groceriesAmount = SALARY * GROCERIES_PERCENT;
        // Calculates the amount spent on entertainment.
        double entertainmentAmount = SALARY * ENTERTAINMENT_PERCENT;
        // Calculates the total of expenses.
        double totalExpenses = rentAmount + groceriesAmount + entertainmentAmount;
        // Calculates the remaining balance after expenses.
        double remainingBalance = SALARY - totalExpenses;

        // The below will display the calculation's results.
        // Displays the monthly salary.
        System.out.println("Monthly Salary: $" + monthlySalary);
        // Displays the amount saved.
        System.out.println("Amount Saved: $" + savedAmount);
        // Displays the amount spent on rent.
        System.out.println("Amount spent on rent: $" + rentAmount);
        // Displays the amount spent on groceries.
        System.out.println("Amount spent on groceries: $" + groceriesAmount);
        // Displays the amount spent on entertainment.
        System.out.println("Amount spent on entertainment: $" + entertainmentAmount);
        // Displays the total expenses.
        System.out.println("Total Expenses: $" + totalExpenses);
        // Displays the remaining balance.
        System.out.println("Remaining Balance: $" + remainingBalance);
    }
}