
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import java.awt.event.*;


public class OptionsView extends JPanel{
        private JTextField playerName;
        private JLabel EnterDiff;
        private JSlider difficulty;
        private JSlider playerLives;
        private JLabel EnterLives;
        
        OptionsModel o_model;
        
        OptionsView(OptionsModel o_model)
        {
            this.o_model = o_model;
                   
            
            playerName = new JTextField("--Enter Player Name--");
            difficulty = new JSlider(JSlider.HORIZONTAL, 1,10,5);
            difficulty.setMajorTickSpacing(1);
            difficulty.setPaintLabels(true);
            difficulty.setPaintTicks(true);

            EnterDiff = new JLabel("  Enter Difficulty:");
            
            EnterLives = new JLabel("Enter # of Lives: ");
            playerLives = new JSlider(JSlider.HORIZONTAL, 1,10,5);
            playerLives.setMajorTickSpacing(1);
            playerLives.setPaintLabels(true);
            playerLives.setPaintTicks(true);

            // It may be useful to have a Save & Return button
            
            
            add(playerName);
            add(EnterDiff);
            add(difficulty);
            add(EnterLives);
            add(playerLives);
        }
             
        
        public String getPlayerName()
        {
            return this.playerName.getText();
        }
        
        public int getDifficulty()
        {
            return this.difficulty.getValue();
        }
        
        public int getLives()
        {
            return this.playerLives.getValue();
        }
}
