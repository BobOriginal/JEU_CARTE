package model;

import java.util.ArrayList;

public class QuelCarte {
	private JeuDeCarte cartes;
	private ArrayList<Carte> carteValide;
	
	
	public QuelCarte() {
		cartes = new JeuDeCarte(54);
		cartes.melanger();
		carteValide = new ArrayList<Carte>(3);
	}
	
	public Carte tirerCarte() {
		Carte c = cartes.tirerFirst();
		cartes.AjouterLast(c);
		return c;
	}
	
	public int estValide(Carte tirer, Carte joueur) {
		/* 
		 * Si les carte sont totalement diferent renvoie -1
		 *  Sinon si la valeur ou la couleur est bonne renvois 0
		 *  sinon tout est bon renvoie 1
		*/
		
		int res = -1;
		if(joueur.equals(tirer)) {
			res = 1;
		}
		else if(joueur.getValeur() == tirer.getValeur()
				|| joueur.getCouleur().equals(tirer.getCouleur())) {
			res = 0;
		}
		return res;
	}
	
	public void CarteValide(Carte tirer, Carte joueur) {
		int valide = estValide(tirer, joueur);
		
		if(valide == 0) {
			if(carteValide.size()==2) {
				carteValide.removeAll(carteValide);
				
			}
		}
	}
	
	
	
	
}
