package main;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import vue.*;


public class Main extends Application {
	
	private static FenAccueil fenAccueil;
	private static FenQuelCarte fenQuelCarte;
	private static FenBus fenBus;
	private static FenCambio fenCambio;
	private static FenPokerFermer fenPokerFermer;
	private static FenPokerOuvert fenPokerOuvert;
	private static FenRiviere fenRiviere;
	
	
	
	
	public void start(Stage f) throws Exception {
		fenAccueil = new FenAccueil();
		fenQuelCarte = new FenQuelCarte();
		fenBus = new FenBus();
		fenCambio = new FenCambio();
		fenPokerFermer = new FenPokerFermer();
		fenPokerOuvert = new FenPokerOuvert();
		fenRiviere = new FenRiviere();

		fenAccueil.show();
	}

	public static void main(String args[]) {
		Application.launch();
	}
	
	public static void ouvrirAccueil(ActionEvent event) throws IOException {
		fenAccueil.show();
	}
	
	public static void fermerAccueil(ActionEvent event) throws IOException {
		fenAccueil.close();
	}
	
	public static void ouvrirQuelCarte(ActionEvent event) throws IOException {
		fenQuelCarte.show();
	}
	
	public static void fermerQuelCarte(ActionEvent event) throws IOException {
		fenQuelCarte.close();
	}
	
	public static void ouvriBus(ActionEvent event) throws IOException {
		fenBus.show();
	}
	
	public static void fermerBus(ActionEvent event) throws IOException {
		fenBus.close();;
	}
	
	public static void ouvrirCambio(ActionEvent event) throws IOException {
		fenCambio.show();
	}
	
	public static void fermerCambio(ActionEvent event) throws IOException {
		fenCambio.close();;
	}
	
	public static void ouvrirPokerFermer(ActionEvent event) throws IOException {
		fenPokerFermer.show();
	}
	
	public static void fermerPokerFermer(ActionEvent event) throws IOException {
		fenPokerFermer.close();
	}
	
	public static void ouvrirPokerOuvert(ActionEvent event) throws IOException {
		fenPokerOuvert.show();
	}
	
	public static void fermerPokerOuvert(ActionEvent event) throws IOException {
		fenPokerOuvert.close();
	}
	
	public static void ouvrirRiviere(ActionEvent event) throws IOException {
		fenRiviere.show();
	}
	
	public static void fermerRiviere(ActionEvent event) throws IOException {
		fenRiviere.close();
	}
	
	public static void quitter(ActionEvent event) throws IOException {
		System.exit(0);
	}
}
