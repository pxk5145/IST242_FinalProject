
import javax.swing.*;

public class NavViewSplashPanel extends JPanel{
    JButton splashButton;
    JLabel optionsLabel;    
    NavViewSplashPanel()
    {
            splashButton = new JButton(new ImageIcon("src/images/zombieRunner.png"));            
            add(splashButton);            
    }    
}
