
package main;

import java.util.ArrayList;

public class Game {
    private int time;
    private ArrayList<Player> players;
    private Pair[][] payoffMatrix;

    public Game() {
        this.time = 0;
        this.players = generatePlayers();
        payoffMatrix = new Pair[2][2];
        setPayoffs();
        play();
        
    }
    
    public void play(){
        while(this.time < 1000) {
            playTurn();
        }
    }
    
    public ArrayList<Player> generatePlayers(){
        ArrayList<Player> players = new ArrayList<Player>();
        
        players.add(new Player());
        players.add(new Player());
        
        return players;
        
    }
    
    public void setPayoffs(){
        Pair[][] payoffs = new Pair[2][2];
        payoffs[0][0] = new Pair(10, 10);
        payoffs[0][1] = new Pair(0, 0);
        payoffs[1][0] = new Pair(0, 0);
        payoffs[1][1] = new Pair(5, 5);
    }

    public void setPayoffMatrix(Pair[][] payoffMatrix) {
        this.payoffMatrix = payoffMatrix;
    }
    
    
    
    public void playTurn(){
        this.time++;
        
    }
    
    
    
}
