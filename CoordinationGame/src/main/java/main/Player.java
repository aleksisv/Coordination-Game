
package main;

import java.util.Random;

public class Player {
    private Strategy currentStrategy;
    private Strategy newStrategy;

    public Player() {
        this.currentStrategy = giveRandomStrategy();
        this.newStrategy = null;
    }
    
    private Strategy giveRandomStrategy(){
        Random r = new Random();
        if (r.nextBoolean()) {
            return new Strategy(0);
        } else return new Strategy(1);
        
    }

    public Strategy getCurrentStrategy() {
        return currentStrategy;
    }

    public Strategy getNewStrategy() {
        return newStrategy;
    }

    public void setCurrentStrategy(Strategy currentStrategy) {
        this.currentStrategy = currentStrategy;
    }

    public void setNewStrategy(Strategy newStrategy) {
        this.newStrategy = newStrategy;
    }
    
    public int playWith(Player other){
        return 0;
    }
    
    
    
    
}
