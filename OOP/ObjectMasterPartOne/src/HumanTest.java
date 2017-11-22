
public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human h1 = new Human();
		Human h2 = new Human();
		h2.attack(h1);
		System.out.println(h2.health); // 100
		System.out.println(h1.health); // 97
	}

}
