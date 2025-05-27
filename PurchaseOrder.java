package app;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
//import java.util.Scanner;

public class PurchaseOrder extends Product {

 //public static void main(String[] args) {
    //constructor
    PurchaseOrder purchaseOrder = new PurchaseOrder(238900, "Hair Mousse", "Lola Ltd", 20, 800.00, "TN7947", 79.99,20);
 
    // additional attributes for purchase ID and tracking number
    private String TrackingNumber;
    private double ShippingTotal;
    private List<Product> products = new ArrayList<>(); // calling in the array list of products from the product class
    private boolean paid = false;

    public PurchaseOrder(int ProductID, String ProductName, String SupplierName, int ProductQuantity, double ProductPrice, String TrackingNumber, double ShippingTotal, int Threshold) {
        // Call superclass constructor to initalise common attributes
        super(ProductID, ProductName, SupplierName, ProductQuantity, ProductPrice, Threshold);
        this.TrackingNumber = TrackingNumber;
        this.ShippingTotal = ShippingTotal;
    }

    // Getter for tracking number
    public String getTrackingNumber() {
        return TrackingNumber;
    }

    //Getter for Shipping cost
    public double getShippingTotal() {
        return ShippingTotal;
    }

    // Adding the product
    public void addProduct(Product product) {
        products.add(product);
    }

    // Calculating the total cost of the purchase including the shipping
    public double CalculateTotalCost() {
        double subtotal = 800.00;
        double shippingTotal = 79.99;

        for (Product p : products) {
            subtotal += p.getProductPrice();
            shippingTotal += p.getShippingTotal();
        }
        return subtotal + shippingTotal;
    }

    // Mark the product as paid
    public void markAsPaid() {
        this.paid = true;
    }

    public boolean isPaid() {
        return paid;
    }

    // Method to update the tracking status
    public void updateTrackingStatus(String newStatus) {
        // Printing the updated tracking status
        System.out.println("Tracking Number: " + TrackingNumber + " - Status: " + newStatus);
    }

    // Override the displayOrderDetails methos to include addtional details
    @Override
    public void displayOrderDetails() {
        // calling the superclass method to display common details
        super.displayOrderDetails();
        // Display additional details for online order
        System.out.println("Tracking Number: " + TrackingNumber);
        System.out.println("Shipping Total: £" + ShippingTotal);
    }

    
}

 
