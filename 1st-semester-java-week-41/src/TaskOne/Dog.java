package TaskOne;

import java.util.ArrayList;

public class Dog {
	private String name;
	private Owner owner;
	private boolean isHungry;
	private ArrayList<Dog> offSprings;

	public Dog(String name, boolean isHungry) {
		this.name = name;
		this.isHungry = isHungry;
		this.offSprings = new ArrayList<>();
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public String feedDog() {
		String s = name + (isHungry ? " has been feeded." : " is not hungry.");
		if (isHungry) {
			isHungry = !isHungry;
		}
		return s;
	}

	public void setOffSprings(Dog... offSprings) {
		for (Dog offSpring : offSprings) {
			this.offSprings.add(offSpring);
		}
	}

	public ArrayList<Dog> getOffSprings() {
		return offSprings;
	}

	public Owner getOwner() {
		return owner;
	}

	@Override
	public String toString() {
		return name;
	}
}
