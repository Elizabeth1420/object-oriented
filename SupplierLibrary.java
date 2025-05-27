package app;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class SupplierLibrary {
    private ArrayList<Supplier> suppliers = new ArrayList<Supplier>();
    public SupplierLibrary() {
        suppliers.add(new Supplier(1110, "Lola Ltd", 868878080, LocalDate.now()));
        suppliers.add(new Supplier(1111, "Carriers ltd", 784830373, LocalDate.now()));
        suppliers.add(new Supplier(1112, "The Hair Supplier", 749383902, LocalDate.now()));
        suppliers.add(new Supplier(1113, "Hair for Us", 797382101, LocalDate.now()));
        suppliers.add(new Supplier(1114, "New Wave", 758820102, LocalDate.now()));

    }

    // Option 1 - Adding suppliers

    public void addSuppliers() { // method to add suppliers in the library
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the Supplier ID?");
        int supplierID = scanner.nextInt();

        System.out.println("What is the Supplier Name?");
        String supplierName = scanner.next();

        System.out.println("What is the Contact Info of the supplier?");
        int supplierContactInfo = scanner.nextInt();

        System.out.println("What is the Order Date?");
        LocalDate orderDate = LocalDate.parse(scanner.next());

        Supplier userSupplier = new Supplier(supplierID, supplierName, supplierContactInfo, orderDate); // setting
                                                                                                        // arraylist of
                                                                                                        // //
                                                                                                        // supplierID,
                                                                                                        // //
                                                                                                        // supplierName,
                                                                                                        // supperlierContactInfo
                                                                                                        // & Order Date
                                                                                                        // //
                                                                                                        // supplierContactInfo
                                                                                                        // in // library
        suppliers.add(userSupplier);

    }
    // Printing out added suppliers

    public void printSuppliers() {
        for (Supplier printSuppliers : suppliers) {
            System.out.println(" Supplier ID: " + printSuppliers.getSupplierID() + ", Supplier Name: "
                    + printSuppliers.getSupplierName() + ", Contact Info: "
                    + printSuppliers.getSupplierContactInfo() + ", Order Date: " + printSuppliers.getOrderDate());
        }
    }

    // Option 2 - Removing suppliers

    public void removeSupplier() { // method to remove supplier from the library
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 to remove by Supplier Name");
        int userInput = scanner.nextInt();
        scanner.nextLine();
        if (userInput == 1) {
            System.out.println("What is the name of the Supplier you'd like to remove?"); // user inputing 1 to remove a
                                                                                          // supplier

            String supplierName = scanner.nextLine(); // user input
            ArrayList<Supplier> removedSuppliers = removeSupplier(supplierName, true);
            printRemovedSuppliers(removedSuppliers); // prinitng out removed suppliers
        } else {
            System.out.println("Invalid input");
        }
    }

    public void printRemovedSuppliers(ArrayList<Supplier> removedSuppliers) {
        for (Supplier removedSupplier : removedSuppliers) {
            System.out.println("You have successfully removed a supplier");
            System.out.println("Removed Supplier ID: " + removedSupplier.getSupplierID() + ", Supplier Name: "
                    + removedSupplier.getSupplierName() + ", Supplier Contact Info: "
                    + removedSupplier.getSupplierContactInfo());
        }
    }

    public ArrayList<Supplier> removeSupplier(String supplierToRemove, boolean isSupplierName) {
        ArrayList<Supplier> removedSuppliers = new ArrayList<Supplier>();
        for (int i = suppliers.size() - 1; i >= 0; i--) {
            if (isSupplierName) {
                if (suppliers.get(i).getSupplierName().equals(supplierToRemove)) {
                    Supplier tempRemoved = suppliers.remove(i);
                    removedSuppliers.add(tempRemoved);
                }

            }
        }
        return removedSuppliers;
    }

}























            // Supplier foundSupplier = null; // assumed supplier was not found, resulting in null

            // iterate through suppliers to find a matching supplier name
            //for (Supplier currentSupplier : suppliers) {
                //if (currentSupplier.getSupplierName() == supplierName) {

                    // found supplier, no need to loop hence the break
                    //foundSupplier = currentSupplier;
                    //break;
                

            // if supplier has been found due to not being null, we can remove the supplier
            // from the supplier library
           // if (foundSupplier != null) {
               // suppliers.remove(foundSupplier);
           // }

           // System.out.println("You have sucessfully removed a Supplier!");


            /*
             * } else if (userInput == 2){
             * System.out.println("What is the Supplier ID you'd like to remove?");
             * 
             * int supplierID = scanner.nextInt();
             * ArrayList<supplier> removedSuppliers = removeSupplier(supplierID, false);
             * printRemovedSongs(removedSuppliers);
             * } else {
             * System.out.println("Invalid input");
             * }
             */

    

