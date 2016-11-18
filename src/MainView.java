
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainView extends JPanel{
    OptionsModel o_model;
    
    MainView(OptionsModel o_model)
    {
        this.o_model = o_model;
        
        JButton welcomeButton = new JButton("Welcome to the Main View!");
        add(welcomeButton);
        
        JLabel playerText = new JLabel("Player Name: " + o_model.grabPlayerName());
        add(playerText);
        
        JLabel diffText = new JLabel("Difficulty set to " + o_model.grabDifficulty());
        add(diffText);
    }
}
