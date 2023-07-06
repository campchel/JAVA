import java.util.*;

    class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;

    private static int accounts;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances
    

    // CONSTRUCTOR
    // Be sure to increment the number of accounts
    public BankAccount(double checkingBalance, double savingsBalance) {
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        totalMoney += checkingBalance + savingsBalance;
        accounts++;
    }


    // GETTERS & SETTERS
    // for checking, savings, accounts, and totalMoney
public void setCheckingBalance(int balance) {
    this.checkingBalance = balance;
}
    public double getCheckingBalance() {
        return this.checkingBalance;
    }


public void setSavingsBalance(int balance) {
    this.savingsBalance = balance;
}
    public double getSavingsBalance() {
        return this.savingsBalance;
    }


public void setAccounts(int number) {
    this.accounts = number;
}
    public int getAccounts() {
        return this.accounts;
    }


public void setTotalMoney(int money) {
    this.totalMoney = money;
}
    public double getTotalMoney() {
        return this.totalMoney;
    }

    // METHODS ==============================================


    // deposit
    // - users should be able to deposit money into their checking or savings account
    // getBalance
    public void deposit(double amount, String accountType ){
        if (accountType.equalsIgnoreCase("checkingBalance")) {
        checkingBalance += amount;
        
        } else if(accountType.equalsIgnoreCase("savingsBalance")) {
            savingsBalance += amount;
        }
        totalMoney += amount;
        System.out.printf("Deposited $%.2f into %s account.\n", amount, accountType);
    
        }

    // withdraw
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    public void withdraw(double amount, String accountType) {
        if (accountType.equalsIgnoreCase("checkingBalance")) {
            if (checkingBalance >= amount) {
                checkingBalance -= amount;
                totalMoney -= amount;
                System.out.printf("Withdrew $%.2f from checking account. Your remaining balance is %.2f", amount, checkingBalance);
            } else {
                System.out.println("Insufficient funds in your checking account!");
            }
        } else if (accountType.equalsIgnoreCase("savingsBalance")) {
            if (savingsBalance >= amount) {
                savingsBalance -= amount;
                totalMoney -= amount;
                System.out.printf("Withdrew $%.2f from savings account. Your remaining balance is %.2f", amount, savingsBalance);
        } else {
            System.out.println("Insufficient funds in your savings account!");
        }
    }
}
}
