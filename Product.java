public class Product {
    private String name;
    private String model;
    private int purchasePrice;
    private int sellingPrice;
    private int quantity;

    public Product(String name, String model, int purchasePrice, int sellingPrice, int quantity){
        this.name=name;
        this.model=model;
        this.purchasePrice=purchasePrice;
        this.sellingPrice=sellingPrice;
        this.quantity=quantity;
    
    }
    public String getName(){
        return name;
    }
    public String getModel(){
        return model;
    }
    public int getPurchase(){
        return purchasePrice;
    }
    public int getSell(){
        return sellingPrice;
    }
    
    public int getQuantity(){
        return quantity;
    }
    public int Profit(){
        return sellingPrice - purchasePrice;
    }
    
    
    public void displayProduct(){
        System.out.println("Product : " +name);
        System.out.println("Model : " +model);
        System.out.println("Purchase Price : " +purchasePrice);
        System.out.println("Selling Price : " +sellingPrice);
        System.out.println("Quantity : " +quantity);
        System.out.println("profit per Product: Rs"+ Profit());
        System.out.println("============================");
        System.out.println("");
    }
}


