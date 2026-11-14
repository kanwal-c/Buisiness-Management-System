public class CashPayment extends Payment {

    public CashPayment(double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println("Payment Method: Cash");
        System.out.println("Amount Paid: Rs. " + amount);
        System.out.println("Cash Payment Successful!");
    }
}
