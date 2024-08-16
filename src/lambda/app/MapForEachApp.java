package lambda.app;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapForEachApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("first", "Didik");
        map.put("middle", "Nur");
        map.put("last", "Hidayat");

        // forEach map
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // forEach with anonymous class
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println(s + " : " + s2);
            }
        });

        // forEach with lambda
        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
