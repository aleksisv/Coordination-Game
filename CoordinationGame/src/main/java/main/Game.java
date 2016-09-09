
package main;

import java.util.ArrayList;

public class Game {
    private int time;
    private ArrayList<Player> players;
    private int[][] payoffMatrix;

    public Game() {
        this.time = 0;
        this.players = generatePlayers();
        payoffMatrix = new int[2][2];
        
        setPayoffs();
        
    }
    
    public void play(){
        while(this.time < 1000) {
            
        }
    }
    
    public ArrayList<Player> generatePlayers(){
        ArrayList<Player> players = new ArrayList<Player>();
        
        players.add(new Player());
        players.add(new Player());
        
        return players;
        
    }
    
    public void setPayoffs(){
        
    }
    
    
    
}
