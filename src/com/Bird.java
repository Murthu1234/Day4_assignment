
package com;

public class Bird {
    String name;
    String color;
    String species;
    int age;

    void eat() {
        System.out.println("bird will eat");
    }
    void swim(){
        System.out.println("bird can swim");
    }
    void fly() {
        System.out.println("bird can fly");

    }
public static void main(String args[]) {
    Bird parrot = new Bird();
    parrot.eat();
    parrot.fly();
    parrot.swim();

    }

}



