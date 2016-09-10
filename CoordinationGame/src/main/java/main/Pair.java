package main;

public class Pair {

    private int[] values;

    public Pair() {
        this.values = new int[2];
    }

    public Pair(int i1, int i2) {
        this.values = new int[2];
        this.values[0] = i1;
        this.values[1] = i2;
    }

    public void setValues(int first, int second) {
        this.values[0] = first;
        this.values[1] = second;
    }

    public void setFirst(int first) {
        this.values[0] = first;
    }

    public void setSecond(int second) {
        this.values[1] = second;
    }

    public int getFirst() {
        return this.values[0];
    }

    public int getSecond() {
        return this.values[1];
    }

    public int[] getValues() {
        return values;
    }

}
