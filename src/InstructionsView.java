
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Font;


public class InstructionsView extends JPanel{
    JLabel instructions, instruct2, instruct3, instruct4, instruct5, instruct6;
    
    InstructionsView ()
    {
        setLayout(new FlowLayout());
        setBackground(Color.BLACK);
        
        instructions = new JLabel("INSTRUCTIONS:");
        instruct2 = new JLabel("The objective of the game is to move");
        instruct3 = new JLabel("through the hallway without being attacked");
        instruct4 = new JLabel("by the incoming zombies. Use arrow keys");
        instruct5 = new JLabel("to move left and right and the the Z key ");
        instruct6 = new JLabel("to shoot.");
        
        instructions.setForeground(Color.GREEN);
        instruct2.setForeground(Color.GREEN);
        instruct3.setForeground(Color.GREEN);
        instruct4.setForeground(Color.GREEN);
        instruct5.setForeground(Color.GREEN);
        instruct6.setForeground(Color.GREEN);
        
        add(instructions);
        add(instruct2);
        add(instruct3);
        add(instruct4);
        add(instruct5);
        add(instruct6);
        
        instructions.setFont(new Font("Arial", Font.BOLD, 50));
        instruct2.setFont(new Font("Arial", Font.PLAIN, 35));
        instruct3.setFont(new Font("Arial", Font.PLAIN, 35));
        instruct4.setFont(new Font("Arial", Font.PLAIN, 35));
        instruct5.setFont(new Font("Arial", Font.PLAIN, 35));
        instruct6.setFont(new Font("Arial", Font.PLAIN, 35));
    }
    
}
