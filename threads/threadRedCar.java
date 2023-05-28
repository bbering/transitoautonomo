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
      controller.redRoute01 = 1;
      controller.rotate(1, 360);
      controller.moveY(55, 1, 0);
      // PERCORRENDO RUA 44
      controller.moveY(44, 1, 0);
      // PERCORRENDO A RUA 33
      controller.moveY(33, 1, 0);
      // PERCORRENDO A RUA 22
      controller.moveY(22, 1, 0);
      // PERCORRENDO A RUA 11
      controller.moveY(11, 1, 0);
      controller.rotate(1, -90);
      // PERCORRENDO A RUA 5
      controller.moveX(5, 1, 1);
      // PERCORRENDO A RUA 4
      controller.moveX(4, 1, 1);
      controller.rotate(1, 180);
      // REGIAO CRITICA !!
      // PERCORRENDO A RUA 9
      controller.redRoute01 = 1;
      controller.moveY(9, 1, 0);
      controller.redRoute01 = 0;
      // PERCORRENDO A RUA 14
      controller.rotate(1, -90);
      controller.moveX(14, 1, 1);
      // PERCORRENDO A RUA 8
      controller.rotate(1, 360);
      controller.moveY(8, 1, 0);
      // PERCORRENDO A RUA 2
      controller.rotate(1, -90);
      controller.moveX(2, 1, 1);
      // PERCORRENDO RUA 1
      controller.moveX(1, 1, 1);
      // PERCORRENDO RUA 6
      controller.rotate(1, 180);
      controller.moveY(6, 1, 0);
      // PERCORRENDO RUA 17
      controller.moveY(17, 1, 0);
      // PERCORRENDO RUA 28
      controller.moveY(28, 1, 0);
      // PERCORRENDO RUA 39
      controller.moveY(39, 1, 0);
      // PERCORRENDO RUA 50
      controller.moveY(50, 1, 0);
      // PERCORRENDO RUA 57
      controller.rotate(1, 90);
      controller.moveX(57, 1, 1);
      // PERCORRENDO RUA 51
      controller.rotate(1, 360);
      controller.moveY(51, 1, 0);
      // PERCORRENDO RUA 40
      controller.moveY(40, 1, 0);
      // PERCORRENDO RUA 35
      controller.rotate(1, 90);
      controller.moveX(35, 1, 1);
      // PERCORRENDO RUA 30
      controller.rotate(1, 360);
      controller.moveY(30, 1, 0);
      // PERCORRENDO RUA 25
      controller.rotate(1, 90);
      controller.moveX(25, 1, 0);
      // PERCORRENDO RUA 31
      controller.rotate(1, 180);
      controller.moveY(31, 1, 0);
      // PERCORRENDO RUA 37
      controller.rotate(1, 90);
      controller.moveX(37, 1, 1);
      // PERCORRENDO RUA 43
      controller.rotate(1, 180);
      controller.moveY(43, 1, 0);
      // PERCORRENDO RUA 54
      controller.moveY(54, 1, 0);
      // PERCORRENDO RUA 61
      controller.rotate(1, 90);
      controller.moveX(61, 1, 0);
    }
  }
}
