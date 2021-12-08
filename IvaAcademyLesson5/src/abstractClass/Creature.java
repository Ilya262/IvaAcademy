package abstractClass;

public abstract class Creature {

	private double weight;
	private int height;
	public Creature(double weight, int height) {
		super();
		this.weight = weight;
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Creature [weight=" + weight + ", height=" + height + "]";
	}
	
	abstract void move();
	abstract void eat();
	
	
	
}
