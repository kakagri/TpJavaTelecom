package Interfaces;
import java.util.ArrayList;

public interface GraphInterface {
	public int numberOfVertices();
	public ArrayList<VertexInterface> getAllVertices();
	public int getWeight(VertexInterface i, VertexInterface j);
	

}
