package io.zipcoder.polymorphism;

public class Fish extends Pet {

    public Fish(String name) {
        super(name);
    }

    public Fish() {
        super("Bob");
    }

    public String speak() {
        String speak = "Blob";
        return speak;
    }
}
