/******************************************************************
 * Restaurant Bill Calculator                                     *
 * This program computes the tax and tip on a restaurant bill.    *
 * It prompts the user to enter the charge for the meal,          *
 * calculates the tax (6.75%) and the tip (20% of total),         *
 * and displays the breakdown along with the total bill.          *
 ******************************************************************/

import java.util.Scanner;

public class RestaurantBill {

    /**************************************************************
     * Main Method                                                *
     * Prompts the user for the meal charge, calculates the tax,  *
     * tip, and total, and displays the breakdown.                *
     **************************************************************/
    public static void main(String[] args) {

        //*********************************************************
        // Constant Declarations                                  *
        // These are fixed values representing tax and tip rates  *
        //*********************************************************
        final double TAX_RATE = 0.0675;          // 6.75% tax rate
        final double TIP_RATE = 0.20;            // 20% tip rate

        //*********************************************************
        // Variable Declarations                                  *
        // To store user input and calculated values              *
        //*********************************************************
        double mealCharge;                        // User input for the meal charge
        double taxAmount;                         // Calculated tax amount
        double tipAmount;                         // Calculated tip amount
        double totalBill;                         // Total bill amount

        //*********************************************************
        // Input Section                                          *
        // Prompting the user to enter the meal charge            *
        //*********************************************************
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter the charge for the meal: $");
        mealCharge = keyboardInput.nextDouble();

        //*********************************************************
        // Calculation Section                                    *
        // Calculate the tax, tip, and total bill                 *
        //*********************************************************
        taxAmount = mealCharge * TAX_RATE;
        tipAmount = (mealCharge + taxAmount) * TIP_RATE;
        totalBill = mealCharge + taxAmount + tipAmount;

        //*********************************************************
        // Output Section                                         *
        // Display the breakdown of costs                         *
        //*********************************************************
        System.out.println();
        System.out.printf("%-25s $%.2f\n", "Meal Charge:", mealCharge);
        System.out.printf("%-25s $%.2f\n", "Tax Amount (6.75%):", taxAmount);
        System.out.printf("%-25s $%.2f\n", "Tip Amount (20%):", tipAmount);
        System.out.printf("%-25s $%.2f\n", "Total Bill:", totalBill);

        //*********************************************************
        // Developer Credit                                       *
        //*********************************************************
        System.out.println();
        System.out.println("Developed by: Nikita Baiborodov");

        //*********************************************************
        // Resource Cleanup                                       *
        // Close the scanner to prevent resource leaks            *
        //*********************************************************
        keyboardInput.close();
        System.exit(0);
    }
}
