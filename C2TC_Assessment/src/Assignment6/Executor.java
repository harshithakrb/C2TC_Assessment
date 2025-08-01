package Assignment6;
import java.util.Scanner;

public class Executor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        // Create BankAccount object
        System.out.print("Enter account number: ");
        int accNum = sc.nextInt();
        System.out.print("Enter initial balance: ₹");
        double initBalance = sc.nextDouble();

        BankAccount account = new BankAccount(accNum, initBalance);

        // Menu loop
        while (true) {
            System.out.println("\n--- Banking Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter deposit amount: ₹");
                        double depositAmt = sc.nextDouble();
                        account.deposit(depositAmt);
                        break;
                    case 2:
                        System.out.print("Enter withdrawal amount: ₹");
                        double withdrawAmt = sc.nextDouble();
                        account.withdraw(withdrawAmt);
                        break;
                    case 3:
                        account.displayBalance();
                        break;
                    case 4:
                        System.out.println("Thank you for banking with us!");
                        sc.close();
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (InvalidAmountException | InsufficientFundsException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                System.out.println("Transaction complete.\n");
            }
        }
    }
}