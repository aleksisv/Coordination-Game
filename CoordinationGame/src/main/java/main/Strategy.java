package main;

public class Strategy {

    private int strategy;
    private int fitness;

    public Strategy(int strategy) {
        this.strategy = strategy;
        this.fitness = 50;
    }

    public int getStrategy() {
        return strategy;
    }

    public void setStrategy(int strategy) {
        this.strategy = strategy;
    }

    public int getFitness() {
        return fitness;
    }

    public void setFitness(int fitness) {
        this.fitness = fitness;
    }
    
    

}
