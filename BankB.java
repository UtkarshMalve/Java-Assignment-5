package ASSIGNMENT50;

class BankB extends Bank {
	 private double balance = 1500;

	 @Override
	 public double getBalance() {
	     return balance;
	 }

	 @Override
	 public double applyInterest() {
	     return balance + (balance * interestRate);
	 }
	}
