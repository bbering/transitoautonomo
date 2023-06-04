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
import threads.threadBlackCar;
import threads.threadBlueCar;
import threads.threadCyanCar;
import threads.threadGreenCar;
import threads.threadOrangeCar;
import threads.threadPurpleCar;
import threads.threadRedCar;
import threads.threadYellowCar;

public class mainController implements Initializable {

  // Imagens utilizadas no programa

  @FXML
  private ImageView redCar;

  @FXML
  private ImageView greenCar;

  @FXML
  private ImageView orangeCar;

  @FXML
  private ImageView blueCar;

  @FXML
  private ImageView yellowCar;

  @FXML
  private ImageView cyanCar;

  @FXML
  private ImageView purpleCar;

  @FXML
  private ImageView blackCar;

  // Sliders

  @FXML
  public Slider redSlider;

  @FXML
  private Slider greenSlider;

  @FXML
  private Slider orangeSlider;

  @FXML
  private Slider blueSlider;

  @FXML
  private Slider yellowSlider;

  @FXML
  private Slider cyanSlider;

  @FXML
  private Slider purpleSlider;

  @FXML
  private Slider blackSlider;

  // Threads

  public threadRedCar tRedCar;

  public threadGreenCar tGreenCar;

  public threadOrangeCar tOrangeCar;

  public threadBlueCar tBlueCar;

  public threadYellowCar tYellowCar;

  public threadCyanCar tCyanCar;

  public threadPurpleCar tPurpleCar;

  public threadBlackCar tBlackCar;

  // Botões de pause

  @FXML
  private Button pauseRed;

  @FXML
  private Button pauseGreen;

  @FXML
  private Button pauseOrange;

  @FXML
  private Button pauseBlue;

  @FXML
  private Button pauseYellow;

  @FXML
  private Button pauseCyan;

  @FXML
  private Button pausePurple;

  @FXML
  private Button pauseBlack;

  // Botão de restartar o programa

  @FXML
  private Button restart;

  // Semaforos que tratarao as colisoes por percurso

  public Semaphore colision01 = new Semaphore(1);
  public Semaphore colision02 = new Semaphore(1);
  public Semaphore colision03 = new Semaphore(1);
  public Semaphore colision04 = new Semaphore(1);
  public Semaphore colision05 = new Semaphore(1);
  public Semaphore colision06 = new Semaphore(1);
  public Semaphore colision07 = new Semaphore(1);
  public Semaphore colision08 = new Semaphore(1);
  public Semaphore colision09 = new Semaphore(1);
  public Semaphore colision10 = new Semaphore(1);
  public Semaphore colision11 = new Semaphore(1);
  public Semaphore colision12 = new Semaphore(1);
  public Semaphore colision13 = new Semaphore(1);
  public Semaphore colision14 = new Semaphore(1);
  public Semaphore colision15 = new Semaphore(1);
  public Semaphore colision16 = new Semaphore(1);
  public Semaphore colision17 = new Semaphore(1);
  public Semaphore colision18 = new Semaphore(1);
  public Semaphore colision19 = new Semaphore(1);
  public Semaphore colision20 = new Semaphore(1);
  public Semaphore colision21 = new Semaphore(1);
  public Semaphore colision22 = new Semaphore(1);
  public Semaphore colision23 = new Semaphore(1);
  public Semaphore colision24 = new Semaphore(1);
  public Semaphore colision25 = new Semaphore(1);
  public Semaphore colision26 = new Semaphore(1);
  public Semaphore colision27 = new Semaphore(1);
  public Semaphore colision28 = new Semaphore(1);
  public Semaphore colision29 = new Semaphore(1);
  public Semaphore colision30 = new Semaphore(1);
  public Semaphore colision31 = new Semaphore(1);
  public Semaphore colision32 = new Semaphore(1);
  public Semaphore colision33 = new Semaphore(1);
  public Semaphore colision34 = new Semaphore(1);
  public Semaphore colision35 = new Semaphore(1);
  public Semaphore colision36 = new Semaphore(1);
  public Semaphore colision37 = new Semaphore(1);
  public Semaphore colision38 = new Semaphore(1);
  public Semaphore colision39 = new Semaphore(1);
  public Semaphore colision40 = new Semaphore(1);
  public Semaphore colision41 = new Semaphore(1);
  public Semaphore colision42 = new Semaphore(1);
  public Semaphore colision43 = new Semaphore(1);
  public Semaphore colision44 = new Semaphore(1);
  public Semaphore colision45 = new Semaphore(1);
  public Semaphore colision46 = new Semaphore(1);
  public Semaphore colision47 = new Semaphore(1);
  public Semaphore colision48 = new Semaphore(1);
  public Semaphore colision49 = new Semaphore(1);
  public Semaphore colision50 = new Semaphore(1);
  public Semaphore colision51 = new Semaphore(1);
  public Semaphore colision52 = new Semaphore(1);
  public Semaphore colision53 = new Semaphore(1);
  public Semaphore colision54 = new Semaphore(1);
  public Semaphore colision55 = new Semaphore(1);
  public Semaphore colision56 = new Semaphore(1);
  public Semaphore colision57 = new Semaphore(1);
  public Semaphore colision58 = new Semaphore(1);
  public Semaphore colision59 = new Semaphore(1);
  public Semaphore colision60 = new Semaphore(1);
  public Semaphore colision61 = new Semaphore(1);
  public Semaphore colision62 = new Semaphore(1);
  public Semaphore colision63 = new Semaphore(1);

  // Variaveis de controle do pause

  int isLockedRed;

  int isLockedGreen;

  int isLockedOrange;

  int isLockedBlue;

  int isLockedYellow;

  int isLockedCyan;

  int isLockedPurple;

  int isLockedBlack;

  // Metodo que move o carro no sentido Y

  public void moveY(int street, int car) {
    if (street == 6 && car == 1)
      for (int i = -565; i <= -480; i++) {
        int moveY = i;
        Platform.runLater(() -> redCar.setY(moveY));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 6 && car == 2)
      for (int i = 110; i >= 0; i--) {
        int moveY = i;
        Platform.runLater(() -> greenCar.setY(moveY));
        try {
          threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 7 && car == 4)
      for (int i = 0; i <= 120; i++) {
        int moveY = i;
        Platform.runLater(() -> blueCar.setY(moveY));
        try {
          threadBlueCar.sleep((int) (10 / blueSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 8 && car == 1)
      for (int i = -450; i >= -525; i--) {
        int moveY = i;
        Platform.runLater(() -> redCar.setY(moveY));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (car == 6 && street == 8) {
      for (int i = 0; i <= 115; i++) {
        int moveY = i;
        Platform.runLater(() -> cyanCar.setY(moveY));
        try {
          threadCyanCar.sleep((int) (10 / cyanSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    }
    if (street == 7 && car == 7)
      for (int i = -470; i >= -530; i--) {
        int moveY = i;
        Platform.runLater(() -> purpleCar.setY(moveY));
        try {
          threadPurpleCar.sleep((int) (10 / purpleSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 9 && car == 1)
      for (int i = -565; i <= -450; i++) {
        int moveY = i;
        Platform.runLater(() -> redCar.setY(moveY));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 9 && car == 4)
      for (int i = 110; i >= 0; i--) {
        int moveY = i;
        Platform.runLater(() -> blueCar.setY(moveY));
        try {
          threadBlueCar.sleep((int) (10 / blueSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 10 && car == 6)
      for (int i = 110; i >= 35; i--) {
        int moveY = i;
        Platform.runLater(() -> cyanCar.setY(moveY));
        try {
          threadCyanCar.sleep((int) (10 / cyanSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 10 && car == 7)
      for (int i = -575; i <= -465; i++) {
        int moveY = i;
        Platform.runLater(() -> purpleCar.setY(moveY));
        try {
          threadPurpleCar.sleep((int) (10 / purpleSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 11 && car == 1)
      for (int i = -420; i >= -565; i--) {
        int moveY = i;
        Platform.runLater(() -> redCar.setY(moveY));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 11 && car == 2)
      for (int i = 0; i <= 120; i++) {
        int moveY = i;
        Platform.runLater(() -> greenCar.setY(moveY));
        try {
          threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 17 && car == 1)
      for (int i = -480; i <= -360; i++) {
        int moveY = i;
        Platform.runLater(() -> redCar.setY(moveY));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {

        }
      }
    if (street == 17 && car == 2)
      for (int i = 220; i >= 110; i--) {
        int moveY = i;
        Platform.runLater(() -> greenCar.setY(moveY));
        try {
          threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 18 && car == 4)
      for (int i = 120; i <= 240; i++) {
        int moveY = i;
        Platform.runLater(() -> blueCar.setY(moveY));
        try {
          threadBlueCar.sleep((int) (10 / blueSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 18 && car == 7)
      for (int i = -350; i >= -470; i--) {
        int moveY = i;
        Platform.runLater(() -> purpleCar.setY(moveY));
        try {
          threadPurpleCar.sleep((int) (10 / purpleSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (car == 6 && street == 19) {
      for (int i = 115; i <= 190; i++) {
        int moveY = i;
        Platform.runLater(() -> cyanCar.setY(moveY));
        try {
          threadCyanCar.sleep((int) (10 / cyanSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    }
    if (street == 20 && car == 4)
      for (int i = 225; i >= 110; i--) {
        int moveY = i;
        Platform.runLater(() -> blueCar.setY(moveY));
        try {
          threadBlueCar.sleep((int) (10 / blueSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 21 && car == 6)
      for (int i = 235; i >= 110; i--) {
        int moveY = i;
        Platform.runLater(() -> cyanCar.setY(moveY));
        try {
          threadCyanCar.sleep((int) (10 / cyanSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 21 && car == 7)
      for (int i = -465; i <= -347; i++) {
        int moveY = i;
        Platform.runLater(() -> purpleCar.setY(moveY));
        try {
          threadPurpleCar.sleep((int) (10 / purpleSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 22 && car == 1)
      for (int i = -300; i >= -420; i--) {
        int moveY = i;
        Platform.runLater(() -> redCar.setY(moveY));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 22 && car == 2)
      for (int i = 120; i <= 230; i++) {
        int moveY = i;
        Platform.runLater(() -> greenCar.setY(moveY));
        try {
          threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 28 && car == 1)
      for (int i = -360; i <= -270; i++) {
        int moveY = i;
        if (car == 1) {
          Platform.runLater(() -> redCar.setY(moveY));
          try {
            threadRedCar.sleep((int) (10 / redSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 28 && car == 7)
      for (int i = -230; i >= -345; i--) {
        int moveY = i;
        Platform.runLater(() -> purpleCar.setY(moveY));
        try {
          threadPurpleCar.sleep((int) (10 / purpleSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 28 && car == 2)
      for (int i = 335; i >= 220; i--) {
        int moveY = i;
        Platform.runLater(() -> greenCar.setY(moveY));
        try {
          threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 29 && car == 4)
      for (int i = 240; i <= 290; i++) {
        int moveY = i;
        Platform.runLater(() -> blueCar.setY(moveY));
        try {
          threadBlueCar.sleep((int) (10 / blueSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 30 && car == 1)
      for (int i = -215; i >= -333; i--) {
        int moveY = i;
        if (car == 1) {
          Platform.runLater(() -> redCar.setY(moveY));
          try {
            threadRedCar.sleep((int) (10 / redSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (car == 6 && street == 30) {
      for (int i = 225; i <= 305; i++) {
        int moveY = i;
        Platform.runLater(() -> cyanCar.setY(moveY));
        try {
          threadCyanCar.sleep((int) (10 / cyanSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    }
    if (street == 30 && car == 2)
      for (int i = 230; i <= 310; i++) {
        int moveY = i;
        if (car == 2) {
          Platform.runLater(() -> greenCar.setY(moveY));
          try {
            threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 31 && car == 1)
      for (int i = -333; i <= -260; i++) {
        int moveY = i;
        Platform.runLater(() -> redCar.setY(moveY));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 31 && car == 2)
      for (int i = 330; i >= 230; i--) {
        int moveY = i;
        Platform.runLater(() -> greenCar.setY(moveY));
        try {
          threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 31 && car == 4)
      for (int i = 340; i >= 225; i--) {
        int moveY = i;
        Platform.runLater(() -> blueCar.setY(moveY));
        try {
          threadBlueCar.sleep((int) (10 / blueSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 32 && car == 6)
      for (int i = 350; i >= 270; i--) {
        int moveY = i;
        Platform.runLater(() -> cyanCar.setY(moveY));
        try {
          threadCyanCar.sleep((int) (10 / cyanSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 33 && car == 1)
      for (int i = -180; i >= -300; i--) {
        int moveY = i;
        Platform.runLater(() -> redCar.setY(moveY));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 33 && car == 7)
      for (int i = -340; i <= -270; i++) {
        int moveY = i;
        Platform.runLater(() -> purpleCar.setY(moveY));
        try {
          threadPurpleCar.sleep((int) (10 / purpleSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 33 && car == 2)
      for (int i = 230; i <= 320; i++) {
        int moveY = i;
        Platform.runLater(() -> greenCar.setY(moveY));
        try {
          threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 39 && car == 1)
      for (int i = -230; i <= -110; i++) {
        int moveY = i;
        Platform.runLater(() -> redCar.setY(moveY));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 39 && car == 2)
      for (int i = 470; i >= 330; i--) {
        int moveY = i;
        Platform.runLater(() -> greenCar.setY(moveY));
        try {
          threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 39 && car == 3)
      for (int i = 110; i >= 35; i--) {
        int moveY = i;
        Platform.runLater(() -> orangeCar.setY(moveY));
        try {
          threadOrangeCar.sleep((int) (10 / orangeSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 40)
      for (int i = -70; i >= -185; i--) {
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
    if (street == 40 && car == 7)
      for (int i = -115; i >= -185; i--) {
        int moveY = i;
        Platform.runLater(() -> purpleCar.setY(moveY));
        try {
          threadPurpleCar.sleep((int) (10 / purpleSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 40 && car == 4)
      for (int i = 315; i <= 430; i++) {
        int moveY = i;
        Platform.runLater(() -> blueCar.setY(moveY));
        try {
          threadBlueCar.sleep((int) (10 / blueSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 41 && car == 5)
      for (int i = 110; i >= 35; i--) {
        int moveY = i;
        Platform.runLater(() -> yellowCar.setY(moveY));
        try {
          threadYellowCar.sleep((int) (10 / yellowSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (car == 6 && street == 41) {
      for (int i = 340; i <= 455; i++) {
        int moveY = i;
        Platform.runLater(() -> cyanCar.setY(moveY));
        try {
          threadCyanCar.sleep((int) (10 / cyanSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    }
    if (street == 41 && car == 2)
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
    if (street == 42 && car == 2)
      for (int i = 465; i >= 375; i--) {
        int moveY = i;
        Platform.runLater(() -> greenCar.setY(moveY));
        try {
          threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 42 && car == 4)
      for (int i = 455; i >= 390; i--) {
        int moveY = i;
        Platform.runLater(() -> blueCar.setY(moveY));
        try {
          threadBlueCar.sleep((int) (10 / blueSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 43 && car == 6)
      for (int i = 465; i >= 350; i--) {
        int moveY = i;
        Platform.runLater(() -> cyanCar.setY(moveY));
        try {
          threadCyanCar.sleep((int) (10 / cyanSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 43 && car == 7)
      for (int i = -230; i <= -110; i++) {
        int moveY = i;
        Platform.runLater(() -> purpleCar.setY(moveY));
        try {
          threadPurpleCar.sleep((int) (10 / purpleSlider.getValue()));
        } catch (InterruptedException e) {
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
    if (street == 44 && car == 1)
      for (int i = -60; i >= -180; i--) {
        int moveY = i;
        Platform.runLater(() -> redCar.setY(moveY));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 44 && car == 2)
      for (int i = 320; i <= 440; i++) {
        int moveY = i;
        Platform.runLater(() -> greenCar.setY(moveY));
        try {
          threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 44 && car == 3)
      for (int i = 0; i <= 110; i++) {
        int moveY = i;
        Platform.runLater(() -> orangeCar.setY(moveY));
        try {
          threadOrangeCar.sleep((int) (10 / orangeSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 44 && car == 5)
      for (int i = 0; i <= 110; i++) {
        int moveY = i;
        Platform.runLater(() -> yellowCar.setY(moveY));
        try {
          threadYellowCar.sleep((int) (10 / yellowSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 50 && car == 1)
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
    if (street == 50 && car == 2)
      for (int i = 580; i >= 470; i--) {
        int moveY = i;
        Platform.runLater(() -> greenCar.setY(moveY));
        try {
          threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 50 && car == 3)
      for (int i = 225; i >= 110; i--) {
        int moveY = i;
        Platform.runLater(() -> orangeCar.setY(moveY));
        try {
          threadOrangeCar.sleep((int) (10 / orangeSlider.getValue()));
        } catch (InterruptedException e) {
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
    if (street == 51 && car == 4)
      for (int i = 430; i <= 535; i++) {
        int moveY = i;
        Platform.runLater(() -> blueCar.setY(moveY));
        try {
          threadBlueCar.sleep((int) (10 / blueSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 51 && car == 7)
      for (int i = 0; i >= -115; i--) {
        int moveY = i;
        Platform.runLater(() -> purpleCar.setY(moveY));
        try {
          threadPurpleCar.sleep((int) (10 / purpleSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 52 && car == 2)
      for (int i = 460; i <= 540; i++) {
        int moveY = i;
        if (car == 2) {
          Platform.runLater(() -> greenCar.setY(moveY));
          try {
            threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (car == 6 && street == 52) {
      for (int i = 455; i <= 570; i++) {
        int moveY = i;
        Platform.runLater(() -> cyanCar.setY(moveY));
        try {
          threadCyanCar.sleep((int) (10 / cyanSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    }
    if (street == 52 && car == 5)
      for (int i = 230; i >= 110; i--) {
        int moveY = i;
        Platform.runLater(() -> yellowCar.setY(moveY));
        try {
          threadYellowCar.sleep((int) (10 / yellowSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 53 && car == 2)
      for (int i = 575; i >= 465; i--) {
        int moveY = i;
        Platform.runLater(() -> greenCar.setY(moveY));
        try {
          threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 53 && car == 4)
      for (int i = 570; i >= 455; i--) {
        int moveY = i;
        Platform.runLater(() -> blueCar.setY(moveY));
        try {
          threadBlueCar.sleep((int) (10 / blueSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 54)
      for (int i = -110; i <= -30; i++) {
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
    if (street == 54 && car == 7)
      for (int i = -110; i <= -40; i++) {
        int moveY = i;
        Platform.runLater(() -> purpleCar.setY(moveY));
        try {
          threadPurpleCar.sleep((int) (10 / purpleSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 54 && car == 6)
      for (int i = 570; i >= 465; i--) {
        int moveY = i;
        Platform.runLater(() -> cyanCar.setY(moveY));
        try {
          threadCyanCar.sleep((int) (10 / cyanSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 55 && car == 1)
      for (int i = 0; i >= -60; i--) {
        int moveY = i;
        Platform.runLater(() -> redCar.setY(moveY));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 55 && car == 2)
      for (int i = 440; i <= 575; i++) {
        int moveY = i;
        Platform.runLater(() -> greenCar.setY(moveY));
        try {
          threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 55 && car == 3)
      for (int i = 110; i <= 225; i++) {
        int moveY = i;
        Platform.runLater(() -> orangeCar.setY(moveY));
        try {
          threadOrangeCar.sleep((int) (10 / orangeSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 55 && car == 5)
      for (int i = 110; i <= 230; i++) {
        int moveY = i;
        Platform.runLater(() -> yellowCar.setY(moveY));
        try {
          threadYellowCar.sleep((int) (10 / yellowSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
  }

  // Metodo que move o carro no sentido X

  public void moveX(int street, int car) {
    if (street == 1 && car == 2)
      for (int i = 0; i <= 75; i++) {
        int moveX = i;
        Platform.runLater(() -> greenCar.setX(moveX));
        try {
          threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 1 && car == 1)
      for (int i = -510; i >= -617; i--) {
        int moveX = i;
        Platform.runLater(() -> redCar.setX(moveX));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 2 && car == 7) {
      for (int i = -365; i <= -285; i++) {
        int moveX = i;
        Platform.runLater(() -> purpleCar.setX(moveX));
        try {
          threadPurpleCar.sleep((int) (10 / purpleSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    }
    if (street == 2 && car == 2) {
      for (int i = 75; i <= 195; i++) {
        int moveX = i;
        Platform.runLater(() -> greenCar.setX(moveX));
        try {
          threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    }
    if (street == 2 && car == 1)
      for (int i = -370; i >= -510; i--) {
        int moveX = i;
        Platform.runLater(() -> redCar.setX(moveX));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 2 && car == 4) {
      for (int i = -120; i >= -248; i--) {
        int moveX = i;
        Platform.runLater(() -> blueCar.setX(moveX));
        try {
          threadBlueCar.sleep((int) (10 / blueSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    }
    if (street == 3 && car == 7) {
      for (int i = -240; i <= -125; i++) {
        int moveX = i;
        Platform.runLater(() -> purpleCar.setX(moveX));
        try {
          threadPurpleCar.sleep((int) (10 / purpleSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    }
    if (street == 3 && car == 2)
      for (int i = 240; i <= 322; i++) {
        int moveX = i;
        Platform.runLater(() -> greenCar.setX(moveX));
        try {
          threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 3 && car == 4)
      for (int i = 0; i >= -120; i--) {
        int moveX = i;
        Platform.runLater(() -> blueCar.setX(moveX));
        try {
          threadBlueCar.sleep((int) (10 / blueSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 3 && car == 6)
      for (int i = -125; i >= -245; i--) {
        int moveX = i;
        Platform.runLater(() -> cyanCar.setX(moveX));
        try {
          threadCyanCar.sleep((int) (10 / cyanSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 4 && car == 7) {
      for (int i = -125; i <= 0; i++) {
        int moveX = i;
        Platform.runLater(() -> purpleCar.setX(moveX));
        try {
          threadPurpleCar.sleep((int) (10 / purpleSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    }
    if (street == 4 && car == 1)
      for (int i = -120; i >= -205; i--) {
        int moveX = i;
        Platform.runLater(() -> redCar.setX(moveX));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 4 && car == 6)
      for (int i = 0; i >= -85; i--) {
        int moveX = i;
        Platform.runLater(() -> cyanCar.setX(moveX));
        try {
          threadCyanCar.sleep((int) (10 / cyanSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 4 && car == 2)
      for (int i = 322; i <= 480; i++) {
        int moveX = i;
        Platform.runLater(() -> greenCar.setX(moveX));
        try {
          threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 5 && car == 1)
      for (int i = 0; i >= -85; i--) {
        int moveX = i;
        Platform.runLater(() -> redCar.setX(moveX));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 5 && car == 2)
      for (int i = 480; i <= 607; i++) {
        int moveX = i;
        Platform.runLater(() -> greenCar.setX(moveX));
        try {
          threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 12 && car == 8)
      for (int i = 0; i <= 125; i++) {
        int moveX = i;
        Platform.runLater(() -> blackCar.setX(moveX));
        try {
          threadBlackCar.sleep((int) (10 / blackSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 14 && car == 1)
      for (int i = -250; i >= -370; i--) {
        int moveX = i;
        Platform.runLater(() -> redCar.setX(moveX));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 23 && car == 7) {
      for (int i = -490; i <= -410; i++) {
        int moveX = i;
        Platform.runLater(() -> purpleCar.setX(moveX));
        try {
          threadPurpleCar.sleep((int) (10 / purpleSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    }
    if (street == 25 && car == 1)
      for (int i = -370; i <= -248; i++) {
        int moveX = i;
        Platform.runLater(() -> redCar.setX(moveX));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 25 && car == 2)
      for (int i = 360; i >= 238; i--) {
        int moveX = i;
        Platform.runLater(() -> greenCar.setX(moveX));
        try {
          threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 27 && car == 7)
      for (int i = 0; i <= 80; i++) {
        int moveY = i;
        Platform.runLater(() -> purpleCar.setX(moveY));
        try {
          threadPurpleCar.sleep((int) (10 / purpleSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 34 && car == 3)
      for (int i = 0; i <= 90; i++) {
        int moveX = i;
        Platform.runLater(() -> orangeCar.setX(moveX));
        try {
          threadOrangeCar.sleep((int) (10 / orangeSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 35 && car == 1)
      for (int i = -490; i <= -410; i++) {
        int moveX = i;
        Platform.runLater(() -> redCar.setX(moveX));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 35 && car == 3)
      for (int i = 90; i <= 206; i++) {
        int moveX = i;
        Platform.runLater(() -> orangeCar.setX(moveX));
        try {
          threadOrangeCar.sleep((int) (10 / orangeSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 36 && car == 3)
      for (int i = 206; i <= 332; i++) {
        int moveX = i;
        Platform.runLater(() -> orangeCar.setX(moveX));
        try {
          threadOrangeCar.sleep((int) (10 / orangeSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (car == 5 && street == 36) {
      for (int i = 0; i <= 80; i++) {
        int moveX = i;
        Platform.runLater(() -> yellowCar.setX(moveX));
        try {
          threadYellowCar.sleep((int) (10 / yellowSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    }
    if (street == 37 && car == 1)
      for (int i = -248; i <= -175; i++) {
        int moveX = i;
        Platform.runLater(() -> redCar.setX(moveX));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 37 && car == 3)
      for (int i = 332; i <= 440; i++) {
        int moveX = i;
        Platform.runLater(() -> orangeCar.setX(moveX));
        try {
          threadOrangeCar.sleep((int) (10 / orangeSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (car == 5 && street == 37) {
      for (int i = 110; i <= 225; i++) {
        int moveX = i;
        Platform.runLater(() -> yellowCar.setX(moveX));
        try {
          threadYellowCar.sleep((int) (10 / yellowSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    }
    if (street == 38 && car == 3)
      for (int i = 455; i <= 570; i++) {
        int moveX = i;
        Platform.runLater(() -> orangeCar.setX(moveX));
        try {
          threadOrangeCar.sleep((int) (10 / orangeSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 38 && car == 7)
      for (int i = 120; i >= 40; i--) {
        int moveY = i;
        Platform.runLater(() -> purpleCar.setX(moveY));
        try {
          threadPurpleCar.sleep((int) (10 / purpleSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 34 && car == 7) {
      for (int i = -365; i >= -445; i--) {
        int moveX = i;
        Platform.runLater(() -> purpleCar.setX(moveX));
        try {
          threadPurpleCar.sleep((int) (10 / purpleSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    }
    if (car == 5 && street == 38) {
      for (int i = 225; i <= 330; i++) {
        int moveX = i;
        Platform.runLater(() -> yellowCar.setX(moveX));
        try {
          threadYellowCar.sleep((int) (10 / yellowSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    }
    if (street == 57 && car == 1)
      for (int i = -617; i <= -530; i++) {
        int moveX = i;
        Platform.runLater(() -> redCar.setX(moveX));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 57 && car == 3) {
      for (int i = 108; i >= 0; i--) {
        int moveX = i;
        Platform.runLater(() -> orangeCar.setX(moveX));
        try {
          threadOrangeCar.sleep((int) (10 / orangeSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    }
    if (street == 57 && car == 2)
      for (int i = 155; i >= -5; i--) {
        int moveX = i;
        Platform.runLater(() -> greenCar.setX(moveX));
        try {
          threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 58 && car == 3) {
      for (int i = 240; i >= 155; i--) {
        int moveX = i;
        Platform.runLater(() -> orangeCar.setX(moveX));
        try {
          threadOrangeCar.sleep((int) (10 / orangeSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    }
    if (street == 58 && car == 4) {
      for (int i = -250; i <= -165; i++) {
        int moveX = i;
        Platform.runLater(() -> blueCar.setX(moveX));
        try {
          threadBlueCar.sleep((int) (10 / blueSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    }
    if (street == 58 && car == 7) {
      for (int i = -240; i >= -325; i--) {
        int moveX = i;
        Platform.runLater(() -> purpleCar.setX(moveX));
        try {
          threadPurpleCar.sleep((int) (10 / purpleSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    }
    if (street == 59 && car == 7) {
      for (int i = -115; i >= -240; i--) {
        int moveX = i;
        Platform.runLater(() -> purpleCar.setX(moveX));
        try {
          threadPurpleCar.sleep((int) (10 / purpleSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    }
    if (street == 59 && car == 4) {
      for (int i = -125; i <= 0; i++) {
        int moveX = i;
        Platform.runLater(() -> blueCar.setX(moveX));
        try {
          threadBlueCar.sleep((int) (10 / blueSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    }
    if (street == 58 && car == 2) {
      for (int i = 238; i >= 155; i--) {
        int moveX = i;
        Platform.runLater(() -> greenCar.setX(moveX));
        try {
          threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    }
    if (street == 59 && car == 5)
      for (int i = 95; i >= 35; i--) {
        int moveX = i;
        Platform.runLater(() -> yellowCar.setX(moveX));
        try {
          threadYellowCar.sleep((int) (10 / yellowSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 59 && car == 6)
      for (int i = -245; i <= -125; i++) {
        int moveX = i;
        Platform.runLater(() -> cyanCar.setX(moveX));
        try {
          threadCyanCar.sleep((int) (10 / cyanSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 59 && car == 3)
      for (int i = 360; i >= 240; i--) {
        int moveX = i;
        Platform.runLater(() -> orangeCar.setX(moveX));
        try {
          threadOrangeCar.sleep((int) (10 / orangeSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 60 && car == 6)
      for (int i = -125; i <= -40; i++) {
        int moveX = i;
        Platform.runLater(() -> cyanCar.setX(moveX));
        try {
          threadCyanCar.sleep((int) (10 / cyanSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 60 && car == 7) {
      for (int i = 0; i >= -75; i--) {
        int moveX = i;
        Platform.runLater(() -> purpleCar.setX(moveX));
        try {
          threadPurpleCar.sleep((int) (10 / purpleSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    }
    if (street == 60 && car == 5)
      for (int i = 220; i >= 95; i--) {
        int moveX = i;
        Platform.runLater(() -> yellowCar.setX(moveX));
        try {
          threadYellowCar.sleep((int) (10 / yellowSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 60 && car == 2)
      for (int i = 470; i >= 360; i--) {
        int moveX = i;
        Platform.runLater(() -> greenCar.setX(moveX));
        try {
          threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 60 && car == 3)
      for (int i = 470; i >= 400; i--) {
        int moveX = i;
        Platform.runLater(() -> orangeCar.setX(moveX));
        try {
          threadOrangeCar.sleep((int) (10 / orangeSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 61 && car == 1)
      for (int i = -110; i <= 0; i++) {
        int moveX = i;
        Platform.runLater(() -> redCar.setX(moveX));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 61 && car == 2)
      for (int i = 607; i >= 530; i--) {
        int moveX = i;
        Platform.runLater(() -> greenCar.setX(moveX));
        try {
          threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 61 && car == 3)
      for (int i = 607; i >= 525; i--) {
        int moveX = i;
        Platform.runLater(() -> orangeCar.setX(moveX));
        try {
          threadOrangeCar.sleep((int) (10 / orangeSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 61 && car == 5)
      for (int i = 365; i >= 285; i--) {
        int moveX = i;
        Platform.runLater(() -> yellowCar.setX(moveX));
        try {
          threadYellowCar.sleep((int) (10 / yellowSlider.getValue()));
        } catch (InterruptedException e) {
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
    if (car == 3) {
      orangeCar.setRotate(rotation);
    }
    if (car == 4) {
      blueCar.setRotate(rotation);
    }
    if (car == 5) {
      yellowCar.setRotate(rotation);
    }
    if (car == 6) {
      cyanCar.setRotate(rotation);
    }
    if (car == 7) {
      purpleCar.setRotate(rotation);
    }
    if (car == 8) {
      blackCar.setRotate(rotation);
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
    this.tOrangeCar = new threadOrangeCar();
    tOrangeCar.setController(this);
    tOrangeCar.start();
    this.tBlueCar = new threadBlueCar();
    tBlueCar.setController(this);
    tBlueCar.start();
    this.tYellowCar = new threadYellowCar();
    tYellowCar.setController(this);
    tYellowCar.start();
    this.tCyanCar = new threadCyanCar();
    tCyanCar.setController(this);
    tCyanCar.start();
    this.tPurpleCar = new threadPurpleCar();
    tPurpleCar.setController(this);
    tPurpleCar.start();
    this.tBlackCar = new threadBlackCar();
    tBlackCar.setController(this);
    tBlackCar.start();
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
    pauseOrange.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        if (isLockedOrange == 0) {
          tOrangeCar.suspend();
          isLockedOrange = 1;
        } else {
          tOrangeCar.resume();
          isLockedOrange = 0;
        }
      }
    });
    pauseBlue.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        if (isLockedBlue == 0) {
          tBlueCar.suspend();
          isLockedBlue = 1;
        } else {
          tBlueCar.resume();
          isLockedBlue = 0;
        }
      }
    });
    pauseYellow.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        if (isLockedYellow == 0) {
          tYellowCar.suspend();
          isLockedYellow = 1;
        } else {
          tYellowCar.resume();
          isLockedYellow = 0;
        }
      }
    });
    pauseCyan.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        if (isLockedCyan == 0) {
          tCyanCar.suspend();
          isLockedCyan = 1;
        } else {
          tCyanCar.resume();
          isLockedCyan = 0;
        }
      }
    });
    pausePurple.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        if (isLockedPurple == 0) {
          tPurpleCar.suspend();
          isLockedPurple = 1;
        } else {
          tPurpleCar.resume();
          isLockedPurple = 0;
        }
      }
    });
    pauseBlack.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        if (isLockedBlack == 0) {
          tBlackCar.suspend();
          isLockedBlack = 1;
        } else {
          tBlackCar.resume();
          isLockedBlack = 0;
        }
      }
    });

    // Inicializando os semaforos ja travados (os carros darão apenas release)

    setSemaphoreRed();
  }

  @FXML
  void restartButton(ActionEvent event) {

    // Parando as threads

    tRedCar.stop();
    tGreenCar.stop();
    tOrangeCar.stop();
    tBlueCar.stop();
    tYellowCar.stop();
    tCyanCar.stop();
    tPurpleCar.stop();
    tBlackCar.stop();

    // Resetando o valor dos sliders

    redSlider.setValue(1);
    greenSlider.setValue(1);
    orangeSlider.setValue(1);
    blueSlider.setValue(1);
    yellowSlider.setValue(1);
    cyanSlider.setValue(1);
    purpleSlider.setValue(1);
    blackSlider.setValue(1);

    // Reinstanciando as threads

    this.tRedCar = new threadRedCar();
    this.tGreenCar = new threadGreenCar();
    this.tOrangeCar = new threadOrangeCar();
    this.tBlueCar = new threadBlueCar();
    this.tYellowCar = new threadYellowCar();
    this.tCyanCar = new threadCyanCar();
    this.tPurpleCar = new threadPurpleCar();
    this.tBlackCar = new threadBlackCar();

    // Invocando o metodo que seta os controllers

    setController();

    // Setando os semaforos novamente (travando)

    this.colision01 = new Semaphore(1);
    this.colision02 = new Semaphore(1);
    this.colision03 = new Semaphore(1);
    this.colision04 = new Semaphore(1);
    this.colision05 = new Semaphore(1);
    this.colision06 = new Semaphore(1);
    this.colision07 = new Semaphore(1);
    this.colision08 = new Semaphore(1);
    this.colision09 = new Semaphore(1);
    this.colision10 = new Semaphore(1);
    this.colision11 = new Semaphore(1);
    this.colision12 = new Semaphore(1);
    this.colision13 = new Semaphore(1);
    this.colision14 = new Semaphore(1);
    this.colision15 = new Semaphore(1);
    this.colision16 = new Semaphore(1);
    this.colision17 = new Semaphore(1);
    this.colision18 = new Semaphore(1);
    this.colision19 = new Semaphore(1);
    this.colision20 = new Semaphore(1);
    this.colision21 = new Semaphore(1);
    this.colision22 = new Semaphore(1);
    this.colision23 = new Semaphore(1);
    this.colision24 = new Semaphore(1);
    this.colision25 = new Semaphore(1);
    this.colision26 = new Semaphore(1);
    this.colision27 = new Semaphore(1);
    this.colision28 = new Semaphore(1);
    this.colision29 = new Semaphore(1);
    this.colision30 = new Semaphore(1);
    this.colision31 = new Semaphore(1);
    this.colision32 = new Semaphore(1);
    this.colision33 = new Semaphore(1);
    this.colision34 = new Semaphore(1);
    this.colision35 = new Semaphore(1);
    this.colision36 = new Semaphore(1);
    this.colision37 = new Semaphore(1);
    this.colision38 = new Semaphore(1);
    this.colision39 = new Semaphore(1);
    this.colision40 = new Semaphore(1);
    this.colision41 = new Semaphore(1);
    this.colision42 = new Semaphore(1);
    this.colision43 = new Semaphore(1);
    this.colision44 = new Semaphore(1);
    this.colision45 = new Semaphore(1);
    this.colision46 = new Semaphore(1);
    this.colision47 = new Semaphore(1);
    this.colision48 = new Semaphore(1);
    this.colision49 = new Semaphore(1);
    this.colision50 = new Semaphore(1);
    this.colision51 = new Semaphore(1);
    this.colision52 = new Semaphore(1);
    this.colision53 = new Semaphore(1);
    this.colision54 = new Semaphore(1);
    this.colision55 = new Semaphore(1);
    this.colision56 = new Semaphore(1);
    this.colision57 = new Semaphore(1);
    this.colision58 = new Semaphore(1);
    this.colision59 = new Semaphore(1);
    this.colision60 = new Semaphore(1);
    this.colision61 = new Semaphore(1);
    this.colision62 = new Semaphore(1);
    this.colision63 = new Semaphore(1);

    // Resetando os acquire dos semaforos

    setSemaphoreRed();

    // Resetando as posicoes dos carros

    resetRoute();

    // Startando todas as threads novamente

    tRedCar.start();
    tGreenCar.start();
    tOrangeCar.start();
    tBlueCar.start();
    tYellowCar.start();
    tCyanCar.start();
    tPurpleCar.start();
    tBlackCar.start();
  }

  public void setController() {
    tRedCar.setController(this);
    tGreenCar.setController(this);
    tOrangeCar.setController(this);
    tBlueCar.setController(this);
    tYellowCar.setController(this);
    tCyanCar.setController(this);
    tPurpleCar.setController(this);
    tBlackCar.setController(this);
  }

  // Metodos que corrigem os movimentos pos cruzamento

  public void correctMoveY(int street, int car) {
    if (car == 1 && street == 54) {
      for (int i = -30; i <= 10; i++) {
        int moveY = i;
        Platform.runLater(() -> redCar.setY(moveY));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    }
    if (street == 28 && car == 1)
      for (int i = -270; i <= -255; i++) {
        int moveY = i;
        if (car == 1) {
          Platform.runLater(() -> redCar.setY(moveY));
          try {
            threadRedCar.sleep((int) (10 / redSlider.getValue()));
          } catch (InterruptedException e) {
          }
        }
      }
    if (street == 54 && car == 7)
      for (int i = -40; i <= 0; i++) {
        int moveY = i;
        Platform.runLater(() -> purpleCar.setY(moveY));
        try {
          threadPurpleCar.sleep((int) (10 / purpleSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 40 && car == 7)
      for (int i = -185; i >= -230; i--) {
        int moveY = i;
        Platform.runLater(() -> purpleCar.setY(moveY));
        try {
          threadPurpleCar.sleep((int) (10 / purpleSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 7 && car == 7)
      for (int i = -530; i >= -575; i--) {
        int moveY = i;
        Platform.runLater(() -> purpleCar.setY(moveY));
        try {
          threadPurpleCar.sleep((int) (10 / purpleSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 32 && car == 6)
      for (int i = 270; i >= 235; i--) {
        int moveY = i;
        Platform.runLater(() -> cyanCar.setY(moveY));
        try {
          threadCyanCar.sleep((int) (10 / cyanSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 42 && car == 2)
      for (int i = 375; i >= 330; i--) {
        int moveY = i;
        Platform.runLater(() -> greenCar.setY(moveY));
        try {
          threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (car == 6 && street == 30) {
      for (int i = 305; i <= 340; i++) {
        int moveY = i;
        Platform.runLater(() -> cyanCar.setY(moveY));
        try {
          threadCyanCar.sleep((int) (10 / cyanSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    }
    if (street == 33 && car == 7)
      for (int i = -270; i <= -230; i++) {
        int moveY = i;
        Platform.runLater(() -> purpleCar.setY(moveY));
        try {
          threadPurpleCar.sleep((int) (10 / purpleSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 10 && car == 6)
      for (int i = 35; i >= 0; i--) {
        int moveY = i;
        Platform.runLater(() -> cyanCar.setY(moveY));
        try {
          threadCyanCar.sleep((int) (10 / cyanSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 42 && car == 4)
      for (int i = 390; i >= 340; i--) {
        int moveY = i;
        Platform.runLater(() -> blueCar.setY(moveY));
        try {
          threadBlueCar.sleep((int) (10 / blueSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 30 && car == 2)
      for (int i = 310; i <= 349; i++) {
        int moveY = i;
        Platform.runLater(() -> greenCar.setY(moveY));
        try {
          threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 41 && car == 5)
      for (int i = 40; i >= 0; i--) {
        int moveY = i;
        Platform.runLater(() -> yellowCar.setY(moveY));
        try {
          threadYellowCar.sleep((int) (10 / yellowSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (car == 1 && street == 8) {
      for (int i = -525; i >= -565; i--) {
        int moveY = i;
        Platform.runLater(() -> redCar.setY(moveY));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    }
    if (car == 2 && street == 52) {
      for (int i = 540; i <= 575; i++) {
        int moveY = i;
        Platform.runLater(() -> greenCar.setY(moveY));
        try {
          threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    }
    if (car == 1 && street == 40) {
      for (int i = -195; i >= -215; i--) {
        int moveY = i;
        Platform.runLater(() -> redCar.setY(moveY));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    }
    if (car == 3 && street == 39) {
      for (int i = 35; i >= 0; i--) {
        int moveY = i;
        Platform.runLater(() -> orangeCar.setY(moveY));
        try {
          threadOrangeCar.sleep((int) (10 / orangeSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    }
    if (car == 1 && street == 31) {
      for (int i = -260; i <= -220; i++) {
        int moveY = i;
        Platform.runLater(() -> redCar.setY(moveY));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    }
    if (street == 29 && car == 4)
      for (int i = 290; i <= 320; i++) {
        int moveY = i;
        Platform.runLater(() -> blueCar.setY(moveY));
        try {
          threadBlueCar.sleep((int) (10 / blueSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 51 && car == 4)
      for (int i = 535; i <= 575; i++) {
        int moveY = i;
        Platform.runLater(() -> blueCar.setY(moveY));
        try {
          threadBlueCar.sleep((int) (10 / blueSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
  }

  // Metodo que corrige o movimento no eixo X apos cruzamento

  public void correctMoveX(int street, int car) {
    if (street == 4 && car == 1)
      for (int i = -205; i >= -250; i--) {
        int moveX = i;
        Platform.runLater(() -> redCar.setX(moveX));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 2 && car == 2) {
      for (int i = 195; i <= 240; i++) {
        int moveX = i;
        Platform.runLater(() -> greenCar.setX(moveX));
        try {
          threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    }
    if (street == 38 && car == 7)
      for (int i = 40; i >= 0; i--) {
        int moveY = i;
        Platform.runLater(() -> purpleCar.setX(moveY));
        try {
          threadPurpleCar.sleep((int) (10 / purpleSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 37 && car == 1)
      for (int i = -175; i <= -127; i++) {
        int moveX = i;
        Platform.runLater(() -> redCar.setX(moveX));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 58 && car == 7) {
      for (int i = -325; i >= -365; i--) {
        int moveX = i;
        Platform.runLater(() -> purpleCar.setX(moveX));
        try {
          threadPurpleCar.sleep((int) (10 / purpleSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    }
    if (street == 2 && car == 7) {
      for (int i = -285; i <= -240; i++) {
        int moveX = i;
        Platform.runLater(() -> purpleCar.setX(moveX));
        try {
          threadPurpleCar.sleep((int) (10 / purpleSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    }
    if (street == 34 && car == 7) {
      for (int i = -445; i >= -490; i--) {
        int moveX = i;
        Platform.runLater(() -> purpleCar.setX(moveX));
        try {
          threadPurpleCar.sleep((int) (10 / purpleSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    }
    if (street == 60 && car == 7) {
      for (int i = -75; i >= -115; i--) {
        int moveX = i;
        Platform.runLater(() -> purpleCar.setX(moveX));
        try {
          threadPurpleCar.sleep((int) (10 / purpleSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    }
    if (street == 61 && car == 3)
      for (int i = 525; i >= 470; i--) {
        int moveX = i;
        Platform.runLater(() -> orangeCar.setX(moveX));
        try {
          threadOrangeCar.sleep((int) (10 / orangeSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 57 && car == 1)
      for (int i = -530; i <= -490; i++) {
        int moveX = i;
        Platform.runLater(() -> redCar.setX(moveX));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 60 && car == 6)
      for (int i = -40; i <= 0; i++) {
        int moveX = i;
        Platform.runLater(() -> cyanCar.setX(moveX));
        try {
          threadCyanCar.sleep((int) (10 / cyanSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (car == 6 && street == 19) {
      for (int i = 190; i <= 225; i++) {
        int moveY = i;
        Platform.runLater(() -> cyanCar.setY(moveY));
        try {
          threadCyanCar.sleep((int) (10 / cyanSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    }
    if (street == 23 && car == 7) {
      for (int i = -410; i <= -365; i++) {
        int moveX = i;
        Platform.runLater(() -> purpleCar.setX(moveX));
        try {
          threadPurpleCar.sleep((int) (10 / purpleSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    }
    if (street == 27 && car == 7)
      for (int i = 80; i <= 120; i++) {
        int moveY = i;
        Platform.runLater(() -> purpleCar.setX(moveY));
        try {
          threadPurpleCar.sleep((int) (10 / purpleSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 5 && car == 1)
      for (int i = -85; i >= -110; i--) {
        int moveX = i;
        Platform.runLater(() -> redCar.setX(moveX));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 4 && car == 6)
      for (int i = -85; i >= -125; i--) {
        int moveX = i;
        Platform.runLater(() -> cyanCar.setX(moveX));
        try {
          threadCyanCar.sleep((int) (10 / cyanSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 60 && car == 3)
      for (int i = 400; i >= 360; i--) {
        int moveX = i;
        Platform.runLater(() -> orangeCar.setX(moveX));
        try {
          threadOrangeCar.sleep((int) (10 / orangeSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (car == 5 && street == 36) {
      for (int i = 80; i <= 110; i++) {
        int moveX = i;
        Platform.runLater(() -> yellowCar.setX(moveX));
        try {
          threadYellowCar.sleep((int) (10 / yellowSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    }
    if (car == 5 && street == 38) {
      for (int i = 330; i <= 360; i++) {
        int moveX = i;
        Platform.runLater(() -> yellowCar.setX(moveX));
        try {
          threadYellowCar.sleep((int) (10 / yellowSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    }
    if (car == 1 && street == 35) {
      for (int i = -410; i <= -370; i++) {
        int moveX = i;
        Platform.runLater(() -> redCar.setX(moveX));
        try {
          threadRedCar.sleep((int) (10 / redSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    }
    if (car == 3 && street == 38) {
      for (int i = 570; i <= 604; i++) {
        int moveX = i;
        Platform.runLater(() -> orangeCar.setX(moveX));
        try {
          threadOrangeCar.sleep((int) (10 / orangeSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    }
    if (street == 58 && car == 3) {
      for (int i = 155; i >= 108; i--) {
        int moveX = i;
        Platform.runLater(() -> orangeCar.setX(moveX));
        try {
          threadOrangeCar.sleep((int) (10 / orangeSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    }
    if (street == 59 && car == 5)
      for (int i = 30; i >= 0; i--) {
        int moveX = i;
        Platform.runLater(() -> yellowCar.setX(moveX));
        try {
          threadYellowCar.sleep((int) (10 / yellowSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 58 && car == 4) {
      for (int i = -165; i <= -125; i++) {
        int moveX = i;
        Platform.runLater(() -> blueCar.setX(moveX));
        try {
          threadBlueCar.sleep((int) (10 / blueSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    }
    if (street == 61 && car == 5)
      for (int i = 285; i >= 220; i--) {
        int moveX = i;
        Platform.runLater(() -> yellowCar.setX(moveX));
        try {
          threadYellowCar.sleep((int) (10 / yellowSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
    if (street == 61 && car == 2)
      for (int i = 530; i >= 470; i--) {
        int moveX = i;
        Platform.runLater(() -> greenCar.setX(moveX));
        try {
          threadGreenCar.sleep((int) (10 / greenSlider.getValue()));
        } catch (InterruptedException e) {
        }
      }
  }

  // Metodo que controla os acquire dos semaforos para melhor organização do
  // codigo

  public void semaphoreControl(int colision) {
    try {
      if (colision == 1) {
        colision01.acquire();
      }
      if (colision == 2) {
        colision02.acquire();
      }
      if (colision == 3) {
        colision03.acquire();
      }
      if (colision == 4) {
        colision04.acquire();
      }
      if (colision == 5) {
        colision05.acquire();
      }
      if (colision == 6) {
        colision06.acquire();
      }
      if (colision == 7) {
        colision07.acquire();
      }
      if (colision == 8) {
        colision08.acquire();
      }
      if (colision == 9) {
        colision09.acquire();
      }
      if (colision == 10) {
        colision10.acquire();
      }
      if (colision == 11) {
        colision11.acquire();
      }
      if (colision == 12) {
        colision12.acquire();
      }
      if (colision == 13) {
        colision13.acquire();
      }
      if (colision == 14) {
        colision14.acquire();
      }
      if (colision == 15) {
        colision15.acquire();
      }
      if (colision == 16) {
        colision16.acquire();
      }
      if (colision == 17) {
        colision17.acquire();
      }
      if (colision == 18) {
        colision18.acquire();
      }
      if (colision == 19) {
        colision19.acquire();
      }
      if (colision == 20) {
        colision20.acquire();
      }
      if (colision == 21) {
        colision21.acquire();
      }
      if (colision == 22) {
        colision22.acquire();
      }
      if (colision == 23) {
        colision23.acquire();
      }
      if (colision == 24) {
        colision24.acquire();
      }
      if (colision == 25) {
        colision25.acquire();
      }
      if (colision == 26) {
        colision26.acquire();
      }
      if (colision == 27) {
        colision27.acquire();
      }
      if (colision == 28) {
        colision28.acquire();
      }
      if (colision == 29) {
        colision29.acquire();
      }
      if (colision == 30) {
        colision30.acquire();
      }
      if (colision == 31) {
        colision31.acquire();
      }
      if (colision == 32) {
        colision32.acquire();
      }
      if (colision == 33) {
        colision33.acquire();
      }
      if (colision == 34) {
        colision34.acquire();
      }
      if (colision == 35) {
        colision35.acquire();
      }
      if (colision == 36) {
        colision36.acquire();
      }
      if (colision == 37) {
        colision37.acquire();
      }
      if (colision == 38) {
        colision38.acquire();
      }
      if (colision == 39) {
        colision39.acquire();
      }
      if (colision == 40) {
        colision40.acquire();
      }
      if (colision == 41) {
        colision41.acquire();
      }
      if (colision == 42) {
        colision42.acquire();
      }
      if (colision == 43) {
        colision43.acquire();
      }
      if (colision == 44) {
        colision44.acquire();
      }
      if (colision == 45) {
        colision45.acquire();
      }
      if (colision == 46) {
        colision46.acquire();
      }
      if (colision == 47) {
        colision47.acquire();
      }
      if (colision == 48) {
        colision48.acquire();
      }
      if (colision == 49) {
        colision49.acquire();
      }
      if (colision == 50) {
        colision50.acquire();
      }
      if (colision == 51) {
        colision51.acquire();
      }
      if (colision == 52) {
        colision52.acquire();
      }
      if (colision == 53) {
        colision53.acquire();
      }
      if (colision == 54) {
        colision54.acquire();
      }
      if (colision == 55) {
        colision55.acquire();
      }
      if (colision == 56) {
        colision56.acquire();
      }
      if (colision == 57) {
        colision57.acquire();
      }
      if (colision == 58) {
        colision58.acquire();
      }
      if (colision == 59) {
        colision59.acquire();
      }
      if (colision == 60) {
        colision60.acquire();
      }
      if (colision == 61) {
        colision61.acquire();
      }
      if (colision == 62) {
        colision62.acquire();
      }
      if (colision == 63) {
        colision63.acquire();
      }
    } catch (InterruptedException e) {
    }
  }

  // Metodo que seta todos os semaforos para nao permitirem o primeiro acquire

  public void setSemaphoreRed() {
    try {
      colision01.acquire();
      colision02.acquire();
      colision03.acquire();
      colision04.acquire();
      colision05.acquire();
      colision06.acquire();
      // colision07.acquire() não é preciso ser inicializado pois o semaforo é
      // liberado pra quem chega
      // primeiro, sem prioridade
      colision08.acquire();
      colision09.acquire();
      colision10.acquire();
      colision11.acquire();
      colision12.acquire();
      colision13.acquire();
      // colision14.acquire() não é preciso ser inicializado pois o semaforo é
      // liberado pra quem chega
      // primeiro, sem prioridade
      colision15.acquire();
      colision16.acquire();
      colision17.acquire();
      colision18.acquire();
      colision19.acquire();
      colision20.acquire();
      colision21.acquire();
      colision22.acquire();
      colision23.acquire();
      colision24.acquire();
      colision25.acquire();
      colision26.acquire();
      colision27.acquire();
      colision28.acquire();
      // colision29.acquire() não é preciso ser inicializado pois o semaforo é
      // liberado pra quem chega
      // primeiro, sem prioridade
      colision30.acquire();
      colision31.acquire();
      colision32.acquire();
      colision33.acquire();
      colision34.acquire();
      colision35.acquire();
      colision36.acquire();
      // colision37.acquire() não é preciso ser inicializado pois o semaforo é
      // liberado pra quem chega
      // primeiro, sem prioridade
      colision38.acquire();
      // colision39.acquire() não é preciso ser inicializado pois o semaforo é
      // liberado pra quem chega
      // primeiro, sem prioridade
      // colision40.acquire() não é preciso ser inicializado pois o semaforo é
      // liberado pra quem chega
      // primeiro, sem prioridade
      colision41.acquire();
      // colision42.acquire() não é preciso ser inicializado pois o semaforo é
      // liberado pra quem chega
      // primeiro, sem prioridade
      // colision43.acquire() não é preciso ser inicializado pois o semaforo é
      // liberado pra quem chega
      // primeiro, sem prioridade
      colision44.acquire();
      colision45.acquire();
      colision46.acquire();
      colision47.acquire();
      colision48.acquire();
      // colision49.acquire() não é preciso ser inicializado pois o semaforo é
      // liberado pra quem chega
      // primeiro, sem prioridade
      colision50.acquire();
      colision51.acquire();
      colision52.acquire();
      colision53.acquire();
      colision54.acquire();
      colision55.acquire();
      colision56.acquire();
      colision57.acquire();
      colision58.acquire();
      // colision59.acquire() não é preciso ser inicializado pois o semaforo é
      // liberado pra quem chega
      // primeiro, sem prioridade
      colision60.acquire();
      colision61.acquire();
      colision62.acquire();
      colision63.acquire();
    } catch (InterruptedException e) {
    }
  }

  // Botao que reseta as posicoes

  public void resetRoute() {
    redCar.setX(0);
    redCar.setY(0);
    greenCar.setX(0);
    greenCar.setY(0);
    orangeCar.setX(0);
    orangeCar.setY(0);
    blueCar.setX(0);
    blueCar.setY(0);
    yellowCar.setX(0);
    yellowCar.setY(0);
    cyanCar.setX(0);
    cyanCar.setY(0);
    purpleCar.setX(0);
    purpleCar.setY(0);
    blackCar.setX(0);
    blackCar.setY(0);
  }
}