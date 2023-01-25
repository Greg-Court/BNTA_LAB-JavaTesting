import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    @Test
    void canDeposit() {
        BankAccount account = new BankAccount();
        account.setBalance(0.00);
        account.deposit(100.00);
        assertThat(account.getBalance()).isEqualTo(100.00);
    }

    @Test
    void canWithdraw() {
        BankAccount account = new BankAccount();
        account.setBalance(69.00);
        account.withdraw(9.00);
        assertThat(account.getBalance()).isEqualTo(60.00);
    }

    @Test
    void overdraftLimitWorks() {
        BankAccount account = new BankAccount();
        account.setBalance(100.00);
        account.setOverdraft(100.00);
        account.withdraw(150.00);
        assertThat(account.getBalance()).isEqualTo(-50.00);
        account.withdraw(100.00);
        assertThat(account.getBalance()).isEqualTo(-50.00);
    }

    @Test
    void correctInterest() {
        BankAccount account = new BankAccount();
        account.setBalance(1000.00);
        account.payInterest("current");
        assertThat(account.getBalance()).isEqualTo(1010.00);
        account.setBalance(1000.00);
        account.payInterest("savings");
        assertThat(account.getBalance()).isEqualTo(1050.00);
    }

    @Test
    void canSetAccountType() {
        BankAccount account = new BankAccount();
        account.setAccountType("current");
        assertThat(account.getAccountType()).isEqualTo("current");
    }

    @Test
    void canSetDateOfBirth() {
        BankAccount account = new BankAccount();
        account.setDateOfBirth(LocalDate.of(1998, 10, 10));
        assertThat(account.getDateOfBirth()).isEqualTo(LocalDate.of(1998,10,10));
    }

}
