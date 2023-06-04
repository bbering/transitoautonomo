package threads;

import control.*;

public class threadRedCar extends Thread {
  // Instanciando o controller
  mainController controller = new mainController();

  // Metodo que define o controller da thread
  public void setController(mainController controller) {
    this.controller = controller;
  }

  public void run() {
    while (true) {
      // PERCORRENDO RUA 55
      controller.rotate(1, 360);
      controller.moveY(55, 1);
      // PERCORRENDO RUA 44
      controller.moveY(44, 1);
      // PERCORRENDO A RUA 33
      controller.moveY(33, 1);
      // LIBERANDO SEMAFORO DA COLISÃO 05
      controller.colision05.release();
      // LIBERANDO SEMAFORO DA COLISAO 23
      controller.colision23.release();
      // PERCORRENDO A RUA 22
      controller.moveY(22, 1);
      // PERCORRENDO A RUA 11
      controller.moveY(11, 1);
      controller.rotate(1, -90);
      // PERCORRENDO A RUA 5
      controller.moveX(5, 1, 1);
      // COLISAO 41 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(41);
      controller.correctMoveX(5, 1);
      // PERCORRENDO A RUA 4
      controller.moveX(4, 1, 1);
      // COLISAO 20 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(20);
      // LIBERANDO SEMAFORO DA COLISAO 20
      controller.correctMoveX(4, 1);
      controller.rotate(1, 180);
      // PERCORRENDO A RUA 9
      controller.moveY(9, 1);
      controller.colision01.release();
      // LIBERANDO SEMAFORO DA COLISAO 01
      // PERCORRENDO A RUA 14
      controller.rotate(1, -90);
      controller.moveX(14, 1, 1);
      // PERCORRENDO A RUA 8
      controller.rotate(1, 360);
      controller.moveY(8, 1);
      // PERCORRENDO A RUA 2
      // COLISAO 02 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(2);
      controller.correctMoveY(8, 1);
      controller.rotate(1, -90);
      controller.moveX(2, 1, 1);
      // LIBERANDO SEMAFORO DA COLISAO 32
      controller.colision32.release();
      // PERCORRENDO RUA 1
      controller.moveX(1, 1, 1);
      // LIBERANDO SEMAFORO DA COLISAO 57
      controller.colision57.release();
      // PERCORRENDO RUA 6
      controller.rotate(1, 180);
      controller.moveY(6, 1);
      // PERCORRENDO RUA 17
      controller.moveY(17, 1);
      // PERCORRENDO RUA 28
      controller.moveY(28, 1);
      // COLISAO 06 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(6);
      // PERCORRENDO RUA 39
      controller.moveY(39, 1);
      // LIBERANDO SEMAFORO DA COLISAO 58
      controller.colision58.release();
      // PERCORRENDO RUA 50
      controller.moveY(50, 1);
      // PERCORRENDO RUA 57
      controller.rotate(1, 90);
      controller.moveX(57, 1, 1);
      // COLISAO 59 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(59);
      controller.correctMoveX(57, 1);
      // PERCORRENDO RUA 51
      controller.rotate(1, 360);
      controller.moveY(51, 1);
      // LIBERANDO SEMAFORO DA COLISAO 12
      controller.colision12.release();
      // LIBERANDO SEMAFORO DA COLISAO 04
      controller.colision04.release();
      // PERCORRENDO RUA 40
      controller.moveY(40, 1);
      // COLISAO 10 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(10);
      controller.semaphoreControl(11);
      controller.correctMoveY(40, 1);
      // PERCORRENDO RUA 35
      controller.rotate(1, 90);
      controller.moveX(35, 1, 1);
      // LIBERANDO SEMAFORO DA COLISAO 59
      controller.colision59.release();
      // COLISAO 42 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(42);
      // LIBERANDO SEMAFORO DA COLISAO 15
      controller.colision16.release();
      // COLISAO 3 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(3);
      controller.correctMoveX(35, 1);
      // PERCORRENDO RUA 30
      controller.rotate(1, 360);
      controller.moveY(30, 1);
      // LIBERANDO SEMAFORO COLISAO 11
      controller.colision11.release();
      // PERCORRENDO RUA 25
      controller.rotate(1, 90);
      controller.moveX(25, 1, 0);
      // LIBERANDO SEMAFORO DA COLISAO 42
      controller.colision42.release();
      // PERCORRENDO RUA 31
      controller.rotate(1, 180);
      controller.moveY(31, 1);
      // COLISAO 07 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(7);
      // COLISAO 14 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(14);
      controller.correctMoveY(31, 1);
      // PERCORRENDO RUA 37
      controller.rotate(1, 90);
      controller.moveX(37, 1, 1);
      // COLISAO 60 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(60);
      controller.correctMoveX(37, 1);
      // COLISAO 43 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(43);
      controller.colision31.release();
      // PERCORRENDO RUA 43
      controller.rotate(1, 180);
      controller.moveY(43, 1);
      // LIBERANDO SEMAFORO DA COLISAO 7
      controller.colision07.release();
      // LIBERANDO SEMAFORO DA COLISAO 14
      controller.colision14.release();
      // PERCORRENDO RUA 54
      controller.moveY(54, 1);
      // COLISAO 09 (VERIFICANDO SEMAFORO)
      controller.semaphoreControl(9);
      controller.correctMoveY(54, 1);
      // PERCORRENDO RUA 61
      controller.rotate(1, 90);
      controller.moveX(61, 1, 0);
      // LIBERANDO SEMAFORO DA COLISAO 60
      controller.colision60.release();
      // LIBERANDO SEMAFORO DA COLISAO 43
      controller.colision43.release();
    }
  }
}