package fcu.oop.iecs;

public class Charmander extends Pokemon
{
	public Charmander(String name, PokemonType type, int cp)
	{
		super(name, type, cp);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void attack()
	{
		System.out.println("Ember...");
	}
}
