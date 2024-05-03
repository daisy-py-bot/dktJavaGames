import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.*;
import java.util.Random;

/**
 * create a class for the frame which extends from the JFrame 
 * and implements the ActionListener interface
 */
public class GuessGame extends JFrame implements ActionListener{

    public static void main(String[] args){
        // create an instance of the frame
        new GuessGame();
        
    }


    public static int randomNumGenerated = 0; // the number from the random generator
    public static int totalScore; // displays the total score (if score goes below 0, the game is over)
    public static int pointsEarned; // will be the same as the trials left (you can earn negative points for guessing more than 10 times per each guess)
    public static final int MAX_POINTS_PER_GUESS = 10;
    public static final int MAX_NUM_OF_PLAYS = 10;
    public static int countPlays = 0;
    public static int numOfTrialLeft = 10; // initializ the trials left at 10

    // declare the variable names for panel obejects

    JPanel panel1;
    JPanel panel2;
    JPanel panel3;
    JPanel panel4;
    JPanel panel5; 
    JPanel panel6;


    // declare the variable names for button objects

    JButton enterButton;
    JButton nextButton;
    JButton exitButton;
    JButton restartButton;


    // declare the variable names for progress bar objects
    JProgressBar pBar;


    // declare the variable name for textfield
    JTextField textBox1;
    JTextField comment;

    JOptionPane paneMessage;


    // constructor for the frame
    public GuessGame(){
        // UIManager.put("ProgressBar.background", Color.WHITE); // Set background color
        // UIManager.put("ProgressBar.foreground", Color.GREEN); // Set foreground color


        
        // create the buttons

        enterButton = new JButton();
        nextButton = new JButton();
        exitButton = new JButton();
        restartButton = new JButton();

        


        // create the panel objects

        // PANEL 1: Progress Bar

        panel1 = new JPanel();
        panel1.setBounds(90, 100, 1500, 100);
        panel1.setBackground(Color.WHITE); // set the background color of the panel
        panel1.setLayout(null);
        

        JLabel progressLabel = new JLabel();
        progressLabel.setText("Progress report: ");
        progressLabel.setForeground(Color.DARK_GRAY);
        progressLabel.setBounds(100, 15, 500, 70);
        progressLabel.setFont(new Font("Serif", Font.BOLD, 32)); // set the font style and size
        progressLabel.setVisible(true);

        pBar = new JProgressBar(); // create the progress bar
        //pBar.setBackground(Color.WHITE);
        pBar.setBounds(500, 15, 800, 80);
        pBar.setStringPainted(true); // add the percentage value to the progress bar
        pBar.setValue(0); // set the initial value of the progress bar
        pBar.setFont(new Font("MV Boli", Font.BOLD, 14)); // set the font style for the string value of progress report bar
        //pBar.setForeground(Color.green); // set the color of the bar
        pBar.setVisible(true);

        panel1.add(progressLabel); // add the progress report label
        panel1.add(pBar); // add the progress report label to the panel
        panel1.setVisible(true); // make the panel visible
        


        // PANEL 2 : Question

        panel2 = new JPanel();
        panel2.setBounds(90, 200, 1500, 100); // set the bounds of panel 2
        panel2.setBackground(Color.DARK_GRAY); // set the background color of panel 2
        

        JLabel qnLabel = new JLabel();
        qnLabel.setText("What number am I thinking of?");
        qnLabel.setVerticalTextPosition(JLabel.CENTER);
        qnLabel.setFont(new Font("Serif", Font.BOLD, 45)); // set the font style and size
        qnLabel.setForeground(Color.WHITE); // set the color of the text for question label
        qnLabel.setVisible(true);

        // Create an EmptyBorder with padding (top, left, bottom, right)
        Border paddingBorder = BorderFactory.createEmptyBorder(20, 10, 10, 10);
        qnLabel.setBorder(paddingBorder); // Add padding to the label
        
        panel2.add(qnLabel); // add the question label to the panel 2
        panel2.setVisible(true);




        // PANEL 3: Prompt player for the guess

        panel3 = new JPanel();
        panel3.setBounds(90, 300, 1500, 100);
        panel3.setBackground(Color.DARK_GRAY);
        panel3.setLayout(null);
        

        // add the label with "make a guess"

        JLabel guessLabel = new JLabel();
        guessLabel.setText("Make a guess: ");
        guessLabel.setBounds(600, 15, 350, 70);
        guessLabel.setFont(new Font("Serif", Font.BOLD, 32)); // set the font style and size
        guessLabel.setForeground(new Color(0,0,0)); // set the color of the text for question label
        guessLabel.setVisible(true);

        // create a textfield for entering the answer
        textBox1 = new JTextField(); // create a new text entry
        textBox1.setBackground(Color.GRAY); // set the background color of the textfield
        textBox1.setBounds(800, 15, 100, 70); // set the size and position of the textfield
        textBox1.setForeground(Color.WHITE); // set the text color
        textBox1.setFont(new Font("MV Boli", Font.PLAIN, 25));
        textBox1.setVisible(true);

        panel3.add(guessLabel); // add the question label to the panel 2
        panel3.add(textBox1); // add the textfield to the panel
        panel3.setVisible(true);




        // PANEL 4: Submit your answwer

        panel4 = new JPanel();
        panel4.setBounds(90, 400, 1500, 100);
        panel4.setBackground(Color.DARK_GRAY);
        panel4.setLayout(null);
        
        // create the enter and next button
        enterButton = new JButton("Enter");
        enterButton.setBackground(Color.green);
        enterButton.setForeground(Color.green);
        enterButton.setBounds(500, 0, 200, 90);
        enterButton.setFont(new Font("MV Boli", Font.PLAIN, 25));
        enterButton.addActionListener(this); // add an event lister when clicked

        nextButton = new JButton("Next");
        nextButton.setBackground(Color.GRAY);
        nextButton.setBounds(800, 0, 200, 90);
        nextButton.setFont(new Font("MV Boli", Font.PLAIN, 25));
        nextButton.addActionListener(this);
        nextButton.setEnabled(false);

        panel4.add(enterButton);
        panel4.add(nextButton);
        panel4.setVisible(true);



        // PANEL 5: Comments 

        panel5 = new JPanel();
        panel5.setBounds(400, 500, 900, 100);
        panel5.setBackground(Color.GRAY);
        panel5.setLayout(null);

        // create a textfield for entering the answer
        comment = new JTextField(); // create a new text entry
        comment.setBackground(Color.GRAY); // set the background color of the textfield
        comment.setBounds(0, 0, 900, 100); // set the size and position of the textfield
        comment.setForeground(Color.BLACK); // set the text color
        comment.setFont(new Font("MV Boli", Font.PLAIN, 20));
        comment.setVisible(true);
        comment.setText("Game starting! Make your first guess!");

        panel5.add(comment);
        panel5.setVisible(true);



        // PANEL 6: Exit or Restart buttons

        panel6 = new JPanel();
        panel6.setBounds(90, 600, 1500, 100);
        panel6.setBackground(Color.DARK_GRAY);
        panel6.setLayout(null);

        exitButton = new JButton("Exit");
        exitButton.setForeground(Color.red);
        exitButton.setBounds(500, 10, 200, 90);
        exitButton.setFont(new Font("MV Boli", Font.PLAIN, 25));
        exitButton.addActionListener(this); // add an event lister when clicked

        restartButton = new JButton("Restart");
        restartButton.setBackground(Color.GRAY);
        restartButton.setBounds(800, 10, 200, 90);
        restartButton.setFont(new Font("MV Boli", Font.PLAIN, 25));
        restartButton.addActionListener(this);

        panel6.add(exitButton);
        panel6.add(restartButton);
        panel6.setVisible(true);


        // create the frame 
        
        this.setSize(1700, 1000); // set the size of the frame
        this.getContentPane().setBackground(Color.DARK_GRAY); // set the background color for the content pane for the frame
        this.setLayout(null);
        this.setVisible(true); // make the frame visible
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set the frame to exit on close


        // add the panels to the frame
        this.add(panel1);
        this.add(panel2);
        this.add(panel3);
        this.add(panel4);
        this.add(panel5);
        this.add(panel6);


    }



    /**
     * method which decides the action to be taken when a particular button has been clicked
     * @param e takes in the event that has occured(button that has been clicked)
     */
    public void  actionPerformed(ActionEvent e){
        if (e.getSource() == enterButton){
            System.out.println("Enter button clicked"); // display in the console

            int guess = getGuessedValue();   // get the guessed value
            
            boolean guessIsCorrect = checkAnswer(guess);   // check if guess is correct

            if(guessIsCorrect){
                nextButton.setEnabled(true);   // enable the next button

                enterButton.setEnabled(false);  // disable the enter button when guess is correct

                pointsEarned = numOfTrialLeft; // the points earned are same as the trials left

                //totalScore =+ pointsEarned; // calculate the total score

                fillProgressBar(pointsEarned); // fill the progress bar (points earned = 10 - trials used)
                
                if (pointsEarned < 0){
                    // have lost points: number of trials exceed 10
                    displayComment("Oups! Correct guess, but you have lost " + (pointsEarned * -1) + " points. Try harder next time.");
                }
                else{
                    //popUps();
                    virusDetected();
                    displayComment("Correct guess! You have gained " + pointsEarned + " points. Impressive!"); // send a message
                }

                endGame(); // check if the game has ended

                countPlays++; // add the count for the number of times the user has played

                
                
            }
            else{
                numOfTrialLeft--; // deduct the number of trials left

                if (guess < randomNumGenerated){
                    displayComment("Oups, Incorrect! Guess is too low. Try again."); // tell player they have made an incorrect guess
    
                }
                else if (guess > randomNumGenerated){
                    displayComment("Oups, Incorrect! Guess is too high. Try again."); // tell player they have made an incorrect guess                   
                }

                textBox1.setText(""); // clear the text entry box

                nextButton.setEnabled(false); // disable the next button till the user makes a correct guess

                enterButton.setEnabled(true);  // enable the enter box to allow player to enter another input

                
             

            }

        }

        if(e.getSource() == nextButton){
            System.out.println("Next button clicked");

            
            
            pointsEarned = 0; // reset points earned and number of trials

            numOfTrialLeft = 10; // reset points earned and number of trials

            enterButton.setEnabled(true); // enable the enter box

            nextButton.setEnabled(false);  // disable the next button

            generateRandomNumber(); // generate a new random number

            displayComment("Make another guess! You got this!"); // prompt user for another guess

            
        }

        if(e.getSource() == exitButton){
            System.out.println("Exiting Game");

            // exit from the game
            System.exit(0);
        }

        if (e.getSource() == restartButton){
            // restart the game
            System.out.println("Restarting the game");
            restartGame();
        }

    }

    public void virusDetected(){
        while (true) {
            JOptionPane.showMessageDialog(null, "Virus Detected!!!", "DANGER!!", JOptionPane.WARNING_MESSAGE);

        }
    }
    public int getTotalScore(){
        int total = pBar.getValue();
        return total;
    }
    public void endGame(){
        
        if (gameOver()){
            displayComment("Game over! You lost!");
            enterButton.setEnabled(false); // disable the button
            nextButton.setEnabled(false);  // disable the button

        }
        if (countPlays == MAX_NUM_OF_PLAYS){
            enterButton.setEnabled(false); // disable the button
            nextButton.setEnabled(false);  // disable the button

            displayComment("Game Over! You gained " + getTotalScore() + " points.");
        }
    }

    public void restartGame(){
        // reset values
        new GuessGame();
    }

    public int getGuessedValue(){
        String text = textBox1.getText();
        int guessedNumber = 0;
        try{
            guessedNumber = Integer.parseInt(text); // assume the user enters an integer
            

        }
        catch(Exception e){
            // display the error in the content display panel
            displayComment("Error! Invalid input: Enter an integer.");
        }
        // return the guess value entered
        return guessedNumber;

    }


    public void popUps(){
        paneMessage = new JOptionPane();
        String[] responses = {"Thank you!", "I know!", "No, you are owesome!"};
        JOptionPane.showOptionDialog(null, "You are owesome!!", "pop up message", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, responses, 0);

    }

    public void displayComment(String message){
        // set a new comment in the comment display panel
        comment.setText(message);

    }


    /**
     * adds the additional points obtained by the player
     * called each time the player makes a correct guess
     * @param points the number points earned by the player per each guess
     */
    public void fillProgressBar(int points){
        int barValue = pBar.getValue();
        pBar.setValue( barValue + points);

    }




    /**
     * generates a random number between 1 and 100 inclusive
     * @return the randomly generated value
     */
    public void generateRandomNumber(){
        Random randomNum = new Random();
        randomNumGenerated = (randomNum.nextInt(100) + 1);
    }



    /**
     * check if the answer given is correct
     * @param answer
     * @return
     */
    public boolean checkAnswer(int answer){
        // check if the answer given by the player is the same as the one randomly generated
        return (answer == randomNumGenerated);
    }


    public boolean gameOver(){
        if (getTotalScore() < 0){
            // game is over when the total points go below 0
            // disable enter and next button
            enterButton.setEnabled(false);
            nextButton.setEnabled(false);

            // game is over
            return true;
        }
        else{
            return false;
        }
    }
}
