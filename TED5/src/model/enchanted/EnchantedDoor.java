package model.enchanted;

import model.abst.AbstractDoor;

public class EnchantedDoor extends AbstractDoor {
	private String type = "enchanted";

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "EnchantedDoor [type=" + type + "]";
	}
	
	
}
