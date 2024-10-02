package ASSIGNMENT50;

class Employee extends Person {
	 private double salary;

	 public Employee(String name, double salary) {
	     super(name); 
	     this.salary = salary;
	 }

	 public void work() {
	     System.out.println(name + " is working.");
	 }

	 public double getSalary() {
	     return salary;
	 }

	 @Override
	 public void displayInfo() {
	     super.displayInfo(); 
	     System.out.println("Salary: " + salary);
	 }
	}

	
	class HRManager extends Employee {
	 public HRManager(String name, double salary) {
	     super(name, salary); // Call the constructor of Employee
	 }

	 
	 @Override
	 public void work() {
	     System.out.println(name + " is managing HR operations.");
	 }

	
	 public void addEmployee(String employeeName) {
	     System.out.println(name + " has added a new employee: " + employeeName);
	 }
	}
