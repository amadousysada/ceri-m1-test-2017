package fr.univavignon.rodeo.implementation;

/**
 * Simple interface for components that has a name.
 * 
 * @author SY
 */
public class NamedObject {
	
	private String name;
	
	public NamedObject(String name){
		this.name=name;
	}

	/**
	 * Name getter.
	 * 
	 * @return The name of this object.
	 */
	public String getName(){
		return this.name;
	}

}
