package control;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import threads.threadBlackCar;

public class mainController implements Initializable {

    @FXML
    private ImageView redCar;

    public threadBlackCar tBlackCar;


    // Metodo que move o carro no sentido Y

    public void moveY(int street) {
        // RUA 55
        if(street == 55)
        for (int i = 0; i >= -60; i--) {
            int moveY = i;
            Platform.runLater(() -> redCar.setY(moveY));
            try {
                threadBlackCar.sleep(10);
            } catch (InterruptedException e) {
            }
        }
        // RUA 44
        if(street == 44)
        for (int i = -60; i >= -180; i--) {
            int moveY = i;
            Platform.runLater(() -> redCar.setY(moveY));
            try {
                threadBlackCar.sleep(10);
            } catch (InterruptedException e) {
            }
        }
        if(street == 33)
        for (int i = -180; i >= -300; i--) {
            int moveY = i;
            Platform.runLater(() -> redCar.setY(moveY));
            try {
                threadBlackCar.sleep(10);
            } catch (InterruptedException e) {
            }
        }
        if(street == 22)
        for (int i = -300; i >= -420; i--) {
            int moveY = i;
            Platform.runLater(() -> redCar.setY(moveY));
            try {
                threadBlackCar.sleep(10);
            } catch (InterruptedException e) {
            }
        }
        if(street == 11)
        for (int i = -420; i >= -540; i--) {
            int moveY = i;
            Platform.runLater(() -> redCar.setY(moveY));
            try {
                threadBlackCar.sleep(10);
            } catch (InterruptedException e) {
            }
        }
    }

    public void rotate(int car, int rotation){
        if(car == 1){
            redCar.setRotate(rotation);
        }
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.tBlackCar = new threadBlackCar();
        tBlackCar.setController(this);
        tBlackCar.start();
    }
}
