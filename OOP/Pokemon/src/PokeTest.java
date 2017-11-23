
public class PokeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pokemon p1 = new Pokemon("Kylebomb", "PLR", 100);
		Pokemon p2 = new Pokemon("Tenderbomb", "PLR", 100);
		p1.attackPokemon(p2);
		Pokedex pdex = new Pokedex();
		System.out.println(pdex.pokemonInfo(p1));
		System.out.println(pdex.pokemonInfo(p2));
	}

}
