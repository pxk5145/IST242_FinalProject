
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
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
    private final String Z_PRESSED = "Z pressed";

    // Movements
    public final int RIGHT = 2;
    public final int LEFT = 3;
    public final int Z = 4;

    private final JLabel Player;
    private final JLabel zombie;
    
    public Rectangle p;
    public Rectangle z;
    
    Projectile projectile;
    
    public ArrayList<Projectile> shots = new ArrayList<Projectile>();
    private Timer Timer;
    public Color palette;

    public gameView() {
        // Panel properties
        
        setSize(300, 300);
        palette = new Color(255,222,154);
        setBackground(palette);
        setLayout(null);
        
        projectile = new Projectile();

        // Configuring Player
        Player = new JLabel(new ImageIcon("src/images/Player.png"));
        zombie = new JLabel(new ImageIcon("src/images/zombie.png"));
        p = new Rectangle(300,300, 100, 75);
        z = new Rectangle(25,300,90,75);
        
        Player.setBounds(300, 300, 120, 75);
        zombie.setBounds(300, 300, 120, 75);
        Player.setLocation(275,515);
        zombie.setLocation(50, 515);
        add(Player);
        add(zombie);

        // .: Key bindings :.
        // - Input maps

        Player.getInputMap(IFW).put(KeyStroke.getKeyStroke("RIGHT"), RIGHT_PRESSED);
        Player.getInputMap(IFW).put(KeyStroke.getKeyStroke("LEFT"), MOVE_LEFT);
        Player.getInputMap(IFW).put(KeyStroke.getKeyStroke("SPACE"), projectile);

        // - Action maps

        Player.getActionMap().put(RIGHT_PRESSED, new MoveAction(RIGHT));
        Player.getActionMap().put(MOVE_LEFT, new MoveAction(LEFT));
        Player.getActionMap().put(Z_PRESSED, new MoveAction(Z));
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
            
            if(direction == RIGHT && Player.getLocation().x < 525) {
                Player.setLocation(Player.getLocation().x + speed, Player.getLocation().y);
                p.setLocation(p.getLocation().x + speed, p.getLocation().y);
            }
            if(direction == LEFT && Player.getLocation().x > 25) {
                Player.setLocation(Player.getLocation().x - speed, Player.getLocation().y);
                p.setLocation(p.getLocation().x - speed, p.getLocation().y);
            }
            if(direction == Z){
                Player.setLocation(Player.getLocation().x, Player.getLocation().y - speed);
            }
            if(p.intersects(z) && Player.isVisible())
            {
                Player.setVisible(false);
            }
        }
    }

}
    

