package com.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount hector = new BankAccount();
		BankAccount jose = new BankAccount();
		hector.depositMoneyChecking(300.50);
		hector.withdrawMoneyChecking(400.12);
		hector.viewBalance();
		hector.viewAccountNumber();
		jose.depositMoneySavings(200.12);
		BankAccount.viewNumAccounts();
		BankAccount.viewTotalBalance();
		}

}
