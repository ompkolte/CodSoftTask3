public class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void withdraw(double amount) {
        if (amount > account.getBalance()) {
            System.out.println("Insufficient balance.");
        } else if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive number.");
        } else {
            account.withdraw(amount);
            System.out.println("Withdrawal successful. Current balance: " + account.getBalance());
        }
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive number.");
        } else {
            account.deposit(amount);
            System.out.println("Deposit successful. Current balance: " + account.getBalance());
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: " + account.getBalance());
    }
}
