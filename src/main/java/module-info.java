module com.example.ads2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ads2 to javafx.fxml;
    exports com.example.ads2;
}