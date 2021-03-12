package test;

import java.util.ArrayList;
import java.util.List;

public class main {

		public static void main(String[] args){
			Chien presentation = new Chien (73,2,"Orion","labrador");
			Chien presentationdeux = new Chien (69,3,"Asta","labrador");
			Etudiant louka = new Etudiant (" PLACE"," Louka" , 18," BTS SIO");


			
			List<Chien> chenil = new ArrayList<Chien>();
			chenil.add(presentation);
			chenil.add(presentationdeux);
			louka.ajouterChien(presentation);
			louka.ajouterChien(presentationdeux);
			louka.retirerChien(0);
			louka.sePresenter();



			
			
			for (int i = 0 ; i < chenil.size() ; i++) {
				System.out.println(chenil.get(i));
				
		}
	}	
}
