
package main;

import javax.swing.JFrame;

public class main {
    
    public static void main(String[] args) {
        JFrame f = new InputFrame();
        f.show();
        Game game = new Game();
        game.play();
    }
    
}
