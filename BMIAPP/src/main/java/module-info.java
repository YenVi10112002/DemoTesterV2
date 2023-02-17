module com.vi.bmiapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.vi.bmiapp to javafx.fxml;
    exports com.vi.bmiapp;
}
