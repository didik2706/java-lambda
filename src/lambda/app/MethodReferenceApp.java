package lambda.app;

import lambda.util.StringUtil;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceApp {
    public static void main(String[] args) {
//        Predicate<String> predicateIsLowerCase = value -> StringUtil.isLowerCase(value);
        Predicate<String> predicateIsLowerCase = StringUtil::isLowerCase;

        System.out.println(predicateIsLowerCase.test("didik"));
        System.out.println(predicateIsLowerCase.test("Didik"));

//        Function<String, String> functionUppercase = value -> value.toUpperCase();
        Function<String, String> functionUppercase = String::toUpperCase;
        System.out.println(functionUppercase.apply("didik"));
    }

    public void run() {
        Predicate<String> predicateIsLowerCase = this::isLowerCase;

        System.out.println(predicateIsLowerCase.test("didik"));
        System.out.println(predicateIsLowerCase.test("Didik"));
    }

    public void run1() {
        MethodReferenceApp app = new MethodReferenceApp();
        Predicate<String> predicateIsLowerCase = app::isLowerCase;

        System.out.println(predicateIsLowerCase.test("didik"));
        System.out.println(predicateIsLowerCase.test("Didik"));
    }

    public boolean isLowerCase(String value) {
        for (var c : value.toCharArray()) {
            if (!Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }
}
