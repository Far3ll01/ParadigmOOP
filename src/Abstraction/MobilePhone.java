package Abstraction;

public class MobilePhone extends Smartphone{
    private boolean doubleSim;

    public MobilePhone(int ramMemory, int internalMemory, double displaySize, double price, boolean doubleSim) {
        super(ramMemory, internalMemory, displaySize, price);
        this.doubleSim = doubleSim;
    }

    @Override
    public void printInformation() {
        System.out.println("MobilePhone{\n" +
                           "    ramMemory = " + getRamMemory() + ",\n" +
                           "    internalMemory = " + getInternalMemory() + ",\n" +
                           "    displaySize = " + getDisplaySize() + ",\n" +
                           "    price = " + getPrice() + ",\n" +
                           "    doubleSim = " + this.doubleSim + "\n" +
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
