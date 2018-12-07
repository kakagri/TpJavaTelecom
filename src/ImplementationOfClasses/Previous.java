package ImplementationOfClasses;
import Interfaces.VertexInterface;
import java.lang.NullPointerException;

public class Previous implements Interfaces.PreviousInterface{
	private VertexInterface[][] previous;
	private int hauteur; 
	private int largeur;
	public Previous(int hauteur, int largeur) {
		this.hauteur=hauteur;this.largeur=largeur;
		previous=new VertexInterface[hauteur][largeur];
	}
	public VertexInterface whoFather(VertexInterface v) throws NullPointerException{
		int xV=v.getX(); int yV=v.getY();
		if (previous[xV][yV]!=null)
		return previous[xV][yV];
		throw new NullPointerException("On n'a pas trouvé le pere du sommet qu'on a entré lol");
	}
	public void changeFather(VertexInterface fils, VertexInterface pere) {
		int x=fils.getX(); int y = fils.getY();
		previous[x][y]=pere;
	}
	public VertexInterface[][] returnArborescence(){
		return previous;
	}

}
