
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

            // It may be useful to have a Save & Return button
            
            
            add(playerName);
            add(EnterDiff);
            add(difficulty);  
        }
             
        
        public String getPlayerName()
        {
            return this.playerName.getText();
        }
        
        public int getDifficulty()
        {
            return this.difficulty.getValue();
        }
}
