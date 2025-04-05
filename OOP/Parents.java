// File name: Main.java

class Parent {
    void showMessage() {
        System.out.println("This is the Parent class.");
    }
}

class Child extends Parent {
    @Override
    void showMessage() {
        System.out.println("This is the Child class (overridden method).");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent obj1 = new Parent();    // Calls Parent version
        obj1.showMessage();

        Child obj2 = new Child();      // Calls Child version
        obj2.showMessage();

        Parent obj3 = new Child();     // Calls Child version (dynamic method dispatch)
        obj3.showMessage();
    }
}
