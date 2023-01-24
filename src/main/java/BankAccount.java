import java.time.LocalDate;
import java.util.Scanner;

public class BankAccount {

    // Class Properties ----------------------------------------------------------------------
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private int accountNumber;
    private double balance;
    private String accountType;

    // Class Constructor ----------------------------------------------------------------------

    public BankAccount (/**String inputFirstName, String inputLastName, LocalDate inputDateOfBirth, int inputAccountNumber**/) {
//        this.firstName = inputFirstName;
//        this.lastName = inputLastName;
//        this.dateOfBirth = inputDateOfBirth;
//        this.accountNumber = inputAccountNumber;
        this.balance = 0;
    }

    // Getters & Setters ----------------------------------------------------------------------

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public LocalDate getLocalDate() { return dateOfBirth; }
    public void setLocalDate(LocalDate dateOfBirth) { this.dateOfBirth = dateOfBirth; }
    public int getAccountNumber() { return this.accountNumber; }
    public void setAccountNumber (int accountNumber) { this.accountNumber = accountNumber; }
    public double getBalance() { return this.balance; }
    public void setBalance(double balance) { this.balance = balance; }

    // Class Methods ----------------------------------------------------------------------

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }
    public void payInterest(double rate) {
        double interest = this.balance * rate;
        this.balance += interest;
    }

}
