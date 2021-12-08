package lesson4_2;

public class Wallet  {

	private double amountOfMoney;
	private double width;

	

	public Wallet(double amountOfMoney, double width) {
		
		this.amountOfMoney = amountOfMoney;
		this.width = width;
	}

	public double getAmountOfMoney() {
		return amountOfMoney;
	}

	public void setAmountOfMoney(double amountOfMoney) {
		this.amountOfMoney = amountOfMoney;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Wallet [amountOfMoney=" + amountOfMoney + ", width=" + width;
	}

	

}
