import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Set<String> f = new HashSet<>();

        f.add("yee");
        f.add("eiei");
        f.add("team");

        System.out.println("------------------------------------------------");
        System.out.println("Set Hash: " + f);
        System.out.println("Size: " + f.size());
        System.out.println("empty: " + f.isEmpty());
        System.out.println("contain 'yee' :" + f.contains("yee"));
        System.out.println("HashSet f: ");
        for (String u : f) {
            System.out.println(u);
        }
        System.out.println("------------------------------------------------");
        Object[] ar = f.toArray();
        System.out.println("HashSet: ");
        for (Object obj : ar) {
            System.out.println(obj);
        }
        f.remove("eiei");



        System.out.println("removing 'eiei': " + f);
        System.out.println("Size: " + f.size());
        System.out.println("empty: " + f.isEmpty());

        f.clear();

        System.out.println("after clear f: " + f);
        System.out.println("Size: " + f.size());
        System.out.println("empty: " + f.isEmpty());

    }
    public void display(Set<String> Hash){
        System.out.println("------------------------------------------------");
        System.out.println("Set Hash : " + Hash);

        System.out.println("------------------------------------------------");
    }
}