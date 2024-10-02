package ASSIGNMENT50;

public class Main {
	 public static void main(String[] args) {
	     // Create instances of each bank
	     BankA bankA = new BankA();
	     BankB bankB = new BankB();
	     BankC bankC = new BankC();

	     // Print balance and interest applied for each bank
	     System.out.println("Bank A Balance: " + bankA.getBalance());
	     System.out.println("Bank A Balance after Interest: " + bankA.applyInterest());

	     System.out.println("Bank B Balance: " + bankB.getBalance());
	     System.out.println("Bank B Balance after Interest: " + bankB.applyInterest());

	     System.out.println("Bank C Balance: " + bankC.getBalance());
	     System.out.println("Bank C Balance after Interest: " + bankC.applyInterest());
	 }
}