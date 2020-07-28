import dices.GameA;
import dices.GameB;

public class MainGames {
    public static void main(String[] args) {
       GameA a = new GameA(2, 7); 
       a.simulate();

       GameB b = new GameB(3, 4);
       b.simulate();
    }
}
