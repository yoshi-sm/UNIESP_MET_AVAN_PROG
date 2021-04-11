package view;

import model.Maze;
import model.enchanted.EnchantedMazeFactory;
import model.regular.MazeFactory;


/*
 * Codigo escrito de acordo com o meu entendimento subjetivo da UML apresentada;
 * 1. Como havia um metodo getInstance() e um metodo makeMaze() optei pela criacao de uma
 * 	  classe "Instance" que teria como atributos o resto das classes.
 * 2. De acordo com a UML cada classe atributo deveria ser subclasse de uma classe Abstract,
 *    i.e. Room -> AbstractRoom, cada grupo de classes se encontra em seu devido pacote. 
 */


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
