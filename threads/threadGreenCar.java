package threads;

import control.*;

public class threadGreenCar extends Thread {
  // Instanciando o controller
  mainController controller = new mainController();

  // Metodo que define o controller da thread
  public void setController(mainController controller) {
    this.controller = controller;
  }

  @Override
  public void run() {
    while (true) {
      // PERCORRENDO RUA 1
      controller.rotate(2, 90);
      controller.moveX(1, 2, 0);
      // COLISAO 15 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(15);
      // PERCORRENDO RUA 2
      controller.moveX(2, 2, 0);
      // COLISAO 44 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(44);
      controller.correctMoveX(2, 2);
      // PERCORRENDO RUA 3
      controller.moveX(3, 2, 0);
      // LIBERANDO O SEMAFORO DA COLISÃO 02
      controller.colision02.release();
      // PERCORRENDO RUA 4
      // COLISÃO 01 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(1);
      controller.moveX(4, 2, 0);
      // PERCORRENDO RUA 5
      controller.moveX(5, 2, 0);
      // LIBERANDO SEMAFORO DA COLISAO 33
      controller.colision33.release();
      // PERCORRENDO RUA 11
      controller.rotate(2, 180);
      controller.moveY(11, 2, 1);
      // PERCORRENDO RUA 22
      controller.moveY(22, 2, 1);
      // PERCORRENDO RUA 33
      controller.moveY(33, 2, 1);
      // PERCORRENDO RUA 44
      controller.moveY(44, 2, 1);
      // PERCORRENDO RUA 55
      controller.moveY(55, 2, 1);
      // PERCORRENDO RUA 61
      controller.rotate(2, -90);
      controller.moveX(61, 2, 1);
      // COLISAO 46 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(46);
      controller.correctMoveX(61, 2);
      // PERCORRENDO RUA 60
      controller.moveX(60, 2, 1);
      // PERCORRENDO RUA 53
      controller.rotate(2, 360);
      controller.moveY(53, 2, 1);
      // LIBERANDO SEMAFORO DA COLISAO 08
      controller.colision08.release();
      // LIBERANDO SEMAFORO DA COLISAO 24
      controller.colision24.release();
      // PERCORRENDO RUA 42
      controller.moveY(42, 2, 1);
      // COLISAO 12 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(12);
      controller.correctMoveY(42, 2);
      // PERCORRENDO RUA 31
      controller.moveY(31, 2, 1);
      // PERCORRENDO RUA 25
      controller.rotate(2, -90);
      controller.moveX(25, 2, 1);
      // PERCORRENDO RUA 30
      controller.rotate(2, 180);
      controller.moveY(30, 2, 1);
      controller.correctMoveY(30, 2);
      // PERCORRENDO RUA 41
      controller.moveY(41, 2, 0);
      // LIBERANDO SEMAFORO DA COLISAO 03
      controller.colision03.release();
      // PERCORRENDO RUA 52
      controller.moveY(52, 2, 0);
      // COLISAO 07 (VERIFICANDO SEMAFORO)
      controller.correctMoveY(52, 2);
      // PERCORRENDO RUA 58
      controller.rotate(2, -90);
      controller.moveX(58, 2, 0);
      // LIBERANDO SEMAFORO DA COLISAO 26
      controller.colision26.release();
      // COLISAO 04 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(4);
      // PERCORRENDO RUA 57
      controller.moveX(57, 2, 0);
      // LIBERANDO SEMAFORO DA COLISAO 19
      controller.colision19.release();
      // PERCORRENDO RUA 50
      controller.rotate(2, 360);
      controller.moveY(50, 2, 1);
      // PERCORRENDO RUA 39
      controller.moveY(39, 2, 1);
      // PERCORRENDO RUA 28
      controller.moveY(28, 2, 1);
      // LIBERANDO SEMAFORO DA COLISAO 30
      controller.colision30.release();
      // PERCORRENDO RUA 17
      controller.moveY(17, 2, 1);
      // PERCORRENDO RUA 6
      controller.moveY(6, 2, 1);
    }
  }
}
