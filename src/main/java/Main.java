public class Main {
    public static void main(String[] args) {
        BankAccount currentAccount = new BankAccount();
        currentAccount.setFirstName("Greg");
        currentAccount.setLastName("C");
        currentAccount.setBalance(100000.00);

        BankAccount savingsAccount = new BankAccount();
        savingsAccount.setFirstName("Oscar");
        savingsAccount.setLastName("Dog");
        savingsAccount.setBalance(1000000.00);

        System.out.println(currentAccount.getBalance());
        System.out.println(savingsAccount.getBalance());

        currentAccount.payInterest("current");
        savingsAccount.payInterest("savings");

        System.out.println(currentAccount.getBalance());
        System.out.println(savingsAccount.getBalance());
    }
}
