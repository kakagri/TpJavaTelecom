package Interfaces;
import java.util.ArrayList;
public interface PreviousInterface {
	public VertexInterface whoFather(VertexInterface fils);
	public void changeFather(VertexInterface fils, VertexInterface pere);
	public ArrayList<VertexInterface> returnArborescence();
}
