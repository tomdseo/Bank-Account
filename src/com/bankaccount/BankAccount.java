package com.bankaccount;

public class BankAccount {
	private String accountNumber;
	private double checkingBalance;
	private double savingsBalance;
	private static int numAccounts = 0;
	private static double totalBalance;
	
	public double getCheckingBalance() {
		return checkingBalance;
	}

	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
	private String randomTenDigit() {
		String randomNumbers = "";
	    for(int i = 0; i < 10 ; i++){
	    	int range = (9 - 0) + 1;
	    	int randomInt = (int)(Math.random() * range) + 0;
	    	String str = String.format("%d", randomInt);
            randomNumbers += str;
        }
	    
        return randomNumbers;
    }

	//Constructor
	public BankAccount() {
		accountNumber = randomTenDigit(); //creates account number from ten random numbers
		numAccounts += 1;
	}
	
	public void depositMoneySavings(double money) {
		this.savingsBalance += money;
		totalBalance += money;
	}
	
	public void depositMoneyChecking(double money) {
		this.checkingBalance += money;
		totalBalance += money;
	}
	
	public void withdrawMoneySavings(double money) {
		if(this.savingsBalance >= money) {
			this.savingsBalance -= money;
			totalBalance -= money;
		} else {
			System.out.println("Transaction cancelled. Not enough money!");
		}
	}
	
	public void withdrawMoneyChecking(double money) {
		if(this.checkingBalance >= money) {
			this.checkingBalance -= money;
			totalBalance -= money;
		} else {
			System.out.println("Transaction cancelled. Not enough money!");
		}
	}
	
	public void viewBalance() {
		String str = String.format("View --> Savings Balance: %.2f | Checking Balance: %.2f", savingsBalance, checkingBalance);
		System.out.println(str);
	}
	
	public void viewAccountNumber() {
		String str = String.format("Your account number --> %s", accountNumber);
		System.out.println(str);
		
	}
	
	public static void viewNumAccounts() {
		String str = String.format("Number of accounts registered --> %d", numAccounts);
		System.out.println(str);
	}
	
	public static void viewTotalBalance() {
		String str = String.format("Sum of balance from all accounts --> %.2f", totalBalance);
		System.out.println(str);
	}
	
	
}
	
