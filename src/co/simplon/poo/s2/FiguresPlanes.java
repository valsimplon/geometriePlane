package co.simplon.poo.s2;

public abstract class FiguresPlanes {
	
	protected int nbcote;
	
	public FiguresPlanes(int nbcote) {
		this.nbcote = nbcote;
	}
	
	protected abstract float calculerPerimetre();
}
