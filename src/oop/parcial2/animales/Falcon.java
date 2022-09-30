package oop.parcial2.animales;

public class Falcon extends Animal implements AnimalThatFly, AnimalThatWalk{
    @Override
    public String toString() {
        return "Falcon";
    }

    @Override
    public void fly() {

    }

    @Override
    public void walk() {

    }
}
