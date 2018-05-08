package fr.univavignon.rodeo;

import java.util.List;
import org.junit.Before;
import org.junit.Test;
import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.IGameStateProvider;
import fr.univavignon.rodeo.api.ISpecie;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;

public class IGameStateProviderTest {

	static IGameStateProvider gameStateProvider;
	static List<ISpecie> maListeSpec;
	IAnimal boeuf =IAnimalTest.getTestInstance();
	String nameG="gameState";
	IGameState gameState =IGameStateTest.getTestInstance();
	@Before
	public  void getInstance(){
		
	

		when(gameState.getName()).thenReturn("MonGameState");
		
		
		gameStateProvider=mock(IGameStateProvider.class);
	
		when(gameStateProvider.get(nameG)).thenReturn(gameState);

	
	doThrow(new IllegalArgumentException()).when(gameStateProvider).save(gameState);
	}
	@Test
	public void testBla(){
		
		assertEquals(gameState,gameStateProvider.get(nameG));
	
	

	}
	
}
