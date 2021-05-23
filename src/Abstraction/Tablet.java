package Abstraction;

public class Tablet extends Smartphone{
    public Tablet(int ramMemory, int internalMemory, double displaySize, double price) {
        super(ramMemory, internalMemory, displaySize, price);
    }

    @Override
    public void printInformation() {
        System.out.println("MobilePhone{\n" +
                           "    ramMemory = " + getRamMemory() + ",\n" +
                           "    internalMemory = " + getInternalMemory() + ",\n" +
                           "    displaySize = " + getDisplaySize() + ",\n" +
                           "    price = " + getPrice() + "\n" +
                           "}");
    }

    @Override
    public void raisePrice(double amount) {
        setPrice(getPrice() + amount);
    }

    @Override
    public void lowerPrice(double amount) {
        setPrice(getPrice() - amount);
    }
}
