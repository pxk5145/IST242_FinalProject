
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainView extends JPanel{
    OptionsModel o_model;
    
    JLabel playerText;
    JLabel diffText;
    JLabel livesText;
    MainView(OptionsModel o_model)
    {
        this.o_model = o_model;
        
        JButton welcomeButton = new JButton("Welcome to the Main View!");
        add(welcomeButton);
        
        playerText = new JLabel("");
        add(playerText);
        
        diffText = new JLabel("");
        add(diffText);
        
        livesText = new JLabel("");
        add(livesText);
    }
    
    public void setPlayerText(String name)
    {
        playerText.setText("Player Name: " + name);
    }
    
    public void setDiff(int num)
    {
        diffText.setText("Difficulty: " + num);
    }
    
    public void setLives(int num)
    {
        livesText.setText("# of Lives: " + num);
    }
}
