package co.simplon.poo.s2;

/**
 * Traite les figures de 4 cotes
 * 
 * @author Simplon 4PLQ4Q1
 *
 */

public class Quadrilateres extends FiguresPlanes {
	
	protected float perimetre;
	protected float largeur;
	protected float longueur;
	
	public Quadrilateres() {
		super(4);
	}
	
	public float getPerimetre() {
		return perimetre;
	}
	
	public float calculerPerimetre() {
		System.out.println(largeur);
		System.out.println(longueur);
		this.perimetre = 2 * (this.largeur + this.longueur);
		return this.perimetre;
	}

	public float getLargeur() {
		return largeur;
	}

	public float getLongueur() {
		return longueur;
	}

	public void setLargeur(float largeur) {
		this.largeur = largeur;
	}

	public void setLongueur(float longueur) {
		this.longueur = longueur;
	}

}
