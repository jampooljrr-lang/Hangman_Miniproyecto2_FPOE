module com.univalle.hangmangame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.univalle.hangmangame to javafx.fxml;
    exports com.univalle.hangmangame;
}