
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
            return new Strategy("Party");
        } else return new Strategy("Home");
        
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
    
    
    
    
}
