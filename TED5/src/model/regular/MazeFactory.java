package model.regular;

import model.Maze;
import model.abst.*;

public class MazeFactory extends AbstractMazeFactory {
	
	public AbstractRoom makeRoom() {
		return new Room();
	}
	
	public AbstractWall makeWall() {
		return new Wall();
	}
	
	public AbstractDoor makeDoor() {
		return new Door();
	}
	
	public Maze makeMaze(AbstractWall wall, AbstractRoom room, AbstractDoor door) {
		// TODO Auto-generated method stub
		return new Maze(wall, room, door);
	}
	
	public Maze getInstance() {
		
		return makeMaze(makeWall(), makeRoom(), makeDoor());
	}
}
