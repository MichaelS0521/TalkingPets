package io.zipcoder.polymorphism;

public class Cat extends Pet{
    public Cat(String name) {
        super(name);
    }

    public Cat() {
        this("Chet");
    }

    public String getName(){
        return super.getName();
    }

    public String speak() {
        String meow = "Meow";
        return meow;
    }
}
