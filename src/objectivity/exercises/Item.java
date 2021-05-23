package objectivity.exercises;

import java.io.Serializable;

public class Item implements Serializable {
    private String name;
    private int quantity;
    private double price;

    public Item() {
        this.name = "";
        this.quantity = 0;
        this.price = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Item(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    public double calculateValue(){
        return this.quantity*this.price;
    }
    public double calculateValueWithDiscount(){
        if(this.quantity >= 5 && this.quantity < 10) return this.calculateValue() * 0.95;
        if(this.quantity >= 10 && this.quantity < 20) return this.calculateValue() * 0.9;
        if(this.quantity >= 20) return this.calculateValue() * 0.85;
        return this.calculateValue();
    }

    @Override
    public String toString() {
        return String.format("%1$-20.20s|%2$10.2f PLN|%3$4d pcs|%4$10.2f PLN|%5$8.2f|%n", this.name, this.price, this.quantity, this.calculateValue(), ((this.calculateValue()/this.calculateValueWithDiscount()-1)*100));
    }

}
