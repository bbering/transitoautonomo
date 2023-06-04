package threads;

import control.*;

public class threadCyanCar extends Thread {
  // Instanciando o controller
  mainController controller = new mainController();

  // Metodo que define o controller da thread
  public void setController(mainController controller) {
    this.controller = controller;
  }

  @Override
  public void run() {
    while (true) {
      // PERCORRENDO RUA 04
      controller.rotate(6, -90);
      controller.moveX(4, 6);
      // COLISAO 34 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(34);
      controller.correctMoveX(4, 6);
      // PERCORRENDO RUA 03
      controller.moveX(3, 6);
      // PERCORRENDO RUA 08
      controller.rotate(6, 180);
      controller.moveY(8, 6);
      // LIBERANDO SEMAFORO DA COLISAO 51
      controller.colision51.release();
      // LIBERANDO SEMAFORO DA COLISAO 44
      controller.colision44.release();
      // PERCORRENDO RUA 19
      controller.moveY(19, 6);
      // COLISAO 42 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(42);
      controller.correctMoveX(19, 6);
      // LIBERANDO SEMAFORO DA COLISAO 41
      controller.colision41.release();
      // LIBERANDO SEMAFORO DA COLISAO 42
      controller.colision42.release();
      // PERCORRENDO RUA 30
      controller.moveY(30, 6);
      controller.correctMoveY(30, 6);
      // PERCORRENDO RUA 41
      controller.moveY(41, 6);
      // LIBERANDO SEMAFORO DA COLISAO 38
      controller.colision38.release();
      // PERCORRENDO RUA 52
      controller.moveY(52, 6);
      // COLISAO 40 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(40);
      // PERCORRENDO RUA 59
      controller.rotate(6, 90);
      controller.moveX(59, 6);
      // PERCORRENDO RUA 60
      controller.moveX(60, 6);
      // COLISAO 43 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(43);
      controller.correctMoveX(60, 6);
      // PERCORRENDO RUA 54
      controller.rotate(6, 360);
      controller.moveY(54, 6);
      // LIBERANDO SEMAFORO DA COLISAO 46
      controller.colision46.release();
      // LIBERANDO SEMAFORO DA COLISAO 40
      controller.colision40.release();
      // LIBERANDO SEMAFORO 36
      controller.colision36.release();
      // LIBERANDO SEMAFORO DA COLISAO 35
      controller.colision35.release();
      // PERCORRENDO RUA 43
      controller.moveY(43, 6);
      // COLISAO 37 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(37);
      // COLISAO 39 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(39);
      // PERCORRENDO RUA 32
      controller.moveY(32, 6);
      // LIBERANDO SEMAFORO DA COLISAO 52
      controller.colision52.release();
      // LIBERANDO SEMAFORO DA COLISAO 43
      controller.colision43.release();
      // LIBERANDO SEMAFORO DA COLISAO 37
      controller.colision37.release();
      // LIBERANDO SEMAFORO DA COLISAO 39
      controller.colision39.release();
      // COLISAO 54 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(54);
      controller.correctMoveY(32, 6);
      // PERCORRENDO RUA 21
      controller.moveY(21, 6);
      // PERCORRENDO RUA 10
      controller.moveY(10, 6);
      // COLISAO 32 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(32);
      // COLISAO 33 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(33);
      controller.correctMoveY(10, 6);
    }
  }
}
