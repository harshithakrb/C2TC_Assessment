package Assignment3;

public class Executor {

	public static void main(String[] args) {
		SavingsAccount savings = new SavingsAccount("Harshitha", 25000.0);
        CheckingAccount checking = new CheckingAccount("Bannu", 1500.0);

        Transaction transaction = new Transaction();

        savings.printAccountDetails();
        transaction.performTransaction(savings, "deposit", 200);
        transaction.performTransaction(savings, "withdraw", 100);

        checking.printAccountDetails();
        transaction.performTransaction(checking, "withdraw", 300);

        System.out.println("\nTotal Bank Accounts: " + Bank.getTotalAccounts());

	}

}
