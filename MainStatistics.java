import java.util.*;
import dices.Statistics;

public class MainStatistics {
	public static void check(SortedMap<Integer, Integer> prueba) {
		Statistics est = new Statistics(prueba);
		System.out.println(prueba);
		System.out.println("Average = " + est.average());
		System.out.println("Mode = " + est.mode());
		System.out.println("Median = " + est.median());
	}

	public static void main(String[] args) {
		SortedMap<Integer, Integer> map = new TreeMap<>();
		map.put(2, 1);
		map.put(3, 1);
		map.put(4, 3);
		map.put(5, 2);
		check(map);
		map.put(5, 3);
		check(map);
		map.put(4, 1);
		map.put(5, 1);
		check(map);
	}
}
