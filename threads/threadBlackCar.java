package threads;

import control.*;

public class threadBlackCar extends Thread {
    // Instanciando o controller
    mainController controller = new mainController();

    // Metodo que define o controller da thread
    public void setController(mainController controller) {
        this.controller = controller;
    }

    @Override
    public void run() {
        while(true){
            // PERCORRENDO RUA 12
            controller.rotate(8, 90);
            controller.moveX(12, 8);
        }
    }
}
