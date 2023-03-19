public class BankAccount{
    private double checkingBalance;
    private double savingsBalance;

    // variables that belong to the BankAccount class
    public static int numberOfAccounts = 0 ;
    public static double totalBalance = 0;

    // bank account constructor
    public BankAccount() {
        BankAccount.numberOfAccounts += 1;
        this.checkingBalance = 0;
        this.savingsBalance = 0;
    }
    
    public void bankDepositAmount(double amount, String account) {
        // add to the balance
        if (account == "checking") {
            this.checkingBalance +=amount;
        }
        else{
            this.savingsBalance += amount;
        }
    }

    // withdraw method. this method will first check for the account type ignoring uppercase 
    // keyword,
    // then compare the withdraw amount from the account balance 
    // then if insufficient funds, it will display a message
    // else it will deduct the amount, same steps for the second account  
    public void bankWithdrawAmount(double amount, String account) {
        if (account.equalsIgnoreCase("checking")) {
            if (amount > checkingBalance) {
                System.out.println("insufficient funds, please change the amount");
            }
            else {
                this.checkingBalance -= amount; 
            }
        }
        else if (account.equalsIgnoreCase("savings")) {
            if (amount > savingsBalance){
                System.out.println(" insufficient funds in savings account, please change the amount");
            }
            else {
                this.savingsBalance -= amount;
            }
        }
    }
    
    // getters and setters to access account balances
    public double getCheckingBalance(){
        return this.checkingBalance;
    }

    public double getSavingsBalance(){
        return this.savingsBalance;
    }





}

