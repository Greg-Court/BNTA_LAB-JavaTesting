import org.w3c.dom.ls.LSOutput;

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
    private double overdraft;

    // Class Constructor ----------------------------------------------------------------------

    public BankAccount () {
        this.balance = 0; // I think this is referring to the instance of the class (newly constructed object)
    }

    // Getters & Setters ----------------------------------------------------------------------

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public LocalDate getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(LocalDate dateOfBirth) { this.dateOfBirth = dateOfBirth; }
    public int getAccountNumber() { return this.accountNumber; }
    public void setAccountNumber (int accountNumber) { this.accountNumber = accountNumber; }
    public double getBalance() { return this.balance; }
    public void setBalance(double balance) { this.balance = balance; }
    public String getAccountType() { return this.accountType; }
    public void setAccountType(String accountType) { this.accountType = accountType; }
    public double getOverdraft() { return this.overdraft; }
    public void setOverdraft(double overdraft) { this.overdraft = overdraft; }

    // Class Methods ----------------------------------------------------------------------

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        double overdraft = this.getOverdraft();
        if (this.balance - amount > -overdraft) {
            this.balance -= amount;
        }
//        else {
//            throw new IllegalArgumentException("You no money.");
    }

//    public double calculateInterest(double percentage){
//        double interestToPay = this.balance * percentage/100;
//        return interestToPay;
//    }


    public void payInterest(String accountType) {
        switch(accountType) {
            case "current":
                double interestC = balance * 0.01;
                this.balance += interestC;
                break;
            case "savings":
                double interestS = balance * 0.05;
                this.balance += interestS;
                break;
        }
    }


}
