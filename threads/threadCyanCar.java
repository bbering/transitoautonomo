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
            controller.moveX(4, 6, 1);
            // PERCORRENDO RUA 03
            controller.moveX(3, 6, 1);
            // PERCORRENDO RUA 08
            controller.rotate(6, 180);
            controller.moveY(8, 6, 1);
            // PERCORRENDO RUA 19
            controller.moveY(19, 6, 1);
            // PERCORRENDO RUA 30
            controller.moveY(30, 6, 1);
            // PERCORRENDO RUA 41
            controller.moveY(41, 6, 1);
            // PERCORRENDO RUA 52
            controller.moveY(52, 6, 1);
            // PERCORRENDO RUA 59
            controller.rotate(6, 90);
            controller.moveX(59, 6, 1);
            // PERCORRENDO RUA 60
            controller.moveX(60, 6, 1);
            // PERCORRENDO RUA 54
            controller.rotate(6, 360);
            controller.moveY(54, 6, 1);
            // PERCORRENDO RUA 43
            controller.moveY(43, 6, 1);
            // PERCORRENDO RUA 32
            controller.moveY(32, 6, 1);
            // PERCORRENDO RUA 21
            controller.moveY(21, 6, 1);
            // PERCORRENDO RUA 10
            controller.moveY(10, 6, 1);
        }
    }
}
