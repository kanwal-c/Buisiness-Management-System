public class Sales {
    private Product product;
    private int soldquantity;
    private double totalBill;
    private static int totalSales=0;
    
  public Sales(Product product,int soldquantity){
  this.product=product;
  this.soldquantity=soldquantity;
  this.totalBill=product.getSell() * soldquantity;
  totalSales++;
  }
  public Product getProduct(){
    return product;
}
public int getSold(){
    return soldquantity;
}
public double getBill(){
    return totalBill;
}
public static int getSales(){
    return totalSales;
}


public void displaySaleDetails() {

    System.out.println("===== SALE RECEIPT =====");
    System.out.println("Product Name: " + product.getName());
    System.out.println("Product Model: " + product.getModel());
    System.out.println("Quantity Sold: " + soldquantity);
    System.out.println("Total Amount: Rs. " + totalBill);
    System.out.println("========================");
}
}


