module co.edu.uniquindio.parcial1fx.empresatransportefx {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.parcial1fx.empresatransportefx to javafx.fxml;
    exports co.edu.uniquindio.parcial1fx.empresatransportefx;

    opens co.edu.uniquindio.parcial1fx.empresatransportefx.controller;
    exports co.edu.uniquindio.parcial1fx.empresatransportefx.controller;

}