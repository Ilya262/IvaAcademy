package OCPgoodCode;

public class Greeter {

	Personality personality ;

	public Greeter(Personality personality) {
		super();
		this.personality = personality;
	}
	
	public String greet() {
		return personality.greet();
	}


	
}
