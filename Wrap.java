public class Wrap extends Meal {
    private int diameter;
    // Default constructor, sets diameter to 6
    public Wrap() {
      diameter = 6;
    }
    // Constructor with price, side(s), and diameter as parameters
    public Wrap(double price, String side, int diameter) {
      super(price, side);  // Calls the parent constructor (Meal)
      this.diameter = diameter;
    }
    // Getter method for diameter
    public int getDiameter() {
      return diameter;
    }
    // Setter method for diameter
    public void setDiameter(int newDiameter) {
      diameter = newDiameter;
    }
    // Returns the Wrap object details as a formatted string, plus the diameter
    public String toString() {
      return "Price: " + getPrice() + "\nSide(s): " + getSide() + "\nDiameter: " + diameter;
    }
}