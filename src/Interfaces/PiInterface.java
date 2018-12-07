package Interfaces;
import java.util.ArrayList; 

public interface PiInterface {
	public int getWeight(VertexInterface v);
	public void changeWeight(VertexInterface v, int valeur);
	public ArrayList<Integer> showAllWeights();
	

}
