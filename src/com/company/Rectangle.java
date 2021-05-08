package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Rectangle {
    private final DecimalFormat df = new DecimalFormat("#0.00");
    private double a;
    private double b;
    private double area;
    public void readData(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter lenght of a");
        this.a = input.nextDouble();
        System.out.println("Please enter lenght of b");
        this.b = input.nextDouble();
        this.calculateArea();
    }
    public void calculateArea(){
        this.area = this.a * this.b;
    }
    public void printValues(){
        System.out.println("Rectangle is built from a = " + df.format(this.a) + " and b = " + df.format(this.b) + " its area is equal to " + df.format(this.area));
    }
}
