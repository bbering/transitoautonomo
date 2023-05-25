package control;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import threads.threadBlackCar;

public class mainController implements Initializable {
    
    // Imagens utilizadas no codigo

    @FXML
    private ImageView blackC;

    // Threads
    private threadBlackCar tBlackCar;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.tBlackCar = new threadBlackCar();
        tBlackCar.start();
    }
    
    public void runStreet10(){
    }
}
