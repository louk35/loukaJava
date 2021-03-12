package test;

import java.util.ArrayList;
import java.util.List;


public class newEtudiant {
	
	private String libelle ;
	List<Etudiant> etudiants;

	public newEtudiant(String libelle) {	
		this.libelle=libelle;
		this.etudiants = new ArrayList<>();
	}

	public void getEtudiant(int index) {	
	}
	
	public void addEtudiant(Etudiant etudiant) {	
		etudiants.add(etudiant);
		
	}
	
	public void removeEtudiant(int index) {	
		etudiants.remove(etudiants);
		
	}
	public void presenterClasse() {
		for (int i= 0 ; i < etudiants.size(); i++){
			etudiants.get(i).sePresenter();
		}
		
	}
	
}