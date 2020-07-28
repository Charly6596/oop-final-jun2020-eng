package dices;

import java.util.Random;

public class Dice {
    private int top;
    private Random random;

    public Dice() {
        random = new Random();
    }
    public void shake() {
        top = random.nextInt(6) + 1; // random number from 1 to 6
    }

    public int getTop() {
        return top;
    }

    public String toString() {
        return Integer.toString(top);
    }
}
