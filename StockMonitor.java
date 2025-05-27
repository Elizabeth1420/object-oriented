package app;
import java.util.List;
import java.util.ArrayList;

 public class StockMonitor {

public static void main(String[] args) {
    List<Product> products = new ArrayList<>();

    products.add(new Product(238900, "Hair Mousse", "Lola Ltd", 150, 15.50, 30));
    products.add(new Product(238901,"Shampoo", "Carriers Ltd", 250, 20.99, 100));
    products.add(new Product (238902, "Conditioner", "The Hair Supplier", 100, 25.50, 30));
    products.add(new Product(238903, "Aftercare", "Hair for us", 50, 30.50, 10));
    products.add(new Product(238904, "Butter hair treatment", "New Wave", 150, 49.99,30));
       
System.out.println("Checking stock levels...");
        
    for (Product p : products) {
         p.displayAlert();
         }
}
    
 }








    
    
