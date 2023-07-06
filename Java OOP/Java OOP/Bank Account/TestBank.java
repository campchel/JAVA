public class TestBank {
    public static void main(String[] args){
        // Create 3 bank accounts
        BankAccount personalAccount = new BankAccount(500.00, 400.00);

        BankAccount medicalAccount = new BankAccount(300.00, 200.00);

        BankAccount retirementAccount = new BankAccount(100.00, 50.00);

        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        // - each deposit should increase the amount of totalMoney
        System.out.println("-------Developer Test-------");
        personalAccount.deposit(600.00, "savingsBalance");
        personalAccount.deposit(700.00, "checkingBalance");

        medicalAccount.deposit(800.00, "savingsBalance");
        medicalAccount.deposit(75.00, "checkingBalance");

        retirementAccount.deposit(25.00, "savingsBalance");
        retirementAccount.deposit(900.00, "checkingBalance");

        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney
        personalAccount.withdraw(50.00, "savingsBalance");
        personalAccount.withdraw(60.00, "checkingBalance");

        medicalAccount.withdraw(40.00, "savingsBalance");
        medicalAccount.withdraw(30.00, "checkingBalance");

        retirementAccount.withdraw(20.00, "savingsBalance");
        retirementAccount.withdraw(10.00, "checkingBalance");

        // Static Test (print the number of bank accounts and the totalMoney)
    System.out.println(personalAccount.getCheckingBalance());
    System.out.println(personalAccount.getSavingsBalance());


    System.out.println(medicalAccount.getCheckingBalance());
    System.out.println(medicalAccount.getSavingsBalance());


    System.out.println(retirementAccount.getCheckingBalance());
    System.out.println(retirementAccount.getSavingsBalance());

    }
}
