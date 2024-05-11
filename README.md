# GAMES

# 1. CONNECT FOUR GAME

Connect Four is a classic two-player game where the objective is to be the first to form a line of four of one's own discs of the same color horizontally, vertically, or diagonally. This Java implementation of Connect Four allows players to take turns dropping colored discs into a vertically suspended grid, with the aim of forming a line of four discs.

## Features

- Dynamic and interactive game interface.
- Two-player mode.
- Error handling for invalid inputs.
- End-game detection to determine the winner or a draw.


## How to Play

- Compile the ConnectFour.java file.
- Run the compiled .class file using the Java Virtual Machine.
- Follow the on-screen prompts to drop discs into the game board.
- The first player to form a line of four discs wins the game.


## Dependencies

Java Development Kit (JDK)


## Usage

- Clone the repository to your local machine.
- Compile the ConnectFour.java file using javac ConnectFour.java.
- Run the compiled .class file using java ConnectFour.
- Follow the on-screen prompts to play the game.


## Contributions

- Contributions to improve the game or add new features are welcome. Please feel free to fork the repository and submit a pull request with your changes.


----------------------------------------------------------------------------------------------------------------------------------------------------------

# 2. GUESSING GAME


# Java Guessing Game

Welcome to the Java Guessing Game! This simple game is built in Java using the Swing library for the GUI. It challenges players to guess a randomly generated number between 0 and 100 within a limited number of attempts.

## How to Play

1. **Guess the Number**: Enter your guess into the text field provided.
2. **Submit Your Guess**: Click the "Enter" button to submit your guess.
3. **Receive Feedback**: Receive feedback on whether your guess is too high, too low, or correct.
4. **Next Round**: If your guess is correct, click the "Next" button to move to the next round.
5. **Score Tracking**: Earn points based on the number of attempts it takes to guess the correct number. Try to maximize your score!
6. **Game Over**: The game ends after 10 rounds. If your score drops below 0, the game is over.

## Features

- **GUI Interface**: User-friendly graphical interface built using the Swing library.
- **Random Number Generation**: A random number between 0 and 100 is generated for each round.
- **Score Tracking**: Points are awarded based on the number of attempts and deducted if the player exceeds 10 attempts.
- **Exit and Restart**: Options to exit the game or restart it at any time.
- **Feedback**: Receive feedback on each guess to guide your next attempt.

## Getting Started

To run the Java Guessing Game:

1. Ensure you have Java Development Kit (JDK) installed on your system.
2. Clone this repository to your local machine.
3. Open the project in your preferred Java IDE.
4. Compile and run the `GuessGame.java` file.

## Contributors

(https://github.com/daisy-py-bot) - Developer

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

----------------------------------------------------------------------------------------------------------------------------------------------------------

# 3. HANGMAN GAME

# Hangman Game

Hangman is a classic word-guessing game where players attempt to guess a hidden word letter by letter. Each incorrect guess results in part of a stick figure being drawn. The objective is to guess the word before the entire stick figure is completed, hence "hanging" the man.


## Features

Dynamic selection of words from a predefined list or command-line arguments.
Interactive gameplay with user prompts for letter guesses.
Error handling for invalid inputs.
Display of correct letters when guessed and tracking of incorrect guesses.
End-game detection to reveal the word and display the number of misses.
How to Play

Compile the Hangman.java file.
Run the compiled .class file using the Java Virtual Machine.
Follow the on-screen prompts to guess letters in the hidden word.
Guess letters one at a time until the word is revealed or the man is hanged.


## Customization

You can customize the word list by editing the wordList array in the code.
Alternatively, you can pass custom words as command-line arguments when running the program.


## Dependencies

Java Development Kit (JDK)


## Usage

Clone the repository to your local machine.
Compile the Hangman.java file using javac Hangman.java.
Run the compiled .class file using java Hangman.
Follow the on-screen prompts to play the game.


## Contributions

Contributions to improve the game or add new features are welcome. Please feel free to fork the repository and submit a pull request with your changes.


## License

- These projects are licensed under the MIT License - see the [LICENSE](LICENSE) file for details.



# 4. LUDO GAME

# Ludo Game in Python

This Python script implements a console-based version of the popular board game "Ludo". Players take turns rolling a dice and moving their pawns around the board, with the goal of reaching the destination before their opponents. The game supports two players and provides a simple yet engaging experience.

## Features

Two-Player Gameplay: Play against a friend in a turn-based format.
Randomized Dice Rolls: The dice rolls are randomized to simulate real gameplay.
Interactive Console Interface: All interactions and prompts are provided through the console.
Automatic Movement: The script handles pawn movement based on the dice rolls and game rules.
Winner Detection: The game automatically detects when a player has won and ends the game.


## How to Play

Start the Game: Run the Python script ludo_game.py.
Game Initialization: The game initializes with Player 1 starting first.
Roll the Dice: Each player takes turns rolling the dice by typing R1 (Player 1) or R2 (Player 2).
Move Pawns: Based on the dice roll, the player chooses which pawn to move.
Winning Condition: The game continues until one player successfully moves all their pawns to the destination.


## Gameplay Rules

Players must roll a 6 to move a pawn out of the starting area.
Pawns move around the board according to the number rolled on the dice.
Players cannot move their pawns to spaces occupied by their own pawns.
The first player to move all their pawns to the destination wins the game.


## Code Structure

The Python script ludo_game.py consists of the following main components:

Global Variables: Initialization of game variables and pawn positions.
Dice Rolling: Function to simulate rolling a six-sided dice.
Pawn Movement: Functions to handle pawn movement and update pawn positions.
Player Turns: Functions to prompt players for input and handle their turns.
Game Loop: The main function that orchestrates the gameplay loop until a winner is determined.


## Dependencies

Python 3.x: Ensure you have Python 3.x installed on your system to run the script.
How to Run

Clone Repository: Clone this repository to your local machine.
Navigate to Directory: Open a terminal and navigate to the directory containing ludo_game.py.
Run Script: Execute the command python ludo_game.py to start the game.
Follow On-Screen Prompts: Follow the on-screen prompts to play the game.


## Contributing

Contributions to improve the Ludo game script are welcome! If you have any ideas for new features, enhancements, or bug fixes, feel free to open an issue or submit a pull request.


## License

This project is licensed under the MIT License.