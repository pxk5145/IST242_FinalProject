
import javax.swing.*;

public class NavViewSplashPanel extends JPanel{
    JButton splashButton;
    JLabel optionsLabel;    
    NavViewSplashPanel()
    {
            splashButton = new JButton(new ImageIcon("src/images/game_template.png"));            
            add(splashButton);
            
            optionsLabel = new JLabel("No options selected yet.");
            add(optionsLabel);
            
    }    
}
