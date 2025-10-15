

public class Meal {
    private double price;
    private String side;
  
    // Constructor with price and side(s) as parameters
    public Meal(double price, String side) {
      this.price = price;
      this.side = side;
    }
    
  // Default constructor, sets price to 6.77 and side(s) to "None"
    public Meal() {
      this(6.77, "None");
    }
  
 // Constructor with only side(s) as parameter, default price is 6.77
    public Meal(String side) {
      this.side = side;
      price = 6.77;
    }
  
    // Constructor with only price as parameter, default side(s) is "None"
    public Meal(double price) {
      this.price = price;
      side = "None";
    }
    // Getter method for price
    public double getPrice() {
      return price;
    }

    public String getSide() {
      return side;
    }
    // Setter method for price with a check to ensure the price isn't negative
    public void setPrice(double newPrice) {
      if (newPrice < 0) {
        price = 0;
      }
      else
      {
        price = newPrice;
      }
    }
    // Setter method for sides
    public void setSide(String newSide) {
      side = newSide;
    }
    // Returns the Meal object details as a formatted string
    public String toString() {
      return "Price: " + price + "\nSide(s): " + side;
    }
}