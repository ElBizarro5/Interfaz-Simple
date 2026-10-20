module com.mycompany.divisores {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.divisores to javafx.fxml;
    exports com.mycompany.divisores;
}
