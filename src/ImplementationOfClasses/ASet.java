package ImplementationOfClasses;
import Interfaces.VertexInterface;
import java.util.ArrayList;


public class ASet implements Interfaces.ASetInterface{
	private ArrayList<VertexInterface> alreadySeenVertices;
	public ASet() {
		alreadySeenVertices=new ArrayList<VertexInterface>();
	}
	public boolean isInA(VertexInterface v) {
		for(VertexInterface s:alreadySeenVertices) {
			if (s.getX()==v.getX() && s.getY()==v.getY() && s.getLabel().equals(v.getLabel()))
				return true;
		}
		return false;
	}
	public void addInA(VertexInterface v) {
		alreadySeenVertices.add(v);
		
	}
	
	
	

}
