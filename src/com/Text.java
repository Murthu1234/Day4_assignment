package com;

public class Text {
    static int x = 11;
    static int y = 33;
     public void method(int x) {
        Text t = new Text();
        this.x = 22;
        y = 44;

        System.out.println("Test.x: " + Text.x); // 22
        System.out.println("t.x: " + t.x);  //22
        System.out.println("t.y: " + t.y); // 33
        System.out.println("y: " + y); // 44
    }

    public static void main(String args[])
    {
        Text t = new Text();
        t.method(25);
    }
}
/*
public class Bird {
    string name;
    string color;
    string species;
    int age;

    void eat() {
        System.out.println("bird will eat");
    }
    void swim(){

    }
    void fly() {

    }

public static void main(String args[]) {
    Bird bird = new Bird();
    bird.eat();
}

}
*/