package company.januszex;

import java.util.ArrayList;
import java.util.List;

public class SawOperator implements Employee, WarehouseWorker{
    private String firstName;
    private String lastName;
    private String address;
    private double salary;
    private String machineType;
    private int positionNumber;
    private boolean physicalExamination;
    private List<String> warnings;

    public SawOperator(String firstName, String lastName, String address, double salary, String machineType, int positionNumber, boolean physicalExamination) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.salary = salary;
        this.machineType = machineType;
        this.positionNumber = positionNumber;
        this.physicalExamination = physicalExamination;
        this.warnings = new ArrayList<>();
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
        this.salary= this.salary*0.9;
    }

    @Override
    public void assignPosition(int positionNumber) {
        this.positionNumber = positionNumber;
    }

    @Override
    public boolean checkPhysicalExamination() {
        return this.physicalExamination;
    }

    @Override
    public void checkPiecework() {
        System.out.println("piecework");
    }
}
