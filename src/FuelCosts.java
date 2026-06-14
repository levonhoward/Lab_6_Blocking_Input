import java.util.Scanner;

public class FuelCosts
{
    static void main() {
        Scanner in = new Scanner(System.in);
        String invalidInput = "";
        double gallonsInTank = 0.0;
        double milesPerGallon = 0.0;
        double pricePerGallon = 0.00;
        boolean isInputValid = false;

        // Get gallonsInTank value and ensure it is valid
        do
        {
            System.out.print("How many gallons of gas are in your tank? ");

            if (in.hasNextDouble())
            {
                isInputValid = true;
                gallonsInTank = in.nextDouble();
            }
            else
            {
                invalidInput = in.nextLine();
                System.out.println("Please enter a valid number.");
            }
        } while (!isInputValid);

        // Get milesPerGallon value and ensure it is valid
        do
        {
            System.out.print("How many miles can your vehicle go per gallon of gas? ");

            if (in.hasNextDouble())
            {
                isInputValid = true;
                milesPerGallon = in.nextDouble();
            }
            else
            {
                isInputValid = false;
                invalidInput = in.nextLine();
                System.out.println("Please enter a valid number.");
            }
        } while (!isInputValid);

        // Get pricePerGallon value and ensure it is valid
        do
        {
            System.out.print("How much does gas cost you per gallon? ");

            if (in.hasNextDouble())
            {
                isInputValid = true;
                pricePerGallon = in.nextDouble();
            }
            else
            {
                isInputValid = false;
                invalidInput = in.nextLine();
                System.out.println("Please enter a valid number.");
            }
        } while (!isInputValid);

        System.out.printf("With a fuel efficiency of %.2f miles per gallon and gas prices at $%.2f per gallon, it will " +
                "cost you $%.2f to drive 100 miles. \n", milesPerGallon, pricePerGallon, ((100 / milesPerGallon) * pricePerGallon));
        System.out.printf("With a full tank at %.2f gallons and a fuel efficiency of %.2f miles per gallon, you can " +
                "travel up to %.2f miles.\n", gallonsInTank, milesPerGallon, (milesPerGallon * gallonsInTank));
    }
}
