package main;

import java.util.ArrayList;
import java.util.Random;

public class Player {
    private int[] fitnesses;
    private Strategy currentStrategy;
    private Strategy newStrategy;

    public Player() {
        this.currentStrategy = giveRandomStrategy();
        this.newStrategy = null;
        this.fitnesses = new int[2];
        this.fitnesses[0] = this.fitnesses[1] = 50;
    }

    private Strategy giveRandomStrategy() {
        Random r = new Random();
        if (r.nextBoolean()) {
            return new Strategy(0);
        } else {
            return new Strategy(1);
        }

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

    public int[] getFitnesses() {
        return fitnesses;
    }
    
    public void tryChangingStrategies() {
        Random r = new Random();
        
        int denominator = this.fitnesses[0] + this.fitnesses[1];
        int nominator = this.fitnesses[this.getCurrentStrategy().getStrategy()];
        double quotient = (double) nominator/denominator;
        System.out.println("Relative fitness of strategy " + this.currentStrategy.getStrategy() + ": " + quotient);
        if (r.nextDouble() > quotient) {
            this.currentStrategy.setStrategy(1 - this.currentStrategy.getStrategy());
        }
    }

}
