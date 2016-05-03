package com.tsg.capstone.CheckingAccount;

public class CheckingAccount {
	private String ownerName;
	private double balance;

        public CheckingAccount(){
            
        }
        
	public CheckingAccount(String ownerName, double balance) {
		this.ownerName = ownerName;
		this.balance = balance;
	}

	public void transfer(CheckingAccount sourceAccount, CheckingAccount destinationAccount, double amount) {
                sourceAccount.withdraw(amount);
		destinationAccount.deposit(amount);
	}

	public void deposit(double amount) {
		if (amount < 0) {
			throw new IllegalArgumentException("Cannot deposit a negative amount");
		}
		this.balance += amount;
	}

	public void withdraw(double amount) {
		if (amount < 0) {
			throw new IllegalArgumentException("Cannot withdraw a negative amount");
		}
		this.balance -= amount;
	}

	public String getOwnerName() {
		return this.ownerName;
	}

	public double getBalance() {
		return this.balance;
	}

    public void transfer(CheckingAccount michaelsAccount, int i) {
        withdraw(i);
        michaelsAccount.deposit(i);
    }

}