package test;

public class MaClasse {
	
	private int compteur;
	
	public int getCompteur() {
		return compteur;
	}
	
	public void setCompteur(int p_compteur) {
		if (p_compteur < 0) {
			compteur = 0;
		} else {
		compteur = p_compteur;
		}
	}
	
	public MaClasse(int p_compteur) {
		compteur = p_compteur;	
		this.start();
	}
	
	public void start() {
		compteur++;
	}
	
	public void stop() {
	}
	
	public void end() {
	}
	
}


/* dans une classe en Java toutes les propriété sont privé (ou protectile) 
 * this. fait référence à des objets/méthodes 
 * */
 */