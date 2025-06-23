package main;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import model.JeuDeCarte;

public class Main {
	

	public void start(Stage f) throws Exception {

	}

	public static void main(String args[]) {
		JeuDeCarte.main(null);
		//Application.launch();
	}

	public static void quitter(ActionEvent event) throws IOException {
		System.exit(0);
	}
}
