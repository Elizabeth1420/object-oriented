package app;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Product {
public static void main(String[] args) {
    //turn this into a constructor 
    Product order = new Product(238900, "Hair Mousse", "Lola Ltd", 2, 40.00,30);
    order.displayOrderDetails();
    System.out.println();
}

    private int ProductID;
    private String ProductName;
    private int ProductQuantity;
    private double ProductPrice;
    private String SupplierName;
    private int Threshold;


    public Product(int productID, String productName, String supplierName, int productQuantity, double productPrice, int threshold) {
        this.ProductID = productID;
        this.ProductName = productName;
        this.ProductQuantity = productQuantity;
        this.ProductPrice = productPrice;
        this.SupplierName = supplierName;
        this.Threshold = threshold;
    }

    public Product(String string, int i, int j) {
        //TODO Auto-generated constructor stub
    }

    public boolean isLowStock() {
        return ProductQuantity <= Threshold;
    }

    public void displayAlert() {
        if (isLowStock()) {
            System.out.println("ALERT: Low stock for " + ProductName + ". Remaining: " + ProductQuantity);
        }
    }
    // Method to get productID
    public int getProductID() {
        return ProductID;
    }

    // Method to get productName
    public String getProductName() {
        return ProductName;
    }

    public String getSupplierName() {
        return SupplierName;
    }

    // Method to get productQuantity
    public int getProductQuantity() {
        return ProductQuantity;
    }

    // Method to get productQuantity
    public double getProductPrice() {
        return ProductPrice;
    }

    public int getThreshold() {
        return Threshold;
    }


    public String getInfo() {
        return ProductID + " " + ProductName + " " + SupplierName + " " + ProductQuantity + " " + ProductPrice;
    }

    //Method to display order details
    public void displayOrderDetails() {
        System.out.println("Product ID: " + ProductID);
        System.out.println("Product Name: " + ProductName);
        System.out.println("Supplier Name: " + SupplierName);
        System.out.println("Product Quantity: " + ProductQuantity);
        System.out.println("Product Price: £" + ProductPrice);


    }

    public double getShippingTotal() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getShippingTotal'");
    }
}