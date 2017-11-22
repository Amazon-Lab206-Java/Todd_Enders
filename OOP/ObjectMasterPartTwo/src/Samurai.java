
public class Samurai extends Human {
	private static int numSamurai = 0;
	
	public Samurai() {
		health = 200;
		numSamurai++;
	}
	
	public void deathBlow(Human h) {
		h.health = 0;
		this.health /= 2;
	}
	
	public void meditate() {
		health += health/2;
	}
	
	public int howMany() {
		return numSamurai;
	}
}
