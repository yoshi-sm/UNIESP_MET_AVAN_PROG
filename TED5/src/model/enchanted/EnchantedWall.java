package model.enchanted;

import model.abst.AbstractWall;

public class EnchantedWall extends AbstractWall{
	private String type = "enchanted";

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "EnchantedWall [type=" + type + "]";
	}
	
}
