
/* ***************************************************************
* Autor............: Breno Bering Silva
* Inicio...........: 24/05/2023
* Ultima alteracao.: -
* Nome.............: Transito Automato
*************************************************************** */
import control.mainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Principal extends Application {
  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {

    // Instanciando o controlador principal
    mainController controller = new mainController();

    // Criando o tema base do programa (Top Gear SNES - Las Vegas)
    controller.playMusic();

    // Criando a tela do programa
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/assets/background.fxml"));
    Parent root = loader.load();
    Scene scene = new Scene(root);
    primaryStage.setScene(scene);
    primaryStage.setWidth(808);
    primaryStage.setHeight(630);
    primaryStage.setResizable(false);
    primaryStage.setTitle("Trânsito Autômato");
    primaryStage.getIcons().add(new Image("/assets/redCar.png"));
    primaryStage.show();
  }
}