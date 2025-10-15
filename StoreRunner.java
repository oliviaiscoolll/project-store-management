import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
    // Asks the user to choose between a bowl or a wrap
    System.out.println("Welcome to Chipotle! Would you like to start an order for a bowl[1] or a wrap[2]? ");
   
    // Stores the user's choice of bowl or wrap
    int bowlOrWrap = input.nextInt();
    
    // If the user chooses a bowl
    if(bowlOrWrap == 1) {
      Bowl olivia = new Bowl();
  
      // Asks for and stores the price of the meal
      System.out.println("Enter a price for your meal: ");
      double newPrice = input.nextDouble();
      
      input.nextLine();
      
      // Asks for and stores the side(s) choice
      System.out.println("Enter side(s) for your meal: ");
      String newSide = input.nextLine();

      input.nextLine();
      
      // Asks for and stores the size of the meal
      System.out.println("What size would you like?");
      String newSize = input.nextLine();
      
      // Sets the properties of the Bowl object
      olivia.setPrice(newPrice);
      olivia.setSide(newSide);
      olivia.setSize(newSize);
      
      // Prints the details of the Plate object
      System.out.println(olivia.toString());
    }
     // If the user chooses a wrap
    else  {
     // Creates a new Wrap object
      Wrap olivia = new Wrap();
      
      // Asks for and stores the price of the meal
      System.out.println("Enter a price for your meal: ");
      double newPrice = input.nextDouble();

      input.nextLine();
      
      // Asks for and stores the side(s) choice
      System.out.println("Enter side(s) for your meal: ");
      String newSide = input.nextLine();

      input.nextLine();
      
      // Asks for and stores the diameter of the wrap
      System.out.println("What diameter would you like?");
      int newDiameter = input.nextInt();
      
      // Sets the properties of the Wrap object
      olivia.setPrice(newPrice);
      olivia.setSide(newSide);
      olivia.setDiameter(newDiameter);
      
      // Prints the details of the Wrap object
      System.out.println(olivia.toString());
    }

    // Closes the Scanner object
    input.close();
    
  }
}