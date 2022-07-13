import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class BankAccount {
    private String accountNumber = "";
    private double checkingBalance;
    private double savingsBalance;
    
    private static int numAccounts;
    private static double bankVault;

    private static Long generateAccountNumber(){
        Random rand = new Random();
        long randomNum = ThreadLocalRandom.current().nextInt(100000000, 999999999);
        if (randomNum < 0) {
            randomNum *= (-1);
        }
        if (String.valueOf(randomNum).length() < 10) {
            randomNum *= 10;
            randomNum += rand.nextInt(10);
        }
        Long number = (Long)randomNum;
        return number;
    }
    
    public void createCheckingAccount(double checkingBalance) {
        this.accountNumber = generateAccountNumber().toString();
        this.checkingBalance = checkingBalance;
        numAccounts += 1;
        setBankVault(checkingBalance);
        System.out.printf("Checking Account created with new Balance $%,.2f %n", this.checkingBalance);
    }
    public void createSavingsAccount(double savingsBalance) {
        this.accountNumber = generateAccountNumber().toString();;
        this.savingsBalance = savingsBalance;
        setNumAccounts(1);
        setBankVault(savingsBalance);
        System.out.printf("Savings Account created with new Balance: $%,.2f %n", this.savingsBalance);

    }
    
    public void depositToAccount(String accountType, double amount) {
        accountType.toLowerCase();
        if (accountType.equals("checking")) {
            this.checkingBalance += amount;
            System.out.printf("Checking Account Balance: $%,.2f %n", this.checkingBalance);
    }else if (accountType.equals("savings")) {
            this.savingsBalance += amount;
            System.out.printf("Savings Account Balance: $%,.2f %n", this.savingsBalance);
        }
        setBankVault(amount);
    }

    public void withdrawlFromAccount(String accountType, double amount) {
        accountType.toLowerCase();
        if (accountType.equals("checking")) {
            if (this.checkingBalance > amount){
                this.checkingBalance -= amount;
                System.out.printf("Checking Account Balance: $%,.2f %n", this.checkingBalance);
                
            }
        }else if (accountType.equals("savings")) {
            if (this.savingsBalance > amount) {
                this.savingsBalance -= amount;
                System.out.printf("Savings Account Balance: $%,.2f %n", this.savingsBalance);
            }
        }
        setBankVault(-amount);
    }

    public double getAllAccountBalance() {
        double available = (this.checkingBalance + this.savingsBalance);
        System.out.printf("Available Balance: %,.2f %n", available);
        return available;
    }

    public double getCheckingBalance() {
        return this.checkingBalance;
    }
    public double getSavingsBalance() {
        return this.savingsBalance;
    }
    public String getAccountNumber() {
        System.out.printf("Account number: %s %n", this.accountNumber);
        return this.accountNumber;
    }

    //NumAccounts Getter/Setter
    public static void getNumAccounts() {
        System.out.printf("Number of accounts: %d %n", numAccounts);
    }
    private static void setNumAccounts(double numAccounts) {
        BankAccount.numAccounts += numAccounts;
    }

    //BankVault Getter/Setter
    public static double getBankVault() {
        System.out.printf("Vault Balance: %,.2f %n", bankVault);
        return bankVault;
    }
    private static void setBankVault(double bankVault) {
        BankAccount.bankVault += bankVault;
    }
}