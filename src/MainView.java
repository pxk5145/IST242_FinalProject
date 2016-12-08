
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JButton;
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
public class MainView extends JPanel implements ActionListener{
    


    // Window in focus variable
    private final int IFW = JComponent.WHEN_IN_FOCUSED_WINDOW;

    // Action strings

    private final String RIGHT_PRESSED = "move right";
    private final String MOVE_LEFT = "move left";

    // Movements
    public final int RIGHT = 2;
    public final int LEFT = 3;
    public final int Z = 4;

    private final JLabel Player;
    private final JLabel zombie;
    
    private Rectangle p;
    private Rectangle z;
    
    private int diffVal;
    private int livesVal;
    private JLabel playerText;
    private JLabel diffText;
    private JLabel livesText;
    private JLabel timerLabel;
    private int i = 300;
    
    private Timer Timer;
    Timer Timer2;
    public Color palette;

    public MainView() {
        // Panel properties
        setSize(600, 600);
        palette = new Color(255,222,154);
        setBackground(palette);
        BorderLayout Border = new BorderLayout();
        setLayout(Border);
        
        playerText = new JLabel("");
        add(playerText,Border.NORTH);
        
        diffText = new JLabel("");
        add(diffText,Border.WEST);
        
        livesText = new JLabel("");
        add(livesText,Border.EAST);
        
        timerLabel = new JLabel("");
        add(timerLabel,Border.SOUTH);
        
        Timer = new Timer(1000, this);
        Timer2 = new Timer(50, this);
        init();

        // Configuring Player
        Player = new JLabel(new ImageIcon("src/images/Player.png"));
        zombie = new JLabel(new ImageIcon("src/images/zombie.png"));
        p = new Rectangle(300,300, 100, 75);
        z = new Rectangle(randX(),300,90,75);
        
        Player.setBounds(300, 300, 120, 75);
        zombie.setBounds(300, 300, 120, 75);
        
        Player.setLocation(275,515);
        zombie.setLocation(30, 300);
        add(Player);
        add(zombie);

        // .: Key bindings :.
        // - Input maps

        Player.getInputMap(IFW).put(KeyStroke.getKeyStroke("RIGHT"), RIGHT_PRESSED);
        Player.getInputMap(IFW).put(KeyStroke.getKeyStroke("LEFT"), MOVE_LEFT);

        // - Action maps

        Player.getActionMap().put(RIGHT_PRESSED, new MoveAction(RIGHT));
        Player.getActionMap().put(MOVE_LEFT, new MoveAction(LEFT));
    }
    
    public void init(){
        Timer.start();
        Timer2.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == Timer)
        {
            i = i-1;
            timerLabel.setText(""+i);
            if (i == 0)
            {
                Timer.stop();
            }
        }
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
            
            if(direction == RIGHT && Player.getLocation().x < 575) {
                Player.setLocation(Player.getLocation().x + speed, Player.getLocation().y);
                p.setLocation(p.getLocation().x + speed, p.getLocation().y);
            }
            if(direction == LEFT && Player.getLocation().x > 0) {
                Player.setLocation(Player.getLocation().x - speed, Player.getLocation().y);
                p.setLocation(p.getLocation().x - speed, p.getLocation().y);
            }
            if(p.intersects(z))
            {
                Player.setVisible(false);
                if (livesVal >= 1){
                    Player.setLocation(275,515);
                    Player.setVisible(true);
                    p.setLocation(300,300);
                    livesVal--;
                    setLives(livesVal);
                }

            }
        }
    }

   
    public void setdiffVal(int num)
    {
        diffVal = num;
    }
    
    public void setlivesVal(int num)
    {
        livesVal = num;
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
    
    public int randX()
    {
       int x = (int) Math.random() + 1;
       int x2 = (int) Math.random() + 1;
       int x3 = (int) Math.random() + 1;
       int x4 = (int) Math.random() + 1;
       int finx = x + x2 + x3 + x4;
       
       return finx;
    }

}
    

