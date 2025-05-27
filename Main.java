package app;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Creating a purchase order for the product
        PurchaseOrder purchaseOrder = new PurchaseOrder(238900, "Hair Mousse", "Lola Ltd", 20, 800.00, "TN7947", 79.99,20);
        // Creating a stock library
        StockLibrary getStockLibrary = new StockLibrary();
        // Creating a Supplier Library
        SupplierLibrary getSupplierLibrary = new SupplierLibrary();
        // Creating Inventory Class 
        // StockMonitor getStockMonitor = new StockMonitor("Hair Mousse", 150, 30);
        // User Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to BNU Industry Solutions Ltd!");
        int userInput;
        do {
            System.out.println(
                      "Enter 1 to add a Supplier\n"
                    + "Enter 2 to remove a Supplier\n"
                    + "Enter 3 to see Supplier Library\n"
                    + "Enter 4 to see Purchase order \n"
                    + "Enter 5 to add a Stock \n"
                    + "Enter 6 to remove a Stock \n"
                    + "Enter 7 to view Stocks \n"
                    + "Enter 8 to view Stock levels");
            userInput = scanner.nextInt();
            Product product;
            Supplier supplier;
            // Seeing supplier Library
            switch (userInput) {
                case 1:
                    getSupplierLibrary.addSuppliers();
                    System.out.println("Your Supplier has now been added");
                    break;
                case 2:
                    System.out.println("Hey, you'd like to remove a supplier!");
                    getSupplierLibrary.removeSupplier();
                    break;
                case 3:
                    System.out.println("Here's the Supplier Library:");
                    getSupplierLibrary.printSuppliers();
                    break;
                case 4:
                    // Calculating total cost of price and shipping from the getPrice and
                    // getShippingTotal method
                    double total = purchaseOrder.CalculateTotalCost();
                    System.out.println("Purchase Order total: £" + total);

                    // Order confirmation
                    boolean success = false;
                    if (success) {
                        purchaseOrder.markAsPaid();
                        System.out.println("Order paid successfully!");
                    }

                    // Display the purchase order details
                    purchaseOrder.displayOrderDetails();
                    // Update and display the tracking status
                    purchaseOrder.updateTrackingStatus("Delivered");
                    break;
                //Adding and removing Inventory Stocks
                case 5:
                    getStockLibrary.addStocks();
                    System.out.print("The Stock has now been added. ");
                    break;
                case 6:
                    System.out.print("You would like to remove a stock!");
                    getStockLibrary.removeProduct();
                    break;
                case 7:
                    System.out.println("Here are the current Stocks: ");
                    getStockLibrary.printProducts();
                case 8:
                    System.out.println("Checking Stock levels....");
                    //getStockMonitor.displayAlert();
                    
                 }
            } while (userInput != 8);

    }

}

