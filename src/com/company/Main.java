package com.company;

import java.util.Scanner;

public class Main {
    public static void exercise_3(){
        Cat cat1 = new Cat("Molly", "Brown", "Persian", 1.5, 1  );
        Cat cat2 = new Cat("Tiger", "Gray", "British Longhair", 2, 2  );
        Cat cat3 = new Cat("Poppy", "Black", "Maine Coon", 1, 1  );
    }
    public static void exercise_4(){
        int menu;
        String FirstName, LastName, Company, PhoneNumber, Address;
        Scanner input = new Scanner(System.in);
        BusinessCardHolder businessCardHolder = new BusinessCardHolder();
        businessCardHolder.add(new BusinessCard("Elwira", "Common", "Flashpoint", "268-877-4330", "0 Hoard Terrace"));
        businessCardHolder.add(new BusinessCard("Isacco", "Pembridge", "Riffwire", "727-287-2669", "28 Dayton Trail"));
        businessCardHolder.add(new BusinessCard("Georgena", "Ellor", "Mita", "917-823-8186", "748 Eastwood Place"));
        while(true){
            System.out.println("""
                    MENU
                    1. To add new object to the list
                    2. Print existing list
                    3. Remove first element
                    0. Exit""");
            menu = input.nextInt();
            switch (menu) {
                case 1 -> {
                    System.out.println("Enter your first name");
                    FirstName = input.nextLine();
                    System.out.println("Enter your last name");
                    LastName = input.nextLine();
                    System.out.println("Enter your company name");
                    Company = input.nextLine();
                    System.out.println("Enter your phone number");
                    PhoneNumber = input.nextLine();
                    System.out.println("Enter your street address");
                    Address = input.nextLine();
                    businessCardHolder.add(new BusinessCard(FirstName, LastName, Company, PhoneNumber, Address));
                }
                case 2 -> businessCardHolder.printAll();
                case 3 -> businessCardHolder.removeFirst();
                case 0 -> System.exit(0);
            }
        }
    }
    public static void exercise_5(){
        Calculator calculator = new Calculator();
        calculator.startCalculator();
    }
    public static void exercise_6(){
        CurrencyConverter converter = new CurrencyConverter();
        converter.runConverter();
    }

    public static void main(String[] args) {

    }
}
