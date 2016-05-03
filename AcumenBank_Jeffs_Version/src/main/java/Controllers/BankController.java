/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DAOs.AccountDAOImpl;
import DAOs.CheckingAccountDAOImpl;
import DAOs.SavingsAccountDAOImpl;
import DTOs.Account;
import DTOs.CheckingAccount;
import DTOs.SavingsAccount;
import java.text.NumberFormat;

/**
 *
 * @author apprentice
 */
public class BankController {
    AccountDAOImpl accountDao;
    SavingsAccountDAOImpl savingsDao;
    CheckingAccountDAOImpl checkingDao;
    NumberFormat formatter = NumberFormat.getCurrencyInstance();
    
    public void run() {
        
        accountDao = new AccountDAOImpl();
        savingsDao = new SavingsAccountDAOImpl();
        checkingDao = new CheckingAccountDAOImpl();
    System.out.println("Welcome to Acumen Bank!");
		System.out.println();

		Account michaelsAccount = new CheckingAccount("Michael", 5000);
		Account gobsAccount = new CheckingAccount("Gob", 2000);

		System.out.println("Open Accounts:");
		System.out.println();
		printAccountDetails((CheckingAccount) michaelsAccount);
		System.out.println();
		printAccountDetails((CheckingAccount) gobsAccount);

		System.out.println();
		System.out.println("Making transfer of $1000 From Michael to Gob ...");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			return;
		}
                
                accountDao.transfer(michaelsAccount, gobsAccount, 1000);

		System.out.println("Updated Account Details:");
		System.out.println();
		printAccountDetails((CheckingAccount)michaelsAccount);
		System.out.println();
		printAccountDetails((CheckingAccount)gobsAccount);

		// sample code for savings account implementation
		
//		Initialize new savings account with initial balance of $30,000 and 0.89% interest
		Account acesSavingsAccount = new SavingsAccount("Ace", 30000, .0089);
		
		Account garysSavingsAccount = new SavingsAccount("Gary", 10000, .0056);
		
                System.out.println();
                printSavingsAccountDetails((SavingsAccount) acesSavingsAccount);
                printSavingsAccountDetails((SavingsAccount)garysSavingsAccount);
                
                System.out.println();
		System.out.println("Making transfer of $5000 From Ace to Gary ...");
                
                
                System.out.println();
                
		accountDao.transfer(acesSavingsAccount, garysSavingsAccount, 5000);
                printSavingsAccountDetails((SavingsAccount)acesSavingsAccount);
                printSavingsAccountDetails((SavingsAccount)garysSavingsAccount);
                System.out.println();
		// apply 2 years of interest to the savings accounts
                System.out.println("Applying two years of interest");
                System.out.println();
		savingsDao.calculateInterest((SavingsAccount)acesSavingsAccount, 2);
		savingsDao.calculateInterest((SavingsAccount)garysSavingsAccount, 2);
                
                printSavingsAccountDetails((SavingsAccount)acesSavingsAccount);
                printSavingsAccountDetails((SavingsAccount)garysSavingsAccount);
                
		
	}

	private void printAccountDetails(CheckingAccount account) {
		System.out.println("Account for " + account.getOwnerName());                
		System.out.println("Balance: " + formatter.format(account.getBalance()));
	}
        
        private  void printSavingsAccountDetails(SavingsAccount account) {
		System.out.println("Savings account for " + account.getOwnerName());
		System.out.println("Savings balance: " + formatter.format(account.getBalance()));
                System.out.println();
	}
    
    }