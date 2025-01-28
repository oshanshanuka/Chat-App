module lk.ijse.chatapplication {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens lk.ijse.chatapplication to javafx.fxml;
    exports lk.ijse.chatapplication;
}