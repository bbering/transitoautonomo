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
            // PERCORRENDO RUA 60
            controller.rotate(7, -90);
            controller.moveX(60, 7);
            controller.correctMoveX(60, 7);
            // LIBERANDO SEMAFORO DA COLISAO 60
            controller.colision60.release();
            // PERCORRENDO RUA 59
            controller.moveX(59, 7);
            // PERCORRENDO RUA 58
            controller.moveX(58, 7);
            // COLISAO 59 (VERIFICANDO SEMAFORO)
            controller.semaphoreControl(59);
            controller.correctMoveX(58, 7);
            // PERCORRENDO RUA 51
            controller.rotate(7, 360);
            controller.moveY(51, 7);
            // LIBERANDO SEMAFORO DA COLISAO 59
            controller.colision59.release();
            // PERCORRENDO RUA 40
            controller.moveY(40, 7);
            // COLISAO 63 (VERIFICANDO SEMAFORO)
            controller.semaphoreControl(63);
            controller.correctMoveY(40, 7);
            // PERCORRENDO RUA 34
            controller.rotate(7, -90);
            controller.moveX(34, 7);
            // COLISAO 58 (VERIFICANDO SEMAFORO)
            controller.semaphoreControl(58);
            controller.correctMoveX(34, 7);
            // LIBERANDO SEMAFORO DA COLISAO 49
            controller.colision49.release();
            // PERCORRENDO RUA 28
            controller.rotate(7, 360);
            controller.moveY(28, 7);
            // LIBERANDO SEMAFORO DA COLISAO 63
            // PERCORRENDO RUA 23
            controller.rotate(7, 90);
            controller.moveX(23, 7);
            // COLISAO 50 (VERIFICANDO SEMAFORO)
            controller.semaphoreControl(50);
            controller.correctMoveX(23, 7);
            // PERCORRENDO RUA 18
            controller.rotate(7, 360);
            controller.moveY(18, 7);
            // PERCORRENDO RUA 7
            controller.moveY(7, 7);
            // COLISAO 57 (VERIFICANDO SEMAFORO)
            controller.semaphoreControl(57);
            // COLISAO 61 (VERIFICANDO SEMAFORO)
            controller.correctMoveY(7, 7);
            // PERCORRENDO RUA 2
            controller.rotate(7, 90);
            controller.moveX(2, 7);
            // COLISAO 51 (VERIFICANDO SEMAFORO)
            controller.semaphoreControl(51);
            controller.correctMoveX(2, 7);
            // PERCORRENDO RUA 3
            controller.moveX(3, 7);
            // PERCORRENDO RUA 4
            controller.moveX(4, 7);
            // PERCORRENDO RUA 10
            controller.rotate(7, 180);
            controller.moveY(10, 7);
            // PERCORRENDO RUA 21
            controller.moveY(21, 7);
            // PERCORRENDO RUA 27
            controller.rotate(7, 90);
            controller.moveX(27, 7);
            // LIBERANDO SEMAFORO DA COLISAO 54
            controller.colision54.release();
            // COLISAO 47 (VERIFICANDO SEMAFORO)
            controller.semaphoreControl(47);
            controller.correctMoveX(27, 7);
            // PERCORRENDO RUA 33
            controller.rotate(7, 180);
            controller.moveY(33, 7);
            controller.correctMoveY(33, 7);
            // PERCORRENDO RUA 38
            controller.rotate(7, -90);
            controller.moveX(38, 7);
            // COLISAO 52 (VERIFICANDO SEMAFORO)
            controller.semaphoreControl(52);
            controller.correctMoveX(38, 7);
            // PERCORRENDO RUA 43
            controller.rotate(7, 180);
            controller.moveY(43, 7);
            // COLISAO 60 (VERIFICANDO SEMAFORO)
            controller.semaphoreControl(60);
            // LIBERANDO SEMAFORO DA COLISAO 53
            controller.colision53.release();
            // PERCORRENDO RUA 54
            controller.moveY(54, 7);
            controller.semaphoreControl(55);
            // COLISAO 55 (VERIFICANDO SEMAFORO)
            controller.semaphoreControl(56);
            // COLISAO 48 (VERIFICANDO SEMAFORO)
            controller.semaphoreControl(48);
            controller.correctMoveY(54, 7);
        }
    }
}