package threads;

import control.*;

public class threadYellowCar extends Thread {
  // Instanciando o controller
  mainController controller = new mainController();

  // Metodo que define o controller da thread
  public void setController(mainController controller) {
    this.controller = controller;
  }

  public void run() {
    while (true) {
      // PERCORRENDO RUA 36
      controller.rotate(5, 90);
      controller.moveX(36, 5, 1);
      // COLISAO 07 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(7);
      controller.correctMoveX(36, 5);
      // PERCORRENDO RUA 37
      controller.moveX(37, 5, 1);
      // COLISAO 29 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(29);
      // COLISAO 37 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(37);
      // LIBERANDO SEMAFORO DA COLISAO 45
      controller.colision45.release();
      // PERCORRENDO RUA 38
      controller.moveX(38, 5, 1);
      // LIBERANDO SEMAFORO DA COLISAO 29
      controller.colision29.release();
      // LIBERANDO SEMAFORO DA COLISAO 37
      controller.colision37.release();
      // LIBERANDO SEMAFORO DA COLISAO 07
      controller.colision07.release();
      // COLISAO 23 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(23);
      // COLISAO 24 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(24);
      controller.correctMoveX(38, 5);
      // PERCORRENDO RUA 44
      controller.rotate(5, 180);
      controller.moveY(44, 5);
      // LIBERANDO SEMAFORO DA COLISAO 47
      controller.colision47.release();
      // PERCORRNEDO RUA 55
      controller.moveY(55, 5);
      // PERCORRENDO RUA 61
      controller.rotate(5, -90);
      controller.moveX(61, 5, 1);
      // COLISAO 36 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(36);
      controller.correctMoveX(61, 5);
      // PERCORRENDO RUA 60
      controller.moveX(60, 5, 1);
      // PERCORRENDO RUA 59
      controller.moveX(59, 5, 1);
      // LIBERANDO SEMAFORO DA COLISAO 25
      controller.colision25.release();
      // COLISAO 26 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(26);
      controller.correctMoveX(59, 5);
      // PERCORRENDO RUA 52
      controller.rotate(5, 360);
      controller.moveY(52, 5);
      // LIBERANDO SEMAFORO DA COLISAO 48
      controller.colision48.release();
      // PERCORRENDO RUA 41
      controller.moveY(41, 5);
      // LIBERANDO SEMAFORO DA COLISAO 28
      controller.colision28.release();
      // COLISAO 27 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(27);
      controller.correctMoveY(41, 5);
    }
  }
}