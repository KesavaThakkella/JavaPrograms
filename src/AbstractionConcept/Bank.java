package AbstractionConcept;

public abstract class Bank {

	// if we want to define any class as abstract class we need to define
	// abstract
	// keyword
	// Atlest one abstract method should be there
	// Abstract class can have abstract methods and non abstract methods
	// we cannot create the object of abstract class.
	// In abstract class we can define any kind of variables static and non
	// static variables eg: int amt =100; final int rate=10; static int
	// loanrate=5%

	// partial abstraction
	// Hiding the complete implementation logic is called as abstraction

	public abstract void loan(); // abstract method -- no method body

	public void credit() { // Non-abstract method it will contain method body

		System.out.println("Bank credit method");
	}

	public void debit() {

		System.out.println("Bank Debit method");
	}

}
