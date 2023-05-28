package control;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.Semaphore;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import threads.threadGreenCar;
import threads.threadRedCar;

public class mainController implements Initializable {

  // Imagens utilizadas no programa

  @FXML
  private ImageView redCar;

  @FXML
  private ImageView greenCar;

  // Sliders

  @FXML
  public Slider redSlider;

  @FXML
  private Slider greenSlider;

  // Threads

  public threadRedCar tRedCar;

  public threadGreenCar tGreenCar;

  // Botões de pause

  @FXML
  private Button pauseRed;

  @FXML
  private Button pauseGreen;

  // Semaforo que tratará as colisões

  public Semaphore sph = new Semaphore(1);

  // Variaveis de travamento de percurso

  public int redRoute01;

  // Variaveis de controle do pause

  int isLockedRed;

  int isLockedGreen;

  // Metodo que move o carro no sentido Y

  public void moveY(int street, int car, int direc) {
    if (street == 6 && direc == 0)
      for (int i = -565; i <= -480; i++) {
        int moveY = i;
        if (car == 1) {
          Platform.runLater(() -> redCar.setY(moveY));
          try {
            threadRedCar.sleep((int) (10 / redSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
      if (street == 6 && direc == 1)
      for (int i = 110; i >= 0; i--) {
        int moveY = i;
        if (car == 2) {
          Platform.runLater(() -> greenCar.setY(moveY));
          try {
            threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 8)
      for (int i = -450; i >= -565; i--) {
        int moveY = i;
        if (car == 1) {
          Platform.runLater(() -> redCar.setY(moveY));
          try {
            threadRedCar.sleep((int) (10 / redSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
        if (car == 2) {
          Platform.runLater(() -> greenCar.setY(moveY));
          try {
            threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }

    if (street == 9)
      for (int i = -565; i <= -450; i++) {
        int moveY = i;
        if (car == 1) {
          Platform.runLater(() -> redCar.setY(moveY));
          try {
            threadRedCar.sleep((int) (10 / redSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
        if (car == 2) {
          Platform.runLater(() -> greenCar.setY(moveY));
          try {
            threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }

    if (street == 11 && direc == 0)
      for (int i = -420; i >= -565; i--) {
        int moveY = i;
        if (car == 1) {
          Platform.runLater(() -> redCar.setY(moveY));
          try {
            threadRedCar.sleep((int) (10 / redSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
        if (car == 2) {
          Platform.runLater(() -> greenCar.setY(moveY));
          try {
            threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 11 && direc == 1)
      for (int i = 0; i <= 120; i++) {
        int moveY = i;
        if (car == 1) {
          Platform.runLater(() -> redCar.setY(moveY));
          try {
            threadRedCar.sleep((int) (10 / redSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
        if (car == 2) {
          Platform.runLater(() -> greenCar.setY(moveY));
          try {
            threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 17 && direc == 0)
      for (int i = -480; i <= -360; i++) {
        int moveY = i;
        if (car == 1) {
          Platform.runLater(() -> redCar.setY(moveY));
          try {
            threadRedCar.sleep((int) (10 / redSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
      if (street == 17 && direc == 1)
      for (int i = 220; i >= 110; i--) {
        int moveY = i;
        if (car == 2) {
          Platform.runLater(() -> greenCar.setY(moveY));
          try {
            threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 22 && direc == 0)
      for (int i = -300; i >= -420; i--) {
        int moveY = i;
        if (car == 1) {
          Platform.runLater(() -> redCar.setY(moveY));
          try {
            threadRedCar.sleep((int) (10 / redSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
        if (car == 2) {
          Platform.runLater(() -> greenCar.setY(moveY));
          try {
            threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 22 && direc == 1)
      for (int i = 120; i <= 230; i++) {
        int moveY = i;
        if (car == 1) {
          Platform.runLater(() -> redCar.setY(moveY));
          try {
            threadRedCar.sleep((int) (10 / redSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
        if (car == 2) {
          Platform.runLater(() -> greenCar.setY(moveY));
          try {
            threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 28 && direc == 0)
      for (int i = -360; i <= -230; i++) {
        int moveY = i;
        if (car == 1) {
          Platform.runLater(() -> redCar.setY(moveY));
          try {
            threadRedCar.sleep((int) (10 / redSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 28 && direc == 1)
      for (int i = 335; i >= 220; i--) {
        int moveY = i;
        if (car == 2) {
          Platform.runLater(() -> greenCar.setY(moveY));
          try {
            threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 30 && direc == 0)
      for (int i = -215; i >= -333; i--) {
        int moveY = i;
        if (car == 1) {
          Platform.runLater(() -> redCar.setY(moveY));
          try {
            threadRedCar.sleep((int) (10 / redSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
        if (car == 2) {
          Platform.runLater(() -> greenCar.setY(moveY));
          try {
            threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 30 && direc == 1)
      for (int i = 230; i <= 340; i++) {
        int moveY = i;
        if (car == 2) {
          Platform.runLater(() -> greenCar.setY(moveY));
          try {
            threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }

    if (street == 31 && direc == 0)
      for (int i = -333; i <= -215; i++) {
        int moveY = i;
        if (car == 1) {
          Platform.runLater(() -> redCar.setY(moveY));
          try {
            threadRedCar.sleep((int) (10 / redSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 31 && direc == 1)
      for (int i = 330; i >= 230; i--) {
        int moveY = i;
        if (car == 2) {
          Platform.runLater(() -> greenCar.setY(moveY));
          try {
            threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 33 && direc == 0)
      for (int i = -180; i >= -300; i--) {
        int moveY = i;
        if (car == 1) {
          Platform.runLater(() -> redCar.setY(moveY));
          try {
            threadRedCar.sleep((int) (10 / redSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
        if (car == 2) {
          Platform.runLater(() -> greenCar.setY(moveY));
          try {
            threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 33 && direc == 1)
      for (int i = 230; i <= 320; i++) {
        int moveY = i;
        if (car == 1) {
          Platform.runLater(() -> redCar.setY(moveY));
          try {
            threadRedCar.sleep((int) (10 / redSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
        if (car == 2) {
          Platform.runLater(() -> greenCar.setY(moveY));
          try {
            threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 39 && direc == 0)
      for (int i = -230; i <= -110; i++) {
        int moveY = i;
        if (car == 1) {
          Platform.runLater(() -> redCar.setY(moveY));
          try {
            threadRedCar.sleep((int) (10 / redSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 39 && direc == 1)
      for (int i = 470; i >= 330; i--) {
        int moveY = i;
        if (car == 2) {
          Platform.runLater(() -> greenCar.setY(moveY));
          try {
            threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 40)
      for (int i = -70; i >= -215; i--) {
        int moveY = i;
        if (car == 1) {
          Platform.runLater(() -> redCar.setY(moveY));
          try {
            threadRedCar.sleep((int) (10 / redSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
        if (car == 2) {
          Platform.runLater(() -> greenCar.setY(moveY));
          try {
            threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 41 && direc == 0)
      for (int i = 349; i <= 460; i++) {
        int moveY = i;
        if (car == 2) {
          Platform.runLater(() -> greenCar.setY(moveY));
          try {
            threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 42 && direc == 1)
      for (int i = 465; i >= 330; i--) {
        int moveY = i;
        if (car == 1) {
          Platform.runLater(() -> redCar.setY(moveY));
          try {
            threadRedCar.sleep((int) (10 / redSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
        if (car == 2) {
          Platform.runLater(() -> greenCar.setY(moveY));
          try {
            threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 43)
      for (int i = -230; i <= -110; i++) {
        int moveY = i;
        if (car == 1) {
          Platform.runLater(() -> redCar.setY(moveY));
          try {
            threadRedCar.sleep((int) (10 / redSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
        if (car == 2) {
          Platform.runLater(() -> greenCar.setY(moveY));
          try {
            threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 44 && direc == 0)
      for (int i = -60; i >= -180; i--) {
        int moveY = i;
        if (car == 1) {
          Platform.runLater(() -> redCar.setY(moveY));
          try {
            threadRedCar.sleep((int) (10 / redSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
        if (car == 2) {
          Platform.runLater(() -> greenCar.setY(moveY));
          try {
            threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 44 && direc == 1)
      for (int i = 320; i <= 440; i++) {
        int moveY = i;
        if (car == 1) {
          Platform.runLater(() -> redCar.setY(moveY));
          try {
            threadRedCar.sleep((int) (10 / redSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
        if (car == 2) {
          Platform.runLater(() -> greenCar.setY(moveY));
          try {
            threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 50 && direc == 0)
      for (int i = -110; i <= 10; i++) {
        int moveY = i;
        if (car == 1) {
          Platform.runLater(() -> redCar.setY(moveY));
          try {
            threadRedCar.sleep((int) (10 / redSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 50 && direc == 1)
      for (int i = 580; i >= 470; i--) {
        int moveY = i;
        if (car == 2) {
          Platform.runLater(() -> greenCar.setY(moveY));
          try {
            threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 51)
      for (int i = 10; i >= -70; i--) {
        int moveY = i;
        if (car == 1) {
          Platform.runLater(() -> redCar.setY(moveY));
          try {
            threadRedCar.sleep((int) (10 / redSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
        if (car == 2) {
          Platform.runLater(() -> greenCar.setY(moveY));
          try {
            threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 52 && direc == 0)
      for (int i = 460; i <= 580; i++) {
        int moveY = i;
        if (car == 2) {
          Platform.runLater(() -> greenCar.setY(moveY));
          try {
            threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 53 && direc == 1)
      for (int i = 575; i >= 465; i--) {
        int moveY = i;
        if (car == 1) {
          Platform.runLater(() -> redCar.setY(moveY));
          try {
            threadRedCar.sleep((int) (10 / redSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
        if (car == 2) {
          Platform.runLater(() -> greenCar.setY(moveY));
          try {
            threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 54)
      for (int i = -110; i <= 10; i++) {
        int moveY = i;
        if (car == 1) {
          Platform.runLater(() -> redCar.setY(moveY));
          try {
            threadRedCar.sleep((int) (10 / redSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
        if (car == 2) {
          Platform.runLater(() -> greenCar.setY(moveY));
          try {
            threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 55 && direc == 0)
      for (int i = 0; i >= -60; i--) {
        int moveY = i;
        if (car == 1) {
          Platform.runLater(() -> redCar.setY(moveY));
          try {
            threadRedCar.sleep((int) (10 / redSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
        if (car == 2) {
          Platform.runLater(() -> greenCar.setY(moveY));
          try {
            threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 55 && direc == 1)
      for (int i = 440; i <= 575; i++) {
        int moveY = i;
        if (car == 1) {
          Platform.runLater(() -> redCar.setY(moveY));
          try {
            threadRedCar.sleep((int) (10 / redSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
        if (car == 2) {
          Platform.runLater(() -> greenCar.setY(moveY));
          try {
            threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
  }

  // Metodo que move o carro no sentido X

  public void moveX(int street, int car, int direc) {
    if (street == 1 && direc == 0)
      for (int i = 0; i <= 120; i++) {
        int moveX = i;
        if (car == 1) {
          Platform.runLater(() -> redCar.setX(moveX));
          try {
            threadRedCar.sleep((int) (10 / redSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
        if (car == 2) {
          Platform.runLater(() -> greenCar.setX(moveX));
          try {
            threadRedCar.sleep((int) (10 / greenSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 1 && direc == 1)
      for (int i = -510; i >= -617; i--) {
        int moveX = i;
        if (car == 1) {
          Platform.runLater(() -> redCar.setX(moveX));
          try {
            threadRedCar.sleep((int) (10 / redSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
        if (car == 2) {
          Platform.runLater(() -> greenCar.setX(moveX));
          try {
            threadRedCar.sleep((int) (10 / greenSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 2 && direc == 0)
      for (int i = 120; i <= 240; i++) {
        int moveX = i;
        if (car == 1) {
          Platform.runLater(() -> redCar.setX(moveX));
          try {
            threadRedCar.sleep((int) (10 / redSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
        if (car == 2) {
          Platform.runLater(() -> greenCar.setX(moveX));
          try {
            threadRedCar.sleep((int) (10 / greenSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 2 && direc == 1)
      for (int i = -370; i >= -510; i--) {
        int moveX = i;
        if (car == 1) {
          Platform.runLater(() -> redCar.setX(moveX));
          try {
            threadRedCar.sleep((int) (10 / redSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
        if (car == 2) {
          Platform.runLater(() -> greenCar.setX(moveX));
          try {
            threadRedCar.sleep((int) (10 / greenSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 3 && direc == 0)
      for (int i = 240; i <= 322; i++) {
        int moveX = i;
        if (car == 1) {
          Platform.runLater(() -> redCar.setX(moveX));
          try {
            threadRedCar.sleep((int) (10 / redSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
        if (car == 2) {
          Platform.runLater(() -> greenCar.setX(moveX));
          try {
            threadRedCar.sleep((int) (10 / greenSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 4 && direc == 1)
      for (int i = -120; i >= -246; i--) {
        int moveX = i;
        if (car == 1) {
          Platform.runLater(() -> redCar.setX(moveX));
          try {
            threadRedCar.sleep((int) (10 / redSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
        if (car == 2) {
          Platform.runLater(() -> greenCar.setX(moveX));
          try {
            threadRedCar.sleep((int) (10 / greenSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 4 && direc == 0)
      for (int i = 322; i <= 480; i++) {
        int moveX = i;
        if (car == 1) {
          Platform.runLater(() -> redCar.setX(moveX));
          try {
            threadRedCar.sleep((int) (10 / redSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
        if (car == 2) {
          Platform.runLater(() -> greenCar.setX(moveX));
          try {
            threadRedCar.sleep((int) (10 / greenSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 5 && direc == 1)
      for (int i = 0; i >= -120; i--) {
        int moveX = i;
        if (car == 1) {
          Platform.runLater(() -> redCar.setX(moveX));
          try {
            threadRedCar.sleep((int) (10 / redSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
        if (car == 2) {
          Platform.runLater(() -> greenCar.setX(moveX));
          try {
            threadRedCar.sleep((int) (10 / greenSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 5 && direc == 0)
      for (int i = 480; i <= 607; i++) {
        int moveX = i;
        if (car == 1) {
          Platform.runLater(() -> redCar.setX(moveX));
          try {
            threadRedCar.sleep((int) (10 / redSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
        if (car == 2) {
          Platform.runLater(() -> greenCar.setX(moveX));
          try {
            threadRedCar.sleep((int) (10 / greenSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 14)
      for (int i = -246; i >= -370; i--) {
        int moveX = i;
        if (car == 1) {
          Platform.runLater(() -> redCar.setX(moveX));
          try {
            threadRedCar.sleep((int) (10 / redSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
        if (car == 2) {
          Platform.runLater(() -> greenCar.setX(moveX));
          try {
            threadRedCar.sleep((int) (10 / greenSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 25 && direc == 0)
      for (int i = -370; i <= -248; i++) {
        int moveX = i;
        if (car == 1) {
          Platform.runLater(() -> redCar.setX(moveX));
          try {
            threadRedCar.sleep((int) (10 / redSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 25 && direc == 1)
      for (int i = 360; i >= 238; i--) {
        int moveX = i;
        if (car == 2) {
          Platform.runLater(() -> greenCar.setX(moveX));
          try {
            threadRedCar.sleep((int) (10 / greenSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 35)
      for (int i = -490; i <= -370; i++) {
        int moveX = i;
        if (car == 1) {
          Platform.runLater(() -> redCar.setX(moveX));
          try {
            threadRedCar.sleep((int) (10 / redSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
        if (car == 2) {
          Platform.runLater(() -> greenCar.setX(moveX));
          try {
            threadRedCar.sleep((int) (10 / greenSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 37)
      for (int i = -248; i <= -127; i++) {
        int moveX = i;
        if (car == 1) {
          Platform.runLater(() -> redCar.setX(moveX));
          try {
            threadRedCar.sleep((int) (10 / redSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
        if (car == 2) {
          Platform.runLater(() -> greenCar.setX(moveX));
          try {
            threadRedCar.sleep((int) (10 / greenSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 57 && direc == 1)
      for (int i = -617; i <= -490; i++) {
        int moveX = i;
        if (car == 1) {
          Platform.runLater(() -> redCar.setX(moveX));
          try {
            threadRedCar.sleep((int) (10 / redSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 57 && direc == 0)
      for (int i = 110; i >= -5; i--) {
        int moveX = i;
        if (car == 2) {
          Platform.runLater(() -> greenCar.setX(moveX));
          try {
            threadRedCar.sleep((int) (10 / greenSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 58 && direc == 0) {
      for (int i = 238; i >= 110; i--) {
        int moveX = i;
        if (car == 2) {
          Platform.runLater(() -> greenCar.setX(moveX));
          try {
            threadRedCar.sleep((int) (10 / greenSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    }
    if (street == 60 && direc == 1)
      for (int i = 470; i >= 360; i--) {
        int moveX = i;
        if (car == 1) {
          Platform.runLater(() -> redCar.setX(moveX));
          try {
            threadRedCar.sleep((int) (10 / redSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
        if (car == 2) {
          Platform.runLater(() -> greenCar.setX(moveX));
          try {
            threadRedCar.sleep((int) (10 / greenSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 61 && direc == 0)
      for (int i = -127; i <= 0; i++) {
        int moveX = i;
        if (car == 1) {
          Platform.runLater(() -> redCar.setX(moveX));
          try {
            threadRedCar.sleep((int) (10 / redSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
        if (car == 2) {
          Platform.runLater(() -> greenCar.setX(moveX));
          try {
            threadRedCar.sleep((int) (10 / greenSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 61 && direc == 1)
      for (int i = 607; i >= 470; i--) {
        int moveX = i;
        if (car == 1) {
          Platform.runLater(() -> redCar.setX(moveX));
          try {
            threadRedCar.sleep((int) (10 / redSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
        if (car == 2) {
          Platform.runLater(() -> greenCar.setX(moveX));
          try {
            threadRedCar.sleep((int) (10 / greenSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
  }

  // Metodo que rotaciona o carro nas curvas

  public void rotate(int car, int rotation) {
    if (car == 1) {
      redCar.setRotate(rotation);
    }
    if (car == 2) {
      greenCar.setRotate(rotation);
    }
  }

  // Metodo que acelera ou desacelera o carro com base no valor do slider

  @Override
  public void initialize(URL location, ResourceBundle resources) {
    this.tRedCar = new threadRedCar();
    tRedCar.setController(this);
    tRedCar.start();
    this.tGreenCar = new threadGreenCar();
    tGreenCar.setController(this);
    tGreenCar.start();
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
    pauseGreen.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        if (isLockedGreen == 0) {
          tGreenCar.suspend();
          isLockedGreen = 1;
        } else {
          tGreenCar.resume();
          isLockedGreen = 0;
        }
      }
    });
  }

  public void getGreenCar() {
    System.out.println(greenCar.getX());
    System.out.println(greenCar.getY());
  }
}
