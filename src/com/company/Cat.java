package com.company;

public class Cat {
    private String Name;
    private String color;
    private String strain;
    private double weight;
    private int age;

    public void saySomething(){
        System.out.println("Moew moew");
    }
    public void eatSomething(double weight){
        this.weight += weight;
    }
    public void growOlder(int age){
        this.age += age;
    }

    public Cat(String name, String color, String strain, double weight, int age) {
        Name = name;
        this.color = color;
        this.strain = strain;
        this.weight = weight;
        this.age = age;
    }
}