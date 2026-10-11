//multilevel inheretence

// Level 1: Grandparent
class Grandparent {
    void greet() {
        System.out.println("Hello from Grandparent");
    }
}

// Level 2: Parent
class Parent extends Grandparent {
    void message() {
        System.out.println("Hello from Parent");
    }
}

// Level 3: Child
class Child extends Parent {
    void info() {
        System.out.println("Hello from Child");
    }
}

public class Main_multileve{
    public static void main(String[] args) {
        Child c = new Child();

        c.greet();   // Grandparent ka method
        c.message(); // Parent ka method
        c.info();    // Child ka method
    }
}
