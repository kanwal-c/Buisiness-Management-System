public class Main {
    public static void main(String[] args) {

        Employee.print();
        Employee e1 = new Manager("Shayan ", "EMP-0021", 39000 , "HR" ,0);

        e1.displayInfo();
        System.out.println("TotalSalary :" + e1.calculateSalary());

        System.out.println("--------------------------");

        Employee e2 = new Manager("Ahmed", "MGR-0022", 100000, "Finance", 12000);
        e2.displayInfo();
        System.out.println("TotalSalary :" + e2.calculateSalary());

        System.out.println("--------------------------");
    

        Employee e3 = new Developer("Maheen", "DEV-0023", 150000, "IT" ,15500 );
        e3.displayInfo();
        System.out.println("TotalSalary :" + e3.calculateSalary());

        System.out.println("--------------------------");

        Employee e4 = new Salesperson("Zain", "SLS-0024", 90000, "Sales and Marketing",2300);
        e4.displayInfo();
        System.out.println("TotalSalary :" + e4.calculateSalary());

        System.out.println("--------------------------");

        System.out.println("Total Employee : " + Employee.getEmployeeCount());
    }
}
