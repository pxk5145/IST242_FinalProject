
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainView extends JPanel{
    
    
    JLabel playerText;
    JLabel diffText;
    JLabel livesText;
    
    gameView view;
    MainView()
    {
        setLayout(new BorderLayout());     
        view = new gameView();
        
        add(view, BorderLayout.CENTER);
        view.setSize(300, 300);
        
        playerText = new JLabel("");
        add(playerText,BorderLayout.NORTH);
        
        diffText = new JLabel("");
        add(diffText, BorderLayout.WEST);
        
        livesText = new JLabel("");
        add(livesText, BorderLayout.EAST);
    }
    
    public void setPlayerText(String name)
    {
        playerText.setText("Player name: " + name);
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
