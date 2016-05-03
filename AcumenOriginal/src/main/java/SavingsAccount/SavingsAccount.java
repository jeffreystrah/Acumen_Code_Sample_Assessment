/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SavingsAccount;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class SavingsAccount {
    private String ownerName;
    private int balance;
    private Double interestRate;
    
    
    public void SavingsAccount(){
        
    }

    public SavingsAccount(String ace, int i, double d) {
        this.ownerName = ace;
        this.balance = i;
        this.interestRate = d;
    }    

    public void transfer(SavingsAccount garysSavingsAccount, int i) {
        transferWithdrawl(i);
        garysSavingsAccount.deposit(i);
    }

    private void transferWithdrawl(int i) {
        balance -= i;
    }

    private void deposit(int i) {
        balance += i;
    }

    public void applyInterest(int i) {
        for (int x = 0; x < i; x++) {
            Double interestEarned;
            interestEarned = balance * ((interestRate) / 1); //here 1 represents the number of times compounded yearly
            balance += interestEarned;
            
        }
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String userName) {
        this.ownerName = userName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
        
}
