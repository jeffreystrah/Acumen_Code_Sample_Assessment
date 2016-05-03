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
public interface SavingsAccountDAO {
   public Double calculateInterest(SavingsAccount account, int timeInYears) ;
}
