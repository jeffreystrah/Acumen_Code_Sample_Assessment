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
public interface CheckingAccountDAO {

    public Double withdraw(CheckingAccount account, double amount);

}
