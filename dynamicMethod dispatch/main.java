class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {

        Animal a;       // Parent reference

        a = new Dog();  // Dog object
        a.sound();      // Dog's sound() runs

        a = new Cat();  // Cat object
        a.sound();      // Cat's sound() runs
    }
}