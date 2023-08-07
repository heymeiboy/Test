public class bankAccount {
    private String accountNumber;
    private String accountName;
    private double accountBalance;
    public bankAccount(String accountNumber, String accountNames){
        this.accountNumber=accountNumber;
        this.accountName = accountNames;
        this.accountBalance = 0;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public String getAccountName(){
        return accountName;
    }

    public double getAccountBalance(){
        return accountBalance;
    }

    public void deposit(double amount){
        this.accountBalance=this.accountBalance + amount;
    }

    public boolean withdrawl(double amount){
        if (amount > this.accountBalance){
            return false;
        }else{
            this.accountBalance=this.accountBalance - amount;
        }return true;
    }
}
