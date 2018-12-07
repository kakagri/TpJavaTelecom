package Interfaces;
import java.util.ArrayList;
public class Dijkstra {
	
	public static PreviousInterface dijkstra(GraphInterface g, VertexInterface r,ASetInterface a, PiInterface pi, PreviousInterface previous) {
		a.addInA(r);
		VertexInterface pivot= r;
		ArrayList<VertexInterface> allVerticesOfG= g.getAllVertices();
		for (VertexInterface s: allVerticesOfG) {
			pi.changeWeight(s, -1);    /*Rendre tous infini    */
		}
		pi.changeWeight(r, 0);
		int n=g.numberOfVertices();
		
		for (int i=0; i<n;i++) {
			
			for( VertexInterface y: allVerticesOfG) {
				int piOfPivot=pi.getWeight(pivot);
				int piOfY=pi.getWeight(y);
				int weightOfPivotToY= g.getWeight(pivot, y);
				
				if ( (weightOfPivotToY!=(-1)) && ( !a.isInA(y) ) ) {
					
					if((piOfY==-1) || (piOfPivot+weightOfPivotToY<piOfY) ) {
						pi.changeWeight(y,piOfPivot+weightOfPivotToY );
						previous.changeFather(y, pivot);
					}
					}
			}
			int valeurMinimale=pi.getWeight(pivot);
			for (VertexInterface y:allVerticesOfG) {
				int piOfY=pi.getWeight(y);
				if ( (!a.isInA(y)) && (piOfY!=-1)&& (piOfY<=valeurMinimale) ) {
					pivot=y;
					valeurMinimale=piOfY;
				}
			}
			a.addInA(pivot);
		}
		return previous;
	}
	
	
	

}
