import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Standard ticket price
        final double STANDARD_TICKET_PRICE = 7.00;

        // Discount rates
        final double DISCOUNT_UNDER_5 = 0.60;           // 60% discount
        final double DISCOUNT_OVER_60 = 0.55;           // 55% discount


        // Initialize total price
        double totalPrice = 0.0;


        // Get the age of the customer
        System.out.print("Enter the age of the customer: ");
        int age = scanner.nextInt();

        // Calculate the ticket price based on age
        double ticketPrice = STANDARD_TICKET_PRICE;

        if (age < 5) {
            ticketPrice = STANDARD_TICKET_PRICE * (1 - DISCOUNT_UNDER_5);
        } else if (age > 60) {
            ticketPrice = STANDARD_TICKET_PRICE * (1 - DISCOUNT_OVER_60);
        } else {
            System.out.println("How many tickets would you like to buy?");

        }


        // Print the ticket price
        System.out.printf("The ticket price is: %.2f Euros%n.", ticketPrice);

        // Close the scanner
        scanner.close();
    }
}
