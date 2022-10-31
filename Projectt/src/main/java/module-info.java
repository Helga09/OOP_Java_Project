module com.example.projectt {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projectt to javafx.fxml;
    exports com.example.projectt;
}