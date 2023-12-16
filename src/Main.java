import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Collection;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        SetHashMap<Integer> set = new SetHashMap<>();
        SetHashMap<Integer> test = new SetHashMap<>();
        SetHashMap<Integer> dest = new SetHashMap<>();

        set.add(5);
        set.add(9);
        set.add(8);
        set.add(6);

        System.out.println("Set size : " + set.size());

        System.out.println("Set elements :");
        for (Integer S : set) {
            System.out.println(S);
        }
        System.out.println("//------------------------------------------------------------------");
        test.add(5);
        test.add(9);
        test.add(8);
        test.add(6);

        System.out.println("Test size : " + test.size());

        System.out.println("Test elements :");
        for (Integer T : test) {
            System.out.println(T);
        }
        System.out.println("//------------------------------------------------------------------");
        System.out.println("Set and Test are same element :" + set.containsAll(test));
        System.out.println("//------------------------------------------------------------------");
        dest.add(2);
        dest.add(4);

        System.out.println("Dest size : " + dest.size());

        System.out.println("Dest elements :");
        for (Integer D : dest) {
            System.out.println(D);
        }
        System.out.println("//------------------------------------------------------------------");
        System.out.println("Dest addAll to Set : " + set.addAll(dest));

        System.out.println("Set elements :");
        for (Integer S : set) {
            System.out.println(S);
        }
        System.out.println("//------------------------------------------------------------------");
        System.out.println("Set retainAll from Test : " + set.retainAll(test));

        System.out.println("Set elements :");
        for (Integer S : set) {
            System.out.println(S);
        }
        System.out.println("//------------------------------------------------------------------");
        System.out.println("remove 5 on Set: " + set.remove(5));
        System.out.println("remove 9 on Set: " + set.remove(9));

        System.out.println("Set is Empty : " + set.isEmpty());

        System.out.println("Set elements :");
        for (Integer S : set) {
            System.out.println(S);
        }
        System.out.println("//------------------------------------------------------------------");
        System.out.println("Set removeAll from Test :" + set.removeAll(test));

        System.out.println("Set elements :");
        for (Integer S : set) {
            System.out.println(S);
        }
        System.out.println("//------------------------------------------------------------------");
        set.clear();
    }
}
