package model;

import java.util.ArrayList;
import java.util.Iterator;

public class JeuDeCarte {
	private ArrayList<Carte> lesCartes;
	private int nbCarte;
	
	public JeuDeCarte(int nbCarte) {
		this.nbCarte = nbCarte;
		lesCartes =  new ArrayList<Carte>(nbCarte);
		initLesCartes();
		
	}

	private void initLesCartes() {
		int i;
		if(nbCarte == 40) {
			
			for(i = 0; i < 10; i++) {
				lesCartes.add( new Carte(i+1, Carte.PIQUE));
			}
			for(i = 0; i < 10; i++) {
				lesCartes.add( new Carte(i+1, Carte.COUER));
			}
			for(i = 0; i < 10; i++) {
				lesCartes.add( new Carte(i+1, Carte.CARREAU));
			}
			for(i = 0; i < 10; i++) {
				lesCartes.add( new Carte(i+1, Carte.TREFFLE));
			}
		}
		else if(nbCarte == 54) {

			for(i = 0; i < 13; i++) {
				lesCartes.add( new Carte(i+1, Carte.PIQUE));
			}
			for(i = 0; i < 13; i++) {
				lesCartes.add( new Carte(i+1, Carte.COUER));
			}
			for(i = 0; i < 13; i++) {
				lesCartes.add( new Carte(i+1, Carte.CARREAU));
			}
			for(i = 0; i < 13; i++) {
				lesCartes.add( new Carte(i+1, Carte.TREFFLE));
			}
		}
		else if(nbCarte == 32) {
	
			for(i = 7; i < 15; i++) {
				lesCartes.add( new Carte(i, Carte.PIQUE));
			}
			for(i = 7; i < 15; i++) {
				lesCartes.add( new Carte(i, Carte.COUER));
			}
			for(i = 7; i < 15; i++) {
				lesCartes.add( new Carte(i, Carte.CARREAU));
			}
			for(i = 7; i < 15; i++) {
				lesCartes.add( new Carte(i, Carte.TREFFLE));
			}
		}
	}
	
	public int getNbCarte() {
		return nbCarte;
	}

	public void setNbCarte(int nbCarte) {
		this.nbCarte = nbCarte;
	}

	public ArrayList<Carte> getLesCartes() {
		return lesCartes;
	}
	
	public void afficherCarte() {
		Iterator<Carte> iter = lesCartes.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	
	public static int getRandom(int min, int max) {

		int range = (max - min) + 1;
     	int random = (int) ((range * Math.random()) + min);
		return random;
	}
	
	public void melanger() {
		int i, rd;
		ArrayList<Carte> auxAL = new ArrayList<Carte>(nbCarte);
		for(i=nbCarte-1;i>=0;i--) {
			rd = getRandom(0,i);
			Carte auxC = lesCartes.remove(rd);
			auxAL.add(auxC);
		}
		lesCartes = auxAL;
	}
	
	public Carte tirerLast() {
		return lesCartes.removeLast();
	}
	
	public Carte tirerFirst() {
		return lesCartes.removeFirst();
	}
	
	public void AjouterLast(Carte c) {
		lesCartes.addLast(c);
	}
	
	public void AjouterFrist(Carte c) {
		lesCartes.addFirst(c);
	}
	
	
}
