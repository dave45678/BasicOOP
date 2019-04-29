package com.company;

public class AnimalApp {

    public static void main(String[] args) {

        Animal a = new Animal();
        print(a.eat());
        print(a.sleep());

        a.setColor("red");
        print(a.getColor());
        a.setName("tori");
        print(a.getName());
        print("I have a dog whose name is " + a.getName() + " and she is color " + a.getColor());

        Cat c = new Cat();
        print(c.eat());
        print(c.sleep());
        print(c.purr());


        Bird b = new Bird(); // attn
        print(b.eat());
        print(b.sleep());
        print(b.fly());

    }

    private static void print(String s) {
        System.out.println(s);
    }
}
