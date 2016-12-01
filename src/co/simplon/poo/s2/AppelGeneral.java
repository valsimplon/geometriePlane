package co.simplon.poo.s2;

public class AppelGeneral {

	public static void main(String... args) {
		
		float perimetre;
		float surface;
		
		Rectangles rectangle = new Rectangles();
		rectangle.setLargeur(5);
		rectangle.setLongueur(7);
		perimetre = rectangle.calculerPerimetre();
		System.out.println(perimetre);
		
		Cercles cercle = new Cercles();
		cercle.setRayon(4);
		perimetre = cercle.calculerPerimetre();
		System.out.println(perimetre);
		surface = cercle.calculerSurface();
		System.out.println(surface);
	}

}
