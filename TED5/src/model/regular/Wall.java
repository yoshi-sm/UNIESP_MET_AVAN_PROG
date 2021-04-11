package model.regular;
import model.abst.AbstractWall;

public class Wall extends AbstractWall {
	private String type = "regular";

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Wall [type=" + type + "]";
	}	
	
}
