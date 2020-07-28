package dices;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;

public class Statistics {
    private SortedMap<Integer, Integer> data;
    
    public Statistics(SortedMap<Integer, Integer> map) {
        if(map.isEmpty()) {
            throw new IllegalArgumentException();
        }

        data = map;
    }

    public double average() {
        double totalTimes = 0; // fraction bottom element
        double x = 0; // fraction top element

        for(int nSim : data.keySet()) {
            int times = data.get(nSim);
            
            x += nSim * times;
            totalTimes += times;
        }

        return x / totalTimes;
    }

    public Set<Integer> mode() {
        Set<Integer> result = new HashSet<>();
        int maxFreq = 0;

        for(int key : data.keySet()) {
            int val = data.get(key);
            if(val > maxFreq) {
                maxFreq = val;
                result.clear();
            }
            if(val == maxFreq) {
                result.add(key);
            }
        }

        return result;
    }

    public int median() {
        List<Integer> ordered = ungroup(data);
        int pos = ordered.size() / 2 - 1;
        return ordered.get(pos);
    }

    private List<Integer> ungroup(SortedMap<Integer, Integer> map) {
        List<Integer> res = new ArrayList<>();
        for(int key : map.keySet()) {
            int val = map.get(key);
            for(int i = 0; i < val; i++) {
                res.add(key);
            }
        }
        return res;
    }
}
