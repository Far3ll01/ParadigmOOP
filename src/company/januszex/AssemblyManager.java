package company.januszex;

public class AssemblyManager extends Administration{
    private boolean isWorkDone;
    private int overhours;

    public AssemblyManager(String firstName, String lastName, String address, double salary, boolean isWorkDone, int overhours) {
        super(firstName, lastName, address, salary);
        this.isWorkDone = isWorkDone;
        this.overhours = overhours;
    }

    public void updateSalary(double salary) {
        this.setSalary(salary);
    }

    @Override
    public void showInformation() {
        System.out.println("Assembly Manager{" + "firstName='" + getFirstName() + '\'' +
                           ", lastName='" + getLastName() + '\'' +
                           ", address='" + getAddress() + '\'' +
                           ", isWorkDone='" + this.isWorkDone + '\'' +
                           ", overhours='" + this.overhours + '\'' +
                           ", salary=" + getSalary() +
                           '}');
    }

    @Override
    public double computeBonus() {
        return getSalary() + (isWorkDone ? this.overhours * (getSalary()/160)*1.5 : 0);
    }
}
