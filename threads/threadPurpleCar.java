package threads;

import control.*;

public class threadPurpleCar extends Thread {
    // Instanciando o controller
    mainController controller = new mainController();

    // Metodo que define o controller da thread
    public void setController(mainController controller) {
        this.controller = controller;
    }

    @Override
    public void run() {
        while (true) {
            // PERCORRENDO RUA 02
            controller.rotate(7, 90);
            controller.moveX(2, 7, 1);
        }
    }
}