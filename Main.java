import java.util.List;
import java.util.SortedMap;

import dices.Game;
import dices.GameA;
import dices.GameB;
import dices.Statistics;

public class Main {
    private static void check(Game g, int n) {
        List<Integer> res = g.experiment(n);
        SortedMap<Integer, Integer> grouped = g.group(res);
		Statistics est = new Statistics(grouped);
		System.out.println(grouped);
		System.out.println("Average = " + est.average());
		System.out.println("Mode = " + est.mode());
		System.out.println("Median = " + est.median());
    }
    
    public static void main(String[] args) {
        GameA gA = new GameA(1, 6);
        check(gA, 30);

        GameB gB = new GameB(3, 2);
        check(gB, 30);
    }
}
