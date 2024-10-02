package ASSIGNMENT50;

class BankA extends Bank {
	 private double balance = 1000;

	 @Override
	 public double getBalance() {
	     return balance;
	 }

	 @Override
	 public double applyInterest() {
	     return balance + (balance * interestRate);
	 }
	}