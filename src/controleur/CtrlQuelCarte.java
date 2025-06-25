package controleur;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import main.Main;

public class CtrlQuelCarte {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView imgCarte1;

    @FXML
    private ImageView imgCarte2;

    @FXML
    private ImageView imgCarte3;

    @FXML
    private ListView<?> liste_carte;
    
    @FXML
    private Button bnRetour;
    
    @FXML
    void retour(ActionEvent event) throws IOException {
    	Main.fermerQuelCarte(event);
    	Main.ouvrirAccueil(event);
    }
    
    public void changerImage(ArrayList<String> nomImg) {
    	 imgCarte1.setImage(null);
    	 imgCarte2.setImage(null);
    	 imgCarte3.setImage(null);
    	if(nomImg.size() == 1) {
    		File image1 = new File(nomImg.get(0));
            Image carte1= new Image(image1.toURI().toString());
            imgCarte1.setImage(carte1);
    	}
    	else if(nomImg.size() == 2) {
    		File image1 = new File(nomImg.get(0));
            Image carte1= new Image(image1.toURI().toString());
            imgCarte1.setImage(carte1);
            
            File image2 = new File(nomImg.get(1));
            Image carte2 = new Image(image2.toURI().toString());
            imgCarte1.setImage(carte2);
    		
    	}
    	else if(nomImg.size() == 3) {
    		File image1 = new File(nomImg.get(0));
            Image carte1= new Image(image1.toURI().toString());
            imgCarte1.setImage(carte1);
            
            File image2 = new File(nomImg.get(1));
            Image carte2 = new Image(image2.toURI().toString());
            imgCarte1.setImage(carte2);
            
            File image3 = new File(nomImg.get(2));
            Image carte3 = new Image(image3.toURI().toString());
            imgCarte1.setImage(carte3);
    	}
    	
    }


    @FXML
    void initialize() {
    	assert bnRetour != null : "fx:id=\"bnRetour\" was not injected: check your FXML file 'fenBaltrou.fxml'.";
        assert imgCarte1 != null : "fx:id=\"imgCarte1\" was not injected: check your FXML file 'fenBaltrou.fxml'.";
        assert imgCarte2 != null : "fx:id=\"imgCarte2\" was not injected: check your FXML file 'fenBaltrou.fxml'.";
        assert imgCarte3 != null : "fx:id=\"imgCarte3\" was not injected: check your FXML file 'fenBaltrou.fxml'.";
        assert liste_carte != null : "fx:id=\"liste_carte\" was not injected: check your FXML file 'fenBaltrou.fxml'.";
        
        File image1 = new File("img/as_de_pique");
        Image carte1= new Image(image1.toURI().toString());
        imgCarte1.setImage(carte1);
        
        File image2 = new File("img/2_de_coeur");
        Image carte2 = new Image(image2.toURI().toString());
        imgCarte1.setImage(carte2);
        
        File image3 = new File("img/2_de_trefle");
        Image carte3 = new Image(image3.toURI().toString());
        imgCarte1.setImage(carte3);
    }

}
