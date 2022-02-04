package Enum3;

import java.util.Scanner;

public class Application {
	
	public enum Direction {

		NORHT, SOUTH, WEST, EAST;

	}
	public enum Continent {

		AUSTRALIA(Direction.NORHT), OCANIA(Direction.SOUTH), ASIA(Direction.WEST), AMERICA(Direction.EAST),
		ANTARCTICA(Direction.NORHT), AFRICA(Direction.NORHT), EUROPE(Direction.SOUTH);


		Direction direction;
		
		Continent(Direction direction) { //constructor
			this.direction = direction;
		}

		public Direction getDirection() {
			return direction;
		}
	}

	static void menu() {

		System.out.println("\nPress 1 to check continent existing");
		System.out.println("Press 2 to output all Continent with the smae Derection:");
		System.out.println("Press 3 to output the nex Continent");
	}

	

	public static void main(String[] args) {
		Continent[] mass = Continent.values();

		Scanner sc = new Scanner(System.in);

		while (true) {

			menu();

			switch (sc.next()) {
			case "1": {

				System.out.println("Enter continent");

				String continent = sc.next().toUpperCase();

				boolean flag = isContinentPresent(mass, continent);

				if (!flag) {
					System.out.println("Continent doesn`t exists");
				}
				break;

			}

			case "2": {
				System.out.println("> Enter Direction:");
				sc = new Scanner(System.in);
				String directionSc = sc.next().toUpperCase();
				
				boolean flag = false;
				
				for (Continent c : mass) {
					if (c.getDirection().name().equals(directionSc)) {
						flag = true;
					}
				}
			
			
				if (flag) {
					Direction dir = Direction.valueOf(directionSc);
					
					for (Continent cont : mass) {
						if (cont.getDirection().toString().equalsIgnoreCase(directionSc)) {
							System.out.println(cont);
						}
					}
				} else { 
					System.out.println("Direction doesn't exists");
				}
				break;	
				
			}
			case "3": {

				System.out.println("Enter continent");

				String continent = sc.next().toUpperCase();

				boolean flag = isContinentPresent(mass, continent);

				if (flag) {
					Continent continent2 = Continent.valueOf(continent);
					int ordinal = continent2.ordinal();
					if (ordinal == (mass.length - 1)) {
						ordinal = 0;
						System.out.println(mass[ordinal]);

					} else {
						System.out.println(mass[ordinal + 1]);
					}

				} else {
					System.out.println("Continent doesn`t exists");
				}
				break;

			}

			default:
				throw new IllegalArgumentException("Unexpected value: " + sc.next());
			}
		}

	}

	private static boolean isContinentPresent(Continent[] mass, String continent) {
		boolean flag = false;
		for (Continent c : mass) {
			if (c.name().equals(continent)) {
				System.out.println("continent exists");
				flag = true;
			}
		}

		return flag;
	}

}
