/*
    STEPS
 1. Keep gueesing words in a list OR take the words from the command line
 2. Prompt the user to guess one letter at a time (order does not matter)
 3. Tell the user// when they enter a wrong guess
 4. Keep track of the number of misses
 5. Display actual letter when user guess is correct
 6. When user finishes, display number of misses
 7. Ask user whether they want to play again
 # Are we looking at capitalization?
 */

import java.util.Arrays;
import java.util.Scanner;

public class Hangman{
    public static void main (String[] args){
        // allow user to enter input
        Scanner input = new Scanner(System.in);
        // set the default list of words to be randomly picked
        String [] wordList = {"write", "that", "program", "object" };

        // check for input from the command line
        if (args.length != 0){
            // if the user passes in arguments from the command line, then use those words to create wordList
            wordList = args;
        }
        // play the game
        playGame(wordList);

        // ask user if they want to play again
        System.out.println("Do you want to guess another word? Enter y or n > ");
        char response = input.next().charAt(0);
        
        // if the user wants to play again, call the play function
        while (response == 'y'){
            playGame(wordList);
            System.out.println("Do you want to guess another word? Enter y or n > ");
            response = input.next().charAt(0);
        }
        // else if the user does not want to play, exit the game
        System.out.println("See you next time!");
        System.exit(0);

    }
    // METHOD 1: PLAY GAME
    public static void playGame(String [] wordList){
        // randomly select the word to be guessed
        String word = selectWord(wordList);

        // print word guessed
        System.out.println(word);
        // prompt the user to make guesses
        guessLetter(word);
        
    }

    // METHOD 2: RANDOMLY SELECT A WORD FOR THE USER TO GUESS 
    public static String selectWord(String[] words){
        // get the number of words in the array 
        int numWords = words.length;

        // get the random index of the word
        int randomIndex = (int) (Math.random() * numWords);

        // return the random word
        return words[randomIndex];
    }

    // METHOD 3: PROMPT THE USER TO MAKE GUESSES
    public static void guessLetter(String guessWord){
        // read input from the terminal
        Scanner input = new Scanner(System.in);

        // get the number of letters in the word to be guessed
        int numChars = guessWord.length();

        // create an array that stores correctly guessed characters
        // inialize every char to a * until the user makes a correct guess
        char [] correctGuesses = new char[numChars];
        for (int i = 0; i < numChars; i++){
            correctGuesses[i] = '*';
        }

        // make an array that of chars of the original word to be guessed
        char [] originalWord = new char[numChars];
        for (int i = 0; i < numChars; i++){
            originalWord[i] = guessWord.charAt(i);
        }
        // make an array of chars that updates when the letter of the guessWord have been picked up
        // this makes sure that we get the character even if it has duplicates
        char[] updateGuessWord = new char[numChars];
        for (int i = 0; i < numChars; i++){
            updateGuessWord[i] = guessWord.charAt(i);
        }

        // count the number of incorrect guesses
        int numMisses = 0;
        // prompt the user to enter a guess until they get the word correct
        while (true){
            // ask the user to enter a guess
            System.out.print("(Guess) Enter a letter in the word: ");
            System.out.print(correctGuesses);
            System.out.print(" > ");
           

            // read the letter as a string from command line and convert to a character
            String s = input.next();
            char letter = s.charAt(0);
            

            // check if the character is part of the word
            int charIndex = charInWord(updateGuessWord, letter);

            // if character is in the remaining letter to be guessed
            if (charIndex != -1){
                // if charIndex is not -1, then the character guessed is correct

                //update the array with correct guesses
                correctGuesses[charIndex] = originalWord[charIndex];

                // remove the character correctly guessed from updateGuessWord by changing the character hold hold '0'
                updateGuessWord[charIndex] = '0';
            }
            // if character is not in the word
            else{

                // check if the character has already been guessed
                int charIndexInOriginalWord = charInWord(originalWord, letter);
                if (charIndexInOriginalWord != -1){
                    // if character is in the original word, then tell the user that they have already guessed it
                    System.out.printf("%c is already in the word\n", letter);
                }
                else{ 
                    // the character is not in the original word
                    // increment the number of misses
                    numMisses++;
                    // tell the user that the letter does not exist in the word
                    System.out.printf("%c is not in the word\n", letter);
                }

            }
            System.out.println(correctGuesses);
            System.out.println(originalWord);
            // check if the user has completely guessed all the letter
            // compare the original array with array of correct guesses
            if (Arrays.equals(correctGuesses, originalWord)){
                System.out.printf("The word is %s. You missed %d times\n", guessWord, numMisses);
                break;
            }
            // print a new line
            System.out.println();


        }
    }

    // METHOD 4: SEARCH FOR A CHARACTER IN AN ARRAY OF CHARACTERS 
    public static int charInWord(char[] word, char character){
        for (int i = 0; i < word.length; i++){
            if (character == word[i]){
                // return index position for character if found in the word
                // what if there are two similar characters?
                return i; 
            }
        }
        // return -1 if the character is not found
        return -1;
    }
    // METHOD 4: PRINT ARRAY IN A STRING FORMAT
    public static void printArrayToString(char word){

    }

    
 }


