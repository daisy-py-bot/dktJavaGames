
import java.util.Random;
import java.util.Scanner;

/**
 * This is a guessing game that allows the player to guess a whole number between 1 and 100
 * The player is given hints if their guess is high or low
 * The player continues to guess till they make the correct guess
 */
public class GuessingGame {
    /**
     * This main method prompts the player for a new guess 
     * The number of trials are also counted
     * @param args does not take an arguments from the command line
     */
    public static void main (String[] args){
        Random random = new Random(5);
        int randomValue = random.nextInt(100) + 1;

        System.out.println("I'm thinking of a whole number between 1 and 100. Can you guess it?\nGuess: ");
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();

        // count the number if trials the user makes before they make the correct guess
        int count = 1;

        while (guess != randomValue){
            if (guess < randomValue){
                System.out.println("Good try, but that's is too low. Try again");
                guess = input.nextInt();

            }
            else if (guess > randomValue){
                System.out.println("Good try, but that's is too high. Try again");
                guess = input.nextInt();
            }
            count++;
        }
        System.out.println("Yes! You guessed correctly after" + count + "tries! Congratulations");  
    }
    
}
