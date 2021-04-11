package model.regular;
import model.abst.*;

public class Door extends AbstractDoor {
	private String type = "regular";

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Door [type=" + type + "]";
	}
	
}
