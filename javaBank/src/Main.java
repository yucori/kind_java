public class Main {

    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        bank.ownerName = "John";
        bank.accountNumber = "123456";
        bank.balance = 1000.00;
        bank.getAccountInfo();
        bank.deposit(500.00);
        bank.getAccountInfo();
        bank.withdraw(500.00);
        bank.getAccountInfo();

        bank.init();
        bank.getAccountInfo();

        bank.ownerName = "Jane Smith";
        bank.accountNumber = "654321";
        bank.balance = 1500.00;
        bank.getAccountInfo();
        bank.deposit(100.00);
        bank.getAccountInfo();
        bank.withdraw(1700.00);
        bank.getAccountInfo();
    }
}