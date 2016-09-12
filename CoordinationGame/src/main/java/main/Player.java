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
        this.fitnesses = new int[3];
        this.fitnesses[0] = this.fitnesses[1] = this.fitnesses[2] = 33;
    }

    private Strategy giveRandomStrategy() {
        Random r = new Random();
        if (r.nextDouble() < 0.33) {
            return new Strategy(0);
        } else if (r.nextDouble() < 0.66) {
            return new Strategy(1);
        } else return new Strategy(2);

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

        int denominator =  this.fitnesses[0] + this.fitnesses[1];
        int nominator = this.fitnesses[this.getCurrentStrategy().getStrategy()];
        double quotient = (double) nominator / denominator;
        System.out.println("The relative fitness of strategy " + this.currentStrategy.getStrategy() + ": " + quotient);
        if (r.nextDouble() > quotient) {
            this.currentStrategy.setStrategy(1 - this.currentStrategy.getStrategy());
        }
    }

    public void tryChangingStrategiesWithMorePossibilities() {
        Random r = new Random();
        int denominator = calculateTotalFitness(this.fitnesses);
        int nominator = this.fitnesses[this.getCurrentStrategy().getStrategy()];
        
        double quotient = (double) nominator / denominator;
        System.out.println("The relative fitness of strategy " + this.currentStrategy.getStrategy() + ": " + quotient);
        
        this.currentStrategy.setStrategy(findTheSpot(this.fitnesses, r.nextInt(denominator)));
    }
    
    public int calculateTotalFitness(int[] fitness){
        int j = 0;
        for (int i = 0; i < fitness.length; i++) {
            j += this.fitnesses[i];
        }
        return j;
    }
    
    public int findTheSpot(int[] fitness, int random) {
        int count = 0;
        for (int i = 0; i < fitness.length; i++) {
            count += fitness[i];
            if(count > random) {
                return i;
            }
        }
        return 0;
    }

}
