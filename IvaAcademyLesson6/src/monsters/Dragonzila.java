package monsters;

public class Dragonzila implements DangerousMonster {

	@Override
	public void destroy() {
		System.out.println("I will destroy you ");
		
	}

	@Override
	public void eat() {
		System.out.println("I will eat you ");
		
	}
	

}
