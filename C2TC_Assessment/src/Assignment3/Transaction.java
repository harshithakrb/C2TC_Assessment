package Assignment3;

public final class Transaction {
	private final double transactionFee = 2.0;

    public final void performTransaction(Account account, String type, double amount) {
        System.out.println("\nPerforming " + type + " of $" + amount);

        if (type.equalsIgnoreCase("deposit")) {
            account.deposit(amount);
        } else if (type.equalsIgnoreCase("withdraw")) {
            account.withdraw(amount + transactionFee); // Fee applies on withdraw
        } else {
            System.out.println("Invalid transaction type.");
        }

        System.out.println("Transaction Fee: $" + transactionFee);
        System.out.println("Updated Balance: $" + account.getBalance());
    }
}
