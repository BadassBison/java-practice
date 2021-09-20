/**
 * Description: A program that recieves orders for cupcakes and outputs the total for each order.
 * @author: Stephanie Scott
 * ULID: sscot17
 * Date: 9/10/21
 *
*/

// imports
import java.util.Scanner;
import java.text.DecimalFormat;

/*
 * receive 10% discount on a dozen or more cupcakes
 * receive 15% discount on three dozen or more cupcakes
 * sales tax is 7.25%
 */
public class Project2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    DecimalFormat decimalFormat = new DecimalFormat("$#0.00");
    DecimalFormat percentPattern = new DecimalFormat("0.#%");
    // constants
    final double COST_RED_VELVET = 2.0;
    final double COST_CARAMEL = 2.5;
    final double COST_CHOCOLATE = 3.0;
    final double SALES_TAX = 0.0725;
    final double DISCOUNT_DOZEN = .1;
    final double DISCOUNT_THREE_DOZEN = .15;

    // Welcome message
    System.out.println("Welcome to the Pflugerville Bakery!");
    System.out.println("We're ready to take your cupcake order.");

    // Get information from user (name, number of each type of cupcake, and day of
    // pickup)
    System.out.print("Please enter your name: ");
    String customerName = scanner.nextLine();
    System.out.print("Enter the number of Red Velvet cupcakes: ");
    int numRedVelvet = scanner.nextInt();
    System.out.print("Enter the number of Caramel Surprise cupcakes: ");
    int numCaramel = scanner.nextInt();
    System.out.print("Enter the number of Chocolate Delight cupcakes: ");
    int numChocolate = scanner.nextInt();
    System.out.print("Enter the day of the week you will pick up your order: ");
    String pickUpDay = scanner.next();
    scanner.close();

    // Calculate total
    int totalCupcakes = numRedVelvet + numCaramel + numChocolate;
    double totalCostRedVelvet = COST_RED_VELVET * numRedVelvet;
    double totalCostCaramel = COST_CARAMEL * numCaramel;
    double totalCostChocolate = COST_CHOCOLATE * numChocolate;
    double totalCost = totalCostRedVelvet + totalCostCaramel + totalCostChocolate;

    // Calculate discounts
    double discountCost;
    if (totalCupcakes >= 36) {
      discountCost = totalCost * (1 - DISCOUNT_THREE_DOZEN);
    } else if (totalCupcakes >= 12) {
      discountCost = totalCost * (1 - DISCOUNT_DOZEN);
    } else {
      discountCost = totalCost;
    }
    // Calculate tax
    double taxCost = discountCost * SALES_TAX;

    // Print summary
    System.out.println("\nOrder Summary:");

    if (numRedVelvet > 0) {
      System.out.println("\nRed Velvet cupcakes: " + numRedVelvet + " for " + decimalFormat.format(totalCostRedVelvet));
    }
    if (numCaramel > 0) {
      System.out
          .println("\nCaramel Surprise cupcakes: " + numCaramel + " for " + decimalFormat.format(totalCostCaramel));
    }
    if (numChocolate > 0) {
      System.out.println(
          "\nChocolate Delight cupcakes: " + numChocolate + " for " + decimalFormat.format(totalCostChocolate));
    }
    System.out.println("\nSubtotal: " + decimalFormat.format(totalCost));

    if (totalCupcakes >= 36) {
      System.out.println("Discount percentage: " + percentPattern.format(DISCOUNT_THREE_DOZEN));
      System.out.println("Discount amount: " + decimalFormat.format(totalCost * DISCOUNT_THREE_DOZEN));
      System.out.println("Discounted subtotal: " + decimalFormat.format(discountCost));
    } else if (totalCupcakes >= 12) {
      System.out.println("Discount percentage: " + percentPattern.format(DISCOUNT_DOZEN));
      System.out.println("Discount amount: " + decimalFormat.format(totalCost * DISCOUNT_DOZEN));
      System.out.println("Discounted subtotal: " + decimalFormat.format(discountCost));
    }
    System.out.println("Tax: " + decimalFormat.format(taxCost));
    System.out.println("\nTotal cost: " + decimalFormat.format(taxCost + discountCost));
    System.out.println("\nThis order will be available for pickup");
    System.out.println("By: " + customerName);
    System.out.println("On: " + pickUpDay);
  }
}
