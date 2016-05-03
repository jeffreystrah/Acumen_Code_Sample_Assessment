/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import DTOs.Account;
import DTOs.SavingsAccount;

/**
 *
 * @author apprentice
 */
public class SavingsAccountDAOImpl implements SavingsAccountDAO {
    
    @Override
    public Double calculateInterest(SavingsAccount account, int timeInYears) {
        Double interestEarned = 0.0d;
        
        for (int i = 0; i < timeInYears; i++) {
            
            interestEarned = account.getBalance() * ((account.getInterestRate() / 100) / account.getCompoundingRate());
            account.setBalance(interestEarned + account.getBalance());
            
        }
        return account.getBalance();
    }
    
}
