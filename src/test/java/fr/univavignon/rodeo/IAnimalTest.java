package fr.univavignon.rodeo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import fr.univavignon.rodeo.api.IAnimal;

public class IAnimalTest{
	
	static IAnimal animal;
	
	public  static IAnimal getTestInstance(){
		animal=mock(IAnimal.class);
		when(animal.isBoss()).thenReturn(false);
		when(animal.getName()).thenReturn("Gaby");
		when(animal.getXP()).thenReturn(20);
		
		
		return animal;	
	}
	
	@Before
	public void getInstance(){
		animal= mock(IAnimal.class);
		when(animal.isBoss()).thenReturn(false);
		when(animal.getName()).thenReturn("Gaby");
		when(animal.getXP()).thenReturn(20);
	}
	
	@Test
	public void isBoss(){
		assertEquals(false,animal.isBoss());
		assertEquals(true,animal.isBoss());
	}
	
	@Test
	public void getName(){
		assertEquals("Gaby", animal.getName());
		assertEquals("AmadouS", animal.getName());
	}
	
	@Test
	public void getXP(){
		assertEquals(12, animal.getXP());
	}

}
