import java.util.Random;
import java.util.Scanner;

public class HighorLow
{

    static void main()
    {
        final int MIN_GUESS = 1;
        final int MAX_GUESS = 10;

        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        boolean isInputValid = false;
        String invalidInput = "";
        int guess = 0;
        int numToGuess = rnd.nextInt(MAX_GUESS) + MIN_GUESS;

        do
        {
            System.out.print("Guess my integer (1-10, inclusive): ");

            if (in.hasNextInt())
            {
                guess = in.nextInt();
                if (guess >= MIN_GUESS && guess <= MAX_GUESS)
                {
                    isInputValid = true;
                }
                else
                {
                    System.out.println("Make sure your integer is between 1 and 10, inclusive.");
                }
            }
            else
            {
                invalidInput = in.nextLine();
                System.out.println("Please enter a valid integer.");
            }
        } while (!isInputValid);

        System.out.printf("My number was %d!\n", numToGuess);
        if (guess < numToGuess)
        {
            System.out.println("You were too low.");
        }
        else if (guess > numToGuess)
        {
            System.out.println("You were too high.");
        }
        else
        {
            System.out.println("You were right on the money!");
        }
    }

}
