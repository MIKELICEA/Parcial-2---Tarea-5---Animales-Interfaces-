package oop.parcial2;

import oop.parcial2.animales.*;

public class Main {
    public static void main(String[] args) {

        //Animales voladores
        Animal eagle = new Eagle();
        Animal falcon = new Falcon();
        Animal condor = new Condor();
        Animal sparrow= new Sparrow();

        //Animales nadadores
        Animal trout = new Trout();
        Animal tilapia = new Tilapia();
        Animal salmon = new Salmon();
        Animal sardine = new Sardine();

        //Animales caminadores
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal mouse = new Mouse();

        System.out.println(eagle);
        System.out.println(falcon);
        System.out.println(condor);
        System.out.println(sparrow);

        System.out.println(trout);
        System.out.println(tilapia);
        System.out.println(salmon);
        System.out.println(sardine);

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(mouse);
    }
}