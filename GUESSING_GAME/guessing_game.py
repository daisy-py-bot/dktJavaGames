'''
This program picks a number at random, does not disclose the number to the user, 
but allows the user to try to guess the chosen number, giving feedback such as “too high” 
or “too low” for each guess the user makes, until they guess the correct number.
'''


from random import *

def guess_game():
    # counts the number of tries the user makes before making the correct guess
    count = 1 
    seed(20)
    randomNumber = randint(1, 100)

    print("I'm thinking of a number between 1 and 100. Can you guess?")
    guess = int(input("Guess: "))

    while guess != randomNumber:
        if guess < randomNumber:
            print("Good try, but that's is too low. Try again")

        else:
            print("Good try, but that is too high. Try again")

        guess = int(input("Guess: "))
        count += 1

    print(f"Yes! You guessed correctly after {count} trial(s)! Congratulations!!")

guess_game()


