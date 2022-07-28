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

public class FileController extends RunApplication {

    @FXML
    GridPane myGrid;

    @FXML
    Label myLabel;

    public ArrayList<Text> myList;

    @FXML
    protected void onHelloButtonClick() throws IOException {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Any File");

        File file = fileChooser.showOpenDialog(null);
        if(file != null) {
            myLabel.setText("Selected File: " + file.getAbsolutePath());
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
