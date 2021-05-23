package objectivity.exercises;

import java.io.*;

public class Order implements Serializable {
    private Item[] items;
    private int maxSize;
    private int size;

    public static void saveOrder(Order o, String fileName) throws IOException {
        if(o.size < 1){
            return;
        }
        FileWriter csvWriter = new FileWriter(fileName);
        csvWriter.append(String.format("%-20.20s|%14.14s|%8.8s|%14.14s|%8.8s|%n", "Name", "Price", "Quantity", "Item total", "Discount"));
        for (Item it : o.items) {
            if(it != null){
                csvWriter.append(it.toString());
            }
        }
        csvWriter.flush();
        csvWriter.close();
    }

    public static Order readOrder(String fileName) throws IOException {
        BufferedReader csvReader = new BufferedReader(new FileReader(fileName));
        Order tempOrder = new Order();
        String tempName;
        int tempQuantity;
        double tempPrice;
        String row;
        while((row = csvReader.readLine()) != null){
            tempName = row.substring(0, 19).trim();
            tempPrice = Double.parseDouble(row.substring(21, 31).trim());
            tempQuantity = Integer.parseInt(row.substring(36,40).trim());
            tempOrder.addItem(new Item(tempName, tempQuantity, tempPrice));
        }
        csvReader.close();
        return tempOrder;
    }

    public Order(int maxSize) {
        this.items = new Item[maxSize];
        this.maxSize = maxSize;
        this.size = 0;
    }

    public Order() {
        this.items = new Item[10];
        this.maxSize = 10;
        this.size = 0;
    }

    public void addItem(Item item){
        for (Item it : this.items) {
            if (it != null) {
                if (it.getName().equals(item.getName()) && it.getPrice() == item.getPrice()) {
                    it.setQuantity(it.getQuantity() + item.getQuantity());
                    return;
                }
            }
        }
        this.items[size++] = item;
    }
    public void removeItem(int index){
        if(this.items[index] != null){
            this.items[index] = null;
            size--;
        }
    }
    public void editItem(int index, String name, int quantity, double price){
        if(this.items[index] != null){
            this.items[index].setName(name);
            this.items[index].setQuantity(quantity);
            this.items[index].setPrice(price);
        }
    }
    public double calculateValue(){
        double sum = 0;
        for (Item it : items) {
            if(it != null) {
                sum += it.calculateValue();
            }
        }
        return sum;
    }
    public double calculateValueWithDiscount(){
        double sum = 0;
        for (Item it : items) {
            if(it != null) {
                sum += it.calculateValueWithDiscount();
            }
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-20.20s|%14.14s|%8.8s|%14.14s|%8.8s|%n", "Name", "Price", "Quantity", "Item total", "Discount"));
        for (Item it : this.items) {
            if(it != null){
                sb.append(it);
            }
        }
        sb.append(String.format("Total: %1$13.2f|Discount: %2$13.2f|Final: %3$16.2f|", this.calculateValue(), (this.calculateValue() - this.calculateValueWithDiscount()), this.calculateValueWithDiscount()));
        return sb.toString();
    }
}
