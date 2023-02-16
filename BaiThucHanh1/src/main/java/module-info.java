module com.mycompany.baithuchanh1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.logging;

    opens com.mycompany.baithuchanh1 to javafx.fxml;
    exports com.mycompany.baithuchanh1;
}
