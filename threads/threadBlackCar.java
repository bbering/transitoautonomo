package threads;

import control.*;

public class threadBlackCar extends Thread {
  // Instanciando o controller
  mainController controller = new mainController();

  // Metodo que define o controller da thread
  public void setController(mainController controller) {
    this.controller = controller;
  }

  public void run() {
    while (true) {
      // PERCORRENDO RUA 55 (PRÉ ZONA CRÍTICA - CRUZAMENTO)
      controller.moveY(55);
      // PERCORRENDO RUA 44 
      controller.moveY(44);
      // PERCORRENDO A RUA 33
      controller.moveY(33);
      // PERCORRENDO A RUA 22
      controller.moveY(22);
      // PERCORRENDO A RUA 11
      controller.moveY(11);
    }
  }
}
