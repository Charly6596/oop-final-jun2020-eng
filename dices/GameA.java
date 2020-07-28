package dices;

import java.util.Set;

public class GameA extends Game {
    private int numDices;
    private int goalSum;

    public GameA(int n, int sum) {
        if(n < 0 || sum < n || sum > 6 * n) {
            throw new IllegalArgumentException();
        }

        goalSum = sum;
        numDices = n;
    }

    public int simulate() {
        Cup cup = new Cup(numDices);
        int sim = 0;
        int sum = 0;

        while(sum != goalSum) {
            Set<Dice> res = cup.cast();
            // System.out.println(res);
            sum = sumDices(res);
            sim++;
        }
        return sim;
    }
    
    private int sumDices(Set<Dice> dices) {
        int res = 0;

        for(Dice d : dices) {
            res += d.getTop();
        }
        
        return res;
    }
}
