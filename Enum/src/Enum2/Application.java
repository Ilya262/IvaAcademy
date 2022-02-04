package Enum2;

import java.util.Arrays;



public class Application {

	public static void main(String[] args) {
		
		
		
		Seasons seasons = Seasons.SPRING;
		
		
		System.out.println(seasons.name());
		System.out.println(seasons.compareTo(Seasons.FALL));
		System.out.println(seasons.compareTo(Seasons.SPRING));
		System.out.println(seasons.compareTo(Seasons.WINTER));
		System.out.println(seasons.ordinal());
		System.out.println(seasons.toString());
		System.out.println(seasons.getDeclaringClass());
		System.out.println(seasons.values());
		System.out.println(Arrays.toString(seasons.values()));
		
		Seasons seasons2 = Seasons.valueOf("WINTER");
		
		
		System.out.println(seasons2.name());
		
		
	}

}
