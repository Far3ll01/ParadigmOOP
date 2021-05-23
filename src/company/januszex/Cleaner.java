package company.januszex;

import java.util.ArrayList;
import java.util.List;

public class Cleaner implements Employee {
    private String firstName;
    private String lastName;
    private String address;
    private double salary;
    private List<String> warnings;

    public Cleaner(String firstName, String lastName, String address, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.salary = salary;
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
        this.salary = this.salary *0.9;
    }
}
