package ImplementationOfClasses;
import java.util.ArrayList;
import Boxes.*;
import Interfaces.*;
import java.io.*;
import java.lang.Exception;

public class Maze implements Interfaces.GraphInterface {
	private ArrayList<VertexInterface> allVertices;
	private VertexInterface[][] boxes;
	private int hauteur; 
	private int largeur;
	public Maze(int hauteur, int largeur) {
		this.hauteur=hauteur; this.largeur=largeur; allVertices=new ArrayList<VertexInterface>();
		boxes=new VertexInterface[hauteur][largeur];
	}
	
	public int numberOfVertices() {
		return allVertices.size();
	}
	
	public void addAVertice(VertexInterface v) {
		int xV=v.getX(); int yV=v.getY();
		allVertices.add(v); 
		boxes[xV][yV]=v;
	}
	
	public void addAVerticeFromIntAndLabel(int i, int j, String label) {
		if (label.equals("A")) {
			VertexInterface v=(VertexInterface) (new ABox(i,j,this));
			addAVertice(v);
		}
		if (label.equals("D")) {
			VertexInterface v=(VertexInterface) (new DBox(i,j,this));
			addAVertice(v);
		}
		if (label.equals("W")) {
			VertexInterface v=(VertexInterface) (new WBox(i,j,this));
			addAVertice(v);
		}
		if (label.equals("E")) {
			VertexInterface v=(VertexInterface) (new EBox(i,j,this));
			addAVertice(v);
		}
	}
	
	public ArrayList<VertexInterface> getAllVertices(){
		return allVertices;
	}
	
	public int getWeight(VertexInterface v, VertexInterface b) {
		int xV=v.getX();int yV=v.getY(); int xB=b.getX(); int yB=b.getY();
		String label=b.getLabel();
		if (label.equals("W")) {
			return -1;
		}
		else {
			if( (Math.abs(xV-xB)+Math.abs(yV-yB))==1) {
				return 1; 
			}
		}
		return -1;	
	}
	
	public final void initFromTextFile(String fileName) throws IOException{
		BufferedReader fichier=null;
		try {
			fichier=new BufferedReader(new FileReader(fileName));
			String ligne="";
			int numeroDeLigne=0;
			while( (ligne=fichier.readLine())!=null) {
				for (int k=0; k<largeur;k++) {
					switch(ligne.charAt(k)) {
						case 'E':
							addAVerticeFromIntAndLabel(numeroDeLigne,k,"E");
						break;
						case 'W':
							addAVerticeFromIntAndLabel(numeroDeLigne,k,"W");
						break;
						case 'A':
							addAVerticeFromIntAndLabel(numeroDeLigne,k,"A");
						break;
						case 'D':
							addAVerticeFromIntAndLabel(numeroDeLigne,k,"D");
						break;
					default:
						throw new IOException("Tu as entré une autre lettre");
						

					}
				}
				numeroDeLigne=numeroDeLigne+1;
			}
			
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			fichier.close();
		}
	}
	
	public final void saveToTextFile(String nomDuFichier) throws IOException{
		PrintWriter fichierDeSortie=new PrintWriter(nomDuFichier);
		for(int j=0; j<hauteur; j++) {
			for (int k=0; k<largeur; k++) {
				if (boxes[j][k]!=null)
				fichierDeSortie.write(boxes[j][k].getLabel());
				else 
					fichierDeSortie.write("E");
			}
			fichierDeSortie.println();
		}
		fichierDeSortie.close();
		
	}
	public VertexInterface giveDeparture() throws IOException {
		for (VertexInterface v: allVertices) {
			if (v.getLabel().equals("D")) 
				return v;
		}
		throw (new IOException("il n'y a pas de boîte de départ"));
	}
	public VertexInterface giveArrival() throws IOException{
		for(VertexInterface v: allVertices) {
			if(v.getLabel().equals("A")) {
				return v;
			}
		}
		throw (new IOException("il n'y a pas de boîte d'arrivée"));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
