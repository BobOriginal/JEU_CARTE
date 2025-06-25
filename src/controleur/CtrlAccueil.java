package controleur;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import main.Main;

public class CtrlAccueil {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button bnQuelCarte;

    @FXML
    private Button bnBus;

    @FXML
    private Button bnCambio;

    @FXML
    private Button bnConnection;

    @FXML
    private Button bnPokerFermer;

    @FXML
    private Button bnPokerOuvert;

    @FXML
    private Button bnQuitter;

    @FXML
    private Button bnRiviere;

    @FXML
    void quelCarte(ActionEvent event) throws IOException {
    	Main.fermerAccueil(event);
    	Main.ouvrirQuelCarte(event);
    }

    @FXML
    void bus(ActionEvent event) {

    }

    @FXML
    void cambio(ActionEvent event) {

    }

    @FXML
    void connection(ActionEvent event) {

    }

    @FXML
    void leave(ActionEvent event) throws IOException {
    	Main.quitter(event);
    }

    @FXML
    void pokerFermer(ActionEvent event) {

    }

    @FXML
    void pokerOuvert(ActionEvent event) {

    }

    @FXML
    void riviere(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert bnQuelCarte != null : "fx:id=\"bnBaltrou\" was not injected: check your FXML file 'fenAccueil.fxml'.";
        assert bnBus != null : "fx:id=\"bnBus\" was not injected: check your FXML file 'fenAccueil.fxml'.";
        assert bnCambio != null : "fx:id=\"bnCambio\" was not injected: check your FXML file 'fenAccueil.fxml'.";
        assert bnConnection != null : "fx:id=\"bnConnection\" was not injected: check your FXML file 'fenAccueil.fxml'.";
        assert bnPokerFermer != null : "fx:id=\"bnPokerFermer\" was not injected: check your FXML file 'fenAccueil.fxml'.";
        assert bnPokerOuvert != null : "fx:id=\"bnPokerOuvert\" was not injected: check your FXML file 'fenAccueil.fxml'.";
        assert bnQuitter != null : "fx:id=\"bnQuitter\" was not injected: check your FXML file 'fenAccueil.fxml'.";
        assert bnRiviere != null : "fx:id=\"bnRiviere\" was not injected: check your FXML file 'fenAccueil.fxml'.";

    }

}
