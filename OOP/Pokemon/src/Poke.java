
public abstract class Poke implements PokeInterface {
	public Pokemon createPokemon(String name, int health, String type) {
		Pokemon newPoke = new Pokemon(name, type, health);
		return newPoke;
	}
	
	public void attackPokemon(Pokemon pokemon) {
		int h = pokemon.getHealth();
		pokemon.setHealth(h-10);
	}
}
