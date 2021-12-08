package staticVarible;

public class StaticClassMain {

	public static void main(String[] args) {
	
		
		StatiClass s=new StatiClass();
		System.out.println(s.myName);
		System.out.println(StatiClass.MY_NAME);
		
		StatiClass.sayHello();
	}

}
