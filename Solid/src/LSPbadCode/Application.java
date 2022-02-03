package LSPbadCode;

public class Application {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();

		r1.setHeight(10);
		r1.setWeight(5);
		System.out.println(r1.calculateSqurie());

		r1 = new Square(); // Square square =new Square();
		
		r1.setHeight(10);
		r1.setWeight(5);
		System.out.println(r1.calculateSqurie());

	}

}
