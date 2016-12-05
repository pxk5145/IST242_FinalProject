
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainView extends JPanel{
    OptionsModel o_model;
    
    JLabel playerText;
    JLabel diffText;
    JLabel livesText;
    
    gameView view;
    MainView(OptionsModel o_model)
    {
        setLayout(new BorderLayout());     
        view = new gameView();
        
        add(view, BorderLayout.CENTER);        
        this.o_model = o_model;
        
        JButton welcomeButton = new JButton("Welcome to the Main View!");
        add(welcomeButton, BorderLayout.NORTH);
        
        playerText = new JLabel("");
        add(playerText,BorderLayout.NORTH);
        
        diffText = new JLabel("");
        add(diffText, BorderLayout.NORTH);
        
        livesText = new JLabel("");
        add(livesText, BorderLayout.NORTH);
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
