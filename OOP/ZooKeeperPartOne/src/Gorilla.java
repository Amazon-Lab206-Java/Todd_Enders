
public class Gorilla extends Mammal {
	public void throwSomething() {
		System.out.println("That dang gorilla just flung somethin'");
		energyLevel -= 5;
	}
	
	public void eatBananas() {
		System.out.println("Yummy bananas");
		energyLevel += 10;
	}
	
	public void climb() {
		System.out.println("Climbing a tree...");
		energyLevel -= 10;
	}
}
