package dices;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Cup {
    private List<Dice> dices;

    public Cup(int n) {
        if(n <= 0) {
            throw new IllegalArgumentException();
        }

        dices = new ArrayList<Dice>();

        for(int i = 0; i < n; i++) {
            dices.add(new Dice());
        }
    }

    public Set<Dice> cast() {
        Set<Dice> ds = new HashSet<>();

        for(Dice d : dices) {
            d.shake();
            ds.add(d);
        }
        return ds;
    }
}
