package app;
public class Stock {
    private String StockName;
    private int StockQuantity;
    private double Price; 

    public Stock(String stockName, int stockQuantity, double price) {
        this.StockName = stockName;
        this.StockQuantity = stockQuantity;
        this.Price = price;
    }

    //Method to get StockName
    public String getStockName(){
         return StockName;
    }
       

     //Method to get StockQuantity
    public int getStockQuantity(){
         return StockQuantity;
    }


    //Method to get Price
    public double getPrice(){
         return Price;
    }


    //Removing quantity
    public void RemoveQuantity(int qunatityToRemove) {
        if (qunatityToRemove <= StockQuantity) {
            StockQuantity -= qunatityToRemove;
        } else {
            System.out.println("Not enough Stock Quantity to remove");

        }
    }

    public String toString() {
        return StockName + ", Stock Quantity: " + StockQuantity + ", Price: £ " + Price;
    }

}
