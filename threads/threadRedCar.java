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
      // PERCORRENDO RUA 55 (PRÉ ZONA CRÍTICA - CRUZAMENTO)
      controller.rotate(1, 360);
      controller.moveY(55);
      // PERCORRENDO RUA 44
      controller.moveY(44);
      // PERCORRENDO A RUA 33
      controller.moveY(33);
      // PERCORRENDO A RUA 22
      controller.moveY(22);
      // PERCORRENDO A RUA 11
      controller.moveY(11);
      controller.rotate(1, -90);
      // PERCORRENDO A RUA 5
      controller.moveX(5);
      // PERCORRENDO A RUA 4
      controller.moveX(4);
      controller.rotate(1, 180);
      // PERCORRENDO A RUA 9
      controller.moveY(9);
      // PERCORRENDO A RUA 14
      controller.rotate(1, -90);
      controller.moveX(14);
      // PERCORRENDO A RUA 8
      controller.rotate(1, 360);
      controller.moveY(8);
      // PERCORRENDO A RUA 2
      controller.rotate(1, -90);
      controller.moveX(2);
      // PERCORRENDO RUA 1
      controller.moveX(1);
      // PERCORRENDO RUA 6
      controller.rotate(1, 180);
      controller.moveY(6);
      // PERCORRENDO RUA 17
      controller.moveY(17);
      // PERCORRENDO RUA 28
      controller.moveY(28);
      // PERCORRENDO RUA 39
      controller.moveY(39);
      // PERCORRENDO RUA 50
      controller.moveY(50);
      // PERCORRENDO RUA 57
      controller.rotate(1, 90);
      controller.moveX(57);
      // PERCORRENDO RUA 51
      controller.rotate(1, 360);
      controller.moveY(51);
      // PERCORRENDO RUA 40
      controller.moveY(40);
      // PERCORRENDO RUA 35
      controller.rotate(1, 90);
      controller.moveX(35);
      // PERCORRENDO RUA 30
      controller.rotate(1, 360);
      controller.moveY(30);
      // PERCORRENDO RUA 25
      controller.rotate(1, 90);
      controller.moveX(25);
      // PERCORRENDO RUA 31
      controller.rotate(1, 180);
      controller.moveY(31);
      // PERCORRENDO RUA 37
      controller.rotate(1, 90);
      controller.moveX(37);
      // PERCORRENDO RUA 43
      controller.rotate(1, 180);
      controller.moveY(43);
      // PERCORRENDO RUA 54
      controller.moveY(54);
      // PERCORRENDO RUA 61
      controller.rotate(1, 90);
      controller.moveX(61);
    }
  }
}
