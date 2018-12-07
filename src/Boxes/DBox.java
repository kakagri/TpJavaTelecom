package Boxes;
import ImplementationOfClasses.Maze;
public class DBox extends MBox {

	public DBox(int i, int j, Maze maze) {
		super(i,j,maze);
	}
	@Override
	public String getLabel() {
		return "D";
	}
	

}
