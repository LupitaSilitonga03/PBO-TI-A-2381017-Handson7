package enkapsulasi;

public class Main {
    public static void main(String[] args) {
        BankAcount lupitaSilitonga = new BankAcount(10);

        //beli minuman 10
        lupitaSilitonga.withdraw(10);
        System.out.println("Current balance is: " + lupitaSilitonga.getBalance());
    }
}
