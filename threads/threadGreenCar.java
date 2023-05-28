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
      // PERCORRENDO RUA 2
      controller.moveX(2, 2, 0);
      // PERCORRENDO RUA 3
      controller.moveX(3, 2, 0);
      // REGIAO CRITICA !!
      /*
       * Utilizada variavel de travamento pois o carro verde funciona como
       * consumidor, apenas lendo o valor da variavel e nao alterando ele
      */
      try {
        controller.sphRoute01Red.acquire();
      } catch (InterruptedException e) {
      }
      // PERCORRENDO RUA 4
      controller.moveX(4, 2, 0);
      controller.sphRoute01Red.release();
      // PERCORRENDO RUA 5
      controller.moveX(5, 2, 0);
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
      // PERCORRENDO RUA 60
      controller.moveX(60, 2, 1);
      // PERCORRENDO RUA 53
      controller.rotate(2, 360);
      controller.moveY(53, 2, 1);
      // PERCORRENDO RUA 42
      controller.moveY(42, 2, 1);
      // PERCORRENDO RUA 31
      controller.moveY(31, 2, 1);
      // PERCORRENDO RUA 25
      controller.rotate(2, -90);
      controller.moveX(25, 2, 1);
      // PERCORRENDO RUA 30
      controller.rotate(2, 180);
      controller.moveY(30, 2, 1);
      // PERCORRENDO RUA 41
      controller.moveY(41, 2, 0);
      // PERCORRENDO RUA 52
      controller.moveY(52, 2, 0);
      // PERCORRENDO RUA 58
      controller.rotate(2, -90);
      controller.moveX(58, 2, 0);
      // PERCORRENDO RUA 57
      controller.moveX(57, 2, 0);
      // PERCORRENDO RUA 50
      controller.rotate(2, 360);
      controller.moveY(50, 2, 1);
      // PERCORRENDO RUA 39
      controller.moveY(39, 2, 1);
      // PERCORRENDO RUA 28
      controller.moveY(28, 2, 1);
      // PERCORRENDO RUA 17
      controller.moveY(17, 2, 1);
      // PERCORRENDO RUA 6
      controller.moveY(6, 2, 1);
    }
  }
}
