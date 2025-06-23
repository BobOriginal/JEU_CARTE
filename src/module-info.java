module jeu_de_carte {
	requires javafx.base;
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	
	//opens controleur to javafx.base, javafx.graphics, javafx.fxml;
	opens model to javafx.base, javafx.graphics, javafx.fxml;
	//opens vue to javafx.base, javafx.graphics, javafx.fxml;
	
}