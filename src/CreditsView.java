
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class CreditsView extends JPanel{
    
    private JLabel title;
    private JLabel name1;
    private JLabel name2;
    private JLabel name3;
    private JLabel name4;
    private JLabel name5;
    
    CreditsView()
    {
       setBackground(Color.BLACK);
        title = new JLabel ("Creators:");
        name1 = new JLabel("Philip Kong");
        name2 = new JLabel("Robert Donohoe");
        name3 = new JLabel("Shawn Foreman");
        name4 = new JLabel("We used this site as a starting point "
                + "for our program:");
        name5 = new JLabel("http://zetcode.com/tutorials/javagamestutorial/spaceinvaders/");
        GridLayout grid = new GridLayout(6,1);
        title.setForeground(Color.WHITE);
        name1.setForeground(Color.WHITE);
        name2.setForeground(Color.WHITE);
        name3.setForeground(Color.WHITE);
        name4.setForeground(Color.WHITE);
        name5.setForeground(Color.WHITE);
        setLayout(grid);
        add(title);
        add(name1);
        add(name2);
        add(name3);
        add(name4);
        add(name5);
        
        title.setFont(new Font("Arial", Font.BOLD, 45));
        name1.setFont(new Font("Arial", Font.PLAIN, 25));
        name2.setFont(new Font("Arial", Font.PLAIN, 25));
        name3.setFont(new Font("Arial", Font.PLAIN, 25));
        name4.setFont(new Font("Arial", Font.PLAIN, 25));
        name5.setFont(new Font("Arial", Font.PLAIN, 25));
        
    }
}