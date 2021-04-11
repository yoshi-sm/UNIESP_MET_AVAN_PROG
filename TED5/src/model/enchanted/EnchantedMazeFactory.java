package model.enchanted;
import model.Maze;
import model.abst.AbstractDoor;
import model.abst.AbstractMazeFactory;
import model.abst.AbstractRoom;
import model.abst.AbstractWall;

public class EnchantedMazeFactory extends AbstractMazeFactory{

	@Override
	public Maze makeMaze(AbstractWall wall, AbstractRoom room, AbstractDoor door) {
		// TODO Auto-generated method stub
		return new Maze(wall, room, door);
	}

	@Override
	public AbstractRoom makeRoom() {
		// TODO Auto-generated method stub
		return new EnchantedRoom();
	}

	@Override
	public AbstractDoor makeDoor() {
		// TODO Auto-generated method stub
		return new EnchantedDoor();
	}

	@Override
	public AbstractWall makeWall() {
		// TODO Auto-generated method stub
		return new EnchantedWall();
	}
	
	public Maze getInstance() {
		return makeMaze(makeWall(), makeRoom(), makeDoor());
	}
}
