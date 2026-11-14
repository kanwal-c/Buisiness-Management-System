public class Salesperson extends Employee {

    private double commission;

    public Salesperson(String name, String employeeId, double basicSalary,String department, double commission) {
        super(name, employeeId, basicSalary , department);
        this.commission = commission;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Commission: " + commission);
    }

    @Override
    public double calculateSalary() {
        return getBasicSalary() + commission;
    }
}
