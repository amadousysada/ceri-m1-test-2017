package fr.univavignon.rodeo.implementation;

import java.util.List;

import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.ISpecie;

/**
 * Interface for a target environment in Rodeo Stampede
 * (such as Savannah). An environment provides available
 * species.
 * 
 * @author SY
 */
public class Environment extends NamedObject implements IEnvironment{
	
	private int areas;
	private List<ISpecie> species;
	
	
	

	public Environment(String name, int areas, List<ISpecie> species) {
		super(name);
		this.areas = areas;
		this.species = species;
	}

	/**
	 * Getter for the number of area available in this
	 * environment.
	 * 
	 * @return Number of area available.
	 */
	public int getAreas() {
		return areas;
	}

	

	/**
	 * Getter for the species available in this
	 * environment.
	 * 
	 * @return List of species available.
	 */
	
	public List<ISpecie> getSpecies() {
		return species;
	}
	


}
