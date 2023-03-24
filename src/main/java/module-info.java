module com.example.dz {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dz to javafx.fxml;
    exports com.example.dz;
}