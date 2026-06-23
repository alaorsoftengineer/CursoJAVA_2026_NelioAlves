package exercicio01_bank;

public class Bank {

    private int accountNumber;
    private String clientName;
    private double balance;

    private static final double WITHDRAW_FEE = 5.00;

    public Bank(int accountNumber, String clientName) {
        this.accountNumber = accountNumber;
        this.clientName = clientName;
    }

    public Bank(int accountNumber, String clientName, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.clientName = clientName;
        deposit(initialDeposit);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + WITHDRAW_FEE;
    }

    @Override
    public String toString() {
        return "Account "
                + accountNumber
                + ", Holder: "
                + clientName
                + ", Balance: $"
                + String.format("%.2f", balance);
    }
}