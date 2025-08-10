import java.util.*;
public class bank {
    private String accNo;
    private String accHolderName;
    private double balance;

    // Constructor
    public bank(String accNo, String accHolderName, double balance) {
        this.accNo = accNo;
        this.accHolderName = accHolderName;
        this.balance = balance;
    }

    // Getters
    public String getAccNo() {
        return accNo;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // Setters
    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Account Holder: " + accHolderName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        bank acc = new bank("123456", "Shyam Kumar", 5000.0);

        acc.displayAccountDetails();
        System.out.println();

        acc.deposit(2000);
        acc.withdraw(1500);
        acc.withdraw(7000); 
        System.out.println();

        acc.displayAccountDetails();
    }
}
