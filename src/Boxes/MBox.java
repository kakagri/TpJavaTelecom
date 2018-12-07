package Boxes;
import ImplementationOfClasses.Maze;
public abstract class MBox implements Interfaces.VertexInterface{
	private int x; 
	private int y;
	private Maze maze; 
	public MBox(int x, int y, Maze maze) {
		this.x=x;this.y=y;this.maze=maze;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}	
	public String getLabel() {
		return "M";
	}

}
