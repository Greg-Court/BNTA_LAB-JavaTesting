import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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

    

}
