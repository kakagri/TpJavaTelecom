package Interfaces;
public interface PreviousInterface {
	public VertexInterface whoFather(VertexInterface fils);
	public void changeFather(VertexInterface fils, VertexInterface pere);
	public VertexInterface[][] returnArborescence();
}
