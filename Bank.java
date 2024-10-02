package ASSIGNMENT50;

class Bank {

	static double interestRate = 0.05;

	public double getBalance() {
		return 0;
	}

	public double applyInterest() {
		return getBalance() + (getBalance() * interestRate);
	}
}
