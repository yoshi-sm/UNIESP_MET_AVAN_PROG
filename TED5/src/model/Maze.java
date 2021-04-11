package model;

import model.abst.AbstractDoor;
import model.abst.AbstractRoom;
import model.abst.AbstractWall;

public class Maze {
			
	private AbstractWall wall;
	private AbstractDoor door;
	private AbstractRoom room;
	
	
	public Maze() {}


	public Maze(AbstractWall wall,  AbstractRoom room, AbstractDoor door) {
		this.wall = wall;
		this.door = door;
		this.room = room;
	}


	public AbstractWall getWall() {
		return wall;
	}


	public void setWall(AbstractWall wall) {
		this.wall = wall;
	}


	public AbstractDoor getDoor() {
		return door;
	}


	public void setDoor(AbstractDoor door) {
		this.door = door;
	}


	public AbstractRoom getRoom() {
		return room;
	}


	public void setRoom(AbstractRoom room) {
		this.room = room;
	}


	@Override
	public String toString() {
		return "Maze [wall=" + wall + ", door=" + door + ", room=" + room + "]";
	}
	
}


