package fr.univavignon.rodeo;



import java.util.ArrayList;
import java.util.List;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.ISpecie;

import org.junit.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import fr.univavignon.rodeo.IAnimalTest;


public class ISpecifieTest {
	
	static ISpecie specie;
	static List<IAnimal> maListeA;
	 
	  
	 
	public  static ISpecie getTestInstance(){
		specie=mock(ISpecie.class);
		when(specie.getArea()).thenReturn(1);
		IAnimal animal = IAnimalTest.getTestInstance();
		maListeA= new ArrayList<>();
		maListeA.add(animal);
		when(specie.getAnimals()).thenReturn(maListeA);
		when(specie.getName()).thenReturn("MyArea");
		
		return specie;	
	}
	 
	@Before
	public  void getInstance(){
		
	
		specie=mock(ISpecie.class);
	when(specie.getArea()).thenReturn(1);
	IAnimal animal = IAnimalTest.getTestInstance();
	maListeA= new ArrayList<>();
	maListeA.add(animal);
	when(specie.getAnimals()).thenReturn(maListeA);
	when(specie.getName()).thenReturn("MyArea");

	}
	@Test
	public void testBla(){
		
	assertEquals(1,specie.getArea());
	System.out.println(specie.getAnimals());
	

	}

}
