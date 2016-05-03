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
public interface AccountDAO {
    
    public double transfer(Account sourceAccount, Account destinationAccount, int amount);;
    public double deposit(Account account, int amount);
    
    
}
