package genspark.challenge.randomstringstocolumns;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
/**
 * Authors: Miguel Da Silva, Basil Steitieh, Michael Prempeh.
 * Controller Class for FXML File
 */

public class RunApplication extends Application {
    /**
     * Extends Application, to use Start method. To display GUI
     *
     * @param primaryStage, main Stage to Display
     * @throws IOException, File Exception
     */
    
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("default.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Random String To Columns");
        stage.setScene(scene);
        stage.show();
    }
   
    
    /**
     * static Main Method to run Args
     *
     * all data in start method
     */

    public static void main(String[] args) {
        launch();
    }
}
