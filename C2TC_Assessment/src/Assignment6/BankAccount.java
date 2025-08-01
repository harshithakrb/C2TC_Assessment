package Assignment6;

public class BankAccount {
	
	private int accountNumber;
    private double balance;

    // Parameterized constructor
    public BankAccount(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Deposit method with validation
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be positive.");
        }
        balance += amount;
        System.out.println("Successfully deposited: ₹" + amount);
    }

    // Withdraw method with validation
    public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance for withdrawal.");
        }
        balance -= amount;
        System.out.println("Successfully withdrawn: ₹" + amount);
    }

    // Method to display balance
    public void displayBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

}
