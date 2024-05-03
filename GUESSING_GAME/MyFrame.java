import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

public class MyFrame extends JFrame{

    // create a constructor
    public MyFrame(){
        // we would like to build a GUI for our guessing game

        this.setTitle("Guessing Game"); // set the title of the GUI

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // exit out of application

        this.setResizable(false); // disable resizing of the this

        ImageIcon icon = new ImageIcon("GGicon.png"); // create an object for a new image icon
        this.setIconImage(icon.getImage()); // set a new icon for the this

        this.getContentPane().setBackground(new Color(40, 120, 90));

        this.setSize(430, 430); // set the size of the window (x and y)

        //this.setLayout(null);

        this.setVisible(true);  // set the visibility to true
    }
    
}
