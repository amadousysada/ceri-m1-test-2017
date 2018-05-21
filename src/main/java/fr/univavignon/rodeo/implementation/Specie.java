package fr.univavignon.rodeo.implementation;

import java.util.List;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.ISpecie;

/**
 * Specie definition.
 * 
 * @author SY
 */
public class Specie extends NamedObject implements ISpecie{
	
	private List<IAnimal> animals;
	private int area;

	public Specie(String name,int area,List<IAnimal> animals) {
		super(name);
		this.animals =animals;
		this.area=area;
	}

	/**
	 * Getter for the target area in which this
	 * specie can be found.
	 * 
	 * @return The area in which this specie can be found from.
	 */
	public int getArea() {
		return area;
	}

	/**
	 * Associated animals getter.
	 * 
	 * @return List of available animal for this specie.
	 */
	public List<IAnimal> getAnimals() {
		return animals;
	}

}
