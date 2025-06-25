package model;

import java.util.ArrayList;

public class Riviere {
	private final static int NBCARTEMAX = 9;
	
	private JeuDeCarte cartes;
	private ArrayList<Carte> cartePoser;
	private int nbCarteAPoser;
	private boolean rajouterCarte;
	
	public Riviere(int nbCarteAPoser, boolean rajouterCarte) {
		cartePoser = new ArrayList<Carte>(40);
		cartes = new JeuDeCarte(40);
		this.nbCarteAPoser = nbCarteAPoser;
		this.rajouterCarte = rajouterCarte;
	}
	
	
	
}
