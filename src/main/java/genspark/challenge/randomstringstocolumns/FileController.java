package genspark.challenge.randomstringstocolumns;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Authors: Miguel Da Silva, Basil Steitieh, Michael Prempeh.
 * Controller Class for FXML File
 */
public class FileController extends RunApplication {

    /**
     * ArrayList<Text> myList =  Create a Text object to have a list to store in Grid
     * GridPane myGrid = Pulled From FXML File
     */
    @FXML
    GridPane myGrid;

    @FXML
    Label myLabel;

    public ArrayList<Text> myList;
    
    /**
    *  Once you've set hello-view.fxml to properly look for HelloController.java,
    * you want to visit your button element and set its onAction attribute to a function inside the controller.
    * imply put, your Controller's function is onHelloButtonClick()
    *
    * After set the button, we got to use FileChooser(),  to invoke file open dialogs for selecting single file ( showOpenDialog ).
    */

    @FXML
    protected void onHelloButtonClick() throws IOException {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Any File");

        File file = fileChooser.showOpenDialog(null);
        if(file != null) {
            myLabel.setText(file.getAbsolutePath());
            myList = new ArrayList<>();

            BufferedReader br = new BufferedReader(new FileReader(file.getAbsolutePath()));
            String line;
            while ((line = br.readLine()) != null) {
                myList.add(new Text(line));
            }

            int x = 0, y = 0;
            for (Text text : myList) {
                myGrid.add(text, x, y);
                y++;
                if (y % 10 == 0) {
                    x++;
                    y = 0;
                }
            }
        }
    }
}
