package model.abst;

import model.Maze;


public abstract class AbstractMazeFactory {
	
	public AbstractMazeFactory() {}
	
	public abstract Maze makeMaze(AbstractWall wall, AbstractRoom room, AbstractDoor door);
	
	public abstract AbstractRoom makeRoom();
	
	public abstract AbstractDoor makeDoor();
	
	public abstract AbstractWall makeWall();

}
