package com.tsg.capstone.AcumenBank;


import SavingsAccount.SavingsAccount;
import com.tsg.capstone.CheckingAccount.CheckingAccount;


public class AcumenBank {

	public static void main(String[] args) {
		System.out.println("Welcome to Acumen Bank!");
		System.out.println();

		CheckingAccount michaelsAccount = new CheckingAccount("Michael", 5000);
		CheckingAccount gobsAccount = new CheckingAccount("Gob", 2000);

		System.out.println("Open Accounts:");
		System.out.println();
		printAccountDetails(michaelsAccount);
		System.out.println();
		printAccountDetails(gobsAccount);

		System.out.println();
		System.out.println("Making transfer of $1000 From Michael to Gob ...");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			return;
		}

                michaelsAccount.transfer(gobsAccount, 1000);

		System.out.println("Updated Account Details:");
		System.out.println();
		printAccountDetails(michaelsAccount);
		System.out.println();
		printAccountDetails(gobsAccount);

		// sample code for savings account implementation
		
//		Initialize new savings account with initial balance of $30,000 and 0.89% interest
		SavingsAccount acesSavingsAccount = new SavingsAccount("Ace", 30000, .0089);
		
		SavingsAccount garysSavingsAccount = new SavingsAccount("Gary", 10000, .0056);
		
                printSavingsAccountDetails(acesSavingsAccount);
                printSavingsAccountDetails(garysSavingsAccount);
                
                System.out.println();
		System.out.println("Making transfer of $5000 From Ace to Gary ...");
                
                
                System.out.println();
                
		acesSavingsAccount.transfer(garysSavingsAccount, 5000);
                printSavingsAccountDetails(acesSavingsAccount);
                printSavingsAccountDetails(garysSavingsAccount);
                System.out.println();
		// apply 2 years of interest to the savings accounts
                System.out.println("Applying two years of interest");
                System.out.println();
		acesSavingsAccount.applyInterest(2);
		garysSavingsAccount.applyInterest(2);
                
                printSavingsAccountDetails(acesSavingsAccount);
                printSavingsAccountDetails(garysSavingsAccount);
                
		
	}

	private static void printAccountDetails(CheckingAccount account) {
		System.out.format("Account for %s:\r\n", account.getOwnerName());
		System.out.format("Balance: $%.2f\r\n", account.getBalance());
	}
        
        private static void printSavingsAccountDetails(SavingsAccount account) {
		System.out.format("Savings account for %s:\r\n", account.getOwnerName());
		System.out.format("Savings balance: $%.2f\r\n " , account.getBalance());
                System.out.println();
	}
        
}