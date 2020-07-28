package dices;

import java.util.List;
import java.util.SortedMap;

public interface Simulation {
   int simulate();
   List<Integer> experiment(int numSim);
   SortedMap<Integer, Integer> group(List<Integer> list); 
}
