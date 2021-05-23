package company.januszex;

import java.util.ArrayList;
import java.util.List;

public class MarketingManager extends Administration{
    private boolean car;
    private String registrationNumber;
    private String workNumber;
    private List<String> clients;

    public MarketingManager(String firstName, String lastName, String address, double salary, boolean car, String registrationNumber, String workNumber) {
        super(firstName, lastName, address, salary);
        this.car = car;
        this.registrationNumber = registrationNumber;
        this.workNumber = workNumber;
        this.clients = new ArrayList<>();
    }

    @Override
    public void showInformation() {
        System.out.println("Marketing Manager{" + "first Name='" + getFirstName() + '\'' +
                           ", last Name='" + getLastName() + '\'' +
                           ", address='" + getAddress() + '\'' +
                           ", registration number='" + (this.car ? this.registrationNumber : "car is not assigned") + '\'' +
                           ", work number='" + this.workNumber + '\'' +
                           ", clients='" + this.clients.toString() + '\'' +
                           ", salary=" + getSalary() +
                           '}');
    }
    public void addClient(String client){
        this.clients.add(client);
    }
    public void removeClient(String client){
        this.clients.remove(client);
    }

    @Override
    public double computeBonus() {
        return getSalary() + this.clients.size() * 400;
    }
    public void assignCar(String registrationNumber){
        this.car = true;
        this.registrationNumber = registrationNumber;
    }

}
