import java.util.Scanner;

public class CtoFConverter
{

    static void main()
    {
        // Fahrenheit = (Celsius * 1.8) + 32
        final double CELSIUS_CONVERSION_MULTIPLIER = 1.8;
        final int CELSIUS_CONVERSION_OFFSET = 32;

        Scanner in = new Scanner(System.in);
        String invalidInput = "";
        double celsius = 0.0;
        double fahrenheit = 0.0;
        boolean isInputValid = false;

        do
        {
            System.out.print("Enter a temperature in Celsius to convert to Fahrenheit: ");

            if (in.hasNextDouble())
            {
                isInputValid = true;
                celsius = in.nextDouble();
                fahrenheit = (celsius * CELSIUS_CONVERSION_MULTIPLIER) + CELSIUS_CONVERSION_OFFSET;
                System.out.printf("%.2f degrees Celsius is %.2f degrees Fahrenheit.", celsius, fahrenheit);
            }
            else
            {
                invalidInput = in.nextLine();
                System.out.println("Please enter a valid number, not '" + invalidInput + "'");
            }
        } while (!isInputValid);
    }

}
