public class BankTest {
    public static void main(String[] args) {
        BankAccount daveAccount = new BankAccount();
        BankAccount cherylAccount = new BankAccount();

        daveAccount.createCheckingAccount(500.00);
        daveAccount.createSavingsAccount(200.00);
        daveAccount.depositToAccount("checking", 30.0);
        daveAccount.getAccountNumber();
        daveAccount.getCheckingBalance();
        daveAccount.getSavingsBalance();
        daveAccount.withdrawlFromAccount("savings", 43.0);
        daveAccount.getAllAccountBalance();

        cherylAccount.createCheckingAccount(475.50);
        cherylAccount.createSavingsAccount(1050.00);
        cherylAccount.depositToAccount("checking", 300.0);
        cherylAccount.getAccountNumber();
        cherylAccount.getCheckingBalance();
        cherylAccount.getSavingsBalance();
        cherylAccount.withdrawlFromAccount("savings", 200.0);
        

        BankAccount.getBankVault();
        BankAccount.getNumAccounts();
    }
}
