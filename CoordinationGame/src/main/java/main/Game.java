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

    public void play() {
        while (this.time < 200) {
            playTurn();
        }
    }

    public ArrayList<Player> generatePlayers() {
        ArrayList<Player> players = new ArrayList<Player>();

        players.add(new Player());
        players.add(new Player());

        return players;

    }

    public void setPayoffs() {
        Pair[][] payoffs = new Pair[3][3];
        payoffs[0][0] = new Pair(10, 10);
        payoffs[0][1] = new Pair(2, 2);
        payoffs[0][2] = new Pair(0, 2);
        payoffs[1][0] = new Pair(0, 0);
        payoffs[1][1] = new Pair(3, 3);
        payoffs[1][2] = new Pair(0, 0);
        payoffs[2][0] = new Pair(0, 0);
        payoffs[2][1] = new Pair(0, 0);
        payoffs[2][2] = new Pair(5, 5);
        
        
        setPayoffMatrix(payoffs);
    }

    public void setPayoffMatrix(Pair[][] payoffMatrix) {
        this.payoffMatrix = payoffMatrix;
    }

    public void playTurn() {
        this.time++;
        System.out.println("The strategy of player 1 before changing: " + players.get(0).getCurrentStrategy().getStrategy());
        System.out.println("The strategy of player 2 before changing: " + players.get(1).getCurrentStrategy().getStrategy());
        pVsP(players.get(0), players.get(1));
        System.out.println("");
        

    }

    private void pVsP(Player player1, Player player2) {
        int payoff1 = payoffMatrix[player1.getCurrentStrategy().getStrategy()][player2.getCurrentStrategy().getStrategy()].getFirst();
        int payoff2 = payoffMatrix[player1.getCurrentStrategy().getStrategy()][player2.getCurrentStrategy().getStrategy()].getSecond();
        
        player1.getFitnesses()[player1.getCurrentStrategy().getStrategy()] += payoff1;
        player2.getFitnesses()[player1.getCurrentStrategy().getStrategy()] += payoff2;
        
        //player1.tryChangingStrategies();
        //player2.tryChangingStrategies();
        player1.tryChangingStrategiesWithMorePossibilities();
        player2.tryChangingStrategiesWithMorePossibilities();
    }

}
