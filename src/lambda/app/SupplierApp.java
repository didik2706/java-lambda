package lambda.app;

import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Didik Nur Hidayat";
        System.out.println(supplier.get());
    }
}
