import java.util.Iterator;
import java.util.Set;

import dices.Cup;
import dices.Dice;

public class MainCup {
   public static void main(String[] args) {
       Cup cup = new Cup(5);
       Set<Dice> dices = cup.cast();
       System.out.println(dices);
       Iterator<Dice> it = dices.iterator();
       boolean issix = false;
       while(it.hasNext() && !issix) {
           if(it.next().getTop() == 6) {
               issix = true;
           }
       }

       if(issix) {
           System.out.println("There was at least a 6");
       }
   } 
}
