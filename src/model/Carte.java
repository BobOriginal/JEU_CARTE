package model;

import java.util.Objects;

public class Carte {
	final static String PIQUE = "pique";
	final static String COUER = "coeur";
	final static String CARREAU = "carreau";
	final static String TREFFLE = "treffle";
	
	private int valeur;
	private String couleur;
	
	public Carte(int valeur, String couleur) {
		this.valeur = valeur;
		this.couleur = couleur;
	}

	public int getValeur() {
		return valeur;
	}

	public String getCouleur() {
		return couleur;
	}

	@Override
	public String toString() {
		if(valeur == 11) {
			return "Valets de " + couleur;
		}
		if(valeur == 12) {
			return "Dame de " + couleur;
		}
		if(valeur == 13) {
			return "Rois de " + couleur;
		}
		if(valeur == 14 || valeur == 1) {
			return "As de " + couleur;
		}
		return valeur + " de " + couleur;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carte other = (Carte) obj;
		return Objects.equals(couleur, other.couleur) && valeur == other.valeur;
	}
	
	
	
	
	
	
	
}
