package Boxes;

public abstract class MBox {
	private int x; 
	private int y;
	public MBox(int x, int y) {
		this.x=x;this.y=y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}	

}
