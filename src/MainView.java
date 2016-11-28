
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainView extends JPanel{
    OptionsModel o_model;
    
    JLabel playerText;
    JLabel diffText;
    MainView(OptionsModel o_model)
    {
        this.o_model = o_model;
        
        JButton welcomeButton = new JButton("Welcome to the Main View!");
        add(welcomeButton);
        
        playerText = new JLabel("");
        add(playerText);
        
        diffText = new JLabel("");
        add(diffText);
    }
    
    public void setPlayerText(String name)
    {
        playerText.setText("Player Name: " + name);
    }
    
    public void setDiff(int num)
    {
        diffText.setText("Difficulty: " + num);
    }
}
