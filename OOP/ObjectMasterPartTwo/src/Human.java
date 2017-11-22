
public class Human {
	public int strength;
	public int stealth;
	public int intelligence;
	public int health;
	
	public Human() {
		health = 100;
		strength = 3;
		stealth = 3;
		intelligence = 3;
	}
	
	public void attack(Human h) {
		h.health -= this.strength;
	}
}
