package Abstraction;

public abstract class Smartphone {
    private int ramMemory;
    private int internalMemory;
    private double displaySize;
    private double price;

    public Smartphone(int ramMemory, int internalMemory, double displaySize, double price) {
        this.ramMemory = ramMemory;
        this.internalMemory = internalMemory;
        this.displaySize = displaySize;
        this.price = price;
    }

    public abstract void printInformation();
    public abstract void raisePrice(double amount);
    public abstract void lowerPrice(double amount);

    public int getRamMemory() {
        return ramMemory;
    }

    public void setRamMemory(int ramMemory) {
        this.ramMemory = ramMemory;
    }

    public int getInternalMemory() {
        return internalMemory;
    }

    public void setInternalMemory(int internalMemory) {
        this.internalMemory = internalMemory;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        this.price = price;
    }
}
