package fr.univavignon.rodeo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.IEnvironmentProvider;

public class IEnvironmentProviderTest {

	
	static IEnvironmentProvider environmentProvide;
	static List<String> envAvailable;
	static String nameE="Wembley";
	
	
	@Before
	public  void getInstance(){
		
	
		environmentProvide=mock(IEnvironmentProvider.class);
		
	
	
	IEnvironment environement = IEnvironmentTest.getTestInstance();
	when(environement.getName()).thenReturn("Wembley");
	envAvailable= new ArrayList<String>();
	System.out.println(environement.getName());
	envAvailable.add(environement.getName());
	when(environmentProvide.getAvailableEnvironments()).thenReturn(envAvailable);
	
	when(environmentProvide.getEnvironment(nameE)).thenReturn(environement);
	

	}
	@Test
	public void testBla(){
		assertEquals("Wembley",environmentProvide.getEnvironment(nameE).getName());
		
		
	
	
	

	}

}
