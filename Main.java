// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import  java.util.*;
public class Main {
    public static void main (String[] args) {
        char choice;
        Bank myBank = new Bank();

        //offer menu
        do {
            System.out.println("Welome, What would you like to do?");
            System.out.println("1. Create a new Bank Account");
            System.out.println("2. Remove an Account");
            System.out.println("3. Deposit money");
            System.out.println("4. Withdrawl Money");
            System.out.println("5. Check Account Details");
            System.out.println("6. Quit");
            System.out.print("Enter Choice 1-6: ");

            //get Choice
            choice = EasyScanner.nextChar();

            //process menu options
            switch (choice) {
                case '1':
                    option1(myBank);
                    break;
                case '2':
                    option2(myBank);
                    break;
                case '3':
                    option3(myBank);
                    break;
                case '4':
                    option4(myBank);
                    break;
                case '5':
                    option5(myBank);
                    break;
                case '6': break;
                default:
                    System.out.println("Invaid Entry");
            }
        } while (choice != '6');
    }

    //Add Account Method
     static void option1(Bank BankIn){
        //Get Details from the user
        System.out.print("Enter Account Number: ");
        String number = EasyScanner.nextString();
        System.out.print("Enter Name of Account: ");
        String name = EasyScanner.nextString();

        //Add Account to the List
        boolean success = BankIn.addAccount(number, name);

        if (success){
            System.out.println("Account Added");
        }else {
            System.out.println("Account Number already exists");
        }
    }

    //Remove Account
     static void option2(Bank BankIn){
        //Collect Details from User
        System.out.print("Enter Account number to remove ");
        String number = EasyScanner.nextString();
        //Remove Account
        boolean found = BankIn.removeAccount(number);
        if(found){
            // i need the output to display the account name alongside the account number
            // e.g Emeka with Account number 12345 has been removed
//            bankAccount account = BankIn.getItem(number);
//            System.out.println(account.getAccountName());
//            if (account != null){
                System.out.println(" Account Successfully removed");
//            }else {
//                System.out.println("Invalid account");
            }
        else {
            System.out.print("Account not foundln");
        }
    }

    //Deposit Money in Account
     static void option3(Bank BankIn){
        //Collect details from user
        System.out.print("Enter Account Number to Deposit to: ");
        String number = EasyScanner.nextString();
        System.out.print("Enter Amount to Deposit: ");
        double amount = EasyScanner.nextDouble();

        boolean found = BankIn.depositMoney(number, amount);
        if (found){
            System.out.print(amount + " Deposited into " + "Account " + number + "Successfully");
        }
        System.out.print("Account not found");
    }

    //Withdrawl Money from an Account
     static void option4(Bank BankIn){
        //Collect details from user
        System.out.print("Enter Account to Withdrawl from: ");
        String number = EasyScanner.nextString();
        System.out.print("Amount to Withdrawl");
        double amount = EasyScanner.nextDouble();

        boolean ok= BankIn.withdrawMoney(number, amount);
        if (ok){
            System.out.print(amount + " Added Successfully");
        }else {
            System.out.print("Account not found or Insufficient Funds");
        }
    }

    //Check Account details
     static void option5(Bank BankIn){
        //Collect details from user\
        System.out.print("Enter Account Number");
        String number = EasyScanner.nextString();

        bankAccount account = BankIn.getItem(number);
        if (account != null) {
            System.out.println("Account number: "+ account.getAccountNumber());
            System.out.println("Account name: " + account.getAccountName());
            System.out.println("Account Balance: " + account.getAccountBalance());
        }else {
            System.out.print("Account does not exist");
        }
    }























//        double amount;
//        boolean ok;
//        bankAccount account1 = new bankAccount("99786754","Susan Richards");
//        System.out.print("Enter amount to deposit: ");
//        amount = keyboard.nextDouble();
//        account1.deposit(amount);
//        System.out.println("Deposit was made");
//        System.out.println("Balance = " + account1.getAccountBalance());
//        System.out.println();
//        System.out.print("Enter amount to withdraw: ");
//        amount = keyboard.nextDouble();
//        ok = account1.withdrawl(amount); // get the return value of the withdraw method
//        if(ok)
//        {
//            System.out.println("Withdrawal made");
//        }
//        else
//        {
//            System.out.println("Insufficient funds");
//        }
//        System.out.println("Balance = " + account1.getAccountBalance());
//        System.out.println();


        // create an array of references
//        bankAccount[] accountList = new bankAccount[3];
//// create three new accounts, referenced by each element in the array
//        accountList[0] = new bankAccount("99786754","Susan Richards");
//        accountList[1] = new bankAccount("44567109","Delroy Jacobs");
//        accountList[2] = new bankAccount("46376205","Sumana Khan");
//// make various deposits and withdrawals
//        accountList[0].deposit(1000);
//        accountList[2].deposit(150);
//        accountList[0].withdrawl(500);
//// print details of all three accounts
//        for(bankAccount item : accountList)
//        {
//            System.out.println("Account number: " + item.getAccountNumber());
//            System.out.println("Account name: " + item.getAccountName());
//            System.out.println("Current balance: " + item.getAccountBalance());
//            System.out.println();
//        }

        // create an array of references
//        ArrayList<bankAccount> accountList = new ArrayList<>();
//// create three new accounts, referenced by each element in the array
//        accountList.add(new bankAccount("99786754","Susan Richards"));
//        accountList.add(new bankAccount("44567109","Delroy Jacobs"));
//        accountList.add(new bankAccount("46376205","Sumana Khan"));
//// make various deposits and withdrawals
//        accountList.get(0).deposit(1000);
//        accountList.get(2).deposit(150);
//        accountList.get(0).withdrawl(500);
//        // print details of all three accounts
//        for(bankAccount item : accountList)
//        {
//            System.out.println("Account number: " + item.getAccountNumber());
//            System.out.println("Account name: " + item.getAccountName());
//            System.out.println("Current balance: " + item.getAccountBalance());
//            System.out.println();
//        }


}