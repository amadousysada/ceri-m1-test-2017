package fr.univavignon.rodeo.implementation;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.ISpecie;
import fr.univavignon.rodeo.api.SpecieLevel;

/**
 * This interface represents a game state.
 * Aims to be instantiated by an {@link GameStateProvider}.
 * 
 * @author SY
 */
public class GameState extends NamedObject implements IGameState{
	
	private SpecieLevel sl;
	private int progression;
	
	public GameState(String _name) {
		super(_name);
		sl=null;
		progression=10;
	}

	/**
	 * Unlock a new area / environment. Ensures that all animals
	 * of the current area are unlocked and that there is a new
	 * area to explore, throwing an IllegalStateException otherwise.
	 * 
	 * @throws IllegalStateException If the area cannot be explored.
	 */
	public void exploreArea() throws IllegalStateException {
		throw new IllegalStateException();
	}

	/**
	 * Sets the given <tt>animal</tt> as caught.
	 * 
	 * @param animal Animal to caught.
	 * @throws IllegalArgumentException If the given <tt>animal</tt> is <tt>null</tt>.
	 * @throws IllegalStateException If the given <tt>animal</tt> can not be found in current areas.
	 */
	public void catchAnimal(IAnimal animal) throws IllegalArgumentException, IllegalStateException {
		if (animal==null) {
			throw new IllegalArgumentException();
		}else{
			throw new IllegalStateException();
		}
		
	}
	/**
	 * Retrieves the level of the given specie.
	 * 
	 * @param specie Specie to get level for.
	 * @return Current specie level.
	 * @throws IllegalArgumentException If the given <tt>specie</tt> is <tt>null</tt>
	 */
	public SpecieLevel getSpecieLevel(ISpecie specie) throws IllegalArgumentException {
		if (specie==null) {
			throw new IllegalArgumentException();
		}
		
		return sl;
	}

	/**
	 * Computes and returns the game progression percentage.
	 * 
	 * @return The total game progression in percent.
	 */
	public int getProgression() {
		return progression;
	}

}
