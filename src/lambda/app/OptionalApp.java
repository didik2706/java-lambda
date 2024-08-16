package lambda.app;

import java.util.Optional;

public class OptionalApp {
    public static void main(String[] args) {
        sayHello("Didik");

        String name = null;
        sayHello(name);
    }

    public static void sayHello(String name) {
        // cara 1
        Optional<String> optionalName = Optional.ofNullable(name);
        Optional<String> optionalNameUpper = optionalName.map(value -> value.toUpperCase());
        optionalNameUpper.ifPresent(s -> System.out.println("HELLO, " + s));

        // cara 2
        Optional.ofNullable(name).map(value -> value.toUpperCase())
                .ifPresentOrElse(
                    value -> System.out.println("HELLO, " + value),
                        () -> System.out.println("HELLO")
                );
    }
}
