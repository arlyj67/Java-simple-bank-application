package First_Bank;

import java.util.Scanner;

public class BankApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter initial Balance");
        double initialBalance = scanner.nextDouble();
        BankAccount account = new BankAccount(initialBalance);

//        SHow menu
        while (true) {
            System.out.println("\nBank Application Menu");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.println("Choose an option:");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter amount to deposit");
                    double deposit_amount = scanner.nextDouble();
                    account.deposit(deposit_amount);
                    System.out.println("Deposit Successful");
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw");
                    double withdraw_amount = scanner.nextDouble();
                    account.withdraw(withdraw_amount);
                    System.out.println("Withdraw Successful");
                    break;
                case 3:
                    System.out.println("Current Balance: " + account.getBalance());
                    break;
                case 4:
                    System.out.println("Thank you for using Bank Application");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again");
            }
        }
    }

}
