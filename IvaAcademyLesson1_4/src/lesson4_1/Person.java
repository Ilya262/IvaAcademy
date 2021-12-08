package lesson4_1;

public class Person {

	private String name;

	private String lastName;

	private Wallet wallet;

	public Person(String name, String lastName, Wallet wallet) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.wallet = wallet;
	}

	public Person(String name, String lastName) {
		super();
		this.name = name;
		this.lastName = lastName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Wallet getWallet() {
		return wallet;
	}

	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", lastName=" + lastName + ", wallet=" + wallet + "]";
	}
	
	
	
	
}
