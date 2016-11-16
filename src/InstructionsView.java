
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;


public class InstructionsView extends JPanel{
    JLabel instructions;
    
    InstructionsView ()
    {
        setLayout(new BorderLayout());
        
        instructions = new JLabel("These are the instructions. Use controls.");
        add(instructions, BorderLayout.EAST);
    }
    
}
