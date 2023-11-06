public class BankAccount {
    String ownerName;
    String accountNumber;
    double balance;

    void init() {
        this.ownerName = "";
        this.accountNumber = "";
        this.balance = 0.00;
    }

   void deposit(double amount) {
        this.balance += amount;
    }

    void withdraw(double amount) {
        if(this.balance >= amount){
            this.balance -= amount;
        } else {
            System.out.println("잔액이 부족합니다.");
            return;
        }
    }

    void getBalance() {
        double balance = this.balance;
        System.out.println("현재 잔액: " + balance);
    }

    void getAccountInfo(){
        System.out.printf("Owner Name: %s, Account Number: %s, Balance: $%.0f%n", ownerName, accountNumber, balance);
    }
}
