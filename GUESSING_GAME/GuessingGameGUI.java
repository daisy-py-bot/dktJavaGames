import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Shape;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class GuessingGameGUI implements ActionListener{

    static JButton button1;


    public static void main(String[] args){

        //MyFrame frame1 = new MyFrame(); // adding a frame
        Border border = BorderFactory.createLineBorder(Color.green, 3); // creates a border of color green and width of 3
        ImageIcon image = new ImageIcon("GGicon.png");

         // A button that performs an action when clicked on

        // BUTTON
        button1 = new JButton(); // create a new button
        button1.setBackground(Color.BLACK); // set the color of the button
        button1.setBounds(10,10, 70, 80);
        button1.setText("Click");
        button1.setFocusable(false);

        GuessingGameGUI game = new GuessingGameGUI();
        button1.addActionListener(game);

        // adding labels (display area for a string of text, image or both)

        // LABELS 

        JLabel label = new JLabel(); // create a new label
        label.setBounds(0, 0, 75, 75);
        label.setText("Guess my number?"); // set text of label
        label.setVerticalTextPosition(JLabel.TOP); // set the vertical position 
        label.setHorizontalTextPosition(JLabel.CENTER); // set the horizontal position
        label.setForeground(Color.green); // set the color of the text
        label.setFont(new Font("MV Boli", Font.BOLD, 20)); // set font of the text 
        label.setIconTextGap(40); // set the gap between the text and the image
        label.setBackground(Color.GRAY); // set the background color to gray
        label.setOpaque(true); // display the background color (takes up the whole space in the frame)
        label.setBorder(border); // set the border
        label.setVerticalAlignment(JLabel.TOP); // set the vertical position of the imaage an text
        label.setHorizontalAlignment(JLabel.CENTER); // set the horizontal position of the imaage an text
        label.setIcon(image); // set the image  // HOW DO YOU ALTER THE IMAGE SIZE?
        //label.setBounds(50,50, 400, 400); // set the x,y coordinates and dimensions




        // A GUI component that functions as a container to hold other components
       
        // PANELS

        JPanel redPanel1 = new JPanel();
        redPanel1.setBounds(0, 0, 100, 100); // set the bounds for the panel
        redPanel1.setBackground(Color.RED); // set the color of the panel

        JPanel greenPanel1 = new JPanel();
        greenPanel1.setBounds(0, 100, 100, 100);
        greenPanel1.setBackground(Color.green); // set the color of the panel
        //greenPanel1.add(label); // add the label to the panel
        greenPanel1.add(button1);

        JPanel bluePanel1 = new JPanel();
        bluePanel1.setBounds(100, 0, 100, 100);
        bluePanel1.setBackground(Color.blue); // set the color of the panel
        bluePanel1.add(label);

        JPanel yellowPanel1 = new JPanel();
        yellowPanel1.setBounds(100, 100, 100, 100);
        yellowPanel1.setBackground(Color.YELLOW); // set the color of the panel



        // FRAME
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000); // set the size of the window
        frame.setLayout(null); // set the layout of the frame
        frame.setVisible(true); // set the frame to visible
        //frame.add(label); // add a label component to the frame
        frame.add(redPanel1);
        frame.add(greenPanel1);
        frame.add(bluePanel1);
        frame.add(yellowPanel1);
        

       

      
        // frame1.add(label); // adding the label to the frame
        // frame1.validate(); // validating      
        //frame.pack();

    }

    

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button1){
            System.out.println("poo");
        }

    }
    
}
