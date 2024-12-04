package First_Bank;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance < 0){
            throw new IllegalArgumentException("Sorry Insufficient Balance");
        }
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0){
            balance += amount;
        }else {
            System.out.println("Deposit amount must greater than 0");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance){
            balance -= amount;
        }else {
            System.out.println("Invalid Amount");
        }
    }

    public double getBalance() {
        return balance;
    }

}
