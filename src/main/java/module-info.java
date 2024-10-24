module com.example.movietablefx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.movietablefx to javafx.fxml;
    exports com.example.movietablefx;
}