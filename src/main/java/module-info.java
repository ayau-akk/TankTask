module com.example.tanktask {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tanktask to javafx.fxml;
    exports com.example.tanktask;
}