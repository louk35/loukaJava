package test;

public class Tortue {
	
	private int taille;
	private int age;
	private String nom;
	private String race;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Tortue(int taille, int age, String nom, String race) {
		this.taille =taille;
		this.age = age;
		this.nom = nom;
		this.race = race;

	}
	
	public void sePresenter() {
		System.out.println("Bonjour je mesure " + taille +"cm"+ ", j'ai " + age +" ans " + " je m'appelle " + nom + " et je suis un " + race);
	}

	
	public String toString() {
		return nom + " " + race ;
	}
	

	
}