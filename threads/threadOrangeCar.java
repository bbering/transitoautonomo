package threads;

import control.*;

public class threadOrangeCar extends Thread {
  // Instanciando o controller
  mainController controller = new mainController();

  // Metodo que define o controller da thread
  public void setController(mainController controller) {
    this.controller = controller;
  }

  public void run() {
    while (true) {
      // PERCORRENDO RUA 34
      controller.rotate(3, 90);
      controller.moveX(34, 3, 1);
      // PERCORRENDO RUA 35
      controller.moveX(35, 3, 1);
      // LIBERANDO SEMAFORO DA COLISAO 63
      controller.colision63.release();
      // COLISAO 38 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(38);
      // COLISAO 25 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(25);
      // LIBERANDO SEMAFORO DA COLISAO 06
      controller.colision06.release();
      // LIBERANDO SEMAFORO DA COLISAO 17
      controller.colision17.release();
      // PERCORRENDO RUA 36
      // COLISAO 14 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(14);
      controller.moveX(36, 3, 1);
      // PERCORRENDO RUA 37
      controller.moveX(37, 3, 1);
      // LIBERANDO SEMAFORO DA COLISAO 62
      controller.colision62.release();
      // COLISAO 39 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(39);
      // COLISAO 53 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(53);
      // LIBERANDO SEMAFORO DA COLISAO 21
      controller.colision21.release();
      // LIBERANDO SEMAFORO DA COLISAO 10
      controller.colision10.release();
      // PERCORRENDO RUA 38
      controller.moveX(38, 3, 1);
      // LIBERANDO SEMAFORO DA COLISAO 39
      controller.colision39.release();
      // LIBERANDO SEMAFORO DA COLISAO 12
      controller.colision12.release();
      // LIBERANDO SEMAFORO DA COLISAO 14
      controller.colision14.release();
      // PERCORRENDO RUA 44
      controller.colision11.release();
      // COLISÃO 05 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(5);
      // COLISAO 08 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(8);
      controller.correctMoveX(38, 3);
      controller.rotate(3, 180);
      controller.moveY(44, 3);
      // PERCORRENDO RUA 55
      controller.moveY(55, 3);
      // PERCORRENDO RUA 61
      controller.rotate(3, -90);
      controller.moveX(61, 3, 1);
      // COLISAO 40 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(40);
      controller.correctMoveX(61, 3);
      // PERCORRENDO RUA 60
      controller.moveX(60, 3, 1);
      // COLISAO 28 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(28);
      controller.correctMoveX(60, 3);
      // LIBERANDO SEMAFORO DA COLISAO 09
      controller.colision09.release();
      // PERCORRENDO RUA 59
      controller.moveX(59, 3, 1);
      // COLISAO 30 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(30);
      // PERCORRENDO RUA 58
      controller.moveX(58, 3, 1);
      // LIBERANDO SEMAFORO DA COLISAO 40
      controller.colision40.release();
      // LIBERANDO SEMAFORO DA COLISAO 27
      controller.colision27.release();
      // COLISAO 12 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(12);
      controller.correctMoveX(58, 3);
      // PERCORRENDO RUA 57
      controller.moveX(57, 3, 1);
      // LIBERANDO SEMAFORO DA COLISAO 55
      controller.colision56.release();
      // LIBERANDO SEMAFORO DA COLISAO 18
      controller.colision18.release();
      // PERCORRENDO RUA 50
      controller.rotate(3, 360);
      controller.moveY(50, 3);
      // PERCORRENDO RUA 39
      controller.moveY(39, 3);
      // COLISAO 11 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(11);
      controller.correctMoveY(39, 3);
    }
  }
}