package monsters;

public class MonsterShow {

	static void eat(Monster m) {
		m.eat();
	}
	
	static void eatDestroy(DangerousMonster m) {
		m.eat();
		m.destroy();
	}
	static void kill(Lethal l) {
		l.kill();
	}
	
public static void main(String[] args) {
	DangerousMonster rex = new Dragonzila();
	eatDestroy(rex);

	
	Vampire dacula=new badVampire();
	eat(dacula);
	eatDestroy(dacula);
	kill(dacula);
	
}
	
}
