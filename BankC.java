package ASSIGNMENT50;

class BankC extends Bank {
	 private double balance = 2000;

	 @Override
	 public double getBalance() {
	     return balance;
	 }

	 @Override
	 public double applyInterest() {
	     return balance + (balance * interestRate);
	 }
	}
