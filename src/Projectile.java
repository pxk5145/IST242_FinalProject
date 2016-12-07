
import java.awt.Color;
import javax.swing.JButton;


public class Projectile extends gameModel{
    JButton shot;
    final int H_space = 6;
    final int V_space = 1;
    
    public Projectile ()
    {
        
    }
    
    public Projectile(int x, int y)
    {
        shot = new JButton("");
        shot.setBackground(Color.BLACK);
        setX(x + H_space);
        setY(y - V_space);
    }
    
    public void shootProjectile()
    {
        
    }
    
}
