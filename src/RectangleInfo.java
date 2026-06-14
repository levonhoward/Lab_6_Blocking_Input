import java.util.Scanner;

public class RectangleInfo
{

    static void main() {
        Scanner in = new Scanner(System.in);
        String invalidInput = "";
        double width = 0.0;
        double height = 0.0;
        boolean isInputValid = false;

        // Get width value and ensure it is valid
        do
        {
            System.out.print("Enter the width of your rectangle: ");

            if (in.hasNextDouble())
            {
                isInputValid = true;
                width = in.nextDouble();
            }
            else
            {
                invalidInput = in.nextLine();
                System.out.println("Please enter a valid number, not '" + invalidInput + "'");
            }
        } while (!isInputValid);

        // Get height value and ensure it is valid
        do
        {
            System.out.print("Enter the height of your rectangle: ");

            if (in.hasNextDouble())
            {
                isInputValid = true;
                height = in.nextDouble();
            }
            else
            {
                isInputValid = false;
                invalidInput = in.nextLine();
                System.out.println("Please enter a valid number, not '" + invalidInput + "'");
            }
        } while (!isInputValid);

        // Rectangle Formulas
        // Perimeter = 2 * Width + 2 * Height
        // Area = Width * Height
        // Length of Diagonal = sqrt(Width^2 + Height^2)
        System.out.printf("With a width of %.2f and a height of %.2f, your rectangle has a perimeter of %.2f and an " +
                "area of %.2f.\n", width, height, ((2 * width) + (2 * height)), (width * height));
        System.out.printf("The length of the diagonal is %.2f.\n", Math.sqrt((width * width) + (height * height)));
    }

}
