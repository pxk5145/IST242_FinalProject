
import java.awt.Rectangle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shawn
 */
public class zombie extends Rectangle{
    int x;
    int y;
    public zombie(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void zombieRand(int pos){
    this.x = pos;
}
    
    public void zombieAnim(){
        this.y += 4;
    }
    
}

