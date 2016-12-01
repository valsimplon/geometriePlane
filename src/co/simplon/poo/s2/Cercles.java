package co.simplon.poo.s2;

import java.lang.Math;

public class Cercles extends FiguresPlanes {

	//private static final float PI = 3.14f;
	
	protected float perimetre;
	protected float surface;
	protected float rayon;
	
	public Cercles() {
		super(1);
	}
		
	public float getRayon() {
		return rayon;
	}

	public void setRayon(float rayon) {
		this.rayon = rayon;
	}

	public float calculerSurface() {
		return (float) (Math.pow(rayon, 2) * Math.PI);
	}
	
	public float calculerPerimetre() {
		this.perimetre = (float) (2 * Math.PI * rayon);
		return perimetre;
	}

}
