package io.zipcoder.polymorphism;

public class Dog extends Pet{

    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super("Buddy");
    }

    public String speak() {
        String speak = "Bark";
        return speak;
    }
}
