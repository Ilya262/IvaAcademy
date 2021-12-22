package iface;

public class SportCar extends Vehicle implements Speedable  {

	private String brandOfNitro;

	public SportCar(String model, int maxSpeed, double price, String brandOfNitro) {
		super(model, maxSpeed, price);
		this.brandOfNitro = brandOfNitro;
	}

	public String getBrandOfNitro() {
		return brandOfNitro;
	}

	public void setBrandOfNitro(String brandOfNitro) {
		this.brandOfNitro = brandOfNitro;
	}

	@Override
	public String toString() {
		return "SportCar [brandOfNitro=" + brandOfNitro + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void addSpeed() {
	
		int speed = getMaxSpeed()+100;
		setMaxSpeed(speed);
	}
	
	
	
}
