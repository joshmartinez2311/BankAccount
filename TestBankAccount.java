class TestBankAccount {
    public static void main(String[] args){
        BankAccount BankAccount1 = new BankAccount();
        BankAccount1.bankDepositAmount(100, "checking");
        BankAccount1.bankDepositAmount(200, "checking");
        BankAccount1.bankDepositAmount(100, "savings");
        BankAccount1.getCheckingBalance();
        BankAccount1.getSavingsBalance();
        System.out.print(BankAccount1.getSavingsBalance());
        System.out.println(BankAccount1.getCheckingBalance());


        // withdraw tests
        BankAccount1.bankWithdrawAmount(600, "checking");
        BankAccount1.bankWithdrawAmount(600, "savings");
        System.out.println(BankAccount1.getCheckingBalance());
        System.out.print(BankAccount1.getSavingsBalance());
    
    
    }
        







}