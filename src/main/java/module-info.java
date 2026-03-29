module org.example.javafxmvc {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.javafxmvc to javafx.fxml;
    exports org.example.javafxmvc;
}