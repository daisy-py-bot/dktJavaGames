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