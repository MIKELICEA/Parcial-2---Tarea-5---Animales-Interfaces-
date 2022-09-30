package oop.parcial2.animales;

public class Duck extends Animal implements AnimalThatWalk, AnimalThatFly, AnimalThatSwims {

    @Override
    public String toString() {
        return "Duck";
    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void walk() {

    }
}
