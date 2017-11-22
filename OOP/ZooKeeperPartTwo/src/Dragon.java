
public class Dragon extends Mammal{
	public Dragon() {
		energyLevel = 300;
	}
	
	public void fly() {
		System.out.println("SWOOOSH!!!");
		energyLevel -= 50;
	}
	
	public void eatHumans() {
		energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("Sizzla'");
		energyLevel -= 100;
	}
	
}
