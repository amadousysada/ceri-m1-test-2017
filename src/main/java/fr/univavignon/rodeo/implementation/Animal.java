package fr.univavignon.rodeo.implementation;

import fr.univavignon.rodeo.api.IAnimal;

/**
 * Animal definition.
 * 
 * @author SY
 */
public class Animal extends NamedObject implements IAnimal{
	
	private boolean isSecret,isEndangered,isBoss;
	private int xp;

	public Animal(String name,int XP,boolean isSecret, boolean isEndangered, boolean isBoss) {
		super(name);
		// TODO Auto-generated constructor stub
		this.xp=XP;
		this.isSecret=isSecret;
		this.isEndangered=isEndangered;
		this.isBoss=isBoss;
	}

	/**
	 * Getter for the associated species XP.
	 * 
	 * @return The amount of XP given when riding it.
	 */
	public int getXP(){
		return xp;
	}

	/**
	 * Indicates if this animal is a secret one.
	 * 
	 * @return <tt>true</tt> if this animal is a secret one, <tt>false</tt> otherwise.
	 */
	public boolean isSecret(){
		return isSecret;
	}

	/**
	 * Indicates if this animal is an endangered one..
	 * 
	 * @return <tt>true</tt> if this animal is an endangered one, <tt>false</tt> otherwise.
	 */
	public boolean isEndangered(){
		return isEndangered;
	}

	/**
	 * Indicates if this animal is a boss.
	 * 
	 * @return <tt>true</tt> if this animal is a boss, <tt>false</tt> otherwise.
	 */
	public boolean isBoss(){
		return isBoss;
	}

}
