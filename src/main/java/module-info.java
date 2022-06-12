module cl.utalca.alumnos.proyecto {
    requires javafx.controls;
    requires javafx.fxml;


    opens cl.utalca.alumnos.proyecto to javafx.fxml;
    exports cl.utalca.alumnos.proyecto;
    exports cl.utalca.alumnos.proyecto.controllers;
    opens cl.utalca.alumnos.proyecto.controllers to javafx.fxml;
}