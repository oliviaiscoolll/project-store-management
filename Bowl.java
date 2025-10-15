public class Bowl extends Meal {
  
    private String size;
    // Default constructor, sets size to "Medium"
    public Bowl() {
      size = "Medium";
    }
    // Constructor with price, side(s), and size as parameters
    public Bowl(double price, String side, String size) {
      super(price, side);  // Calls the parent constructor (Meal)
      this.size = size;
    }
    // Getter method for size
    public String getSize() {
      return size;
    }
    // Setter method for size
    public void setSize(String newSize) {
      size = newSize;
    }
    // Returns the Bowl object details as a formatted string, including size
    public String toString() {
      return "Price: " + getPrice() + "\nSide(s): " + getSide() + "\nSize: " + size;
    }
}