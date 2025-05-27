package app;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

//Defines the OnlineOrder subclass that extends CustomerOrder
 public class OnlineOrder extends CustomerOrder {
    //additional attributes for delivery address and tracking number
    private String DeliveryAddress;
    private String TrackingNumber;

    //Constructor to intialise the OnlineOrder Object
    public OnlineOrder(String orderId, String customer, LocalDate orderDate, String item, double price, String deliveryAddress, String trackingNumber) {
        // Calling superclass constructor to initalise common attritubes 
        super(orderId, customer, orderDate, item, price);
        this.DeliveryAddress = deliveryAddress;
        this.TrackingNumber = trackingNumber;
    }

    //Getter for delivery address
    public String getDeliveryAddress () {
        return DeliveryAddress;
    }

    // Getter for tracking number
    public String getTrackingNumber () {
        return TrackingNumber;
    }

    //Method to calculate delivery time based on the address
    public int calculateDeliveryTime() {
        //delivery time based on the length of the address string 
        return DeliveryAddress.length() % 15 + 1;
    }
    
    // Method to update the tracking status 
    public void updateTrackingStatus(String newStatus) {
        //Printing the updated tracking status 
        System.out.println("Tracking Number: " + TrackingNumber + " - Status: " + newStatus);
    }

    //Overridding the displayOrderDetails method to include additional details 
    @Override
    public void displayOrderDetails(){ //get order details 
        //call the superclass method to display common details 
        super.displayOrderDetails();
        //Display additional details for online order
        System.out.println("Delivery Address: " + DeliveryAddress);
        System.out.println("Tracking Number: " + TrackingNumber);
    }

}
