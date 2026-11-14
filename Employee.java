abstract class Employee {

    private String name;
    private String employeeId;
    private double basicSalary;
    private String department;
    private static int employeeCount = 0;

    Employee(String name, String employeeId, double basicSalary, String department) {
        this.name = name;
        this.employeeId = employeeId;
        this.basicSalary = basicSalary;
        this.department = department;

        employeeCount++;
    }

    static void print() {

        System.out.println("============================");
        System.out.println("Electronic Store Management ");
        System.out.println("============================");

        System.out.println("Employee Management");
        System.out.println("********************");
    }

    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public String getDepartment() {
        return department;
    }

    public void setdepartment(String department) {
        this.department = department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBasicSalary(double basicSalary) {
        if (basicSalary >= 0) {
            this.basicSalary = basicSalary;
        } else {
            System.out.println("Invalid Salary");
        }
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public abstract double calculateSalary();

    public void displayInfo() {
        System.out.println("Name :" + this.name);
        System.out.println("EmployeeId :" + this.employeeId);
        System.out.println("BasicSalary :" + this.basicSalary);
        System.out.println("Department :" + department);
    }

}
