/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import DTOs.CheckingAccount;

/**
 *
 * @author apprentice
 */
public class CheckingAccountDAOImpl implements CheckingAccountDAO{

    @Override
    public Double withdraw(CheckingAccount account, double amount) {
    	if (amount < 0) {
            throw new IllegalArgumentException("Cannot withdraw a negative amount");
            }
            account.setBalance(account.getBalance() - amount);
            return account.getBalance();
    }
    
}
