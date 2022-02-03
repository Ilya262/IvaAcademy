package LSPgoodCode;

public class Application {

	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle();

		rectangle.setHeight(10);
		rectangle.setWight(5);
		System.out.println(rectangle.calculateSquire());

		Square square = new Square();
		square.setWight(5);
		System.out.println(square.calculateSquire());

	}

}
