import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class App extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{
        
        //FXMLLoader Loader = new FXMLLoader(getClass().getResource("/ressources/FX/Menu_scene.fxml"));
        //Parent root = Loader.load();
        //Menu_Controller controller = Loader.getController();
        //controller.setScene(primaryStage);
        //primaryStage.setTitle("Destiny's showdown");
        //primaryStage.setScene(new Scene(root, 600, 600));
        //primaryStage.show();
    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
