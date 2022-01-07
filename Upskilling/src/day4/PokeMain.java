package day4;

public class PokeMain {
	public static void main(String[] args) {
		Pokemon poke = new Pokemon("FIRE", "DARK", "Houndoom", 100);
		poke.attack("FIRE", "ICE", "STEEL");
		poke.attack("DARK", "ICE", "STEEL");
	}
}
