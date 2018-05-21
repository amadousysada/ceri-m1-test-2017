package fr.univavignon.rodeo.implementation;

import java.util.ArrayList;
import java.util.List;

import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.IGameStateProvider;

/**
 * Manages game states.
 * 
 * @author SY
 */
public class GameStateProvider implements IGameStateProvider{
	
	
	private List<IGameState> iGameStates;
	
	public GameStateProvider() {
		this.iGameStates= new ArrayList<IGameState>();
	}
	

	

	/**
	 * Saves the given <tt>gameState</tt>.
	 * 
	 * @param gameState The game state to save.
	 */
	public void save(IGameState gameState) {
		
		//TODO : Add real GameState
	}

	/**
	 * Retrieves (eventually load lazilly) the game state.
	 * 
	 * @param name Name of the game state to retrieve.
	 * @return Associated game state if any, or a new one otherwise.
	 * @throws IllegalArgumentException If the given <tt>name</tt> is <tt>null</tt>
	 */
	public IGameState get(String name) throws IllegalArgumentException {
		if (name==null) throw new IllegalArgumentException();
		for (IGameState iGameState : iGameStates)
			if (iGameState.getName().equals(name))
				return iGameState;
		
		IGameState tmp = new GameState("myName");
		iGameStates.add(tmp);
		return tmp;
	}

}
