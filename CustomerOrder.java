package app;
import java.time.LocalDate; 
import java.time.temporal.ChronoUnit;

//Definind the CustomerOrder class
public class CustomerOrder {
     public static void main(String[] args) {

                //Create an OnlineOrder Object 
                OnlineOrder onlineOrder = new OnlineOrder("LOT489", "Tasha McStevans", LocalDate.now(),"Hair Mousse", 15.99, "167 High Street, Ballington", "TRK580");
                //Display online order details
                onlineOrder.displayOrderDetails();
                //Calculate and display delivery time
                int deliveryTime = onlineOrder.calculateDeliveryTime();
                System.out.println("Estimated Delivery Time: " + deliveryTime + "days");
                //Update and display the tracking status 
                onlineOrder.updateTrackingStatus("In Transit");
     }
    //attributes for orderID, customer and order date
    private String OrderId;
    private String Customer;
    private LocalDate OrderDate;
    private String Item;
    private double Price;

    // constructor to intiatise the CustomerOrder Object
    public CustomerOrder(String orderId, String customer, LocalDate orderDate, String item, double price) {
        this.OrderId =orderId;
        this.Customer = customer;
        this.OrderDate = orderDate;
        this.Item = item;
        this.Price = price;
       
    }
    // Getter for order ID
    public String getOrderId () {
        return OrderId;
   }

   //Getter for customer
   public String getCustomer () {
        return Customer;
   }
   
   //Getter for order date
   public LocalDate getOrderDate () {
        return OrderDate;
   }

   //Getter for Item 
   public String getItem () {
        return Item;
   }

    //Getter for Price 
   public double getPrice () {
        return Price;
   }



   // Method to display order details
   public void displayOrderDetails () {
    System.out.println("Order ID: " + OrderId);
    System.out.println("Customer: " + Customer);
    System.out.println("Order Date: " + OrderDate);
    System.out.println("Item Purchased: " + Item);
    System.out.println("Price: " + Price);
   }

}

