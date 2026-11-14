public class Manager extends Employee{
    private double bonus;

    Manager(String name , String employeeId , double basicSalary , String department,  double bonus){
        super(name , employeeId , basicSalary , department);
        this.bonus = bonus;
    }
     
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Bonus :" + bonus);
    }

    @Override
    public double calculateSalary(){
        return getBasicSalary() + bonus;
    }
}
