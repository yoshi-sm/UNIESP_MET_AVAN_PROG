package model.regular;
import model.abst.AbstractRoom;

public class Room extends AbstractRoom{
	private String type = "regular";

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Room [type=" + type + "]";
	}
	
}	
