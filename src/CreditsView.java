
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class CreditsView {
    
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
        
        JPanel content = new JPanel();
        content.setLayout(grid);
        content.add(title);
        content.add(name1);
        content.add(name2);
        content.add(name3);
        
    }
}