module anna.busfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens anna.busfx to javafx.fxml;
    exports anna.busfx;
}