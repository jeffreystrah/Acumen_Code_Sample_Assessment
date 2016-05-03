/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTOs;

/**
 *
 * @author apprentice
 */
public class CheckingAccount extends Account{
    
    private String ownerName;
    private double balance;

    public CheckingAccount(String ownerName, int i) {
       this.ownerName = ownerName;
       this.balance = i;
    }

    public void CheckingAccount(){

    }

    public void CheckingAccount(String ownerName, double balance) {
            this.ownerName = ownerName;
            this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
     
}
