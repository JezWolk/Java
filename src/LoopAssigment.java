
import java.util.Scanner;
/**
 * @info Program that calculates the payment schedule based on user input
 * @author Jeremiah Wolkiewicz
 * @version 09/27/2022
 */
public class LoopAssigment {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double initial;
        double month_pay;
        double rate;
        Scanner input = new Scanner(System.in);
        System.out.println("How much money did you borrow: ");
        initial = input.nextDouble();
//While statements determining whether there is a valid number
        while (initial < 0) {
            System.out.println("Not valid input, how much money did you borrow: ");
            initial = input.nextDouble();
        }
        System.out.println("What is the montly payment amount: ");
        month_pay = input.nextDouble();
// Checks if monthly pay is less then the initial value and then makes the user re-enter a valid input
        while (month_pay < 0 && month_pay < initial) {
            System.out.println("Not valid input, what is the montly payment amount: ");
            month_pay = input.nextDouble();
        }

        System.out.println("What interest rate pecentage would you like to pay: ");
        rate = input.nextDouble();
// Checks if the interest rate is less then 0 and then makes the user re-enter a valid input
        while (rate < 0) {
            System.out.println("Not valid input, what interest rate pecentage would you like to pay: ");
            rate = input.nextDouble();
        }
// MATH CALCULATIONS
        rate = rate/100;
        double month = 1;
        double remaining = 1;
        System.out.println("Month\t\tInitial Amount\t\tInterest\tPrinicpal Paid\t\tAmount Remaining");
        while (remaining > 0) {
            double interest = rate/12 * initial;
            double princ_paid = month_pay-interest;
            remaining = initial - princ_paid;
            if (remaining < 0) {
                remaining = 0;
            }
// PRINTS OUT FINAL RESULT
            System.out.format("%3.0f",month);
            System.out.format("%21.0f",initial);
            System.out.format("%21.0f",interest);
            System.out.format("%20.0f",princ_paid);
            System.out.format("%25.0f\n",remaining);
            month += 1;
            initial = remaining;
        }
    }
}