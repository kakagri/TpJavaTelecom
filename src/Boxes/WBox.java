package Boxes;
import ImplementationOfClasses.Maze;
public class WBox extends MBox {
	public WBox(int i, int j, Maze maze) {
		super(i,j,maze);
	}
	@Override
	public String getLabel() {
		return "W";
	}

}
