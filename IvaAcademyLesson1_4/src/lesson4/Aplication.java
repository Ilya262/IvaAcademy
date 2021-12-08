package lesson4;

public class Aplication {

	public static void main(String[] args) {
	
		Student student =new Student(1, "NTY");//
		
		System.out.println(student);
		
		Student student2 =new Student("Roman", "lol", 35, 156, 2, "KY");
		
		
		System.out.println(student2);

		
		System.out.println("*****************************************************************");
		
		
		
		
		
		
		
		
		
		
		Waiter waiter = new Waiter("Oleg", "Olegov", 45,200);
		
		System.out.println(waiter.getAge());
		
		System.out.println(waiter.getLastName());
		
		waiter.setAge(50);
		
		System.out.println(waiter);
		
		Waiter waiter2 =new Waiter("Igor", "Romanchuk", 33, 190, 20, 5);
		
		System.out.println(waiter2);
	}

}
