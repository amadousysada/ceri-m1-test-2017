package fr.univavignon.rodeo.implementation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.IEnvironmentProvider;

/**
 * Main entry point which allows to retrieve {@link Environment}
 * instance for a given <tt>name</tt>.
 * 
 * @author SY
 */
public class EnvironmentProvider implements IEnvironmentProvider{
	
	private List<IEnvironment> availableEnvironements;
	
	
	
	public EnvironmentProvider(List<IEnvironment> environements) {
		super();
		this.availableEnvironements=(environements);
	}

	/**
	 * Retrieves and returns the list of available
	 * environments name.
	 * 
	 * @return A list of environment name.
	 */

	public List<String> getAvailableEnvironments() {
		List<String> liste=new ArrayList<String>();
		for (IEnvironment environment : availableEnvironements) {
			liste.add(environment.getName());
			
		}
		return liste;
	}

	/**
	 * Retrieves and returns the environment
	 * denoted by the given <tt>name</tt>.
	 * 
	 * @param name Name of the environment to retrieve.
	 * @return Required environment if available, <tt>null</tt> otherwise.
	 * @throws IllegalArgumentException If the given <tt>name</tt> is null.
	 */
	public IEnvironment getEnvironment(String name) throws IllegalArgumentException{
		Iterator<IEnvironment> it=availableEnvironements.iterator();
		boolean found=false;
		IEnvironment env =null;
		while(it.hasNext() && !found){
			if((it.next().getName()).equals(name)){
				found=true;
				env=it.next();
			}
		}
		return env;
	}

}
