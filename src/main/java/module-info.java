module fr.yr.application.calculatrice {
    requires javafx.controls;
    requires javafx.fxml;


    opens fr.yr.application.calculatrice to javafx.fxml;
    exports fr.yr.application.calculatrice;
}