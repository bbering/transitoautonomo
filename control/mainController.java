package control;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import threads.threadRedCar;

public class mainController implements Initializable {

  // Imagens utilizadas no programa

  @FXML
  private ImageView redCar;

  // Sliders
  @FXML
  public Slider redSlider;

  // Threads

  public threadRedCar tRedCar;

  // Botões de pause

  @FXML
  private Button pauseRed;

  // Variaveis de controle do pause

  int isLockedRed;

  // Metodo que move o carro no sentido Y

  public void moveY(int street) {
    if (street == 6)
      for (int i = -565; i <= -480; i++) {
        int moveY = i;
        Platform.runLater(() -> redCar.setY(moveY));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 8)
      for (int i = -450; i >= -565; i--) {
        int moveY = i;
        Platform.runLater(() -> redCar.setY(moveY));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }

    if (street == 9)
      for (int i = -565; i <= -450; i++) {
        int moveY = i;
        Platform.runLater(() -> redCar.setY(moveY));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }

    if (street == 11)
      for (int i = -420; i >= -565; i--) {
        int moveY = i;
        Platform.runLater(() -> redCar.setY(moveY));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 17)
      for (int i = -480; i <= -360; i++) {
        int moveY = i;
        Platform.runLater(() -> redCar.setY(moveY));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 22)
      for (int i = -300; i >= -420; i--) {
        int moveY = i;
        Platform.runLater(() -> redCar.setY(moveY));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 28)
      for (int i = -360; i <= -230; i++) {
        int moveY = i;
        Platform.runLater(() -> redCar.setY(moveY));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 30)
      for (int i = -215; i >= -333; i--) {
        int moveY = i;
        Platform.runLater(() -> redCar.setY(moveY));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 31)
      for (int i = -333; i <= -215; i++) {
        int moveY = i;
        Platform.runLater(() -> redCar.setY(moveY));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 33)
      for (int i = -180; i >= -300; i--) {
        int moveY = i;
        Platform.runLater(() -> redCar.setY(moveY));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 39)
      for (int i = -230; i <= -110; i++) {
        int moveY = i;
        Platform.runLater(() -> redCar.setY(moveY));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 40)
      for (int i = -70; i >= -215; i--) {
        int moveY = i;
        Platform.runLater(() -> redCar.setY(moveY));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 43)
      for (int i = -230; i <= -110; i++) {
        int moveY = i;
        Platform.runLater(() -> redCar.setY(moveY));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 44)
      for (int i = -60; i >= -180; i--) {
        int moveY = i;
        Platform.runLater(() -> redCar.setY(moveY));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 50)
      for (int i = -110; i <= 10; i++) {
        int moveY = i;
        Platform.runLater(() -> redCar.setY(moveY));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 51)
      for (int i = 10; i >= -70; i--) {
        int moveY = i;
        Platform.runLater(() -> redCar.setY(moveY));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 54)
      for (int i = -110; i <= 10; i++) {
        int moveY = i;
        Platform.runLater(() -> redCar.setY(moveY));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 55)
      for (int i = 0; i >= -60; i--) {
        int moveY = i;
        Platform.runLater(() -> redCar.setY(moveY));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
  }

  // Metodo que move o carro no sentido X

  public void moveX(int street) {
    if (street == 1)
      for (int i = -510; i >= -617; i--) {
        int moveX = i;
        Platform.runLater(() -> redCar.setX(moveX));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 2)
      for (int i = -370; i >= -510; i--) {
        int moveX = i;
        Platform.runLater(() -> redCar.setX(moveX));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 4)
      for (int i = -120; i >= -250; i--) {
        int moveX = i;
        Platform.runLater(() -> redCar.setX(moveX));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 5)
      for (int i = 0; i >= -120; i--) {
        int moveX = i;
        Platform.runLater(() -> redCar.setX(moveX));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 14)
      for (int i = -250; i >= -370; i--) {
        int moveX = i;
        Platform.runLater(() -> redCar.setX(moveX));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 25)
      for (int i = -370; i <= -248; i++) {
        int moveX = i;
        Platform.runLater(() -> redCar.setX(moveX));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 35)
      for (int i = -490; i <= -370; i++) {
        int moveX = i;
        Platform.runLater(() -> redCar.setX(moveX));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 37)
      for (int i = -248; i <= -127; i++) {
        int moveX = i;
        Platform.runLater(() -> redCar.setX(moveX));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 57)
      for (int i = -617; i <= -490; i++) {
        int moveX = i;
        Platform.runLater(() -> redCar.setX(moveX));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 61)
      for (int i = -127; i <= 0; i++) {
        int moveX = i;
        Platform.runLater(() -> redCar.setX(moveX));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
  }

  // Metodo que rotaciona o carro nas curvas

  public void rotate(int car, int rotation) {
    if (car == 1) {
      redCar.setRotate(rotation);
    }
  }

  // Metodo que acelera ou desacelera o carro com base no valor do slider

  @Override
  public void initialize(URL location, ResourceBundle resources) {
    this.tRedCar = new threadRedCar();
    tRedCar.setController(this);
    tRedCar.start();
    pauseRed.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        if (isLockedRed == 0) {
          tRedCar.suspend();
          isLockedRed = 1;
        } else {
          tRedCar.resume();
          isLockedRed = 0;
        }
      }
    });
  }

  public void getRedCar() {
    System.out.println(redCar.getX());
    System.out.println(redCar.getY());
  }
}
