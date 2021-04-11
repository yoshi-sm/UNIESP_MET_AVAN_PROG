package view;

import model.Maze;
import model.enchanted.EnchantedMazeFactory;
import model.regular.MazeFactory;


public class MazeGame {

	private static Maze createMaze(String mazeType) {
		
		if (mazeType.equals("regular")){
			return new MazeFactory().getInstance();
		}
		else if(mazeType.equals("enchanted")){
			return new EnchantedMazeFactory().getInstance();	
		}
		else {
			return null;
		}
	}
	
	public static void main(String[] args) {
		
		Maze regularMaze = createMaze("regular");
		Maze enchantedMaze = createMaze("enchanted");
		Maze nullMaze = createMaze("asdasgfag");
		System.out.println(regularMaze);
		System.out.println(enchantedMaze);
		System.out.println(nullMaze);
		
	}
}
