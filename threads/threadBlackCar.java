package threads;

import control.*;

public class threadBlackCar extends Thread {
  // Instanciando o controller
  mainController controller = new mainController();

  // Metodo que define o controller da thread
  public void setController(mainController controller) {
    this.controller = controller;
  }

  @Override
  public void run() {
    while (true) {
      // PERCORRENDO RUA 12
      controller.rotate(8, 90);
      controller.moveX(12, 8);
      // PERCORRENDO RUA 13
      controller.moveX(13, 8);
      // LIBERANDO SEMAFORO DA COLISAO 65
      controller.colision65.release();
      // COLISAO 64 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(64);
      controller.correctMoveX(13, 8);
      // PERCORRENDO RUA 8
      controller.rotate(8, 360);
      controller.moveY(8, 8);
      // PERCORRENDO RUA 3
      controller.rotate(8, 90);
      controller.moveX(3, 8);
      // PERCORRENDO RUA 9
      controller.rotate(8, 180);
      controller.moveY(9, 8);
      // PERCORRENDO RUA 15
      controller.rotate(8, 90);
      controller.moveX(15, 8);
      // PERCORRENDO RUA 16
      controller.moveX(16, 8);
      // COLISAO 67 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(67);
      controller.correctMoveX(16, 8);
      // PERCORRENDO RUA 22
      controller.rotate(8, 180);
      controller.moveY(22, 8);
      // PERCORRENDO RUA 33
      controller.moveY(33, 8);
      // COLISAO 66 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(66);
      controller.correctMoveY(33, 8);
      // PERCORRENDO RUA 44
      controller.moveY(44, 8);
      // PERCORRENDO RUA 49
      controller.rotate(8, -90);
      controller.moveX(49, 8);
      // PERCORRENDO RUA 48
      controller.moveX(48, 8);
      // PERCORRENDO RUA 53
      controller.rotate(8, 180);
      controller.moveY(53, 8);
      // COLISAO 68 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(68);
      controller.correctMoveY(53, 8);
      // PERCORRENDO RUA 59
      controller.rotate(8, -90);
      controller.moveX(59, 8);
      // PERCORRENDO RUA 52
      controller.rotate(8, 360);
      controller.moveY(52, 8);
      // PERCORRENDO RUA 46
      controller.rotate(8, -90);
      controller.moveX(46, 8);
      // PERCORRENDO RUA 45
      controller.moveX(45, 8);
      // PERCORRENDO RUA 39
      controller.rotate(8, 360);
      controller.moveY(39, 8);
      // PERCORRENDO RUA 28
      controller.moveY(28, 8);
      // PERCORRENDO RUA 17
      controller.moveY(17, 8);
    }
  }
}
