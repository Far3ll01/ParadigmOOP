package company.januszex;

import java.util.ArrayList;
import java.util.List;

public class TruckDriver implements Employee, Driver{
    private String firstName;
    private String lastName;
    private String address;
    private double salary;
    private String vehicle;
    private List<String> warnings;
    private boolean technicalExamination;

    public TruckDriver(String firstName, String lastName, String address, double salary, String vehicle, boolean technicalExamination) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.salary = salary;
        this.vehicle = vehicle;
        this.technicalExamination = technicalExamination;
        this.warnings = new ArrayList<>();
    }

    @Override
    public void assignVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public boolean checkTechnicalExamination() {
        return this.technicalExamination;
    }

    @Override
    public void showInformation() {
        System.out.println("TruckDriver{" + "firstName='" + firstName + '\'' +
                           ", lastName='" + lastName + '\'' +
                           ", address='" + address + '\'' +
                           ", salary=" + salary +
                           ", vehicle='" + vehicle + '\'' +
                           ", warnings=" + warnings +
                           ", technicalExamination=" + technicalExamination +
                           '}');
    }


    @Override
    public void grantBonus() {
        this.salary = this.salary*1.1;
    }

    @Override
    public double computeNet() {
        return this.salary*0.83;
    }

    @Override
    public void giveWarning(String warning) {
        this.warnings.add(warning);
    }

    @Override
    public void givePunishment() {
        this.salary = this.salary*0.9;
    }
}
