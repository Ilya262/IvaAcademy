package lesson4_1;

public class Application {

	public static void main(String[] args) {

		
		
		Person person = new Person("Name","lastName");
		
		System.out.println(person);
		
		Person person2 =new Person("Name1", "lastName2", new Wallet(500,50));
		

		System.out.println(person2);
		
	}

}
