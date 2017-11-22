
public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ninja n = new Ninja();
		Samurai s = new Samurai();
		Samurai sam = new Samurai();
		Wizard w = new Wizard();
		n.steal(w);
		w.fireball(s);
		s.deathBlow(w);
		System.out.println(n.health);
		System.out.println(w.health);
		System.out.println(s.health);
		System.out.println(s.howMany()); // should be 2
	}

}
