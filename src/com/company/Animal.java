package com.company;

/*
 * This is the parent class. Also called the super class
 */
public class Animal {

    private String color;
    private String name;

    public void setColor(String c){
        color = c;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public Animal() {
        System.out.println("A new animal has been created!");
    }

    public String sleep() {
        return "An animal sleeps...";
    }
    public String eat() {
        return "An animal eats...";
    }
}