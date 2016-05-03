/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import DTOs.Account;

/**
 *
 * @author apprentice
 */
public class AccountDAOImpl implements AccountDAO {

    @Override
    public double transfer(Account sourceAccount, Account destinationAccount, int amount) {
        double transferAmount = (double)amount;
        double sourceAccountBalance = sourceAccount.getBalance();
        double destinationAccountBalance = destinationAccount.getBalance();
        double newBalance =(sourceAccountBalance - transferAmount);
        sourceAccount.setBalance(newBalance);
        destinationAccount.setBalance(destinationAccountBalance + transferAmount);
        return sourceAccount.getBalance();
    }

    @Override
    public double deposit(Account account, int amount) {
        account.setBalance(account.getBalance() + amount);
        return account.getBalance();
    }
    
}
