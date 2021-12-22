package iface;

public class Truck extends Vehicle implements Speedable{

	private double maxLoad;
	private double lenght;

	public Truck(String model, int maxSpeed, double price, double maxLoad, double lenght) {
		super(model, maxSpeed, price);
		this.maxLoad = maxLoad;
		this.lenght = lenght;
	}

	public double getMaxLoad() {
		return maxLoad;
	}

	public void setMaxLoad(double maxLoad) {
		this.maxLoad = maxLoad;
	}

	public double getLenght() {
		return lenght;
	}

	public void setLenght(double lenght) {
		this.lenght = lenght;
	}

	@Override
	public String toString() {
		return "Truck [maxLoad=" + maxLoad + ", lenght=" + lenght + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void addSpeed() {
		int speed=getMaxSpeed()+100;
		setMaxSpeed(speed);
		
	}

}
