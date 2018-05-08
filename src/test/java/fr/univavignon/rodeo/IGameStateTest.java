package fr.univavignon.rodeo;



import java.util.List;

import org.junit.Before;
import org.junit.Test;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.ISpecie;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;

public class IGameStateTest {

	static IGameState gameState;
	static List<ISpecie> maListeSpec;
	static IAnimal boeuf =IAnimalTest.getTestInstance();
	

	@Before
	public  void getInstance(){
		
		ISpecie specie =ISpecifieTest.getTestInstance();
			
		
	gameState=mock(IGameState.class);
	when(gameState.getProgression()).thenReturn(20);
	when(gameState.getName()).thenReturn("gameState");
	doThrow(new IllegalArgumentException()).when(gameState).catchAnimal(boeuf);
	//when(gameState.catchAnimal(boeuf)).thenThrow(NullPointerException.class);;
	doThrow(new IllegalArgumentException()).when(gameState).getSpecieLevel(specie);
	}
	@Test
	public void testBla(){
		
		assertEquals(20,gameState.getProgression());
	
	

	}
	public static IGameState getTestInstance() {
		
		ISpecie specie =ISpecifieTest.getTestInstance();
			
		
	gameState=mock(IGameState.class);
	when(gameState.getProgression()).thenReturn(20);
	when(gameState.getName()).thenReturn("gameState");
	doThrow(new IllegalArgumentException()).when(gameState).catchAnimal(boeuf);
	//when(gameState.catchAnimal(boeuf)).thenThrow(NullPointerException.class);;
	doThrow(new IllegalArgumentException()).when(gameState).getSpecieLevel(specie);

		return gameState;
	}
}
