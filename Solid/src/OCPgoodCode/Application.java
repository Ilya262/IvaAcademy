package OCPgoodCode;

public class Application {

	public static void main(String[] args) {

		Personality fPersonality = new FamilyPersonality();
		Personality formalPersonality = new FormalPersonality();
		Personality casualPersonality = new CasualPersonality();

		Greeter greeter = new Greeter(casualPersonality);
		System.out.println(greeter.greet());
		greeter = new Greeter(fPersonality);
		System.out.println(greeter.greet());
		
		greeter = new Greeter(formalPersonality);
		System.out.println(greeter.greet());

	}

}
