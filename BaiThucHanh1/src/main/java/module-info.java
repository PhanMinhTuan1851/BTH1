module com.mycompany.baithuchanh1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.baithuchanh1 to javafx.fxml;
    exports com.mycompany.baithuchanh1;
}
