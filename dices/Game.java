package dices;

import java.util.LinkedList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public abstract class Game implements Simulation {
    
    public List<Integer> experiment(int numSim) {
        if(numSim <= 0) {
            throw new IllegalArgumentException();
        }

        List<Integer> res = new LinkedList<>(); // Quick insertion
        for(int i = 0; i < numSim; i++) {
            res.add(this.simulate());
        }

        return res;
    }

    public SortedMap<Integer, Integer> group(List<Integer> list) {
        SortedMap<Integer, Integer> res = new TreeMap<>();

        for(int i : list) {
            int count = res.getOrDefault(i, 0);
            res.put(i, count + 1);
        }

        return res;
    } 
}
