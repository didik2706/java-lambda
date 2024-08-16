package lambda.app;

import java.util.List;
import java.util.function.Consumer;

public class ForEachApp {
    public static void main(String[] args) {
        List<String> list = List.of("Didik", "Nur", "Hidayat");

        // forEach List
        for (var value : list) {
            System.out.println(value);
        }

        // forEach with anonymous class
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println(value);
            }
        });

        // forEach with lambda
        list.forEach(value -> System.out.println(value));

        // forEach with method reference
        list.forEach(System.out::println);
    }
}
