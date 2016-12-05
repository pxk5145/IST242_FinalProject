
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shawn
 */
public class gameView extends JPanel{
    


    // Window in focus variable
    private final int IFW = JComponent.WHEN_IN_FOCUSED_WINDOW;

    // Action strings

    private final String RIGHT_PRESSED = "move right";
    private final String MOVE_LEFT = "move left";

    // Movements
    public final int RIGHT = 2;
    public final int LEFT = 3;

    private final JLabel button;
    
    private Timer Timer;
    public Color palette;

    public gameView() {
        // Panel properties

        palette = new Color(255,222,154);
        setBackground(palette);
        setLayout(null);

        // Configuring button
        button = new JLabel(new ImageIcon("src/images/Player.png"));
        button.setBounds(300, 300, 40, 75);
        add(button);

        // .: Key bindings :.
        // - Input maps

        button.getInputMap(IFW).put(KeyStroke.getKeyStroke("RIGHT"), RIGHT_PRESSED);
        button.getInputMap(IFW).put(KeyStroke.getKeyStroke("LEFT"), MOVE_LEFT);

        // - Action maps

        button.getActionMap().put(RIGHT_PRESSED, new MoveAction(RIGHT));
        button.getActionMap().put(MOVE_LEFT, new MoveAction(LEFT));
    }

    private class MoveAction extends AbstractAction {

        private final int direction;
        private final int speed = 8;
        private int leftPress;
        private int rightPress;

        public MoveAction(int direction) {
            this.direction = direction;
            this.leftPress = leftPress;
            this.rightPress = rightPress;
        }
        
       /* public boolean KeyPressed(KeyEvent e){
            boolean result = false;
            int key = e.getKeyCode();
            if(key == KeyEvent.VK_LEFT)
            {
                 result = true;
            }
            if(key)
            {
                result = false
            }
            return result;
        }
        
        public void KeyReleased(KeyEvent e){
            boolean result = false;
            int key = e.getKeyCode();
            if(key == KeyEvent.VK_RIGHT)
            {
                 result = true;
            }
            else
            {
                result = false; 
            }
            return result;
        }*/

        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(direction == RIGHT && button.getLocation().x < 525) {
                button.setLocation(button.getLocation().x + speed, button.getLocation().y);
            }
            if(direction == LEFT && button.getLocation().x > 25) {
                button.setLocation(button.getLocation().x - speed, button.getLocation().y);
            }
        }
    }

}
    

