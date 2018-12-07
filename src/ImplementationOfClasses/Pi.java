package ImplementationOfClasses;
import java.util.Arrays;
import Interfaces.VertexInterface;

public class Pi implements Interfaces.PiInterface {
	private int[][] arrayOfPis;
	private int hauteur; 
	private int largeur;
	public Pi(int hauteur, int largeur) {
		this.hauteur=hauteur;
		this.largeur=largeur;
		arrayOfPis= new int[hauteur][largeur];
		for(int j=0; j<hauteur;j++) {
			Arrays.fill(arrayOfPis, -1);
		}
	}
	public int getWeight(VertexInterface v) {
		int xV=v.getX(); int yV=v.getY();
		return arrayOfPis[xV][yV];
	}
	public int[][] showAllWeights(){
		return arrayOfPis;
	}
	public void changeWeight(VertexInterface v,int valeur) {
		int xV=v.getX();int yV=v.getY();
		arrayOfPis[xV][yV]=valeur;
	}
	

}
