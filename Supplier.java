package app;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Supplier {
    private int SupplierID; 
    private String SupplierName;
    private int SupplierContactInfo; 
    private LocalDate OrderDate;


//Setting the supplier 
    public Supplier (int supplierID, String supplierName, int supplierContactInfo, LocalDate orderDate){
    this.SupplierID = supplierID;
    this.SupplierName = supplierName; 
    this.SupplierContactInfo = supplierContactInfo; 
    this.OrderDate = orderDate;
}

//returning supplierId, supplierName, supplierContactInfo

// Method to get supplierID
    public int getSupplierID () {
        return SupplierID;
    }

// Method to get supplier name 
    public String getSupplierName () {
        return SupplierName;
    }

//Method to get contact info 
    public int getSupplierContactInfo () { 
        return SupplierContactInfo;
    }

//Method to get order dat
    public LocalDate getOrderDate() {
        return OrderDate;
    }


// Method to display order details 

public String getInfo() {
    return SupplierID + " " + SupplierName + " " + SupplierContactInfo + " " + OrderDate;
    }      


    public void displayOrderDetails(){
    System.out.println("Supplier ID: " + SupplierID);
    System.out.println("Supplier Name: " + SupplierName);
    System.out.println("Supplier Contact Info: " + SupplierContactInfo);
    System.out.println("Order Date: " + OrderDate);
}
     
}






