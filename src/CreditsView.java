
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class CreditsView extends JPanel{
    
    private JLabel title;
    private JLabel name1;
    private JLabel name2;
    private JLabel name3;
    
    CreditsView()
    {
        title = new JLabel ("Creators:");
        name1 = new JLabel("Philip Kong");
        name2 = new JLabel("Robert Donohoe");
        name3 = new JLabel("Shawn Foreman");
        GridLayout grid = new GridLayout(4,1);
        
        setLayout(grid);
        add(title);
        add(name1);
        add(name2);
        add(name3);
        
    }
}