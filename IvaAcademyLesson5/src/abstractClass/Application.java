package abstractClass;

public class Application {

	public static void main(String[] args) {
		
		
		
		Human h = new Human(40, 140, "Vova", 25);
		System.out.println(h);
		
		System.out.println();
		
		h.eat();
		
		h.move();
		
		System.out.println();
	
		Animal a = new Animal(20, 40, "dog", 20);
		
		System.out.println();
		
		System.out.println(a);
		
		System.out.println();
		
		a.eat();
		
		a.move();

	}
}
