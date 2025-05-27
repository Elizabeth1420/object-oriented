package app;
import java.util.ArrayList;
import java.util.Scanner;

//Product library class
public class StockLibrary {
    public ArrayList<Product> products = new ArrayList<Product>();
    private int threshold;
    public StockLibrary() {
        products.add(new Product(238900, "Hair Mousse","Lola Ltd", 150, 15.50,30));
        products.add(new Product(238901, "Shampoo", "Carriers Ltd", 250, 20.99,100));
        products.add(new Product(238902, "Conditioner", "The Hair Supplier", 100, 25.50,30));
        products.add(new Product(238903, "Aftercare", "Hair for us",50, 30.50,10));
        products.add(new Product(238904, "Butter hair treatment", "New Wave", 150, 49.99,30));
    }

    // Option 1 to add Stock
    public void addStocks() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the Stock name: ");
        String productName = scanner.nextLine();

        System.out.print("Enter the Supplier Name: ");
        String supplierName = scanner.nextLine();

        System.out.print("Enter the Stock quantity: ");
        int productQuantity = scanner.nextInt();

        System.out.print("Enter the Stock price: ");
        double productPrice = scanner.nextDouble();

        System.out.print("Enter the Product ID: ");
        int productID = scanner.nextInt();

        

       // Setting an arraylist
       Product userProduct = new Product(productID, productName, supplierName, productQuantity, productPrice, threshold);
        products.add(userProduct);
    }

    public void printProducts() {
        for (Product printProducts : products) { // printing out added stocks
            System.out.println("Stock Name: " + printProducts.getProductName() + ", Supplier Name: " + printProducts.getSupplierName() + ", Stock Quantity: " + printProducts.getProductQuantity()
                 + ", Price: " + printProducts.getProductPrice() + ", Product ID: " + printProducts.getProductID() + ", Stock level: " + printProducts.getThreshold());
        }
   }

    // Option 2 to remove stocks
    public void removeProduct() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter 1 to remove Stock by Product name or Enter 2 to remove by Product Quantity");
        int userInput = scanner.nextInt();
        scanner.nextLine();
        if (userInput == 1) {
            System.out.println("What is the name of the Stock you would like to remove?");

            String productName = scanner.nextLine();
            ArrayList<Product> removedProducts = removeProduct(productName, true);
            printRemovedProducts(removedProducts);
        } else if (userInput == 2) {
            System.out.println("What is the Product Quantity you would like to remove?");

            int productQuantity = scanner.nextInt();
            ArrayList<Product> removedProducts = removeProduct(productQuantity, false);
            printRemovedProducts(removedProducts);
        } else {
            System.out.println("Invalid input");
        }
     }

     private ArrayList<Product> removeProduct(String productName, boolean isProductName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeProduct'");
    }

     public void printRemovedProducts(ArrayList<Product> removedProducts) { //print removed stocks from the arraylist of products
        for (Product removedProduct : removedProducts) {
            System.out.println(" You have successfully removed a stock!");
            System.out.println("Removed Stock name: " + removedProduct.getProductName() + ", Stock Quantity: " + removedProduct.getProductQuantity() + 
            ", Price: " + removedProduct.getProductPrice() + ", Product ID: " + removedProduct.getProductID());
            
        }
     }
     
     public ArrayList<Product> removeProduct(int productToRemove, boolean isProductName) {
        ArrayList<Product>removedProducts = new ArrayList<Product>();
        for (int i = products.size() -1; i >= 0; i--) {
            if (isProductName) {
                if(products.get(i).getProductName().equals(productToRemove)) {
                    Product tempRemoved = products.remove(i);
                    removedProducts.add(tempRemoved);
                } 
            }else {
                    if (products.get(i).getProductQuantity() == (productToRemove)) {
                        Product tempRemoved = products.remove(i);
                        removedProducts.add(tempRemoved);

                    }
                }
            }
            return removedProducts;
        }

    


           

            
        



    
    
     
     











        
    
 }


   