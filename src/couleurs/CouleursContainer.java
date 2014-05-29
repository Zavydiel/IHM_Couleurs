package couleurs;

public class CouleursContainer {
	
	private GLCouleur[] couleurs;
	
	public CouleursContainer(int nombre) {
		couleurs  = new GLCouleur[nombre];
		for (int i = 0; i < getTaille(); i++) {
			int grayLevel = 20 + (255-20)/getTaille() * i;
			couleurs[i] = Palette.getCouleurAleatoire(grayLevel);
		}
	}
	
	public GLCouleur getGLCouleur(int index) {
		return couleurs[index];
	}
	
	public int getTaille() {
		return couleurs.length;
	}
	
//	public void ordonnerNiveauGris() {
//		Collections.sort(couleurs, new CouleursComparator());
//	}
	
	
}