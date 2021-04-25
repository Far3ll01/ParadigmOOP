package com.company;

import java.util.ArrayList;

public class Order {
    private ArrayList<Product> products;
    private double OrderValue;

    public void add(Product product){
        products.add(product);
        getValueOfOrder();
    }

    public Order() {
        this.products = new ArrayList<>();
        this.OrderValue = 0;
    }

    public void getValueOfOrder(){
        double sum = 0;
        for (Product product : products) {
            sum += product.getValue();
        }
        this.OrderValue = sum;
    }
    public double getValueOfOrder(double discount){
        return this.OrderValue * discount;
    }
}
