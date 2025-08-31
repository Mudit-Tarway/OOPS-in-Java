// Account class
class Account {
    String name;
    String accountNumber;
    String accountType;
    String address;
    double balance;

    // Constructor 1: Initialize name, account number, account type and initial amount
    Account(String name, String accountNumber, String accountType, double initialAmount) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = initialAmount;
    }

    // Constructor 2: Initialize name, account number, account type, address, and balance
    Account(String name, String accountNumber, String accountType, String address, double initialAmount) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.address = address;
        this.balance = initialAmount;
    }

    // Method to display account details
    void displayName() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        if (address != null)
            System.out.println("Address: " + address);
        System.out.println("Current Balance: " + balance);
    }

    // Deposit method
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Check balance method
    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

// Test class with main method
public class Banking {
    public static void main(String[] args) {
        // Using Constructor 1
        Account acc1 = new Account("Sachin", "12345", "Savings", 1000.0);
        acc1.displayName();
        acc1.deposit(500);
        acc1.withdraw(300);
        acc1.checkBalance();

        System.out.println("-----------------------");

        // Using Constructor 2
        Account acc2 = new Account("Sumit", "67890", "Current", "Delhi", 2000.0);
        acc2.displayName();
        acc2.deposit(1000);
        acc2.withdraw(1500);
        acc2.checkBalance();
    }
}
