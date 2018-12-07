package Boxes;
import ImplementationOfClasses.Maze;

public class EBox extends MBox{
	public EBox(int i, int j, Maze maze) {
		super(i,j,maze);
	}
	@Override
	public String getLabel() {
		return "E";
	}

}
