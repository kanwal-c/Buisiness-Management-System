public class Developer extends Employee{
    private int projectAllowance;

    public Developer(String name , String employeeId , double basicSalary, String department , int projectAllowance) {
        super(name , employeeId , basicSalary , department);
           this.projectAllowance = projectAllowance;
    }

     @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("ProjectAllowance : " + projectAllowance);
    }
    
    @Override 
    public double calculateSalary(){
        return getBasicSalary() + projectAllowance;
    }
}
