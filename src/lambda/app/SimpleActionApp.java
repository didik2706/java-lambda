package lambda.app;


import lambda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {
//        SimpleAction simpleAction = new SimpleAction() {
//            @Override
//            public String action(String name) {
//                return name;
//            }
//        };
//
//        System.out.println(simpleAction.action("Didik 1"));
//
//        SimpleAction simpleAction2 = (String name) -> {
//            return name;
//        };
//        System.out.println(simpleAction2.action("Didik 2"));

        SimpleAction simpleAction1 = (String name) -> {
          return "Hello, " + name;
        };

        SimpleAction simpleAction2 = name -> {
          return "Hello, " + name;
        };

        SimpleAction simpleAction3 = (String name) -> "Hello, " + name;
        SimpleAction simpleAction4 = (name) -> "Hello, " + name;
        SimpleAction simpleAction5 = name -> "Hello, " + name;
    }
}
