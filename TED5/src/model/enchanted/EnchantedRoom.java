package model.enchanted;

import model.abst.AbstractRoom;

public class EnchantedRoom extends AbstractRoom {
	private String type = "enchanted";

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "EnchantedRoom [type=" + type + "]";
	}
	
}
