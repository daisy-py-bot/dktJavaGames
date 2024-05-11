

from random import *

# 1. Declaring and initializing global variables
global pawnsInHome
global pawnsOutOfHome
global pawnsAtDestination
global player1
global player2
global maxNumOfSteps
maxNumOfSteps = 56


pawnsInHome = ['P1_pawn1', 'P1_pawn2', 'P1_pawn3', 'P1_pawn4', 'P2_pawn1', 'P2_pawn2', 'P2_pawn3', 'P2_pawn4']
pawnsOutOfHome = []
pawnsAtDestination = []

# this helps us keep track of the number of steps taken by each pawn
player1 = {'P1_pawn1': 0, 'P1_pawn2': 0, 'P1_pawn3': 0, 'P1_pawn4': 0}
player2 = {'P2_pawn1': 0, 'P2_pawn2': 0, 'P2_pawn3': 0, 'P2_pawn4': 0}


# 2. Rolling the dice
def rollDice():
    return randint(1, 6)


# 3. Adding the number of steps for pawn
def addSteps(player, pawn, numSteps):
    player[pawn] = player[pawn] + numSteps
    return player


# 4. Checking for winner.
def checkWinner(player):
    for pawn in player:
        if player[pawn] == maxNumOfSteps and player[pawn] not in pawnsAtDestination:
            pawnsAtDestination.append(pawn)
    for pawn in player:
        if pawn not in pawnsAtDestination:
            return False
    return True

# 5. Checking if the pawn can be moved. Returns a list of movable pawns for each player
def movable_Pawns(player, numOnDice):
    movablePawns = []
    if numOnDice != 6:
        for pawn in player:
            if pawn not in pawnsInHome and numOnDice <= (maxNumOfSteps - player[pawn]):
                movablePawns.append(pawn)
    elif numOnDice == 6:
        for pawn in player:
            if numOnDice <= (maxNumOfSteps - player[pawn]):
                movablePawns.append(pawn)  # this means if the number of steps is 56(arrived at the destination), it cannot move
    return movablePawns


# 6. Decides how the pawn moves
def movePawn(pawn, player, num):
    if pawn in pawnsInHome:
        pawnIndex = pawnsInHome.index(pawn)
        pawnsOutOfHome.append(pawnsInHome.pop(pawnIndex))
        print('Pawn out home😃')
    else:
        addSteps(player, pawn, num)
    return 1

# 7. Plays for the current player
def currentPlayer(player, playerPawns, num):
    movable_pawns = movable_Pawns(player, num)
    numOfMovablePawns = len(movable_pawns)

    if numOfMovablePawns == 0:
        print('You have no movable pawns🫥')

    elif numOfMovablePawns == 1:
        movePawn(movable_pawns[0], player, num)

    else:
        validInput = ['P1', 'P2', 'P3', 'P4']
        selectPawn = input('Select the pawn you want to move (P1, P2, P3, P4)>>')
        while selectPawn not in validInput:
            selectPawn = input('Invalid input. Please, enter P1, P2, P3, or  P4)>>')
        while playerPawns[selectPawn] not in movable_pawns:
            print(f'Pawn selected is not movable. These are the only movable pawns you have: {movable_pawns}')
            selectPawn = input('Select a movable pawn>>')
            while selectPawn not in validInput:
                selectPawn = input('Invalid input. Please, enter P1, P2, P3, or  P4)>>')

        movePawn(playerPawns[selectPawn], player, num)


# 8. Prompt player 1 for input
def firstPlayer():
    myPawns = {'P1': 'P1_pawn1', 'P2': 'P1_pawn2', 'P3': 'P1_pawn3', 'P4': 'P1_pawn4'}
    stepsLeftForPawn = {'P1': (maxNumOfSteps - player1['P1_pawn1']), 'P2': (maxNumOfSteps - player1['P1_pawn2']), 'P3': (maxNumOfSteps - player1['P1_pawn3']), 'P4': (maxNumOfSteps - player1['P1_pawn4'])}
    print(f'\nPLAYER 1>>>Number of steps left for each pawn: {stepsLeftForPawn}\n...............................')

    p1 = input('Player 1 please roll by typing R1: ')
    while p1 != 'R1':
        p1 = input('Wrong input Player 1. Please roll by typing R1: ')

    num = rollDice()
    print(f'Player 1 got a {num}.', end=' ')

    currentPlayer(player1, myPawns, num)

    if num == 6:
        return 1  # this calls for a replay
    else:
        return 0  # this calls for the next player

# 9. Prompt the second player for input
def secondPlayer():
    myPawns = {'P1': 'P2_pawn1', 'P2': 'P2_pawn2', 'P3': 'P2_pawn3', 'P4': 'P2_pawn4'}
    stepsLeftForPawn = {'P1': (maxNumOfSteps - player2['P2_pawn1']), 'P2': (maxNumOfSteps - player2['P2_pawn2']), 'P3': (maxNumOfSteps - player2['P2_pawn3']), 'P4': (maxNumOfSteps - player2['P2_pawn4'])}
    print(f'\nPLAYER 2>>>Number of steps left: {stepsLeftForPawn}\n...............................')

    p2 = input('Player 2 please roll by typing R2: ')
    while p2 != 'R2':
        p2 = input('Wrong input Player 2. Please roll by typing R2: ')

    num = rollDice()
    print(f'Player 2 got a {num}.', end=' ')
    currentPlayer(player2, myPawns, num)
    if num == 6:
        return 1  # this calls for a replay
    else:
        return 0  # this calls for the next player


def mainLudoGame():
    start = input('Press Enter to start the game>>>>')
    if start == '':
        print('WELCOME TO LUDO GAME VERSION 2: THE FIRST PLAYER WILL START>>\n__________\n')

    playGame = True

    while playGame == True:
        playerOne = firstPlayer()
        while playerOne == 1:
            print('Player 1 will replay\n________________', end=' ')
            playerOne = firstPlayer()

        if checkWinner(player1) == True:
            print('Player 1 wins!!🥳🥳🥳🥳🥳🥳🥳🥳\nGame Game over')
            playGame = False
        else:
            playerTwo = secondPlayer()
            while playerTwo == 1:
                print('Player 2 will replay\n_______________', end=' ')
                playerTwo = secondPlayer()

            if checkWinner(player2) == True:
                print('Player 2 wins!🥳🥳🥳🥳🥳🥳🥳🥳\nGame over')
                playGame = False

mainLudoGame()
