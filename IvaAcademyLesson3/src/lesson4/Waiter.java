package lesson4;

public class Waiter extends Human{

	
	private double hourPayRate;

	private double tips;
	
	
	public Waiter(String name, String lastName, int age, int hight) {
		super(name, lastName, age, hight);
		
	}
	
	

	public Waiter(String name, String lastName, int age, int hight, double hourPayRate, double tips) {
		super(name, lastName, age, hight);
		this.hourPayRate = hourPayRate;
		this.tips = tips;
	}



	public double getHourPayRate() {
		return hourPayRate;
	}



	public void setHourPayRate(double hourPayRate) {
		this.hourPayRate = hourPayRate;
	}



	public double getTips() {
		return tips;
	}



	public void setTips(double tips) {
		this.tips = tips;
	}



	@Override
	public String toString() {
		return "Waiter [hourPayRate=" + hourPayRate + ", tips=" + tips + ", getName()=" + getName() + ", getLastName()="
				+ getLastName() + ", getAge()=" + getAge() + ", getHight()=" + getHight() + "]";
	}
	
	
	
}
