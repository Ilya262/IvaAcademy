package OCPbadCode;

public class Concierge {

	String formality;

	public String greet() {

		if (this.formality == "formal") {
			return "good evening sir";
		} else if (this.formality == "casual") {
			return "hello bro";
		} else if (this.formality == "family") {

			return "hello";
		}

		return "hello.....";

	}

}
