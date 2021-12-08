package abstractClass;

public class Animal extends Creature {

	private String breed;
	private int speed;

	public Animal(double weight, int height, String breed, int speed) {
		super(weight, height);
		this.breed = breed;
		this.speed = speed;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Animal [breed=" + breed + ", speed=" + speed + ", getWeight()=" + getWeight() + ", getHeight()="
				+ getHeight() + ", toString()=" + super.toString() + "]";
	}

	@Override
	void move() {
		System.out.println("Animal is moving");

	}

	@Override
	void eat() {
		System.out.println("Animal is eating");

	}

}
