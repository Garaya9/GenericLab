package genericlab;

/**
 * A bank account with a balance that can be changed by deposits and withdrawals.
 * @author Gebrella Araya
 * @date Feb 9, 2024
 */
public class BankAccount implements Measurable {
    private double balance;

    /**
     * Constructs a bank account with a zero balance.
     */
    public BankAccount() {
        balance = 0;
    }

    /**
     * Constructs a bank account with a given balance.
     * @param initialBalance the initial balance
     */
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    /**
     * Deposits money into the bank account.
     * @param amount the amount to deposit
     */
    public void deposit(double amount) {
        balance += amount;
    }

    /**
     * Withdraws money from the bank account.
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount) {
        balance -= amount;
    }

    /**
     * Gets the current balance of the bank account.
     * @return the current balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Implements Measurable interface.
     * @return the balance
     */
    public double getMeasure() {
        return balance;
    }
}
