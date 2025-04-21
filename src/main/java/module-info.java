module org.example.quizsystem {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens org.example.quizsystem to javafx.fxml;
    exports org.example.quizsystem;
}