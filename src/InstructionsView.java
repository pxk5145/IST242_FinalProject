
import javax.swing.JPanel;
import javax.swing.JLabel;


public class InstructionsView extends JPanel{
    JLabel instructions;
    
    InstructionsView ()
    {
        instructions = new JLabel("These are the instructions. Use controls.");
        add(instructions);
    }
    
}
