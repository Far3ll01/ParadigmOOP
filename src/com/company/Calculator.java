package com.company;

import java.util.Scanner;

public class Calculator {
    private boolean isRunning;

    public Calculator() {
        this.isRunning = true;
    }

    public static void addition(double a, double b){
        System.out.println("Sum of " + a + " and " + b + " is equal " + (a+b));
    }
    public static void subtraction(double a, double b){
        System.out.println("difference of " + a + " and " + b + " is equal to: " + (a-b));
    }
    public static void multiplication(double a, double b){
        System.out.println("product of " + a + " and " + b + " is equal to: " + (a*b));
    }
    public static void division(double a, double b){
        if(b != 0) {
            System.out.println("quotient of " + a + " and " + b + " is equal to: " + (a * b));
        }else{
            System.out.println("division by zero is forbidden!!!");
        }
    }
    public void startCalculator(){
        Scanner input = new Scanner(System.in);
        String temp;
        String[] array;
        while(this.isRunning){
            System.out.println("""
                    Calculator is running...
                    To calculate something please enter simple equation ie. "10 + 12"
                    To stop calculator please enter "Stop"
                    """);
            temp = input.nextLine();
            if (temp.equalsIgnoreCase("Stop")){
                this.stopCalculator();
                continue;
            }
            array = temp.split("[+*/-]",2);
            if(temp.contains("+")){
                addition(Double.parseDouble(array[0]), Double.parseDouble(array[1]));
            }
            if(temp.contains("-")){
                subtraction(Double.parseDouble(array[0]), Double.parseDouble(array[1]));
            }
            if(temp.contains("*")){
                multiplication(Double.parseDouble(array[0]), Double.parseDouble(array[1]));
            }
            if(temp.contains("/")){
                division(Double.parseDouble(array[0]), Double.parseDouble(array[1]));
            }
            System.out.println();
        }
        input.close();
    }
    public void stopCalculator(){
        this.isRunning = false;
    }
}
