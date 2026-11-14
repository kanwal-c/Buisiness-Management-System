
public class Main {

    public static void main(String[] args) {

        // =====================================
        //          EMPLOYEE MANAGEMENT
        // =====================================

        System.out.println("\n========== EMPLOYEE MANAGEMENT ==========");

        Employee.print();

        Employee e1 = new Manager(
                "Shayan", "EMP-0021", 39000, "HR", 0);

        e1.displayInfo();
        System.out.println("Total Salary: " + e1.calculateSalary());

        System.out.println("--------------------------------");

        Employee e2 = new Manager(
                "Ahmed", "MGR-0022", 100000, "Finance", 12000);

        e2.displayInfo();
        System.out.println("Total Salary: " + e2.calculateSalary());

        System.out.println("--------------------------------");

        Employee e3 = new Developer(
                "Maheen", "DEV-0023", 150000, "IT", 15500);

        e3.displayInfo();
        System.out.println("Total Salary: " + e3.calculateSalary());

        System.out.println("--------------------------------");

        Employee e4 = new Salesperson(
                "Zain", "SLS-0024", 90000,
                "Sales and Marketing", 2300);

        e4.displayInfo();
        System.out.println("Total Salary: " + e4.calculateSalary());

        System.out.println("--------------------------------");

        System.out.println("Total Employees: "
                + Employee.getEmployeeCount());


        // =====================================
        //           PRODUCT MANAGEMENT
        // =====================================

        System.out.println("\n========== PRODUCT MANAGEMENT ==========");

        System.out.println("\n=========== LAPTOP ===========");

        Product DELL = new Product("Laptop", "DELL", 120000, 150000, 10);
        DELL.displayProduct();

        Product HP = new Product("Laptop", "HP", 80000, 100000, 20);
        HP.displayProduct();

        Product LENOVO = new Product("Laptop", "LENOVO", 50000, 80000, 20);
        LENOVO.displayProduct();


        System.out.println("\n======== SPEAKERS =========");

        Product speakerJBL = new Product("speaker", "JBL GO 3", 10000, 15000, 50);
        speakerJBL.displayProduct();

        Product speakerSony = new Product("speaker", "Sony SRS-X", 18000, 25000, 50);
        speakerSony.displayProduct();


        System.out.println("\n======== SMARTPHONES =======");

        Product iPhone = new Product("Smartphone", "iPhone", 200000, 250000, 25);
        iPhone.displayProduct();

        Product Samsung = new Product("Smartphone", "Samsung Galaxy A55", 80000, 100000, 25);
        Samsung.displayProduct();

        Product Xiaomi = new Product("Smartphone", "Xiaomi", 60000, 80000, 20);
        Xiaomi.displayProduct();

        Product Vivo = new Product("Smartphone", "Vivo", 50000, 70000, 15);
        Vivo.displayProduct();

        Product oppo = new Product("Smartphone", "oppo", 50000, 70000, 15);
        oppo.displayProduct();

        Product Realme = new Product("Smartphone", "Realme", 80000, 100000, 20);
        Realme.displayProduct();


        System.out.println("\n======== HEADPHONES ========");

        Product zero = new Product("Headphone", "Zero Lifestyle", 6000, 8000, 10);
        zero.displayProduct();

        Product audionic = new Product("Headphone", "Audionic Hammer", 6000, 8000, 10);
        audionic.displayProduct();

        Product SonyHeadphone = new Product("Headphone", "Sony WH-CH520", 10000, 12000, 10);
        SonyHeadphone.displayProduct();

        Product Baseuse = new Product("Headphone", "Baseus Bowie H1s", 14000, 16000, 10);
        Baseuse.displayProduct();


        System.out.println("\n========== KEYBOARD ========");

        Product hyperxKb = new Product("Keyboard", "HyperX Alloy Origins", 18000, 22000, 10);
        hyperxKb.displayProduct();

        Product a4techKb = new Product("Keyboard", "A4Tech KRS-85", 1800, 2400, 5);
        a4techKb.displayProduct();

        Product corsairKb = new Product("Keyboard", "Corsair K55 RGB", 9500, 12000, 15);
        corsairKb.displayProduct();


        System.out.println("\n========= AIR PODS =========");

        Product galaxyBuds = new Product("AirPods", "Samsung Galaxy Buds 2", 22000, 26500, 10);
        galaxyBuds.displayProduct();

        Product soundpeats = new Product("AirPods", "SoundPEATS Free2 Classic", 5500, 7000, 15);
        soundpeats.displayProduct();

        Product redmiBuds = new Product("AirPods", "Redmi Buds 4 Active", 4200, 5500, 10);
        redmiBuds.displayProduct();


        System.out.println("\n========== MOUSE ===========");

        Product hpMouse = new Product("Mouse", "HP X1000 Wired", 1200, 1600, 5);
        hpMouse.displayProduct();

        Product redragonMouse = new Product("Mouse", "Redragon M601 Centrophorus", 3200, 4200, 10);
        redragonMouse.displayProduct();

        Product logitechMx = new Product("Mouse", "Logitech MX Master 3S", 24000, 28500, 10);
        logitechMx.displayProduct();


        System.out.println("\n========= MONITOR ==========");

        Product asusMonitor = new Product("Monitor", "Asus TUF Gaming 24 Inch", 45000, 52000, 12);
        asusMonitor.displayProduct();

        Product lgMonitor = new Product("Monitor", "LG UltraGear 27 Inch", 62000, 72000, 15);
        lgMonitor.displayProduct();

        Product viewsonicMonitor = new Product("Monitor", "ViewSonic VA2215-H", 24000, 29000, 10);
        viewsonicMonitor.displayProduct();


        // =====================================
        //             SALES MANAGEMENT
        // =====================================

        System.out.println("\n========== SALES MANAGEMENT ==========");

        // Sale 1: Two DELL laptops

        Sales sale1 = new Sales(DELL, 2);
        sale1.displaySaleDetails();

        // Sale 2: One HP laptop

        Sales sale2 = new Sales(HP, 1);
        sale2.displaySaleDetails();

        System.out.println("Total Sales Records: " + Sales.getSales());


        // =====================================
        //             PAYMENT MANAGEMENT
        // =====================================

        System.out.println("\n========== PAYMENT MANAGEMENT ==========");

        // Cash payment for DELL sale

        Payment payment1 = new CashPayment(sale1.getBill());

        System.out.println("\n===== CASH PAYMENT =====");
        payment1.pay();


        // Card payment for HP sale

        Payment payment2 = new CardPayment(sale2.getBill());

        System.out.println("\n===== CARD PAYMENT =====");
        payment2.pay();


        System.out.println("\n========== SYSTEM COMPLETED ==========");

    }
}
