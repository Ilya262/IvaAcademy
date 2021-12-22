package iface;

public class Application {

	public static void main(String[] args) {
	
		Lotus lotus =new Lotus("evora", 200, 75000, "Nitro");
		System.out.println(lotus);
		
		
		lotus.addSpeed();
		System.out.println(lotus);

		lotus.addSpeed();
		System.out.println(lotus);
		
		Truck truck =new Truck("Vazik", 80, 10000, 5000, 3);
		
		System.out.println(truck);
		truck.addSpeed();
		System.out.println(truck);
		
	}

}
