package Boxes;
import ImplementationOfClasses.Maze;
public class ABox extends MBox {
	public ABox(int i, int j, Maze maze) {
		super(i,j,maze);
	}
	@Override
	public String getLabel() {
		return "A";
	}

}
