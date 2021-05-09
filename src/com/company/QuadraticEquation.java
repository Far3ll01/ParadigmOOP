package com.company;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    private double x1;
    private double x2;
    private double x0;
    private int Case;

    @Override
    public String toString() {
        return this.a + "x^2+" + this.b + "x +" + this.c +"=0";
    }
    public void readData(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert value for a ");
        this.a = input.nextDouble();
        System.out.println("Please insert value for b");
        this.b = input.nextDouble();
        System.out.println("Please insert value for c");
        this.c = input.nextDouble();
        System.out.println(this);
        input.close();
    }
    public void solveEquation(){
        if(this.a == 0){
            if(this.b == 0 && this.c != 0){
                System.out.println("Inconsistency");
            }else{
                System.out.println("Equation have one root in x = " + -this.c/this.b);
            }
        }else{
             double delta = Math.pow((Math.pow(this.b, 2) - 4 * this.a * this.c), 0.5);
             if(delta > 0) this.Case = 1;
             if(delta == 0) this.Case = 2;
             if(delta < 0) this.Case = 3;
            switch (this.Case) {
                case 1 -> {
                    this.x1 = ((-this.b + delta) / 2 * this.a);
                    this.x2 = ((-this.b - delta) / 2 * this.a);
                }
                case 2 -> this.x0 = (-this.b / 2 * this.a);
            }
        }
    }
    public void showResults(){
        if(this.Case == 1) System.out.println("Equation have two roots in x = " + this.x1 + " and in x = " + this.x2);
        if(this.Case == 2) System.out.println("Equation have one double root in x = " + x0);
        if(this.Case == 3) System.out.println("Equation have no roots");
    }
}
