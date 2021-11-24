package lesson4_2;

public class Person2 extends Wallet {

	private String name;

	private String lastName;

	public Person2(double amountOfMoney, double width, String name, String lastName) {
		super(amountOfMoney, width);
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

	@Override
	public String toString() {
		return "Person2 [name=" + name + ", lastName=" + lastName + ", getAmountOfMoney()=" + getAmountOfMoney()
				+ ", getWidth()=" + getWidth() + "]";
	}

	

}
