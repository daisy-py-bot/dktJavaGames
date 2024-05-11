package CONNECT_FOUR;

/*A game played by dropping balls in either of the seven columns until four similar balls form
a row or column or a diagonal

What do i need?
1. A 2D array with 7 columns and 6 rows
2. A method to check whether selected row has space and validate that
3. A method to print out the status of the board (the updated board)
4. To check if there is a winner  (passing r or y to check red or yellow balls in rows colums or diagonal)

    CASES
    1. case where no player wins
    2. case where the user enters invalid input (error handling)
    3. Handle exceptions (if user enters a letter insted of a number)
    4. Check when it is game over
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConnectFour {
    public static final int MIN_CONNECTIONS = 4;
    // for formatting the board
    public static final char SLASH = '|';
    public static void main(String[] args){
        // initialize the status of the board
        char[][] board = initializeBoard();
        // print the initial empty bosboard
        dropBall(board);
    }
    

    // METHOD 1: INITIALIZE BOARD 
    public static char[][] initializeBoard(){
        // create the 2D array that represents the board 
        char[][] board = new char[6][7];
        
        // for each row
        for (int i = 0; i < board.length; i++){
            // for the columns
            for (int j = 0; j < board[i].length; j++){
                //initialize board with empty spaces
                board[i][j] = ' ';
            }
        }
        return board;
    }

    // METHOD 2: PRINT THE BOARD
    public static void printBoard(char[][] board){
        System.out.println("-------------------------");
        // loop through the rows
        for (int i = 0; i < board.length; i++){
            // loop through each column
            for (int j = 0; j < board[i].length; j++){
                // format the board
                System.out.printf("%c%1s", SLASH, board[i][j]);
            }
            System.out.print("|\n");

        }
        System.out.println("----------------------------");

    }

    // DROP BALL
    public static void dropBall(char[][] board){
        // initializing the players
        char currentPlayer = 'R';
        char previousPlayer = 'Y';
        
        // count the number of plays

        while(gameNotOver(board)){
            // print the board
            printBoard(board);
            // make a new line

            // ask the current player to choose a column to drop their ball
            selectPlayer(currentPlayer);

            // read a valid column number chosen by player
            int columnNum = validateInput();
            System.out.println(columnNum);
            
            // find an empty row for the selected column 
            int rowNum = findEmptyRow(board, columnNum);
            System.out.println(rowNum);
            
            // prompt the user to select another another if they choose a column that is already full
            while (rowNum == -1){
                System.out.println("Selected column already full. Choose another column");
                // prompt the current to select another column
                selectPlayer(currentPlayer);
                columnNum = validateInput();

                // check for an empty column again
                rowNum = findEmptyRow(board, columnNum);
            }

            // drop the ball at the selected column and empty row
            board[rowNum][columnNum] = currentPlayer;

            // exit the game if the current player wins
            if (checkWinner(board, currentPlayer)){
                break;

            }
            
            System.out.println(currentPlayer);
            // switch the players
            char temp = currentPlayer;
            currentPlayer = previousPlayer;
            previousPlayer = temp;
        }

    }

    // METHOD: PROMPT A PLAYER TO PLAY
    public static void selectPlayer(char currentPlayer){
        // response for player
        switch(currentPlayer){
            // if current player is 'R', they are dropping a red ball
            case 'R':
                System.out.print("Drop a red disk at column (0-6): ");
                break;
            // if current player is 'Y', they are dropping a yellow ball
            case 'Y':
                System.out.print("Drop a yellow disk at column (0-6): ");
                break;
                
        }
    }

    // METHOD: HANDLE EXCEPTIONS
    public static int validateInput(){
        Scanner input = new Scanner(System.in);
        int columnNum;

        while(true){
            try{
                // attempt to read an integer from the user
                columnNum = input.nextInt();

                // check if the integer is between 0 and 6
                if (columnNum < 0 || columnNum > 6){
                    throw new IllegalArgumentException("Number should be between 0 and 6");
                    
                }
                break;
            }
            catch(InputMismatchException e){
                System.out.println("Invalid input: " + e.getMessage());
                System.out.println("Enter an integer number between 0 and 6");

                // get rid of the invalid loop to avoid an infite loo
                input.nextLine();
            } 
            catch(IllegalArgumentException e){
                System.out.print("Invalid input: " + e.getMessage());
                System.out.println("Enter an integer number between 0 and 6");
            }          

        }
        return columnNum;  
        
    }

    // METHOD: CHECK THE AVAILABLE ROW FOR THE SELECTED COLUMN
    public static int findEmptyRow(char[][] board, int columnNum){
        // initialize the empty row number 
        int emptyRowNum = -1;
        // get number of rows
        int numRows = board.length;
        // go through the rows
        for (int i = 0; i < numRows; i++){
            // count from the bottom row and check for an empty space
            if (board[numRows - 1 - i][columnNum] == ' '){
                emptyRowNum = numRows - 1 - i;
                // return the row number that is free for a given column
                return emptyRowNum;
            }

        }
        // else if the selected column is full, return -1
        return emptyRowNum;
    }
    // METHOD : CHECK ROWS FOR A WINNER
    public static boolean checkRows(char [][] board, char ball){
        
        // loop through each row
        for (int i = 0; i < board.length; i++){
            // check if four similar balls connect in a single row
            int connectNum = 0;
            // loop through the row
            for (int j = 0; j < board[i].length; j++){

                // check if the ball is similar to the ball at the given index
                if (ball == board[i][j]){
                    // increment the count if the ball is similar to the ball at given index position
                    connectNum++;

                    // check if we have 4 balls in a row
                    if (connectNum == 4){
                        // if four balls connect, return true
                        return true;
                    }
                }
                else{
                    // if there is another opposite ball reset the count to 0
                    connectNum = 0; 
                    // restart counting
                }

            }

        }


        return false;
    }
    // METHOD: CHECK COLUMNS FOR WINNER
    public static boolean checkColumns(char[][] board, char ball){
        // count the number of balls that connect
        int count = 0;
        // loop through each columns
        for (int col = 0; col < board[0].length; col++){
            // check any four balls that connect in each column 
            // for each column, go through each row
            
            for (int row = 0; row < board.length; row++){
                if (board[row][col] == ball){
                    // if similar balls are consecutive, increment count
                    count++; 
                    if (count == 4){
                        // if there are 4 similar balls consecutive, return true
                        return true;
                    }
                    

                }
                else{
                    count = 0;
                    // reset count to 0 if there is a desimilar ball
                }
            }

        }
        // else if there are no consecutive similar balls on the columns, return false
        return false;
    }


    // METHOD: CHECK RIGHT DIAGONALS
    // method for iterating through the diagonals for the rows and columns
    public static boolean checkDiagonals(char[][] board, char ball){

        // iterate through all the rows
        for(int row = 0; row < board.length; row++){

            // iterate through all the columns
            for(int col = 0; col < board[row].length; col++){

                // check for a single diagonal
                if (checkRightDiagonal(board, ball, col, row) || checkLeftDiagonals(board, ball, col, row)){
                    // this condition can only be executed if a diagonal has been found
                    return true;
                }
                else{
                    continue;
                }
            }
            
        }

        return false;
    }


    // METHOD: CHECK A SINGLE DIAGONAL
    // method for iterating a single diagonal
    public static boolean checkRightDiagonal(char[][] board, char ball, int startColNum, int startRowNum){
        // initialize the counter for balls that connect
        int connectNum = 0;

        // iterate through the diagonal
        while(startColNum < board[0].length && startRowNum < board.length){
            // check if the balls connect
            if (ball == board[startRowNum][startColNum]){
                // increment the number of balls that connect
                connectNum++;
                // check if there are four connections that have been made
                if (connectNum == MIN_CONNECTIONS){
                    return true;
                }
            }
            // else if the balls do not connect, reset the count (connectNum)
            else{
                connectNum = 0;
            }
            // increment column number and row number
            startColNum++;
            startRowNum++;
        }

        // if no diagonal has 4 balls that connect, return false
        return false;
    }

    // METHOD: CHECK LEFT DIAGONALS
    public static boolean checkLeftDiagonals(char[][] board, char ball, int startColNum, int startRowNum){
        // initialize the counter for balls that connect
        int connectNum = 0;

        // iterate through the diagonal in a left slant
        while(startColNum >= 0 && startRowNum < board.length){
            // check if the balls connect
            if (ball == board[startRowNum][startColNum]){
                // increment the number of balls that connect
                connectNum++;
                // check if there are four connections that have been made
                if (connectNum == MIN_CONNECTIONS){
                    return true;
                }
            }
            // else if the balls do not connect, reset the count (connectNum)
            else{
                connectNum = 0;
            }
            // decrement column number and row number
            startColNum--;

            // increment the row number
            startRowNum++;
        }

        return false;
    }


    // check for a winner
    public static boolean checkWinner(char [][] board, char ball){
        boolean result = (checkColumns(board, ball) || checkRows(board, ball) || checkDiagonals(board, ball));
        // if only there is a winner, display a message
        if (result){
            // display the board
            printBoard(board);

            // check which player has won
            if (ball == 'R'){
                System.out.println("The red player has won");
            }
            else{
                System.out.println("The yellow player has won");
            }
        }

        return result;

         
    }
    public static boolean gameNotOver(char[][] board){
        // check of there is no empty space anywhere
        // iterate through the row
        for (int row = 0; row < board.length; row++){
            // iterate through each column
            for (int col = 0; col < board[0].length; col++){
                if (board[row][col] == ' '){
                    // if there is an empty space anywhere, then the game is not over
                    return true; // if the game is not over
                }
                
            }

        }
        return false;// no empty space anywhere
    }
}
