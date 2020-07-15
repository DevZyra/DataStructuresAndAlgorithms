import java.util.*;

public class App {
    public static void main(String[] args) {

        NavigableMap<Integer,Integer> tm = new TreeMap<>();

        tm.put(444,30);
        tm.put(2,20);
        tm.put(4,40);
        tm.put(1,10);
        tm.put(5,50);
        tm.put(3,30);
        tm.put(11,30);
        tm.put(23,30);

        tm.put(255553,30);

        System.out.println(tm);

        System.out.println(tm.descendingKeySet());


    }
}
