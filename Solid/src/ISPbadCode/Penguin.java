package ISPbadCode;

public class Penguin implements Bird{

	@Override
	public void fly() {
		System.out.println("this method not working");
	}
	@Override
	public void molt() {
	System.out.println("I am` molt");
		
	}

}
