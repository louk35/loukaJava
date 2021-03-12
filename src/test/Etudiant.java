package test;

import java.util.ArrayList;
import java.util.List;

public class Etudiant {

		private String Nom;
		private String Prenom;
		private int Age;
		private String Classe;

		private List<Chien> chiens;


		
		
	
	
		public Etudiant(String Nom, String Prenom, int Age, String Classe) {
			this.Nom= Nom;
			this.Prenom=Prenom;
			this.Age = Age;
			this.Classe=Classe;
			this.chiens = new ArrayList<>();

		}

		public void sePresenter() {
			System.out.println("Bonjour je m'appele " + Nom + Prenom + " j'ai " + Age + " je suis en " + Classe);
			for (int i= 0 ; i < chiens.size(); i++){
				chiens.get(i).sePresenter();
				
			}

		}
		
		public void ajouterChien(Chien chien) {
			chiens.add(chien);
			
		}
		
		public void retirerChien(int numeroChien) {
			chiens.remove(numeroChien);
			
		}
		

		
		
}