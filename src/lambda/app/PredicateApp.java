package lambda.app;

import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {
        Predicate<String> stringPredicate = value -> value.isBlank();

        System.out.println(stringPredicate.test("Didik"));
        System.out.println(stringPredicate.test(""));
     }
}
