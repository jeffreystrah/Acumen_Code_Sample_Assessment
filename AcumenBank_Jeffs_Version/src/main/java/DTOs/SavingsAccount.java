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
public class SavingsAccount extends Account {
   
    public void setBalance(Double startingBalance) {
        balance = startingBalance;
    }
    private Double compoundingRate = 1d;
    private Double interestRate;
    private int yearsCompounded;

    public SavingsAccount(String ace, int i, double d) {
        this.ownerName = ace;
        this.balance = (double)i;
        this.interestRate = d;
    }
    
    public void SavingsAccount(String ownerName, double balance) {
            this.ownerName = ownerName;
            this.balance = balance;
    }
        
    public void SavingsAccount(){

    }

    public Double getCompoundingRate() {
        return compoundingRate;
    }

    public void setCompoundingRate(Double compoundingRate) {
        this.compoundingRate = compoundingRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public int getYearsCompounded() {
        return yearsCompounded;
    }

    public void setYearsCompounded(int yearsCompounded) {
        this.yearsCompounded = yearsCompounded;
    }


}
