package dices;

import java.util.Set;

public class GameB extends Game {
   private int numDices;
   private int numSixes;

    public GameB(int n, int numSixes) {
        if(n <= 0 || numSixes <= 0) {
            throw new IllegalArgumentException();
        }

        numDices = n;
        this.numSixes = numSixes;
    }

    
    public int simulate() {
        Cup cup = new Cup(numDices);
        int sixes = 0;
        int times = 0;
        while(sixes < numSixes) {
            Set<Dice> res = cup.cast();
            // System.out.println(res);
            sixes += countSixes(res);
            times++;
        }

        return times;
    }

    private int countSixes(Set<Dice> dices) {
        int res = 0;
        for(Dice d : dices) {
            if(d.getTop() == 6) {
                res++;
            }
        }
        return res;
    }
    
}
