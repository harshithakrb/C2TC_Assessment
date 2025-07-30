package Assignment5;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Ticket Booking System!");

        System.out.print("Enter the stage event name: ");
        String stageEvent = sc.nextLine();

        System.out.print("Enter the customer name: ");
        String customer = sc.nextLine();

        System.out.print("Enter number of seats: ");
        int noOfSeats = Integer.parseInt(sc.nextLine());

        TicketBooking booking = new TicketBooking(stageEvent, customer, noOfSeats);

        System.out.println("\nSelect Payment Method:");
        System.out.println("1. Cash Payment");
        System.out.println("2. Wallet Payment");
        System.out.println("3. Credit Card Payment");
        System.out.print("Enter your choice (1-3): ");
        int choice = Integer.parseInt(sc.nextLine());

        switch (choice) {
            case 1: {
                System.out.print("Enter amount to pay: ");
                double amount = Double.parseDouble(sc.nextLine());
                booking.display();
                booking.makePayment(amount);
                break;
            }
            case 2: {
                System.out.print("Enter amount to pay: ");
                double amount = Double.parseDouble(sc.nextLine());
                System.out.print("Enter wallet number: ");
                String walletNumber = sc.nextLine();
                booking.display();
                booking.makePayment(amount, walletNumber);
                break;
            }
            case 3: {
                System.out.print("Enter cardholder name: ");
                String holderName = sc.nextLine();
                System.out.print("Enter amount to pay: ");
                double amount = Double.parseDouble(sc.nextLine());
                System.out.print("Enter credit card type: ");
                String cardType = sc.nextLine();
                System.out.print("Enter CCV number: ");
                String ccv = sc.nextLine();
                booking.display();
                booking.makePayment(holderName, amount, cardType, ccv);
                break;
            }
            default: {
                System.out.println("Invalid choice. Please restart and enter a valid option.");
            }
        }

        sc.close();
    }
}