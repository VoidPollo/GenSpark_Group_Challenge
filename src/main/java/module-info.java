module genspark.challenge.randomstringstocolumns {
    requires javafx.controls;
    requires javafx.fxml;


    opens genspark.challenge.randomstringstocolumns to javafx.fxml;
    exports genspark.challenge.randomstringstocolumns;
}