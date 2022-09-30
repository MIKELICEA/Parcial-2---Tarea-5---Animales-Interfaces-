package oop.parcial2.animales;

public class Eagle extends Animal implements AnimalThatFly, AnimalThatWalk{

    @Override
    public String toString() {
        return "Eagle";
    }

    @Override
    public void fly() {

    }

    @Override
    public void walk() {

    }
}
