package monsters;

public class badVampire implements Vampire{

	@Override
	public void destroy() {
		System.out.println("Vipire will destroy somebody");
		
	}

	@Override
	public void eat() {
		System.out.println("Vipire will eat something");
		
	}

	@Override
	public void kill() {
		System.out.println("Vipire will kill somebody");
		
	}

	@Override
	public void drinkBlood() {
		System.out.println("Vipire will drink some blood");
		
	}

}
