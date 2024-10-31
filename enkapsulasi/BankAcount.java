package enkapsulasi;

public class BankAcount {
    private double balance;

    public BankAcount(final double balance) {
        this.balance = balance;
    }

    public void deposit(double jumlah) {
        if (jumlah > 0) {
            balance += jumlah;
        }
    }

    public void withdraw(double jumlah) {
        if (jumlah > 0 && balance >= jumlah) {
            balance -= jumlah;
        }
    }

    public double getBalance() {
        return balance;
    }
}
