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

}
