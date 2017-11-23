
public class Pokemon extends Poke {
	private String name;
	private String type;
	private int health;
	private static int pokenumber;
	
	public Pokemon(String name, String type, int health) {
		this.name = name;
		this.type = type;
		this.health = health;
	}
	
	public String pokemonInfo(Pokemon pokemon) {
		return "Name: "+pokemon.getName()+" Type: "+pokemon.getType()+" Health: "+pokemon.getHealth();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
}
