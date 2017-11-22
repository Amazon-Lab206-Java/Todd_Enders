
public class Ninja extends Human {
	public Ninja() {
		stealth = 10;
	}
	
	public void steal(Human h) {
		h.health -= this.stealth;
		this.health += this.stealth;
	}
	
	public void runAway() {
		health -= 10;
	}
}
